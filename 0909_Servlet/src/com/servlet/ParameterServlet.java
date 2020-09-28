package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doPost方法进行请求的接收
        //doPost请求的中文乱码解决
        request.setCharacterEncoding("UTF-8");
        System.out.println("==================doPost==================");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");

        System.out.println("用户名:" + username);
        System.out.println("密码:" + password);
        System.out.println("兴趣爱好:" + Arrays.asList(hobbies));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==================doGet==================");
        //请求参数的获取
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");
        //doGet请求的中文乱码解决
        //1.先以iso8859-1 进行编码
        //2.再用utf-8解码
        username = new String(username.getBytes("iso-8859-1"), "UTF-8");

        System.out.println("用户名:" + username);
        System.out.println("密码:" + password);
        System.out.println("兴趣爱好:" + Arrays.asList(hobbies));

    }
}
