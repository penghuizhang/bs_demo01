package com.bs.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class CategoryCourse {
    private Integer id;

    private String name;

    private String desc;

    private Date addTime;

    private String image;

}