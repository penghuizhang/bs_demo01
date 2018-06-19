package com.bs.controller;


import com.bs.model.Courses;
import com.bs.model.CoursesVideo;
import com.bs.model.Result;
import com.bs.model.StudentProfile;
import com.bs.model.pojo.Lesson_video_pojo;
import com.bs.model.pojo.send_message;
import com.bs.service.CourseService;
import com.bs.service.StudentService;
import com.bs.service.lessonVideoService;
import com.bs.utils.ResultUtil;
import com.bs.service.courseVideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by kylin on 2018/3/2.
 */
@Api(description = "课程章节相关操作")
@RestController
public class lessonVideoController {

    @Autowired
    private CourseService courseService;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    private StudentService studentService;

    @Autowired
    private lessonVideoService lessonVideoService;

    @Autowired
    private Lesson_video_pojo lesson_video_pojo;

    @Autowired
    private courseVideoService courseVideoService;

    @Autowired
    private CoursesVideo coursesVideo;

    @ApiOperation(value = "获取该课程ID下所有章节视频信息")
    @GetMapping(value = "study/{id}/lists")
    public Result findCourseListById(@PathVariable("id") Integer id) throws Exception {

        return ResultUtil.success(lessonVideoService.findCourseListById(id));
    }

    @ApiOperation(value = "获取该章节的课程描述简介")
    @GetMapping(value = "study/{id}/course/details")
    public Result findCourseInforBylessonId(@PathVariable("id") Integer id) throws Exception {
        //返回是一个字符串
        return ResultUtil.success(courseService.findCourseInforBylessonId(id));
    }

    @Scheduled(cron = "00 44 17 * * ?")  //20点50分16秒执行
    @ApiOperation(value = "每天晚上八点定时发邮件通知学生")
    @GetMapping(value = "email/post/")
    public Result send_message() throws Exception {
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        /**
         * 思路如下：
         * 1. 直接获取到触发器表 得到课程编号  list
         * 2. 通过课程编号查到学生openid字段。是一个list
         * 3. 通过openId查找到学生email信息，发送邮件
         */
        //        获取到触发器表中数据  得到需要通知的课程
        List<send_message> course_update_table = courseVideoService.send_message();
        //循环遍历数据 得到课程
        for (send_message course : course_update_table) {
            String coursesss = course.getName();
            String msg = "您订阅的课程《" + coursesss + "》有更新，请及时学习哦！！！";
            //查找该课程下的学生
            Integer course_id = course.course_id;
            Courses studentList = courseService.findStudentByCourseId(course_id);
            //得到课程下学生列表字段，将学生列表字段进行分解
            String ss = studentList.getUserList();
            if (ss == null) {
                continue;
            }
            String[] lists = ss.split(",");
            for (String userAccount : lists) {
                String email = studentService.findStudentEmailByOpenId(userAccount);
                try {
                    final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
                    final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                    message.setFrom("15890651564@163.com");
                    message.setTo(email);
                    message.setSubject("IT技能教学");
                    message.setText(msg);
                    this.mailSender.send(mimeMessage);
                } catch (Exception ex) {

                }
            }
        }
        return ResultUtil.success("success");
    }

    @Scheduled(cron = "00 51 17 * * ?")  //每天三点清空表数据
    @ApiOperation(value = "每天凌晨三点删除触发器中数据(flag置为1表示删除)")
    @GetMapping(value = "email/delete/")
    public Result delete_triggerData() throws Exception {
        //得到的是lesson_id,需要进行转换course_id
        int r = courseService.delete_triggerData();

        return ResultUtil.success(r);
    }


}
