<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/8
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>A页面</title>
</head>
<body>

<jsp:useBean id="userBean" scope="session" class="com.zhijieketang.User"/>
<jsp:setProperty name="userBean" property="userid" value="1000"/>
<jsp:setProperty name="userBean" property="userName" value="Tony"/>

<form action="b.jsp" method="post">
    <input type="submit" value="跳转到B页面">
</form>
</body>
</html>