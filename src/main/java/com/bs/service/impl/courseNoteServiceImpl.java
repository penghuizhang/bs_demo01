package com.bs.service.impl;

import com.bs.mapper.CourseNoteMapper;
import com.bs.model.CourseNote;
import com.bs.model.pojo.Note_User_course_pojo;
import com.bs.service.courseNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kylin on 2018/3/13.
 */
@Service(value = "courseNoteService")
public class courseNoteServiceImpl implements courseNoteService {

    @Autowired
    private CourseNoteMapper courseNoteMapper;

    @Override
    public int addOneNote(CourseNote courseNote) throws Exception {
        int r = courseNoteMapper.addOneNote(courseNote);
        if (r>0){
            return 1;  //插入成功
        }else{
            return -1; //插入失败
        }

    }

    @Override
    public Integer FindCourseIdByLessonId(Integer lesson_id) throws Exception {
        return courseNoteMapper.FindCourseIdByLessonId(lesson_id);
    }

    @Override
    public List<Note_User_course_pojo> findNoteListByCourseId(Integer course_id) throws Exception {
        return courseNoteMapper.findNoteListByCourseId(course_id);
    }

    @Override
    public Integer FindUserIdByOpenId(String user_id) throws Exception {
        return courseNoteMapper.FindUserIdByOpenId(user_id);
    }

    @Override
    public List<Note_User_course_pojo> findNoteList4(Integer course_id) throws Exception {
        return courseNoteMapper.findNoteList4(course_id);
    }


}
