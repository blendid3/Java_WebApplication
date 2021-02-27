package com.zhijieketang.layerdemo.ui;

import com.zhijieketang.layerdemo.domain.Customer;
import com.zhijieketang.layerdemo.service.CustomerService;
import com.zhijieketang.layerdemo.service.imp.CustomerServiceImp;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends javax.servlet.http.HttpServlet {

    CustomerService customerService = new CustomerServiceImp();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // 操作标志
        String action = request.getParameter("action");

        if ("search".equalsIgnoreCase(action)) {
            //TODO
        } else if ("reg".equalsIgnoreCase(action)) {
            //TODO
        } else if ("login".equalsIgnoreCase(action)) {

            String userid = request.getParameter("userid");
            String userpwd = request.getParameter("userpwd");

            Customer customer = new Customer();
            customer.setId(userid);
            customer.setPassword(userpwd);

            if (customerService.login(customer)) {
                //登录成功
                HttpSession session = request.getSession();
                session.setAttribute("customer", customer);
                request.getRequestDispatcher("login_success.jsp").forward(request, response);
            } else {
                // 登录失败
                request.getRequestDispatcher("login.html").forward(request, response);
            }

        }


    }
}
