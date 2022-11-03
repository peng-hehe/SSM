package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//参数
//    单个字面量类型
    User getUserByUsername01(String username);
    User getUserByUsername02(String username);

//    多个字面量类型
    User checkLogin01(String username,String password);
    User checkLogin02(String username,String password);

//    map
    User checkLoginByMap(Map<String,Object> map);

//    单个pojo
    void insertUser(User user);

//    @Param
    User checkLoginByParam(@Param("aa") String username,@Param("bb") String password);



//查询
//      5。1查询一个实体对象
    User getUserById(@Param("id") String id);

//    5.2查询一个集合list
    List<User> getAllUser();


}
