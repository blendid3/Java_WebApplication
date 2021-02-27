<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP表达式示例</title>
</head>
<body>
    <h2>JSP表达式示例：</h2>
    <h4>当前时间：<%=new java.util.Date()%></h4>
    <h4>传输协议：<%=request.getProtocol()%></h4>
</body>
</html>