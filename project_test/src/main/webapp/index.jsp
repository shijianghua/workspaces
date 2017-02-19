<%--
  Created by IntelliJ IDEA.
  User: forest
  Date: 17/2/16
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="POST">
    用户名:<input type="text" name="name"><br/>

    密码:<input type="password" name="password"/><br/>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>
