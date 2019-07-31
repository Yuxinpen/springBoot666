package com.qianfeng.controller;

import com.qianfeng.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String hello(Model model){
        //异常
        //int i = 1/0;

        String username = "马云";
        model.addAttribute("username",username);

        TUser user = new TUser(1L,"zs","123");
        model.addAttribute("user",user);

        model.addAttribute("money",10000);

        List<TUser> users = new ArrayList<>();
        users.add(new TUser(2L,"科比","888"));
        users.add(new TUser(3L,"詹姆斯","999"));

        model.addAttribute("users",users);

        model.addAttribute("now",new Date());

        return "hello";
    }
}
