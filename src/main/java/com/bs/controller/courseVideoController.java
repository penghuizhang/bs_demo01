package com.bs.controller;

import com.bs.model.CoursesVideo;
import com.bs.model.Result;
import com.bs.service.courseVideoService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;

/**
 * Created by kylin on 2018/3/4.
 */
@Api(description = "课程视频相关操作")

public class courseVideoController {

    @Autowired
    private CoursesVideo coursesVideo;

    @Autowired
    private courseVideoService courseVideoService;

    @ApiOperation(value = "播放视频地址获取")
    @GetMapping(value = "play/video_id/{id}/lesson_id/{lesson_id}")
    public Result FindUrlByLessonInAndId(@PathVariable("id")Integer id, @PathVariable("lesson_id")Integer lesson_id)throws Exception{

        return ResultUtil.success(courseVideoService.FindUrlByLessonInAndId(lesson_id,id));
    }


}
