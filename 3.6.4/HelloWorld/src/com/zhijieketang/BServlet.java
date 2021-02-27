package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BServlet", urlPatterns = {"/bpage"})
public class BServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");

        response.setContentType("text/html;charset=utf-8");
        // 获得Session
        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(1000);
        // 设置Session属性
        session.setAttribute("username", username);

        StringBuffer sbr = new StringBuffer();
        sbr.append("<!DOCTYPE html>");
        sbr.append("<html>");
        sbr.append("<head>");
        sbr.append("    <meta charset=\"utf-8\">");
        sbr.append("    <title>B页面</title>");
        sbr.append("</head>");
        sbr.append("<body>");
        sbr.append("<form action=\"cpage\" method=\"post\">");
        sbr.append("    用户名：").append(username).append(" <br>");
        sbr.append("    <input type=\"submit\" value=\"跳转到C页面\">");
        sbr.append("</form>");
        sbr.append("</body>");
        sbr.append("</html>");

        PrintWriter out = response.getWriter();
        out.print(sbr.toString());
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
