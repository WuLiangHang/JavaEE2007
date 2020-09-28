package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");//MIME
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("admin") && password.equals("123")) {
            Cookie cookie = new Cookie("username", username);
            resp.addCookie(cookie);
            resp.getWriter().write("<h1>登录成功</h1>");
        } else {
            resp.getWriter().write("<h1>登录失败</h1>");
        }
    }
}
