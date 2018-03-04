package com.bs.controller;

import com.bs.model.CoursesVideo;
import com.bs.model.Result;
import com.bs.service.courseVideoService;
import com.bs.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * Created by kylin on 2018/3/4.
 */
@RestController
public class courseVideoController {

    @Autowired
    private CoursesVideo coursesVideo;

    @Autowired
    private courseVideoService courseVideoService;

    @GetMapping(value = "play/{id}")
    public Result selectByPrimaryKey(@PathVariable("id") Integer id)throws Exception{
        return ResultUtil.success(courseVideoService.selectByPrimaryKey(id));
    }

}
