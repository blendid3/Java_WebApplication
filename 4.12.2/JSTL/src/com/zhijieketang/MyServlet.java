package com.zhijieketang;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String str = "Tony.";
        request.setAttribute("name", str);

        RequestDispatcher dispatcher = request.getRequestDispatcher("page1.jsp");
        dispatcher.forward(request, response);
    }
}
