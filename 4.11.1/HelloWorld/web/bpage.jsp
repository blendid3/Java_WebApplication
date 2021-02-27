<%@ page import="com.zhijieketang.User" %>
<%@ page contentType="text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");

    User user1 = new User();
    user1.setId(1000);
    user1.setName("Tony");

    User user2 = new User();
    user2.setId(2000);
    user2.setName("Tom");

    session.setAttribute("user", user1);
    application.setAttribute("user", user2);

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
数量+1：${param.count + 1}
<br />
eq：${1 == 1}或${1 eq 1}
<br />
not：${ not (2 < 1)}
<br />
and：${ 1 > 2 and 2 < 1}
<br />
<a href="cpage.jsp?username=${param.username}">跳转到C页面</a>
<br />
</body>
</html>