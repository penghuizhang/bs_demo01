package com.bs.mapper;

import com.bs.model.Courses;
import com.bs.model.StudentProfile;
import org.springframework.web.bind.annotation.PathVariable;
import sun.plugin.util.UserProfile;

import java.util.HashMap;
import java.util.Map;


public interface StudentProfileMapper {

//    插入用户信息，该用户信息仅仅写入一次
    int insertSelective(StudentProfile studentProfile) throws Exception;

//    如果过期，又进行登录，则不进行操作，查询该openid是否存在
    StudentProfile selectOpenIdIsExist(String UserAccount) throws Exception;

//    用户学习课程时，将用户添加到课程列表,xml方法用的是select  concat函数
    int insertStudentToCourseStudentList(@PathVariable("retMap") HashMap retMap) throws Exception;

//    查询该用户是否已经写如果userlist中
    String finduserlistExistUserAccount(Integer courseId) throws Exception;

    //通过openid获取用户的user表主键
    Integer FindUserIdByOpenId(String user_id) throws Exception;

    //添加用户的邮箱
    int insertUserEmail(String email) throws Exception;



    //通过学生查找学生邮箱
    String findStudentEmailByOpenId(String openId) throws Exception;

    int insertCourseToStudentProfile(Map map) throws Exception;

    String findStudentInforByOpenId(String useraccount) throws Exception;



}
