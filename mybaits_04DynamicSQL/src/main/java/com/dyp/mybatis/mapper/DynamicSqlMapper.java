package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSqlMapper {

//    if标签
    List<Emp> getEmpListByMoreTJ(Emp emp);

//    where标签
    List<Emp> getEmpListByMoreTJ2(Emp emp);

//     trim标签
    List<Emp> getEmpListByMoreTJ3(Emp emp);

//    choose where otherwise(switch)
    List<Emp> getEmpByChoose(Emp emp);

    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);


    List<Emp> getEmpByCondition(Emp emp);
}
