package com.qainfeng.controller;

import com.qainfeng.entity.Resource;
import com.qainfeng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class controller {

    /*@Value("${fileServer.path}")
    private String fileServer;

    @Value("${emailServer.path}")
    private String emailServer;*/

    @Autowired
    private Resource resource;

    @GetMapping("properties")
    public String properties(){
        return resource.getImageServer()+":"+resource.getEmailServer();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello.SpringBoot!!!!";
    }
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }
    @PostMapping("add")
    public User add(User user){
        //user.setEntryDate(new Date());
        return user;
    }
}
