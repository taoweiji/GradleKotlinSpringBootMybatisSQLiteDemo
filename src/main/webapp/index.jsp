<%--
  Created by IntelliJ IDEA.
  User: Wiki
  Date: 2018/4/26
  Time: 下午2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table border="2">
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${users}" var="item" varStatus="status">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
