package com.bs.controller;

import com.bs.model.Result;
import com.bs.model.User;
import com.bs.service.UserService;
import com.bs.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by kylin on 2018/2/25.
 */
@RestController
public class indexcontroller {

    @Autowired
    private User user;

    @Resource
    private UserService userService;


    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public Result index(@Valid User user,
                        String name,
                        String password,
                        Integer age,
                        BindingResult bindingResult) throws Exception{
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        User u = new User();
        u.setPassword(password);
        u.setName(name);
        u.setAge(age);

        int r = userService.insertUser(u);
        if (r == 1){
            return ResultUtil.success(u);
        }else {
            return ResultUtil.error(1,"插入失败");
        }

    }
}
