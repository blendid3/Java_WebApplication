<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>流程控制</title>
  </head>
  <body>

<%
    int sec = Calendar.getInstance().get(Calendar.SECOND);
%>
<c:set value="<%=sec%>" var="seconds"/>
<c:if test="${seconds le 30}">
    <c:out value="${seconds} 小于等于 30"/><br>
</c:if>

<c:choose>
    <c:when test="${seconds le 30}">
        <c:out value="${seconds} 小于等于 30"/><br>
    </c:when>
    <c:when test="${seconds eq 30}">
        <c:out value="${seconds} 等于 30"/><br>
    </c:when>
    <c:otherwise>
        <c:out value="${seconds} 大于 30"/><br>
    </c:otherwise>
</c:choose>


  </body>
</html>
