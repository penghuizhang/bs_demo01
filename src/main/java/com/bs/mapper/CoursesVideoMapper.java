package com.bs.mapper;

import com.bs.model.CoursesVideo;

public interface CoursesVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CoursesVideo record);

    int insertSelective(CoursesVideo record);

    CoursesVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CoursesVideo record);

    int updateByPrimaryKey(CoursesVideo record);
}