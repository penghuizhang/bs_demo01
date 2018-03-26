package com.bs.mapper;

import com.bs.model.Userprofile;
import sun.plugin.util.UserProfile;

public interface UserprofileMapper {

//    插入用户信息，该用户信息仅仅写入一次
    int insert(Userprofile userProfile) throws Exception;

//    如果过期，又进行登录，则不进行操作，查询该openid是否存在
    Userprofile selectOpenIdIsExist(String UserAccount) throws Exception;

}
