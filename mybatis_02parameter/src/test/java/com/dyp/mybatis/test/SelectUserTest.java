package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.UserMapper;
import com.dyp.mybatis.pojo.User;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SelectUserTest {

//    5。1查询一个pojo
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById("1");
        System.out.println(userById);
    }

//    5。2查询一个集合list
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }


}
