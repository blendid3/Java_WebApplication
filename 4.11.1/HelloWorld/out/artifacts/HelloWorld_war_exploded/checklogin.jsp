<%@ page contentType="text/html; charset=utf-8" %>
<html>
<body>
<%--进行登录检查--%>
<%
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    if (name.equals("tony") && password.equals("123")) {
        // 设置request的username属性
        request.setAttribute("username", name);
        // 设置pageContext的username属性
        pageContext.setAttribute("username", name);
        request.getRequestDispatcher("sucess.jsp").forward(request,response);
//        response.sendRedirect("sucess.jsp?username="+name);
    } else {
        response.sendRedirect("login.jsp?username="+name);
    }
%>
</body>
</html>