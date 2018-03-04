package com.bs.controller;

import com.bs.model.CoursesVideo;
import com.bs.model.Result;
import com.bs.model.pojo.Lesson_video_pojo;
import com.bs.service.lessonVideoService;
import com.bs.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kylin on 2018/3/2.
 */
@RestController
public class lessonVideoController {

    @Autowired
    private lessonVideoService lessonVideoService;

    @Autowired
    private Lesson_video_pojo lesson_video_pojo;


    @Autowired
    private CoursesVideo coursesVideo;

    @GetMapping(value = "study/{id}/lists")
    public Result findCourseListById(@PathVariable("id") Integer id) throws Exception{

        return ResultUtil.success(lessonVideoService.findCourseListById(id));
    }




}
