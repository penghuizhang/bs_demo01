package com.bs.mapper;

import com.bs.model.Courses;

import java.util.List;

public interface CoursesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Courses record);

    int insertSelective(Courses record);

    Courses selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Courses record);

    int updateByPrimaryKeyWithBLOBs(Courses record);

    int updateByPrimaryKey(Courses record);

    String selectByIdFindName(Integer id) throws Exception;

    List<Courses> findCourseListById(Integer id) throws Exception;
}