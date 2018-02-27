package com.bs.service.impl;

import com.bs.mapper.categoryCourseMapper;
import com.bs.model.CategoryCourse;
import com.bs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
@Service(value = "categoryService")
public class categoryServiceImpl implements CategoryService {

    @Autowired
    private categoryCourseMapper categoryCoursecategoryMapper;

    @Override
    public String findCategoryNameById(int id) throws Exception {
        return categoryCoursecategoryMapper.findCategoryNameById(id);
    }

    @Override
    public List<CategoryCourse> findCourseListById(int id) throws Exception {
        List<CategoryCourse> categoryCourses = categoryCoursecategoryMapper.findCourseListById(id);
        return categoryCoursecategoryMapper.findCourseListById(id);
    }

    @Override
    public List findCourseListName() throws Exception {
        return categoryCoursecategoryMapper.findCourseListName();
    }
}
