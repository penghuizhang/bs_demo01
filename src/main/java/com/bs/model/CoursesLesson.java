package com.bs.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class CoursesLesson {
    private Integer id;

    private String name;

    private Date add_time;

    private Integer course_id;


}