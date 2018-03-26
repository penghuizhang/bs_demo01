package com.bs.controller;

import com.bs.model.CategoryCourse;
import com.bs.model.Result;
import com.bs.service.CategoryService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
@Api(description = "课程分类相关操作")
@RestController
public class categoryController {
    @Resource
    private CategoryCourse categoryCoursecategory;

    private List<CategoryCourse> categoryCoursecategoryList;

    @Resource
    private CategoryService categoryService;


    /**
     * 获取到课程的大分类  前端，后端，移动开发等等字样
     * 返回格式
     * {
         "code": 200,
         "message": "success",
         "data": []
     }
     * @throws Exception
     */
    @ApiOperation("通过分类id获取该课程名称")
    @GetMapping(value = "/course/category/lists/{id}")
    public Result CategoryCoursecategory(@PathVariable("id") Integer id ) throws Exception{

        String categoryName = categoryService.findCategoryNameById(id);

      return  ResultUtil.success(categoryName);
    }


    /**
     * 通过id获取该分类下所有的课程
     */
    @ApiOperation(value = "通过分类id获取该分类下所有课程")
    @GetMapping(value = "/course/category/{id}/lists")
    public Result<CategoryCourse> getCategoryCourse(@PathVariable("id") Integer id) throws Exception{
        return ResultUtil.success(categoryService.findCourseListById(id));
    }

    /**
     * 获取到分类列表
     */
    @ApiOperation(value = "获取该系统课程分为哪些种类")
    @GetMapping(value = "course/category")
    public Result findCourseListName() throws Exception{
        return ResultUtil.success(categoryService.findCourseListName());
    }
}
