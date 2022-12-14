package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.DynamicSqlMapper;
import com.dyp.mybatis.pojo.Emp;
import com.dyp.mybatis.utils.SqlSessionUtils;
import jdk.nashorn.internal.ir.CallNode;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestMybatis {

    @Test
    public void getEmpListByMoreTJ(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpListByMoreTJ(new Emp(null, "张三", 18, "男"));
        empListByMoreTJ.forEach(System.out::println);
    }

//    where标签

    /**
     * a>若where标签中的if条件都不满足，则where标签没有任何功能，即不会添加where关键字
     *
     * b>若where标签中的if条件满足，则where标签会自动添加where关键字，并将条件最前方多余的and去掉
     *
     * 注意：where标签不能去掉条件最后多余的and
     */
    @Test
    public void getEmpListByMoreTJ2(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpListByMoreTJ2(new Emp(null, "", 18, "男"));
        empListByMoreTJ.forEach(System.out::println);
    }

    /**
     * 常用属性：
     *
     *   prefix：在trim标签中的内容的前面添加某些内容
     *
     *   prefixOverrides：在trim标签中的内容的前面去掉某些内容
     *
     *   suffix：在trim标签中的内容的后面添加某些内容
     *
     *   suffixOverrides：在trim标签中的内容的后面去掉某些内容
     */
    @Test
    public void getEmpListByMoreTJ3(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpListByMoreTJ3(new Emp(null, "", 18, "男"));
        empListByMoreTJ.forEach(System.out::println);
    }

//8。4

    /**
     *
     */
    @Test
    public void getEmpByChoose(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpByChoose(new Emp(null, "", 18, "男"));
        empListByMoreTJ.forEach(System.out::println);
    }

//    foreach 批量添加
    @Test
    public void insertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp1 = new Emp(null, "小明1", 20, "男");
        Emp emp2 = new Emp(null, "小明2", 20, "男");
        Emp emp3 = new Emp(null, "小明3", 20, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void deleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Integer[] integers = {5, 6, 7};
        mapper.deleteMoreEmp(integers);
    }

//    Sql片段
    @Test
    public void getEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> emps = mapper.getEmpByCondition(new Emp(null, "", 18, "男"));
        emps.forEach(System.out::println);
    }


}
