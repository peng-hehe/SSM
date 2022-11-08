package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.CacheMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
