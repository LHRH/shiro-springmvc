<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linghu
  Date: 17/04/28
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"></c:set>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<h3>登录界面</h3>
<form action="${ctp}/app/logon">
    username: <input type="text" name="username">
    <br/>
    password: <input type="password" name="password">
    <br/>
    <input type="submit" value="logon">
</form>
</body>
</html>
