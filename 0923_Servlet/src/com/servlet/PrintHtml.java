package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintHtml extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("<html lang=\"en\">");
        out.write("<head>");
        out.write("    <meta charset=\"UTF-8\">");
        out.write("    <title>Title</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<a href=\"/0923_Servlet/MyServlet02\">请点击我</a>");
        out.write("<h1>这是HTML页面数据</h1>");
        out.write("</body>");
        out.write("</html>");

    }
}
