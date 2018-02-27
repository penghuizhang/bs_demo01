package com.bs.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class Courses {
    private Integer id;

    private String name;

    private String description;

    private String degree;

    private Integer learn_time;

    private Integer students;

    private Integer favorite_student;

    private String image;

    private Integer click_numbers;

    private Date add_time;

    private Integer course_org_id;

    private String category;

    private String tag;

    private Integer course_category_id;

    private String details;

   }