package com.dyp.mybaits.test;

import com.dyp.mybatis.mapper.UserMapper;
import com.dyp.mybatis.pojo.User;
import com.dyp.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testInsert() throws IOException {
        // 获取核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 获取SqlSessionFactoryBuilder 对象 -> 工厂构建器
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 创建 SqlSession 工厂 -> 创建会话
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

        // 获取 会话 对象 -> MyBatis 提供的操作数据库的对象
        //SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);


        // 获得Mapper接口的代理类 -> 操纵Mapper类执行数据库操作
        // 代理模式 -》实现mapper接口，创建实现类
        //     通过mapper接口全类名找到映射文件
        //     通过mapper接口要调用的方法，找到映射文件的sql语句
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL操作
        Integer rows = userMapper.insertUser();
        System.out.println("rows = " + rows);

        //唯一标识：namespace.Id  找到sql
//        int result = sqlSession.insert("com.dyp.mybatis.mapper.UserMapper.insertUser");
//        System.out.println("rows = " + result );

        // 提交事务 -> 事务是默认开启的
        sqlSession.commit();

        // 关闭资源
        sqlSession.close();

    }

    @Test
    public void getAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }

}
