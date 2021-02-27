<%@ page contentType="text/html; charset=utf-8" %>
<body>
<h3>登录成功！</h3>
username参数：<%=request.getParameter("username")%><br>
password参数：<%=request.getParameter("password")%><br>
<hr>
从request的username属性取出数据：<%=request.getAttribute("username")%><br>
从pageContex的username属性取出数据：<%=pageContext.getAttribute("username")%><br>
使用pageContex从request中取出username属性取出数据：<%=pageContext.getAttribute("username", PageContext.REQUEST_SCOPE)%><br>
</body>