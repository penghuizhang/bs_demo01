package com.bs.mapper.pojo;

import com.bs.model.pojo.Lesson_video_pojo;
import com.bs.model.pojo.send_message;

import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */
public interface course_video_mapper {

    List<Lesson_video_pojo> findCourseListById(Integer id) throws Exception;

    List<send_message> send_message(Integer course_id) throws Exception;
}
