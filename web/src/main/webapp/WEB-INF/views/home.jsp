<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="u" items="${urlList}">
    <h4>Url: <c:out value="${u.id}"/></h4>
    <h4>Url: <c:out value="${u.body}"/></h4>
    <h4>___________________________________________________</h4>

</c:forEach>

</body>
</html>