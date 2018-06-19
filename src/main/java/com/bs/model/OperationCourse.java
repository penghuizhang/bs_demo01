package com.bs.model;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by kylin on 2018/4/27.
 */
@Component
public class OperationCourse {

    private Integer id;

    private String user;

    private String message;

    private Date add_time;

    private String wxopenid;  //微信账号

    private Integer course_id;  //课程编号

    private Integer lesson_id;  //章节编号

    private Integer video_id; //视频编号


}
