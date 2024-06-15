<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../header.jsp"></jsp:include>
	<h1>All Users Data</h1>
	<table border="2">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Password</th>
			<th>Mobile</th>
			<th>Email</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach var="user" items="${userObj}">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.password }</td>
				<td>${user.phoneno }</td>
				<td>${user.email }</td>
				<td><a href="deleteUser?id=${user.id}">Delete</a></td>
				<td><a href="editeUser?id=${user.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>