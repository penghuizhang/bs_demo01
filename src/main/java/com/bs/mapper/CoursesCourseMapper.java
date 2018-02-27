package com.bs.mapper;

import com.bs.model.CoursesCourse;

import java.util.List;

public interface CoursesCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CoursesCourse record);

    int insertSelective(CoursesCourse record);

    CoursesCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CoursesCourse record);

    int updateByPrimaryKeyWithBLOBs(CoursesCourse record);

    int updateByPrimaryKey(CoursesCourse record);

    List<CoursesCourse> findCourseListById(Integer id) throws Exception;
}