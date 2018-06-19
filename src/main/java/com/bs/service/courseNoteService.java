package com.bs.service;

import com.bs.model.CourseNote;
import com.bs.model.pojo.Note_User_course_pojo;

import java.util.List;
import java.util.Map;

/**
 * Created by kylin on 2018/3/13.
 */

public interface courseNoteService {

    int addOneNote(CourseNote courseNote) throws  Exception;

    /**
     * 通过章节id 查询course_id
     * @param lesson_id
     * @return   course_id
     */
    Integer FindCourseIdByLessonId(Integer lesson_id) throws Exception;

    List<Note_User_course_pojo> findNoteListByCourseId(Integer course_id) throws Exception;


    Integer FindUserIdByOpenId(String user_id) throws Exception;

    List<Note_User_course_pojo> findNoteList4(Integer course_id) throws Exception;
}
