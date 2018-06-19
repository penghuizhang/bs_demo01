package com.bs.service;

import com.bs.model.Courses;
import org.springframework.stereotype.Service;

/**
 * Created by kylin on 2018/5/5.
 */

public interface CourseService {

    String findCourseInforBylessonId(Integer id) throws Exception;

    //通过课程查找学习的学生
    Courses findStudentByCourseId(int course_id) throws Exception;

    int delete_triggerData() throws Exception;

    //根据课程编号查询该学生学习过的视频
    Courses findCourseToMeList(String id) throws Exception;
}
