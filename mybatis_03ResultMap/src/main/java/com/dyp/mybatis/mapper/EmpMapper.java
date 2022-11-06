package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

//    7.1字段名和属性名不一致的情况
    Emp getEmpByEmpId(@Param("empId") Integer empId);
    Emp getEmpResultMapByEmpId(@Param("empId") Integer empId);





}
