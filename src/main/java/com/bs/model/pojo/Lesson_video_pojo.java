package com.bs.model.pojo;

import com.bs.model.CoursesLesson;
import com.bs.model.CoursesVideo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */

@Component
public class Lesson_video_pojo {
    /**
     * 这个id表示的是两个表的联合主键，通过这个id将课程中章节和视频进行关联
     */
    private Integer id;

    private Integer lesson_id;

    //章节名
    private String name;

    @Autowired
    List<CoursesVideo> coursesVideo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(Integer lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CoursesVideo> getCoursesVideo() {
        return coursesVideo;
    }

    public void setCoursesVideo(List<CoursesVideo> coursesVideo) {
        this.coursesVideo = coursesVideo;
    }
}
