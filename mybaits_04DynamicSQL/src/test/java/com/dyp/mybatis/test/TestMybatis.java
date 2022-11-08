package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.DynamicSqlMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {

    @Test
    public void getEmpListByMoreTJ(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpListByMoreTJ(new Emp(null, "张三", 18, "男"));
        empListByMoreTJ.forEach(System.out::println);
    }
}
