package com.shop.test;

import com.shop.bean.User;
import com.shop.service.UserService;
import com.shop.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        boolean result = userService.registUser(new User("abc123", "123123", "abc123@qq.com"));
        System.out.println("注册是否成功?" + result);
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User("admin", "123", null)));
    }

    @Test
    public void existsUsername() {
        if (!userService.existsUsername("admin")) {
            System.out.println("用户名已存在");
        } else {
            System.out.println("用户名可用");
        }
    }
}
