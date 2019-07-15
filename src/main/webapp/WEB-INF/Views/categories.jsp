<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.07.2019
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>

<div>
    <c:forEach var="c" items="${categories}">
        <h3>Category name <c:out value="${c.name}"/></h3>
        <h4>Category description <c:out value="${c.description}"/></h4>
        <a href="<c:url value="/edit-category?c_id=${c.id}"/>">Edit</a>
        <a href="<c:url value="/delete-category?c_id=${c.id}"/>">Delete</a>
    </c:forEach>

</div>

<div style="margin-top: 50px">
    <h3>Add category</h3>
    <a href="<c:url value="/add-category"/>">Add</a>
</div>


</body>
</html>
