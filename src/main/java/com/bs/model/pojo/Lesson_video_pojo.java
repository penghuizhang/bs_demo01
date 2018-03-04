package com.bs.model.pojo;

import com.bs.model.CoursesLesson;
import com.bs.model.CoursesVideo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */

@Component
@Getter
@Setter
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
}
