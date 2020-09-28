package com.servlet;

import com.bean.Person;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        Gson gson = new Gson();
        resp.setContentType("text/html;charset=utf-8");
        Person person = null;
        String jsonStr = null;
        if (action.equals("jQueryAjax")){
            person = new Person(1, 18, "小明jQueryAjax", 'M');
        }else if(action.equals("jQueryGet")){
            person = new Person(1, 18, "小明jQueryGet", 'M');
        }else if(action.equals("jQueryPost")){
            person = new Person(1, 18, "小明jQueryPost", 'M');
        }
        jsonStr = gson.toJson(person);
        resp.getWriter().write(jsonStr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(2, 19, "小红", 'F');
        Gson gson = new Gson();
        String jsonStr = gson.toJson(person);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(jsonStr);
    }
}
