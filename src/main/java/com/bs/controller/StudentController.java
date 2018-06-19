package com.bs.controller;

import com.bs.mapper.StudentProfileMapper;
import com.bs.model.Courses;
import com.bs.model.Result;
import com.bs.model.StudentProfile;
import com.bs.service.CourseService;
import com.bs.service.StudentService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kylin on 2018/5/1.
 */
@Api(description = "用户个人信息及其操作相关（信息,笔记,评论等）")
@RestController
public class StudentController {
    @Autowired
    private StudentProfile studentProfile;
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @ApiOperation(value="创建用户", notes="根据用户点击个人页面获取用户信息")
    @PostMapping("user/add")
    public Result addUser(StudentProfile studentProfile) throws Exception{

        String userAccount = studentProfile.getUseraccount();

        //先进行查询用户是否已经存在如果存在不许要进行添加到数据库，否则写到数据库，同时防止动态刷新后再次写入
        StudentProfile u = studentService.selectOpenIdIsExist(userAccount);
        if (u == null){
            //如果为空,说明第一次使用，没有进行登录过，需要写入到数据库

            return ResultUtil.success(studentService.insertSelective(studentProfile)) ;
        }else{
            //说明是微信登录失效，进行刷新，数据库不需要更新，因为用户openid唯一
            return null;
        }
    }

    @ApiOperation(value = "用户学习课程时，将用户的openid写到课程学员列表中")
    @PostMapping(value = "user/userlist/add")
    public Result addUserList(String useraccount, Integer courseId )throws Exception{
        int ret = 0; //返回结果
        /**
         * 1. 先进性判断该用户是否写到该课程的user_list字段中
         * 2. 该课程是否已经写入到学生信息表，用于学生信息的相关查找操作
         */
        //先进行查询用户账号时候已经存在该列表中，如果存在该列表就不进行记录，否者执行下面的操作
        String userlist = studentService.finduserlistExistUserAccount(courseId);
        String[] lists = userlist.split(",");
        for(String x:lists){
            if(x.equals(useraccount) ){
                continue;
            }else{
                HashMap retMap = new HashMap();
                retMap.put("useraccount", useraccount);
                retMap.put("courseId",courseId);
                ret =  studentService.insertStudentToCourseStudentList(retMap);
            }
        }

        //将学生学习这门课程结果写入到数据库 课程字段 中
        Map map = new HashMap();
        map.put("courseId",courseId);
        map.put("useraccount",useraccount);
        //判断是否该课程已经加入到学生个人课程列表study_course字段中
        String studentProfile = studentService.findStudentInforByOpenId(useraccount);
        String[] listss = studentProfile.split(",");
        for (String x: listss) {
            //如果查询出来有该课程，直接跳出
            if (courseId.equals(x)){
                break;
            }else{
                //如果查询出结果没有该课程，进行添加，添加成功后直接跳出循环
                int r = studentService.insertCourseToStudentProfile(map);
                break;
            }
        }
        return ResultUtil.success(ret);
    }

    @ApiOperation(value = "添加用户的邮箱地址，进行发送邮件")
    @PostMapping(value = "user/email/add")
    public Result addUserEmail(String email,String openId) throws Exception{
        int r = studentService.insertUserEmail(email,openId);
        return ResultUtil.success(1);
    }

    @ApiOperation(value = "学生学习过的课程列表展示")
    @GetMapping(value = "user/course/lists")
    public List StudentCourseList(String openId) throws Exception{
        /**
         * 1. 先将学生的openId获取到，查询数据库中该学生的study_list字段数据
         * 2. 将study_list字段进行切片，获取到该学生曾经学习浏览点击过的视频
         * 3. 将查询出的结果放到list中返回前台数据
         */
        String course_list = studentService.findStudentInforByOpenId(openId);
        String ids[] = course_list.split(",");
        List<Courses> coursesList = new ArrayList<>();
        for (String id: ids) {
            //对单一一个id课程进行查询数据
            Courses courses = courseService.findCourseToMeList(id);
            String url = "https://kylin.ngrok.xiaomiqiu.cn/media/";
            String new_url = url+courses.getImage();
            courses.setImage(new_url);

            //等级转化英文转化为中文
            String dg = "";
            String degree = courses.getDegree();
            if ("cj".equals(degree)){
                dg = "初级";
            }else if("zj".equals(degree)){
                dg = "中级";
            }else if("gj".equals(degree)){
                dg = "高级";
            }
            courses.setDegree(dg);
            coursesList.add(courses);
        }
        return coursesList;
    }
}
