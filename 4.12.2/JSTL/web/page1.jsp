<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>测试JSTL</title>
  </head>
  <body>
  <c:set var="a" value="Hello World." scope="session" />
  <c:out value="${a}" /><br>
  <c:out value="${name}" /><br>
  清除变量a  <c:remove var="a" /><br>
  <c:out value="${a}" /><br>

  <c:out value="a > b" escapeXml="true"/><br>

  </body>
</html>
