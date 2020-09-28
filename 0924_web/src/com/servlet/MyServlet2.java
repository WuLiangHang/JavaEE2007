package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.getWriter().println("<h1>" + "username = " + username + "</h1>");
        resp.getWriter().println("<h1>" + "password = " + password + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.getWriter().println("post访问方式");
        resp.getWriter().println("<h1>" + "username = " + username + "</h1>");
        resp.getWriter().println("<h1>" + "password = " + password + "</h1>");
    }
}
