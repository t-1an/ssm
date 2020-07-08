package com.xiaotian.ssm.service;

import com.github.pagehelper.PageInfo;
import com.xiaotian.ssm.pojo.User;

/**
 * @author longxiaotian
 */
public interface UserService {

    /**
     * Gets user list.
     *
     * @param page  the page
     * @param limit the limit
     * @return the user list
     */
    PageInfo<User> getUserList(int page, int limit);
}
