package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.User;

import java.util.List;

public interface UserMapper01 {

    Integer insertUser();

    User getUserById();
    List<User> getAllUser();


}
