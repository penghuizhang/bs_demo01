package com.bs.service;

import com.bs.model.CoursesVideo;

import java.util.HashMap;

/**
 * Created by kylin on 2018/3/4.
 */
public interface courseVideoService {

    CoursesVideo FindUrlByLessonInAndId(Integer lesson_id, Integer id) throws Exception;



}
