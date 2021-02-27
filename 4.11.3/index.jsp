<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>表示语言运算符</title>
  </head>
  <body>
 <h5>1. EL算术运算符</h5>
${ 5 == 5 }或${ 5 eq 5 }<br>
${ 5 != 5 }或${ 5 ne 5 }<br>
${ 3 < 5 }或${ 3 lt 5 }<br>
${ 3 > 5 }或${ 3 gt 5 }<br>
${ 3 <= 5 }或${ 3 le 5 }<br>
${ 3 >= 5 }或${ 3 ge 5 }<br>

 <h5>2. EL关系运算符</h5>
${ 5 == 5 }或${ 5 eq 5 }<br>
${ 5 != 5 }或${ 5 ne 5 }<br>
${ 3 < 5 }或${ 3 lt 5 }<br>
${ 3 > 5 }或${ 3 gt 5 }<br>
${ 3 <= 5 }或${ 3 le 5 }<br>
${ 3 >= 5 }或${ 3 ge 5 }<br>

<h5>3. EL逻辑运算符</h5>
<%
boolean A = 1 > 2;
boolean B = 3 > 2;
boolean C = 3 <= 2;
%>
${ A && B }或${ A and B }<br>
${ A || B }或${ A or B }<br>
${ !A }或${ not A }<br>

<h5>4.EL其他运算符</h5>
${ empty param.name }<br>
${A ? 1+1 : 2+2}<br>
${ 2 * (3 + 5)}<br>
  </body>
</html>
