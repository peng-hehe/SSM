package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSqlMapper {

    List<Emp> getEmpListByMoreTJ(Emp emp);
}
