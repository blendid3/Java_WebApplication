package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CServlet", urlPatterns = {"/cpage"})
public class CServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 取出Cookie
        String pname = null;
        Cookie[] cookies = request.getCookies(); //所有的Cookie
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    pname = cookie.getValue();
                    break;
                }
            }
        }

        request.setCharacterEncoding("utf-8");
//        String page = request.getParameter("page");
//        String username = request.getParameter("username");

        response.setContentType("text/html;charset=utf-8");

        StringBuffer sbr = new StringBuffer();
        sbr.append("<!DOCTYPE html>");
        sbr.append("<html>");
        sbr.append("<head>");
        sbr.append("    <meta charset=\"utf-8\">");
        sbr.append("    <title>C页面</title>");
        sbr.append("</head>");
        sbr.append("<body>");
        sbr.append("    用户名：").append(pname).append(" <br>");
        sbr.append("   <a href=\"delcookie?username=\"").append(pname).append(">删除Cookie</a>");
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
