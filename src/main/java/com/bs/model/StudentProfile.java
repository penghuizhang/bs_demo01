package com.bs.model;

import org.springframework.stereotype.Component;

/**
 * Created by kylin on 2018/5/1.
 */
@Component
public class StudentProfile {

    private Integer id;

    private String nickName;

    private String gender;

    private String city;

    private String province;

    private String country;

    private String imageUrl;

    private String useraccount;

    private String email;

    private String study_course;

    public String getStudy_course() {
        return study_course;
    }

    public void setStudy_course(String study_course) {
        this.study_course = study_course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }
}
