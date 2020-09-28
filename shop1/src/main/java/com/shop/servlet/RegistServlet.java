package com.shop.servlet;

import com.shop.entity.User;
import com.shop.service.UserService;
import com.shop.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        User user = new User(username, password, email);
        boolean flag = userService.registUser(user);
        if (flag) {
            resp.sendRedirect(req.getContextPath() + "/pages/user/regist_success.html");
        } else {
            resp.sendRedirect(req.getContextPath() + "/pages/user/regist.html");
        }
    }
}
