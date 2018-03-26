package com.bs.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.NotNull;
import java.util.Date;


@Component
@Getter
@Setter
public class Userprofile {

    private Integer id;

    private String password;

    private Date lastLogin;

    private Boolean isSuperuser;


    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private Boolean isStaff;

    private Boolean isActive;

    private Date dateJoined;

//    昵称
    private String nickName;

    private Date birthday;

    private String gender;

    private String address;

    private String mobile;

    private String image;

    private String userAccount;

    private String image_url;
}