<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>迭代操作</title>
</head>
<body>

<%
    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    request.setAttribute("list",list);
%>
<h4>迭代集合对象:</h4>
<c:forEach var="elem" items="${list}" varStatus="status" begin="1" end="5" step="2">
    第${status.count}次迭代，索引:${status.index}，值是:${elem}，是否是第1个:${status.first}，是否是最后 一个:${status.last}<br>
</c:forEach>

<h4>迭代指定的次数:</h4>
<c:forEach var="elem" varStatus="status" begin="1" end="5" step="2">
    值是:${elem}，是否是第1个:${status.first}，是否是最后 一个:${status.last}<br>
</c:forEach>

</body>
</html>
