package com.bs.service;

import com.bs.model.pojo.Lesson_video_pojo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Action;
import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */
public interface lessonVideoService {


    List<Lesson_video_pojo> findCourseListById(Integer id) throws Exception;
}
