package com.dyp.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;

public interface UserDao {
    /**
     * 保存用户信息
     */
    @Autowired
    void saveUser();
}
