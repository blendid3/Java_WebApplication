<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP声明变量和方法</title>
</head>
<body bgcolor="#ffffff">
声明变量:
<%! int i = 0; %>
<%! int a, b, c; %>
<%! String str = new String("hello"); %>
<br>
声明方法：
<%!
    public String strTemp(int iTemp) {
        if (iTemp < 10) {
            return "iTemp比10小";
        } else {
            return "iTemp大于等于 10";
        }
    }
%>
<br>
<%=str%><br>
<%=strTemp(9)%><br>
</body>
</html>
