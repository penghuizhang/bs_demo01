package com.bs.model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
/**
 * 课程实体类
 * 添加一个学员list字段  5.1
 */
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

    private String user_list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getLearn_time() {
        return learn_time;
    }

    public void setLearn_time(Integer learn_time) {
        this.learn_time = learn_time;
    }

    public Integer getStudents() {
        return students;
    }

    public void setStudents(Integer students) {
        this.students = students;
    }

    public Integer getFavorite_student() {
        return favorite_student;
    }

    public void setFavorite_student(Integer favorite_student) {
        this.favorite_student = favorite_student;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getClick_numbers() {
        return click_numbers;
    }

    public void setClick_numbers(Integer click_numbers) {
        this.click_numbers = click_numbers;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Integer getCourse_org_id() {
        return course_org_id;
    }

    public void setCourse_org_id(Integer course_org_id) {
        this.course_org_id = course_org_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getCourse_category_id() {
        return course_category_id;
    }

    public void setCourse_category_id(Integer course_category_id) {
        this.course_category_id = course_category_id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUserList() {
        return user_list;
    }

    public void setUserList(String userList) {
        this.user_list = userList;
    }
}