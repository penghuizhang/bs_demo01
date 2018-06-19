package com.bs.service.impl;

import com.bs.mapper.CoursesMapper;
import com.bs.mapper.StudentProfileMapper;
import com.bs.model.Courses;
import com.bs.model.StudentProfile;
import com.bs.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kylin on 2018/3/17.
 */
@Service(value = "StudentProfile")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentProfileMapper studentProfileMapper;

    @Resource
    private CoursesMapper coursesMapper;

    @Override
    public int insertSelective(StudentProfile studentProfile) throws Exception {
        return studentProfileMapper.insertSelective(studentProfile);
    }

    @Override
    public StudentProfile selectOpenIdIsExist(String UserAccount) throws Exception {
        return studentProfileMapper.selectOpenIdIsExist(UserAccount);
    }

    @Override
    public int insertStudentToCourseStudentList(@PathVariable("retMap")HashMap retMap) throws Exception {

        return studentProfileMapper.insertStudentToCourseStudentList(retMap);
    }

    @Override
    public String finduserlistExistUserAccount(Integer courseId) throws Exception {
        return studentProfileMapper.finduserlistExistUserAccount(courseId);
    }

    @Override
    public Integer FindUserIdByOpenId(String user_id) throws Exception {
        return studentProfileMapper.FindUserIdByOpenId(user_id);
    }

    @Override
    public int insertUserEmail(String email,String openId) throws Exception {
        return studentProfileMapper.insertUserEmail(email);
    }


    @Override
    public String findStudentEmailByOpenId(String openId) throws Exception {
        return studentProfileMapper.findStudentEmailByOpenId(openId);
    }

    @Override
    public int insertCourseToStudentProfile(Map map) throws Exception {
        return studentProfileMapper.insertCourseToStudentProfile(map);
    }

    @Override
    public String findStudentInforByOpenId(String useraccount) throws Exception {
        return studentProfileMapper.findStudentInforByOpenId(useraccount);
    }



}
