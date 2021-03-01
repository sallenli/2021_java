package com.blog.dao.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public User queryUser(String account) {
        SqlSession sqlSession= sqlSessionFactory.openSession();
        User user=null;
        try {
             user=sqlSession.selectOne(workspace+".queryUser",account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.close();
        return user;
    }
}
