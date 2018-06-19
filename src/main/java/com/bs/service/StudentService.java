package com.bs.service;


import com.bs.model.Courses;
import com.bs.model.StudentProfile;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kylin on 2018/3/17.
 */
public interface StudentService {

    int insertSelective(StudentProfile userProfile) throws Exception;

    StudentProfile selectOpenIdIsExist(String UserAccount) throws Exception;

    int insertStudentToCourseStudentList(@PathVariable("retMap")HashMap retMap) throws Exception;

    String finduserlistExistUserAccount(Integer courseId) throws Exception;

    Integer FindUserIdByOpenId(String user_id) throws Exception;

    int insertUserEmail(String email,String openId) throws Exception;



    //通过学生查找学生邮箱
    String findStudentEmailByOpenId(String openId) throws Exception;

    //学生学习视频时将课程写入学生数据表
    int insertCourseToStudentProfile(Map map) throws Exception;

    //判断该课程是否已经加入到学生信息表中
    String findStudentInforByOpenId(String useraccount) throws Exception;


}
