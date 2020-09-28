package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//一般在实际项目中 都是使用继承HttpServlet的方式去实现Servlet程序
//1.编写一个类继承HttpServlet
//2.根据业务需要重写doGet或者doPost方法
//3.到web.xml中配置Servlet程序的访问地址
public class HelloServlet2 extends HttpServlet {

    public HelloServlet2() {
        System.out.println("1.构造函数被执行");
    }

    /**
     * doGet() 在get请求时被调用
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doGet方法被调用。");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doPost方法被调用。");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doPut方法被调用。");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doDelete方法被调用。");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("2.init初始化方法");
        //1.可以获取Servlet程序的别名 servlet-name的值
        System.out.println("HelloServlet2的别名是:" + config.getServletName());
        //2.获取初始化参数init-param
        System.out.println("初始化参数username的值是:" + config.getInitParameter("username"));
        System.out.println("初始化参数url的值是:" + config.getInitParameter("url"));
        //3.获取ServletContext对象
        System.out.println(config.getServletContext());
    }
}
