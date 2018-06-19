package com.bs.service;

import com.bs.model.CoursesVideo;
import com.bs.model.pojo.send_message;

import java.util.HashMap;
import java.util.List;

/**
 * Created by kylin on 2018/3/4.
 */
public interface courseVideoService {

    CoursesVideo FindUrlByLessonInAndId(Integer lesson_id, Integer id) throws Exception;


    int  selectVideoUpdate() throws Exception;

    List<send_message> send_message() throws Exception;
}
