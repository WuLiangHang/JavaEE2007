package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getAttribute(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setAttribute(req, resp);
    }

    /**
     * 往Session 中保存数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp)throws ServletException,
            IOException {
        req.getSession().setAttribute("key1", "value1");
        resp.getWriter().write("已经往Session 中保存了数据");
    }

    /**
     * 获取Session 域中的数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp)throws ServletException,
            IOException {
        Object attribute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从Session 中获取出key1 的数据是：" + attribute);
    }

}
