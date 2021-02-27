package com.zhijieketang;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends javax.servlet.http.HttpServlet {

    UserDAOBean userDAOBean = new UserDAOBean();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // 操作标志
        String action = request.getParameter("action");

        if ("search".equalsIgnoreCase(action)) {
            // 查询所有数据
            // http://localhost:9999/Controller?action=search

            List<UserBean> list = userDAOBean.findAll();
            // 数据保存到request属性中
            request.setAttribute("list", list);
            // 页面跳转
            request.getRequestDispatcher("user_list.jsp").forward(request, response);

        } else if ("delete".equalsIgnoreCase(action)) {// 删除数据

            String strUserid = request.getParameter("userid");
            userDAOBean.remove(new Integer(strUserid));
            request.getRequestDispatcher("delete_success.html").forward(request, response);
        }

    }
}
