package com.shop.test;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUserName() {
        if (userDao.queryUserByUsername("admin") == null) {
            System.out.println("用户名可用");
        } else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUserNameAndPassWord() {
        if (userDao.queryUserByUserNameAndPassWord("admin", "1234") == null) {
            System.out.println("用户名密码错误，登录失败");
        } else {
            System.out.println("登录成功");
        }
    }

    @Test
    public void saveUser(){
        System.out.println(userDao.saveUser(new User("admin1","123123","123456@yahoo.com")));
    }
}
