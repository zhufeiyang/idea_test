<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24 0024
  Time: 上午 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="username"/><br/>
        年龄：<input type="text"  name="userage"><br/>
        <input type="submit" value="OKOK">
    </form>
</body>
</html>
