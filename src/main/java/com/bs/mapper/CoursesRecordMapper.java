package com.bs.mapper;

import com.bs.model.CourseRecord;
import com.bs.model.Courses;

import java.util.List;

public interface CoursesRecordMapper {
    /**
     * 插入一条数据
     */
    int insert(CourseRecord courseRecord) throws Exception;
}