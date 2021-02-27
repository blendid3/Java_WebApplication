<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
</head>

<form method="post" action="checklogin.jsp">
    <table>
        <tr>
            <td>输入用户名：</td>
            <td>
                <input type="text" name="username" value=''>
            </td>
        </tr>
        <tr>
            <td>输入密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr colspan=2>
            <td><input type="submit" value="login"></td>
        </tr>
    </table>
</form>
</body>
</html>
