<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.07.2019
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Category</title>
</head>
<body>
<h2>Add new Category</h2>

<spring:form modelAttribute="category" action="/add-category" method="post">
    <label for="name">Name</label>
    <spring:input path="name" id="name"/>
    <label for="description">Description</label>
    <spring:input path="description" id="description"/>
    <button type="submit">Submit</button>
</spring:form>
</body>
</html>
