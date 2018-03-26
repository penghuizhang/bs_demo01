package com.bs.controller;

import com.bs.model.CoursesVideo;
import com.bs.model.Result;
import com.bs.model.pojo.Lesson_video_pojo;
import com.bs.service.lessonVideoService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by kylin on 2018/3/2.
 */
@Api(description = "课程章节相关操作")
@RestController
public class lessonVideoController {

    private Logger log = LoggerFactory.getLogger(lessonVideoController.class);

    @Autowired
    private lessonVideoService lessonVideoService;

    @Autowired
    private Lesson_video_pojo lesson_video_pojo;


    @Autowired
    private CoursesVideo coursesVideo;

    @ApiOperation(value = "获取该课程ID下所有章节视频信息")
    @GetMapping(value = "study/{id}/lists")
    public Result findCourseListById(@PathVariable("id") Integer id) throws Exception{

        return ResultUtil.success(lessonVideoService.findCourseListById(id));
    }








}
