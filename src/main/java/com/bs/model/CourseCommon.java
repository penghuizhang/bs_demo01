package com.bs.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by kylin on 2018/3/5.
 */
@Component
@Getter
@Setter
public class CourseCommon {

    private Integer id;

    //用户的姓名
    private Integer name;

    //用户的头像
    private String thumb;

    //评论的信息
    private String common_message;


}
