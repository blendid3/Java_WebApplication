package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", urlPatterns = {"/myservlet"})
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        User user = (User) request.getSession().getAttribute("userBean");
        StringBuilder sb = new StringBuilder();
        sb.append("用户id：").append(user.getUserid()).append("<br>");
        sb.append("用户名：").append(user.getUserName());

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
        out.close();
    }
}
