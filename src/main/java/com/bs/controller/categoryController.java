package com.bs.controller;

import com.bs.model.CategoryCourse;
import com.bs.model.Result;
import com.bs.service.CategoryService;
import com.bs.utils.ResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
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
    @GetMapping(value = "/course/category/lists/{id}")
    public Result CategoryCoursecategory(@PathVariable("id") Integer id ) throws Exception{

        String categoryName = categoryService.findCategoryNameById(id);

      return  ResultUtil.success(categoryName);
    }


    /**
     * 通过id获取该分类下所有的课程
     */
    @GetMapping(value = "/course/category/{id}/lists")
    public Result<CategoryCourse> getCategoryCourse(@PathVariable("id") Integer id) throws Exception{
        return ResultUtil.success(categoryService.findCourseListById(id));
    }

    /**
     * 获取到分类列表
     */
    @GetMapping(value = "course/category")
    public Result findCourseListName() throws Exception{
        return ResultUtil.success(categoryService.findCourseListName());
    }
}
