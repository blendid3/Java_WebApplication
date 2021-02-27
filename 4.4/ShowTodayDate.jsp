<%--
  Created by IntelliJ IDEA.
  User: tonyguan
  Date: 2018/12/8
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>今天的日期</title>
</head>
<body>

<%
    DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
    String strDate = dateFormat.format(new java.util.Date());
%>

今天的日期：<%=strDate%><br>
</body>
</html>
