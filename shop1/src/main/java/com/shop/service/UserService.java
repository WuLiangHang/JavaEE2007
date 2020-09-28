package com.shop.service;

import com.shop.entity.User;

public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     */
    public boolean registUser(User user);

    /**
     * 登录
     *
     * @param user
     * @return 如果返回null 说明登录失败
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     *
     * @param username
     * @return 返回true 代表用户名可用
     */
    public boolean existsUsername(String username);
}
