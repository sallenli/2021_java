package com.blog.dao;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public interface UserDao {

        String workspace="com.blog.dao.UserDao.java";
        public User queryUser(@Param("account") String account);

}
