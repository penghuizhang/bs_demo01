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
    public List<CategoryCourse> findCategoryById(int id) throws Exception {
        return (List<CategoryCourse>) categoryCoursecategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CategoryCourse> selectByIdFindName(int id) throws Exception {
        return categoryCoursecategoryMapper.selectByIdFindName(id);
    }
}
