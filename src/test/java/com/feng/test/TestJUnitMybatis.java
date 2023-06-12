package com.feng.test;

import com.feng.mapper.UserMapper;
import com.feng.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @author AsuraTu
 */
public class TestJUnitMybatis {

    SqlSessionFactory sqlSessionFactory = null;

    @BeforeEach // BeforeEach 注解表示在每个测试方法执行之前都会执行一次
    public void prepare() throws IOException {
        System.out.println("准备工作");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @AfterEach // AfterEach 注解表示在每个测试方法执行之后都会执行一次
    public void after() {
        System.out.println("收尾工作");
    }

    @Test
    public void testFindUserById() throws IOException {
        // 获取 SqlSession 对象
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 利用动态代理技术, 获取到 UserMapper 的代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 调用代理对象的方法
            System.out.println(userMapper.findUserById(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFunc1() {
        System.out.println("测试方法1");
    }

    @Test
    public void findAllUser() throws IOException {
        // 获取 SqlSession 对象
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 利用动态代理技术, 获取到 UserMapper 的代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 调用代理对象的方法
            List<User> allUser = userMapper.findAllUser(1000, "feng");
            System.out.println("共计: " + allUser.size() + " 条数据");
            for (User user : allUser) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestFindUserByLoginMap() throws IOException {
        // 获取 SqlSession 对象
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 利用动态代理技术, 获取到 UserMapper 的代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 创建一个 Map, 用于存放登录信息
            HashMap<String, Object> loginMap = new HashMap<>();
            loginMap.put("passport", "admin1");
            loginMap.put("password", "111");

            // 调用代理对象的方法
            List<User> allUser = userMapper.findUserByLoginMap(loginMap);
            System.out.println("共计: " + allUser.size() + " 条数据");
            for (User user : allUser) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertUser() throws IOException {
        // 获取 SqlSession 对象
        // openSession() 方法默认是不自动提交事务的
        // 如果要自动提交事务, 需要传入一个 boolean 类型的参数 true, 如: openSession(true)
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 利用动态代理技术, 获取到 UserMapper 的代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 创建一个 Map, 用于存放登录信息
            User user = new User();
            user.setNickname("feng");
            user.setPassport("admin1");
            user.setPassword("111");
            user.setBalance(1000.0);

            // 调用代理对象的方法
            boolean insertUser = userMapper.insertUser(user);
            System.out.println(insertUser);
            // 提交事务, 默认是不自动提交事务的
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testUpdateUser() throws IOException {
        // 获取 SqlSession 对象
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 利用动态代理技术, 获取到 UserMapper 的代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 创建一个 Map, 用于存放登录信息
            User user = new User();
            user.setId(3);
            user.setNickname("feng1");
            user.setPassport("admin11");
            user.setPassword("111");
            user.setBalance(1000.0);

            // 调用代理对象的方法
            boolean updateUser = userMapper.updateUser(user);
            System.out.println(updateUser);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMap() {
        HashMap<String, Object> loginMap = new HashMap<>();
        loginMap.put("passport", "admin1");
        loginMap.put("password", "111");
        Object passport = loginMap.get("passport");
        System.out.println(passport);
    }


}
