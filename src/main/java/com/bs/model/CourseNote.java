package com.bs.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by kylin on 2018/3/13.
 */
@Component
@Getter
@Setter
public class CourseNote {

    private Integer id;

//    评论内容
    private String note_message;

    private String add_time;

//    外键，用户id
    private Integer user_id;
//    评论的课程id
    private Integer course;
}
