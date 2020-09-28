package com.shop.service.impl;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean registUser(User user) {
        int result = userDao.saveUser(user);
        return (result > -1);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUserNameAndPassWord(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        return (userDao.queryUserByUsername(username) == null);
    }
}
