package com.shop.dao.impl;

import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;
import com.shop.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM `T_user` WHERE `username` = ?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryUserByUserNameAndPassWord(String username, String password) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM `T_user` WHERE `username` = ? AND `password` = ?";

        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "INSERT INTO `T_user` (`username`, `password`, `email`) VALUES (?, ?, ?);";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }
}
