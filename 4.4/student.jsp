<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>模板元素</title>
</head>
<body>
<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
    </tr>
    <%
        for (int i = 0; i < 10; i++) {
            String name = "Tony" + i;
    %>
    <tr>
        <td><%=i%></td>
        <td><%=name%></td>
    </tr>
    <% }
    %>
</table>
</body>
</html>