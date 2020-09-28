package com.servlet;

import com.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Student(i, "student" + i, 18 + i, "123456" + i));
        }
        request.setAttribute("studentList", list);
        request.getRequestDispatcher("/studentList.jsp").forward(request, response);
    }
}
