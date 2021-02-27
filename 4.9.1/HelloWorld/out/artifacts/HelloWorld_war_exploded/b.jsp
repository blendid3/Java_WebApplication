<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/8
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>B页面</title>
</head>
<body>

<jsp:useBean id="userBean" scope="session" class="com.zhijieketang.User"/>
用户id：<jsp:getProperty name="userBean" property="userid" /><br>
用户名：<jsp:getProperty name="userBean" property="userName" />

</body>
</html>