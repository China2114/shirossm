<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/7
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<ul>
    <s:hasRole name="管理员">
        <li><a href="user/userList">用户管理</a></li>
    </s:hasRole>
    <s:hasPermission name="书本新增">
        <li>书本新增</li>
    </s:hasPermission>
    <s:hasPermission name="书本查询">
        <li>书本查询</li>
    </s:hasPermission>
</ul>
</body>
</html>
