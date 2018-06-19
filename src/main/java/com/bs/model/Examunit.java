package com.bs.model;

import java.util.Date;

public class Examunit {
    private Integer id;

    private String studentId;

    private String choise_type;

    private String answer_a;

    private String answer_b;

    private String answer;

    private Date add_time;

    private Integer courseName_id;

    private String choise_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getChoise_type() {
        return choise_type;
    }

    public void setChoise_type(String choise_type) {
        this.choise_type = choise_type;
    }

    public String getAnswer_a() {
        return answer_a;
    }

    public void setAnswer_a(String answer_a) {
        this.answer_a = answer_a;
    }

    public String getAnswer_b() {
        return answer_b;
    }

    public void setAnswer_b(String answer_b) {
        this.answer_b = answer_b;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Integer getCourseName_id() {
        return courseName_id;
    }

    public void setCourseName_id(Integer courseName_id) {
        this.courseName_id = courseName_id;
    }

    public String getChoise_name() {
        return choise_name;
    }

    public void setChoise_name(String choise_name) {
        this.choise_name = choise_name;
    }
}