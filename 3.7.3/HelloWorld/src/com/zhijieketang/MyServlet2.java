package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "MyServlet2", urlPatterns = {"/myservlet2"})
public class MyServlet2 extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("utf-8");
        String pname = request.getParameter("username");
        String[] c1 = request.getParameterValues("c1");
        String[] selectedlang = request.getParameterValues("selectedlang");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h3>用户名：" + pname + "</h3>");
        out.close();

    }

}
