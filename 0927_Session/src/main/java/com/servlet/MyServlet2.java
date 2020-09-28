package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 先获取Session 对象
        HttpSession session = req.getSession();
        // 设置当前Session3 秒后超时
        session.setMaxInactiveInterval(3);
        resp.getWriter().println(session.isNew());
        resp.getWriter().println(session.getId());
        resp.getWriter().write("当前Session 已经设置为3 秒后超时");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 先获取Session 对象
        HttpSession session = req.getSession();
        resp.getWriter().println(session.isNew());
        resp.getWriter().println(session.getId());
        // 让Session 会话马上超时
        session.invalidate();
        resp.getWriter().write("Session 已经设置为超时 （无效）");
    }
}
