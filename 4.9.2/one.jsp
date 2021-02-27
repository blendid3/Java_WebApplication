<%@ page pageEncoding="UTF-8" %>
<body>
<a href="two.html">这是two.html中的文字</a>
<%
    String name = request.getParameter("name");
%>
传递过来的用户：<%=name%>

</body>