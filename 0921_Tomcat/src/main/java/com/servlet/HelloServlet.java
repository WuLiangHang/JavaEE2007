package com.servlet;

import javax.servlet.*;
import java.io.IOException;

//1.编写一个类去实现Servlet接口
//2.实现service方法 处理请求并且相应数据
//3.到web.xml中配置servlet程序的访问地址
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("HelloServlet无参构造函数");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet被初始化 执行init()方法。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //专门用来处理请求和响应的
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet被访问了。");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("web工程停止，HelloServlet被销毁。");
    }
}