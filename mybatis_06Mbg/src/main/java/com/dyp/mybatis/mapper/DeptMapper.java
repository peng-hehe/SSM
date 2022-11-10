package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.Dept;
import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Wed Nov 09 14:34:36 CST 2022
     */
    int deleteByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Wed Nov 09 14:34:36 CST 2022
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Wed Nov 09 14:34:36 CST 2022
     */
    Dept selectByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Wed Nov 09 14:34:36 CST 2022
     */
    List<Dept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Wed Nov 09 14:34:36 CST 2022
     */
    int updateByPrimaryKey(Dept record);
}