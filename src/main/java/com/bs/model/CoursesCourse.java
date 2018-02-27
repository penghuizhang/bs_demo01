package com.bs.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CoursesCourse {
    private Integer id;

    private String name;

    private String description;

    private String degree;

    private Integer learnTime;

    private Integer students;

    private Integer favoriteStudent;

    private String image;

    private Integer clickNumbers;

    private Date addTime;

    private Integer courseOrgId;

    private String category;

    private String tag;

    private Integer courseCategoryId;

    private String details;

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
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Integer getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(Integer learnTime) {
        this.learnTime = learnTime;
    }

    public Integer getStudents() {
        return students;
    }

    public void setStudents(Integer students) {
        this.students = students;
    }

    public Integer getFavoriteStudent() {
        return favoriteStudent;
    }

    public void setFavoriteStudent(Integer favoriteStudent) {
        this.favoriteStudent = favoriteStudent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getClickNumbers() {
        return clickNumbers;
    }

    public void setClickNumbers(Integer clickNumbers) {
        this.clickNumbers = clickNumbers;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCourseOrgId() {
        return courseOrgId;
    }

    public void setCourseOrgId(Integer courseOrgId) {
        this.courseOrgId = courseOrgId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(Integer courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}