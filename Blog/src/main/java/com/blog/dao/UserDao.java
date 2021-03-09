package com.blog.dao;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserDao {

        String workspace="com.blog.dao.UserDao";
        public User queryUser(@Param("account") String account);

        String saveUser(@Param("user")User user);
}
