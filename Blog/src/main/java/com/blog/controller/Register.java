package com.blog.controller;


import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Register {

    @Autowired
    UserService userService;
    @GetMapping("/register")
    public void setUser(String account,String userPassword){
      if(StringUtils.hasLength(account)&&StringUtils.hasLength(userPassword)){
       userService.QueryUser(account);
      }

    }
}
