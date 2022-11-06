package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.EmpMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest {

//    7.1字段名和属性名不一致的情况
    @Test
    public void getEmpByEmpId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);
    }

    @Test
    public void getEmpResultMapByEmpId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpResultMapByEmpId(1);
        System.out.println(empByEmpId);
    }
}
