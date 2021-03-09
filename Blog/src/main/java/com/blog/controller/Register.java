package com.blog.controller;


import com.blog.entity.User;
import com.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


@RestController
public class Register {

    private Logger log= LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;
    @GetMapping("/queryUser/{accountId}")
    public String queryUser(@PathVariable(name = "accountId") String account){
        try {
            if(StringUtils.hasLength(account)){
                String s = userService.QueryUser(account);
                  return s;
            }
            else {
                return "请输入用户名";
            }
        } catch (Exception e) {

            log.info(e.getMessage());
            e.printStackTrace();
            return "用户信息错误";
        }
    }
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        if(StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())){
          //  String userName = userService.QueryUser(user.getUserName());
           // if(StringUtils.hasLength(userName)){
               // return "用户名重复，请重新输入";
           // }
           // else {
                try {
                   return userService.saveUser(user);

                } catch (Exception e) {
                    e.printStackTrace();
                    return  "用户注册失败";
                }
            }
      //  }
        else {
            return "缺少用户名/密码";
        }


    }
}
