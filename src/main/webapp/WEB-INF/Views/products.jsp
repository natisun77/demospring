<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 17.07.2019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>

<div>
    <c:forEach var="p" items="${products}">
        <h3>Product name <c:out value="${p.name}"/></h3>
        <h4>Product description <c:out value="${p.description}"/></h4>
        <h4>Product price <c:out value="${p.price}"/></h4>
    </c:forEach>
</div>

</body>
</html>
