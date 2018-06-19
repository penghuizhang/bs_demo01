package com.bs.mapper;

import com.bs.model.Examunit;

import java.util.List;

public interface ExamUnitMapper {
    /**
     * 通过课程id获取到该课程下的单元测试题目
     */
    List<Examunit> FindExamByCourseId(Integer courseName_id) throws Exception;




}