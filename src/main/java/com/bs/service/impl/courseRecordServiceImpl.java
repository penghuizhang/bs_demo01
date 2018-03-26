package com.bs.service.impl;

import com.bs.mapper.CoursesRecordMapper;
import com.bs.model.CourseRecord;
import com.bs.service.courseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kylin on 2018/3/9.
 */
@Service(value = "courseRecordService")
public class courseRecordServiceImpl implements courseRecordService {

    @Autowired
    private CoursesRecordMapper coursesRecordMapper;

    @Override
    public int insert(CourseRecord courseRecord) throws Exception {
        return coursesRecordMapper.insert(courseRecord);
    }
}
