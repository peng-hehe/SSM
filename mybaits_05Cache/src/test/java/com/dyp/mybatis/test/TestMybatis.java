package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.CacheMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {

    @Test
    public void getEmpById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession.getMapper(CacheMapper.class);
        Emp empById1 = mapper1.getEmpById(1);
        System.out.println(empById1);

        Emp empById2 = mapper1.getEmpById(1);
        System.out.println(empById2);

        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp = mapper2.getEmpById(1);
        System.out.println(emp);

    }

    @Test
    public void testCache() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession1 = build.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById1 = mapper1.getEmpById(1);
        System.out.println(empById1);
        sqlSession1.close();


        SqlSession sqlSession2 = build.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp empById2 = mapper2.getEmpById(1);
        System.out.println(empById2);
        sqlSession2.close();

    }
}
