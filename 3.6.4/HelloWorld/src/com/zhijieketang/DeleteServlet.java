package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteServlet", urlPatterns = {"/delsession"})
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
//        String username = request.getParameter("username");

        // 删除Session
        HttpSession session = request.getSession();
        session.removeAttribute("username");

        StringBuffer sbr = new StringBuffer();
        sbr.append("<!DOCTYPE html>");
        sbr.append("<html>");
        sbr.append("<head>");
        sbr.append("    <meta charset=\"utf-8\">");
        sbr.append("    <title>删除Session页面</title>");
        sbr.append("</head>");
        sbr.append("<body>");
        sbr.append("    Session已经删除");
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
