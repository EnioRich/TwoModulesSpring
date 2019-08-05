<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border='2' width='50%'>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Body</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${urlList}" var="u">
        <tr>
            <td><c:out value="${u.id}"/></td>
            <td><c:out value="${u.name}"/></td>
            <td><c:out value="${u.body}"/></td>
            <td><c:out value="${u.status}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>