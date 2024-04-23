<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" action="savestudent" method="post">
		name: <form:input path="name"/><br><br>
		email: <form:input path="email"/><br><br>
		phone: <form:input path="phone"/><br><br>
		password: <form:input path="password"/>
		<input type="submit">
	</form:form>
</body>
</html>