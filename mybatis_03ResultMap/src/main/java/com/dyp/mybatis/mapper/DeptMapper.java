package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);
}
