package com.servlet;

import com.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Cookie cookie = new Cookie("key1", "value3");
//        response.addCookie(cookie);
        Cookie cookie = CookieUtils.findCookie("key1", request.getCookies());
        if (cookie != null) {
//            2、调用setValue()方法赋于新的Cookie 值。
            cookie.setValue("newValue6");
//        3、调用response.addCookie()通知客户端保存修改
            response.addCookie(cookie);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        createCookie(request, response);
//        life10(request, response);
//        Cookie cookie = new Cookie("username", "admin");
//        cookie.setMaxAge(-1);
//        response.addCookie(cookie);
        testPath(request, response);
    }

    protected void createCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        //1.创建Cookie对象
        Cookie cookie = new Cookie("username", "admin");
        cookie.setMaxAge(60 * 60);
        //2.通知客户端保存cookie
        response.addCookie(cookie);
        response.getWriter().write("Cookie成功");
    }

    protected void life10(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Cookie cookie = new Cookie("life10", "life10");
        cookie.setMaxAge(10); // 设置Cookie 10秒之后被删除。无效
        resp.addCookie(cookie);
        resp.getWriter().write("已经创建了一个存活10秒的Cookie");
    }

    /**
     * 马上删除一个Cookie
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 先找到你要删除的Cookie 对象
        Cookie cookie = CookieUtils.findCookie("admin", req.getCookies());
        if (cookie != null) {
            // 调用setMaxAge(0);
            cookie.setMaxAge(0); // 表示马上删除，都不需要等待浏览器关闭
            // 调用response.addCookie(cookie);
            resp.addCookie(cookie);
            resp.getWriter().write("admin 的Cookie 已经被删除");
        }
    }

    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1", "path1Value");
        // getContextPath() ===>>>>  得到工程路径
        cookie.setPath(req.getContextPath() + "/abc"); // ===>>>>  /工程路径/abc
        resp.addCookie(cookie);
        Cookie cookie2 = new Cookie("path2", "path2Value");
        cookie2.setPath(req.getContextPath()); // ===>>>>  /工程路径/abc
        resp.addCookie(cookie2);
        resp.getWriter().write("创建了一个带有Path 路径的Cookie");
    }
}
