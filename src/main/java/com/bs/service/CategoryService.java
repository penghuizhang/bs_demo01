package com.bs.service;

import com.bs.model.CategoryCourse;
import com.bs.model.Result;

import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
public interface CategoryService {

    /**
     * 通过id进行获取到分类
     * @return   一个分类名称
     */
    String  findCategoryNameById(int id) throws Exception;

    /**
     * 通过id获取到该分类下面的所有课程
     */
    public List<CategoryCourse> findCourseListById(int id) throws Exception;

    /**
     * 获取分类类表
     */
    public List findCourseListName() throws Exception;
}
