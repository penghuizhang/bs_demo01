package com.bs.controller;

import com.bs.model.Result;
import com.bs.service.examUnitService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kylin on 2018/5/8.
 */
@Api(value = "考试相关的操作")
@RestController
public class examUnitController {
    @Autowired
    private examUnitService examUnitService;

    @ApiOperation(value = "某一门课程的单元测试")
    @GetMapping(value = "exam/unit/{courseName_id}")
    public Result FindExamByCourseId(@PathVariable("courseName_id")Integer courseName_id) throws Exception{
        return ResultUtil.success(examUnitService.FindExamByCourseId(courseName_id));
    }
}
