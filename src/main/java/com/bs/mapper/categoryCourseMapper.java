package com.bs.mapper;

import com.bs.model.CategoryCourse;

import java.util.List;

public interface categoryCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryCourse record);

    int insertSelective(CategoryCourse record);

    CategoryCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryCourse record);

    int updateByPrimaryKey(CategoryCourse record);

    List<CategoryCourse> selectByIdFindName(int id) throws Exception;
}