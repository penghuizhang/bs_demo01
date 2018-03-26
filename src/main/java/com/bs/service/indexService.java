package com.bs.service;

import com.bs.model.Courses;

import java.util.List;

/**
 * Created by kylin on 2018/3/26.
 */
public interface indexService {

    //获取轮播图
    List<Courses> FindCourseImageToLunbo() throws Exception;

    //获取根据时间首页列表
    List<Courses> FindCourseByOrderTime() throws Exception;

    //根据学习点击率进行排序
    List<Courses> FindCourseByHot() throws Exception;
}
