package com.bs.mapper;

import com.bs.model.Courses;

import java.util.List;

public interface CoursesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Courses record);

    int insertSelective(Courses record);

    Courses selectByPrimaryKey(Integer id);

    String selectByIdFindName(Integer id) throws Exception;

    List<Courses> findCourseListById(Integer id) throws Exception;


    //获取轮播图
    List<Courses> FindCourseImageToLunbo() throws Exception;

    //获取根据时间首页列表
    List<Courses> FindCourseByOrderTime() throws Exception;

    //根据学习点击率进行排序
    List<Courses> FindCourseByHot() throws Exception;

    //通过lesson_id返回课程的课程描述
    String findCourseInforBylessonId(Integer id);

    //通过课程查找学习的学生
    Courses findStudentByCourseId(int course_id) throws Exception;

    /**
     * 每天凌晨三点删除数据
     */
    int delete_triggerData() throws Exception;

    Courses findCourseToMeList(String id) throws Exception;
}