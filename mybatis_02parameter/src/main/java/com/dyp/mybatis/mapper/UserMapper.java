package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

//    单个字面量类型
    User getUserByUsername01(String username);
    User getUserByUsername02(String username);

//    多个字面量类型
    User checkLogin01(String username,String password);
    User checkLogin02(String username,String password);

//    map
    User checkLoginByMap(Map<String,Object> map);



}
