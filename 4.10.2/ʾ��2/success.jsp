<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h3>登录成功</h3>
username参数:<%=request.getParameter("username")%><br>
password参数:<%=request.getParameter("password")%><br>
<hr>
从request的username属性取出数据：<%=request.getAttribute("username")%><br>
从page的username属性取出数据：<%=pageContext.getAttribute("username")%><br>
从session的username属性取出数据：<%=pageContext.getAttribute("username", PageContext.SESSION_SCOPE)%><br>

</body>
</html>
