package com.zjw.controller;

import com.zjw.spring.annotation.Component;
import com.zjw.spring.mvc.annotation.RequestMapping;

@Component
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello.do")
    public User hello(User user){
        System.out.println(user);
        return user;
    }

    @RequestMapping("/test.do")
    public String test(){
        return "test";
    }
}
