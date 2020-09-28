package com.shop.service;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.entity.User;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean registUser(User user) {
        if (!existsUsername(user.getUsername())){
            return false;
        }
        int result = userDao.saveUser(user);
        return (result > 0);
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
