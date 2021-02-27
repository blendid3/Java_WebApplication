<%@ page contentType="text/html; charset=utf-8" %>
<%
    String sname = (String)session.getAttribute("username");
    String aname = (String)application.getAttribute("username");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>C页面</title>
</head>
<body>
从session中取出用户名：<%=sname%><br />
从application中取出用户名：<%=aname%><br />
</body>
</html>