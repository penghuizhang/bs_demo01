package com.bs.service.impl;

import com.bs.mapper.UserprofileMapper;
import com.bs.model.Userprofile;
import com.bs.service.UserprofileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by kylin on 2018/3/17.
 */
@Service(value = "userProfile")
public class UserProfileServiceImpl implements UserprofileService {

    @Resource
    private UserprofileMapper userprofileMapper;

    @Override
    public int insert(Userprofile userProfile) throws Exception {
        return userprofileMapper.insert(userProfile);
    }

    @Override
    public Userprofile selectOpenIdIsExist(String UserAccount) throws Exception {
        return userprofileMapper.selectOpenIdIsExist(UserAccount);
    }
}
