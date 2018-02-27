package com.bs.service.impl;

import com.bs.mapper.UserMapper;
import com.bs.model.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kylin on 2018/2/26.
 */
@Service(value = "userService")
public class userServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public int insertUser(User user) throws Exception {
        return userMapper.insertSelective(user);
    }
}
