package com.dyp.mybatis.test;

import com.dyp.mybatis.mapper.UserMapper;
import com.dyp.mybatis.pojo.User;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectUserTest {

//    5。1查询一个pojo
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById("1");
        System.out.println(userById);
    }

//    5。2查询一个集合list
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }


    //    5.3查询一个单行
    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }


    //5.4查询到Map
    @Test
    public void testGetUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userMapById = mapper.getUserMapById("1");
        System.out.println(userMapById);

        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);
    }

//    5.5查询List<Map>

    @Test
    public void testAllUserToListMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> allUserToListMap = mapper.getAllUserToListMap();
        allUserToListMap.forEach(System.out::println);
    }

//    6特殊查询
//    6.1模糊查询
@Test
public void testGetUserByLike(){
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> user01 = mapper.getUserByLike01("ad");
    user01.forEach(System.out::println);
    List<User> user02 = mapper.getUserByLike02("ad");
    user01.forEach(System.out::println);
    List<User> user03 = mapper.getUserByLike03("ad");
    user01.forEach(System.out::println);

}

    //    6特殊查询
//    6.2批量删除
    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteMore("2,3");
    }

//    6.3动态表名

    @Test
    public void testGetListByTable(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> t_user = mapper.getListByTable("t_user");
        t_user.forEach(System.out::println);
    }

//6.4获取自增主键
    @Test
    public void testInsertUserGetId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "李四", "123456", 12, "男", "1234@qq.com");
        mapper.insertUserGetId(user);
        System.out.println(user);
    }











}
