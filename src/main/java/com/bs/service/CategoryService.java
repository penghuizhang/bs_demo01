package com.bs.service;

import com.bs.model.CategoryCourse;
import com.bs.model.Result;

import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
public interface CategoryService {

    public List<CategoryCourse> findCategoryById(int id) throws Exception;

    public List<CategoryCourse> selectByIdFindName(int id) throws Exception;
}
