package com.feng.mapper;

import com.feng.model.User;

/**
 * @author asura
 */
public interface UserMapper {
    // Mapper 文件夹就是类似于 Dao 层的东西

    User findUserById(int id);
}
