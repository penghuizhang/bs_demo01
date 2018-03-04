package com.bs.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Getter
@Setter
public class CoursesVideo {
    private Integer id;

    private Date add_time;

    private Integer lesson_id;

    private String video_url;

    private String name;


}