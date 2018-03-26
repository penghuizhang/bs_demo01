package com.bs.mapper;

import com.bs.model.CoursesVideo;

import java.util.HashMap;
import java.util.Map;

public interface CoursesVideoMapper {

    /**
     * 通过lesso_id和课程的id进行查询该课程的url 进行播放视频
     * @param lesson_id  该课程所属章节名
     * @param id  该课程在位置
     * @return  该课程
     * @throws Exception
     */
      CoursesVideo FindUrlByLessonInAndId(Map<String,Object> map) throws Exception;
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(CoursesVideo record);
//
//    int insertSelective(CoursesVideo record);
//
//    CoursesVideo selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(CoursesVideo record);
//
//    int updateByPrimaryKey(CoursesVideo record);
}