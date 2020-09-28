package com.shop.test;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.entity.User;
import org.junit.Test;

public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void test1() {
//        System.out.println(userDao.queryUserByUsername("admin"));
//        System.out.println(userDao.queryUserByUserNameAndPassWord("admin", "123"));

        System.out.println(userDao.saveUser(new User("admin5", "123","123@qq.com")));
    }
}
