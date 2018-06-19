package com.bs.controller;

import com.bs.model.Result;
import com.bs.service.commonService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kylin on 2018/6/16.
 */
@Api(value = "工具类")
@RestController
public class CommonController {
    @Autowired
    private commonService commonService;
    /**
     * 获取到formid 然后写入到数据库中保存起来
     */
    @ApiOperation(value = "获取到模板的form_id")
    @PostMapping(value = "common/formId")
    public Result getFormId(String formId) throws Exception{
        System.out.println("formId = "+formId);
        int r = commonService.insertFormId(formId);
        return ResultUtil.success(1);
    }



}
