<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/8
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
<a href="/shirossm/goAddUser">增加用户</a>
<table width="50%" align="center" border="1">
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${users}" var="i">
        <tr>
            <td>${i.userid}</td>
            <td>${i.username}</td>
            <td><a href="javascript:mya(${i.userid})">删除</a></td>
        </tr>
    </c:forEach>
</table>
<script>
    function mya(userid){
        var f=confirm("是否确认删除？")
        if(f){
            location.href="/shirossm/user/delUser?userId="+userid
        }
    }
</script>
</body>
</html>
