package com.bs.controller;

import com.bs.mapper.CourseNoteMapper;
import com.bs.model.CourseNote;
import com.bs.model.Result;
import com.bs.model.pojo.Note_User_course_pojo;
import com.bs.service.courseNoteService;
import com.bs.service.impl.courseNoteServiceImpl;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javafx.scene.chart.PieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by kylin on 2018/3/13.
 */
@Api(description = "课程笔记相关操作")
@RestController
public class courseNoteController {

    @Autowired
    private courseNoteService courseNoteServiceImpl;

    /**
     * 该方法用来添加笔记
     * @param  userAccount  用户的openid
     * @param lesson_id   用户添加的评论的所属传过来的是章节id，应该查询一下数据库，获得课程id，这样进行绑定
     * @return     返回一个整型，判断是否成功
     * @throws Exception
     */
    @ApiOperation(value = "添加笔记",notes = "获取到用户的openid和该表进行关联，返回user表主键")
    @PostMapping(value = "note/add")
    public Result<Note_User_course_pojo> addOneNote(String note_message, Integer lesson_id, String user_id) throws Exception {

//        将数据进行封装
        CourseNote courseNote = new CourseNote();
        courseNote.setNote_message(note_message);



        //1.将章节id查询出课程id  lesson_id------》course_id
        Integer course_id = courseNoteServiceImpl.FindCourseIdByLessonId(lesson_id);
        courseNote.setCourse(course_id);

        // 2. 将数据进行封装到实体类中，写入到数据库
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

        //通过user_id查出该用户的user表主键

        Integer openId = courseNoteServiceImpl.FindUserIdByOpenId(user_id);

        courseNote.setUser_id(openId);
        courseNote.setAdd_time(sdf.format(data));

        int r = courseNoteServiceImpl.addOneNote(courseNote);
        if (r==1){
            return ResultUtil.success("写入成功");
        }else {
            return ResultUtil.error(1,"写入失败");
        }

    }


    @ApiOperation(value = "查看某课程笔记", notes = "通过该课程，查看课程下面的所有笔记信息")
    @GetMapping(value = "note/lists/{lesson_id}")
    public List<Note_User_course_pojo> findNoteListByCourseId(@PathVariable("lesson_id") Integer lesson_id) throws Exception{
        //1.将章节id查询出课程id  lesson_id------》course_id
        Integer course_id = courseNoteServiceImpl.FindCourseIdByLessonId(lesson_id);

        return courseNoteServiceImpl.findNoteListByCourseId(course_id);
    }




}
