package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ShowTodayDateServlet", urlPatterns = {"/date"})
public class ShowTodayDateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print(" <head> ");
        out.print("  <meta charset=\"UTF-8\" /> ");
        out.print("  <title>今天的日期</title>");
        out.print(" </head>");
        out.print(" <body>");
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        out.print("   今天的日期：" + df.format(date));
        out.print("  <br />");
        out.print(" </body>");
        out.print("</html>");

        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
