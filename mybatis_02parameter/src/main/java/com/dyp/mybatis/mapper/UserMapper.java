package com.dyp.mybatis.mapper;

import com.dyp.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
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

//    5.3查询单行单列
    Integer getCount();

//    5.4查询到Map
    Map<String,Object> getUserMapById(@Param("id") String id);
    @MapKey("id")
    Map<String,Object> getAllUserToMap();

//    5.5查询List<Map>
    List<Map<String,Object>> getAllUserToListMap();




//    特殊查询

//    6.1模糊查询

    List<User> getUserByLike01(@Param("mohu") String mohu);
    List<User> getUserByLike02(@Param("mohu") String mohu);
    List<User> getUserByLike03(@Param("mohu") String mohu);

//    6.2批量删除

    void deleteMore(@Param("ids") String ids);

//6.3动态表名

    List<User> getListByTable(@Param("tableName") String tableName);

//    6.4获取自增主键
    void insertUserGetId(User user);


}
