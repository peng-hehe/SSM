package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.EmpMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void testMBG() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
    }

    @Test
    public  void testPage(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(2, 5);
        System.out.println(page);


        List<Emp> emps = mapper.selectAll();

        System.out.println(page);

        emps.forEach(System.out::println);

        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 5);
        System.out.println(empPageInfo);


    }



}
