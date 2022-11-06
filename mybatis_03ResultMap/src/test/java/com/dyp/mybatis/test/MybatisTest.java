package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.DeptMapper;
import com.dyp.mybatis.mapper.EmpMapper;
import com.dyp.mybatis.pojo.Dept;
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


//7.2多对一关系


    @Test
    public void getEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empByEmpId);
    }
//方式二：association 标签。处理实体类类型的属性
    @Test
    public void getEmpAndDeptByEmpIdTwo(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByEmpIdTwo(1);
        System.out.println(empByEmpId);
    }

//    方法三：分步查询
    @Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(empByEmpId);
    }


//    7.3一对多关系

//    方式一：级联 + collection
@Test
public void getDeptAndEmpsByDeptId(){
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
    Dept dept = mapper.getDeptAndEmpsByDeptId(1);
    System.out.println(dept);
}



}
