package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.UserMapper;
import com.dyp.mybatis.pojo.User;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MybatisTest {

//    单个字面量
    @Test
    public void getUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByUsername01 = mapper.getUserByUsername01("admin");
        System.out.println(userByUsername01);

        User userByUsername02 = mapper.getUserByUsername02("admin");
        System.out.println(userByUsername02);
    }

    //    多个字面量
    @Test
    public void checkLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user01 = mapper.checkLogin01("admin","123456");
        System.out.println(user01);

        User user02 = mapper.checkLogin02("admin1","123456");
        System.out.println(user02);
    }

    //    map
    @Test
    public void checkLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username","admin");
        map.put("password","123456");

        User user = mapper.checkLoginByMap(map);
        System.out.println(user);

    }

//    单个pojo
    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "张三", "123456", 18, "男", "123@qq.com");
        mapper.insertUser(user);
    }

//    注解@Param
//    多个字面量
@Test
public void checkLoginByParam(){
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = mapper.checkLoginByParam("admin","123456");
    System.out.println(user);
}








}
