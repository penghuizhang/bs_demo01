package com.bs.model.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by kylin on 2018/3/18.
 */

@Component
public class Note_User_course_pojo {

    private String note_message;


    private String image_url;

    private String nick_name;

    private String user_id;

    private Date add_time;

    public String getNote_message() {

        return note_message;
    }

    public void setNote_message(String note_message) {
        this.note_message = note_message;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }
}
