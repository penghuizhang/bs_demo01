package com.bs.controller;

import com.bs.mapper.UserprofileMapper;
import com.bs.model.Result;
import com.bs.service.UserprofileService;
import com.bs.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bs.model.Userprofile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kylin on 2018/3/17.
 */
@Api(description = "用户个人信息相关")
@RestController
public class userProfileController {

    @Autowired
    private UserprofileService userprofileService;


    @ApiOperation(value="创建用户", notes="根据用户点击个人页面获取用户信息")
    @PostMapping("user/add")
    public Result addUser(Userprofile userProfile) throws Exception{

        String userAccount = userProfile.getUserAccount();

        Userprofile u = userprofileService.selectOpenIdIsExist(userAccount);
        if (u == null){
            //如果为空,说明第一次使用，没有进行登录过，需要写入到数据库
            String gender = userProfile.getGender();
            if (gender.equals("1")){
                userProfile.setGender("female");
            }else if (gender.equals("0")){
                userProfile.setGender("male");
            }else{
                userProfile.setGender("Uunknowe");

            }
            return ResultUtil.success(userprofileService.insert(userProfile)) ;
        }else{
            //说明是微信登录失效，进行刷新，数据库不需要更新，因为用户openid唯一
            return null;
        }



    }
}
