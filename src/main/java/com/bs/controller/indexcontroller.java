package com.bs.controller;

import com.bs.mapper.CoursesMapper;
import com.bs.model.Courses;
import com.bs.model.Result;
import com.bs.service.indexService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kylin on 2018/3/26.
 */
@Api(description = "小程序首页相关操作")
@RestController
public class indexController  {

    @Autowired
    private Courses courses;

    @Autowired
    private indexService indexServicess;

    @ApiOperation(value = "获取小程序页面轮播图方法")
    @GetMapping(value = "/index/lunbo")
    public Result<Courses> getlunBoImage() throws Exception{
        return ResultUtil.success(indexServicess.FindCourseImageToLunbo());
    }

    @ApiOperation(value = "首页根据时间排出一个列表")
    @GetMapping(value = "index/timeList")
    public Result getindexList() throws Exception{
        return ResultUtil.success(indexServicess.FindCourseByOrderTime());
    }

    @ApiOperation(value = "首页根据学生兴趣读度排序")
    @GetMapping(value = "index/recommend")
    public Result<Courses> getindexRecommend() throws Exception{

        return ResultUtil.success(indexServicess.FindCourseByHot());
    }
}
