package com.bs.mapper;

import com.bs.model.CourseNote;
import com.bs.model.pojo.Note_User_course_pojo;

import java.util.List;
import java.util.Map;

/**
 * Created by kylin on 2018/3/13.
 */
public interface CourseNoteMapper {

//    添加一条笔记
    int addOneNote(CourseNote courseNote) throws  Exception;

//    通过章节id获取课程id   lesson_id -----》》》course_id
    Integer FindCourseIdByLessonId(Integer lesson_id) throws Exception;

//    通过课程id获取该课程的所有笔记信息
    List<Note_User_course_pojo> findNoteListByCourseId(Integer course_id) throws Exception;

    //通过openid获取用户的user表主键
    Integer FindUserIdByOpenId(String user_id) throws Exception;
}
