package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MyServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("utf-8");
        String pname = request.getParameter("username");
        String[] c1 = request.getParameterValues("c1");
        String[] selectedlang = request.getParameterValues("selectedlang");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h3>你喜欢哪些语言：" + Arrays.toString(c1) + "</h3>");
        out.print("<h3>请选择你喜欢的计算机编程语言：" + Arrays.toString(selectedlang) + "</h3>");
        out.print("<h3>用户名：" + pname + "</h3>");
        out.close();

    }

}
