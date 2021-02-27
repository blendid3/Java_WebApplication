<%@ page contentType="text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    Cookie cookie = new Cookie("username", "Tom");
    cookie.setMaxAge(1000);
    // 设置Cookie
    response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>B页面</title>
</head>
<body>
用户名：${param.username}
<br />
你喜欢哪些语言：${paramValues.c1[0]}
<br />
请选择你喜欢的计算机编程语言：${paramValues.selectedlang[0]}
<br />
<a href="cpage.jsp?username=${param.username}">跳转到C页面</a>
<br />
</body>
</html>