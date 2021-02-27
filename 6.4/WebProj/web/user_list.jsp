<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>查询用户列表</title>
</head>
<body>
<table width="50%" border="1" align="center">
    <tr>
        <th>用户ID</th>
        <th>用户名</th>
        <th>操作</th>
    </tr>
    <c:forEach var="userBean" items="${list}">
        <tr>
            <td>${userBean.id}</td>
            <td>${userBean.name}</td>
            <td>&nbsp; <a href="Controller?action=delete&userid=${userBean.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
