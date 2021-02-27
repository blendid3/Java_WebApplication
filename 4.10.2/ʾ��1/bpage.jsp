<%@ page contentType="text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String pname = request.getParameter("username");
    //===== 设置Session =======
    session.setAttribute("username", pname);
    //===== 设置application =======
    application.setAttribute("username", pname);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>B页面</title>
</head>
<body>
用户名：<%=pname%>
<br />
<a href="cpage.jsp?username=<%=pname%>">跳转到C页面</a>
<br />
</body>
</html>