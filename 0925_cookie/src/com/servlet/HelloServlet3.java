package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HelloServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");//MIME
        HttpSession session = req.getSession();
        System.out.println(session.isNew());
        System.out.println(session.getId());
        resp.getWriter().println("Session是否为新创建？" + session.isNew());
        resp.getWriter().println("SessionId:" + session.getId());
    }
}
