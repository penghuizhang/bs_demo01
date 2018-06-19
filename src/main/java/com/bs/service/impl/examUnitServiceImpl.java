package com.bs.service.impl;

import com.bs.mapper.ExamUnitMapper;
import com.bs.model.Examunit;
import com.bs.service.examUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kylin on 2018/5/8.
 */
@Service(value = "examUnitService")
public class examUnitServiceImpl implements examUnitService {


    @Autowired
    private ExamUnitMapper examUnitMapper;


    @Override
    public List<Examunit> FindExamByCourseId(Integer courseName_id) throws Exception {
        return (List<Examunit>) examUnitMapper.FindExamByCourseId(courseName_id);
    }
}
