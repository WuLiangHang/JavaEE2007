package com.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet1 implements Servlet {
    public HelloServlet1() {
        System.out.println("1.HelloServlet1()无参构造函数被调用。");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init方法被调用");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.service方法被调用 === HelloServlet被访问。");
        //请求信息的获取(HttpServletRequest 有getMethod()方法)
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();
        switch (method){
            case "GET":
                System.out.println("GET请求");
                break;
            case "POST":
                System.out.println("POST请求");
                break;
            case "PUT":
                System.out.println("PUT请求");
                break;
            case "DELETE":
                System.out.println("DELETE请求");
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("web工程停止，HelloServlet1被销毁。");
    }
}