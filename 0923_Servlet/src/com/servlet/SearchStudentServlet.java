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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Student(i, "Stu" + i, 18 + i, "12345" + i));
        }
        req.setAttribute("studentList", list);
        req.getRequestDispatcher("/studentList.jsp").forward(req, resp);
    }
}
