package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

//    7.1字段名和属性名不一致的情况
    Emp getEmpByEmpId(@Param("empId") Integer empId);
    Emp getEmpResultMapByEmpId(@Param("empId") Integer empId);


//    7.2多对一关系

//    方式一：级联方式处理 ，即一次连接出所有字段。
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

//    方式二：association 标签。处理实体类类型的属性
    Emp getEmpAndDeptByEmpIdTwo(@Param("empId") Integer empId);


//    方法三：分步查询
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);





}
