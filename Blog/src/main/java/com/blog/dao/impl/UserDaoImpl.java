package com.blog.dao.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
             sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
            return user;
        }

    }

    @Override
    public String saveUser(User user) {
        SqlSession sqlSession= null;
        try {
            sqlSession = sqlSessionFactory.openSession();
             sqlSession.insert(workspace + ".saveUser", user);
            sqlSession.commit();
            return  "用户注册成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "用户名重复，用户注册失败";
        }
        finally {
            sqlSession.close();
        }

    }
}
