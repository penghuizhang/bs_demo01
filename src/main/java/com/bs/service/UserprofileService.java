package com.bs.service;


import com.bs.model.Userprofile;

/**
 * Created by kylin on 2018/3/17.
 */
public interface UserprofileService {

    int insert(Userprofile userProfile) throws Exception;

    Userprofile selectOpenIdIsExist(String UserAccount) throws Exception;
}
