<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>C页面</title>
</head>
<body>
从session中取出用户名：${sessionScope.user.name}<br />
从application中取出用户名：${applicationScope.user["name"]}<br />
从默认范围中取出用户名：${user["name"]}<br />
</body>
</html>