<%--
  Created by IntelliJ IDEA.
  User: lsy
  Date: 2019/5/19
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="register.action" method="post">
    <input type="text" name="username" placeholder="输入用户名" />
    <br/>
    <input type="password" name="password" placeholder="输入密码" />
    <br />
    <input type="submit" value="注册">
    <input type="reset" value="重置">
</form>
</body>
</html>
