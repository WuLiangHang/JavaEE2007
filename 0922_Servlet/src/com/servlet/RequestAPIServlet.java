package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.getRequestURI 获取请求的资源路径
        System.out.println("URI == " + request.getRequestURI());
        //2.获取请求的统一资源定位
        System.out.println("URL == " + request.getRequestURL());
        //3.获取客户端的ip地址
        System.out.println("客户端IP地址 == " + request.getRemoteHost());
        //4.获取请求头
        System.out.println("请求头 == " + request.getHeader("User-Agent"));
        //5.获取请求方式GET或者POST
        System.out.println("请求的方式 == " + request.getMethod());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}