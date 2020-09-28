package com.servlet;

import com.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet1 extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null && cookies.length > 0) {
//            for (int i = 0; i < cookies.length; i++) {
//                response.getWriter().write("CookieName = " + cookies[i].getName() + "<br/>");
//                response.getWriter().write("CookieValue = " + cookies[i].getValue() + "<br/>");
//            }
//        } else {
//            response.getWriter().write("没有Cookie!");
//        }
        getCookie(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        createCookie(request, response);
    }

    protected void createCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        //1.创建Cookie对象
        Cookie cookie = new Cookie("key1", "value1");
        //2.通知客户端保存cookie
        response.addCookie(cookie);
        //1.创建Cookie对象
        Cookie cookie1 = new Cookie("key2", "value2");
        //2.通知客户端保存cookie
        response.addCookie(cookie1);
        response.getWriter().write("Cookie成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cookies = req.getCookies();
//        for (Cookie cookie : cookies) {
//            resp.getWriter().write("Cookie[" + cookie.getName() + "=" + cookie.getValue() + "] <br/>");
//        }
        Cookie[] cookies = req.getCookies();
        Cookie iWantCookie = CookieUtils.findCookie("key1", cookies);
        // 如果不等于null，说明赋过值，也就是找到了需要的Cookie
        if (iWantCookie != null) {
            resp.getWriter().write("找到了需要的Cookie, CookieName = " + iWantCookie.getName());
        } else {
            resp.getWriter().write("没有找到该Cookie！");
        }
    }

}
