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
}