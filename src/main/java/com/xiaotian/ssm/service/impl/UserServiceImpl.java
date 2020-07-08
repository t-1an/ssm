package com.xiaotian.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaotian.ssm.mapper.UserMapper;
import com.xiaotian.ssm.pojo.User;
import com.xiaotian.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author longxiaotian
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * Gets user list.
     *
     * @param page  the page
     * @param limit the limit
     * @return the user list
     */
    @Override
    public PageInfo<User> getUserList(int page, int limit) {
        //开启分页
        PageHelper.startPage(page, limit);
        //通过mapper获取数据
        List<User> userList = userMapper.getAllUsers();
        //封装返回数据
        return new PageInfo<>(userList);
    }
}
