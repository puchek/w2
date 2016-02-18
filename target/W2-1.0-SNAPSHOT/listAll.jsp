<%--
  Created by IntelliJ IDEA.
  User: avk
  Date: 8/9/14
  Time: 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
    Hello 2
    <ul>
    <c:forEach var="p" items="${productList}">
        <li>${p.productName}</li>
    </c:forEach>

    </ul>
</body>
</html>
