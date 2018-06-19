package com.bs.service;

import com.bs.model.Examunit;

import java.util.List;

/**
 * Created by kylin on 2018/5/8.
 */
public interface examUnitService {
    List<Examunit> FindExamByCourseId(Integer courseName_id) throws Exception;

}
