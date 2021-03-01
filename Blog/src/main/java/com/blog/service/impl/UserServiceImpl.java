package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public String QueryUser(String account) {
        if(StringUtils.hasLength(account)){
            User user = userDao.queryUser(account);
            return user.toString();
        }
        else {
            return "账号错误";
        }

    }
}
