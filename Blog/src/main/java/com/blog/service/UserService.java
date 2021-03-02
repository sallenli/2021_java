package com.blog.service;


import com.blog.entity.User;

public interface UserService {
     String QueryUser(String account);

     void saveUser(User user);
}
