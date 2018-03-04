package com.bs.mapper;

import com.bs.model.CoursesLesson;

public interface CoursesLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CoursesLesson record);

    int insertSelective(CoursesLesson record);

    CoursesLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CoursesLesson record);

    int updateByPrimaryKey(CoursesLesson record);
}