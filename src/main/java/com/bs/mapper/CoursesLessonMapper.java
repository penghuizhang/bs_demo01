package com.bs.mapper;

import com.bs.model.CoursesLesson;
import com.bs.model.pojo.send_message;

import java.util.List;

public interface CoursesLessonMapper {

    Integer findCourseIdByLessonId(Integer lesson_id) throws Exception;

    List<send_message> send_message(Integer course_id) throws Exception;
}