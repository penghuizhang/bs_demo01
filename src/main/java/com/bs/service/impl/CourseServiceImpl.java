package com.bs.service.impl;

import com.bs.mapper.CoursesMapper;
import com.bs.model.Courses;
import com.bs.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kylin on 2018/5/5.
 */
@Service(value = "courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CoursesMapper coursesMapper;

    @Override
    public String findCourseInforBylessonId(Integer id) throws Exception {
        return coursesMapper.findCourseInforBylessonId(id);
    }

    @Override
    public Courses findStudentByCourseId(int course_id) throws Exception {
        return coursesMapper.findStudentByCourseId(course_id);
    }

    @Override
    public int delete_triggerData() throws Exception {
        return coursesMapper.delete_triggerData();
    }
    @Override
    public Courses findCourseToMeList(String id) throws Exception {
        return coursesMapper.findCourseToMeList(id);
    }


}
