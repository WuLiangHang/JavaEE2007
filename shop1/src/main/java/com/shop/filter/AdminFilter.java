package com.shop.filter;

import com.shop.entity.User;
import com.shop.service.UserService;
import com.shop.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {
    UserService userService = new UserServiceImpl();

    public AdminFilter() {
        System.out.println("执行Filter无参构造函数");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter 的init(FilterConfig filterConfig)初始化");
//       1、获取Filter 的名称 filter-name 的内容
        System.out.println("filter-name 的值是：" + filterConfig.getFilterName());
//       2、获取在web.xml 中配置的init-param 初始化参数
        System.out.println("初始化参数username 的值是：" + filterConfig.getInitParameter("username"));
        System.out.println("初始化参数url 的值是：" + filterConfig.getInitParameter("url"));
//       3、获取ServletContext 对象
        System.out.println(filterConfig.getServletContext());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter被访问");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        if (username == null || password == null || username.isEmpty() || password.isEmpty() || userService.login(new User(username, password)) == null) {
            //代表登录超时 session中会话信息失效
            request.getRequestDispatcher("/pages/user/login.html").forward(request, response);
            return;
        } else {
            // 让程序继续往下访问用户的目标资源
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("执行销毁方法");
    }
}
