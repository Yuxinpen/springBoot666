package com.qianfeng.controller;

import com.qianfeng.entity.TUser;
import com.qianfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
