package com.servlet.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1 ");

        request.setAttribute("key1", "value1");

        //请求重定向两种方案
        //方案1：不推荐使用
        // 设置响应状态码302 ，表示重定向，（已搬迁）
//        response.setStatus(302);
        // 设置响应头，说明 新的地址在哪里
        //也可以访问其他Servlet
//        response.setHeader("Location", "http://localhost:8083/0909_Servlet_war_exploded/Response2");
        //可以访问html页面
//        response.setHeader("Location", "http://localhost:8083/0909_Servlet_war_exploded/");
        //可以访问工程外的资源
//        response.setHeader("Location", "http://www.baidu.com");

        //方案2：推荐使用
        response.sendRedirect("http://www.baidu.com");
    }
}
