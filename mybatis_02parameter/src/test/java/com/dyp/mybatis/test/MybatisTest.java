package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.UserMapper;
import com.dyp.mybatis.pojo.User;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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

}
