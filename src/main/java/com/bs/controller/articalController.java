package com.bs.controller;

import com.bs.model.Artical;
import com.bs.model.Result;
import com.bs.service.articalService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kylin on 2018/5/9.
 */
@Api(value = "手记相关操作")
@RestController
public class articalController {
    @Autowired
    private articalService articalService;

    @ApiOperation(value = "手记首页查询5条数据")
    @GetMapping(value = "artical/index")
    public Result<Artical> findShoujiList() throws Exception{
        return ResultUtil.success(articalService.findShoujiList());
    }

    @ApiOperation(value = "页面滑到底部，加载数据")
    @GetMapping(value = "artical/addData/{id}")
    public Result<Artical> addArticalListNum(@PathVariable("id") Integer id) throws Exception{
        //一次增加7条数据
        return ResultUtil.success(articalService.addArticalListNum(id));
    }

    @ApiOperation(value = "统计数据库中有多少条手记")
    @GetMapping(value = "artical/count")
    public Result<Artical> articalCount() throws Exception{
        //一次增加7条数据
        return ResultUtil.success(articalService.articalCount());
    }

    @ApiOperation(value = "查看某条手记")
    @GetMapping(value = "artical/getartical/{id}")
    public Result<Artical> getArticalDetail(@PathVariable("id") Integer id) throws Exception{
        //一次增加7条数据
        return ResultUtil.success(articalService.getArticalDetail(id));
    }

    @ApiOperation(value = "某条手记阅读数+1")
    @GetMapping(value = "artical/addReadNum/{id}")
    public Result addReadNum(@PathVariable("id") Integer id) throws Exception{
        //一次增加7条数据
        return ResultUtil.success(articalService.addReadNum(id));
    }


}
