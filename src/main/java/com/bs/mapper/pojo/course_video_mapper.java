package com.bs.mapper.pojo;

import com.bs.model.pojo.Lesson_video_pojo;

import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */
public interface course_video_mapper {

    List<Lesson_video_pojo> findCourseListById(Integer id) throws Exception;
}
