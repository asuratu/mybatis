package com.feng.test;

import com.feng.mapper.UserMapper;
import com.feng.model.User;
import com.mysql.cj.callback.MysqlCallbackHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author AsuraTu
 */
public class TestJUnitMybatis extends Base {

    @Test
    public void testFindUserById() throws IOException {

        SqlSessionFactory sqlSessionFactory = this.prepareBuilder();

        // 以上不用背, 知道怎么用就行
        // 以下是重点

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
        SqlSessionFactory sqlSessionFactory = this.prepareBuilder();

        // 以上不用背, 知道怎么用就行
        // 以下是重点

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




}
