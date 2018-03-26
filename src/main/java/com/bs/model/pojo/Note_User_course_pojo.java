package com.bs.model.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by kylin on 2018/3/18.
 */

@Component
@Getter
@Setter
public class Note_User_course_pojo {

    private String note_message;


    private String image_url;

    private String nick_name;

    private String user_id;
}
