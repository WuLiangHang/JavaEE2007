package com.ebank.controller;

import com.ebank.entity.Phone;
import com.ebank.service.PhoneService;
import com.ebank.service.impl.PhoneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {
    Phone phone = null;
    PhoneService phoneService = new PhoneServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pay = request.getParameter("pay");
        if (pay == null) {
            String phoneNum = request.getParameter("phoneNum");
            phone = phoneService.queryByPhone(phoneNum);
            if (phone != null) {
                request.setAttribute("phone", phone);
                if (phone.getStatus() == 1) {
                    request.getRequestDispatcher("phonePaid.jsp").forward(request, response);
                } else if (phone.getStatus() == 0) {
                    request.getRequestDispatcher("phoneNotPaid.jsp").forward(request, response);
                }
                request.setAttribute("message", null);
            } else {
                request.setAttribute("message", "办理业务的号码不存在，请重新输入。");
                request.getRequestDispatcher("search.jsp").forward(request, response);
            }
        } else {
            int result = phoneService.update(phone);
            if (result < 0) {
                response.sendRedirect("failed.html");
            } else {
                response.sendRedirect("success.html");
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
