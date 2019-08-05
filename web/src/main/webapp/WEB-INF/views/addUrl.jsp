<%--
  Created by IntelliJ IDEA.
  User: PlanE
  Date: 05.08.2019
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Url</title>
</head>
<body>
<%--@elvariable id="url" type="com.model"--%>
<spring:form modelAttribute = "url" action = "/add-url" method = "post">
    <label for="name">Name</label>
    <spring:input path="name" id="name"/>

    <label for="body">Body</label>
    <spring:input path="body" id="body"/>

    <button type="submit">Submit</button>
</spring:form>
</body>
</html>
