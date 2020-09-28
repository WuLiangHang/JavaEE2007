package com.shop.servlet;

import com.shop.entity.User;
import com.shop.service.UserService;
import com.shop.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username, password);
        if (userService.login(user) != null) {
            req.getSession().setAttribute("username", username);
            req.getSession().setAttribute("password", password);
            req.getRequestDispatcher("pages/user/login_success.html").forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/pages/user/login.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
