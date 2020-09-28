package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContext2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //4.ServletContext像Map一样存取数据
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext context = getServletContext();
        System.out.println(context);
        System.out.println("保存之前：Context获取key的值" + context.getAttribute("key"));
        context.setAttribute("key", "value");
        System.out.println("context获取域数据key的值是:" + context.getAttribute("key"));
        context.removeAttribute("key");
        System.out.println(context.getAttribute("key"));
    }
}
