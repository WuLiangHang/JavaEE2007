package com.servlet.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //响应的乱码解决
        //方案1:不推荐
//        //设置服务器字符集为UTF-8
//        response.setCharacterEncoding("UTF-8");
//        //通过响应头 设置浏览器也使用UTF-8字符集
//        response.setHeader("Content-type", "text/html;charset=UTF-8");

        //方案2:推荐
        //它会同时设置服务器和客户端使用UTF-8字符集 还设置了响应头
        //此方法一定要在获取流对象之前调用才有效
        response.setContentType("text/html;charset=UTF-8");
        //登录成功
        //要求 往客户端回传字符串数据
        PrintWriter writer = response.getWriter();
        writer.write("这是ResponseIOServlet 的相应内容！");
    }
}
