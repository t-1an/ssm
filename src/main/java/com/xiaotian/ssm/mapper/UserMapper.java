package com.xiaotian.ssm.mapper;

import com.xiaotian.ssm.pojo.User;

import java.util.List;

/**
 * @author longxiaotian
 */
public interface UserMapper {
    /**
     * Gets all users.
     *
     * @return the all users
     */
    List<User> getAllUsers();
}
