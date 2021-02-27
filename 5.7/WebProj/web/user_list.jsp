<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
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
    <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            out.print("驱动程序加载失败...");
            return;
        }

        // 获得数据库连接
        String url = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=false";
        String user = "root";
        String password = "12345";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name, userid from user")) {

            while (rs.next()) {
                int id = rs.getInt("userid");
                String name = rs.getString("name");
    %>

    <tr>
        <td><%=id %>
        </td>
        <td><%=name%>
        </td>
        <td>&nbsp; <a href="#?">删除</a>
        </td>
    </tr>

    <% }
    }
    %>
</table>
</body>
</html>
