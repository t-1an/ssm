package com.xiaotian.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.xiaotian.ssm.pojo.User;
import com.xiaotian.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author longxiaotian
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @param page  页码
     * @param limit 每页数量
     * @return 分页后的user列表
     */
    @RequestMapping("/userList")
    @ResponseBody
    public List<User> getUserList(int page, int limit) {
        PageInfo<User> userPageInfo = userService.getUserList(page, limit);
        return userPageInfo.getList();
    }
}
