package com.bs.mapper;

import com.bs.model.CategoryCourse;
import com.bs.model.Courses;

import java.util.List;

public interface categoryCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryCourse record);

    int insertSelective(CategoryCourse record);

    String findCategoryNameById(Integer id) throws  Exception;

    int updateByPrimaryKeySelective(CategoryCourse record);

    int updateByPrimaryKey(CategoryCourse record);

    List findCourseListName() throws  Exception;

    List<Courses> findCourseListById(int id) throws Exception;


}