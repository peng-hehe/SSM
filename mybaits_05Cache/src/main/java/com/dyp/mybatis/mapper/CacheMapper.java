package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    Emp getEmpById(@Param("empId") Integer empId);


}
