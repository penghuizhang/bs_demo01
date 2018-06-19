package com.bs.model.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by kylin on 2018/5/10.
 */
@Component
public class send_message {
    public  Integer tri_id;
    public Integer course_id;
    public String name;
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTri_id() {
        return tri_id;
    }

    public void setTri_id(Integer tri_id) {
        this.tri_id = tri_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}
