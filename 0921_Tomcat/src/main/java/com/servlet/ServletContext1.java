package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContext1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取web.xml中配置的上下文参数
        ServletContext context = this.getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param参数username的值是:" + username);
        String password = context.getInitParameter("password");
        System.out.println("context-param参数password的值是:" + password);
        //2.获取当前的工程路径： /工程路径
        System.out.println("当前工程路径：" + context.getContextPath());
        //3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径是：" + context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是:" + context.getRealPath("/css"));
        System.out.println("工程下1.jpg的绝对路径是:" + context.getRealPath("/img/1.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        // 获取ServletContext 对象
        ServletContext context = this.getServletContext();
        System.out.println(context);
        System.out.println("保存之前: Context1 获取 key1 的值是:" + context.getAttribute("key1"));
        context.setAttribute("key1", "value1");
        System.out.println("Context1中获取域数据key1的值是:" + context.getAttribute("key1"));
    }
}
