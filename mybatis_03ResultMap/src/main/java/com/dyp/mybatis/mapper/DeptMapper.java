package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);


    //    7.3一对多关系

    //    方式一：级联 + collection
    Dept getDeptAndEmpsByDeptId(@Param("deptId") Integer deptId);
}
