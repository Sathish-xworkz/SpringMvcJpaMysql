<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../header.jsp"></jsp:include>
	<h1>Update User</h1>

	<form action="update" method="post" modelAttribute="user">
		<div>
			<label>UserID</label> <input type="text" readonly="readonly" value="${editUser.id }" name="id">
		</div>
		<div>
			<label>UserName</label> <input type="text" value="${editUser.name }" name="name">
		</div>
		<div>
			<label>Password</label> <input type="text" value="${editUser.password }" name="password">
		</div>
		<div>
			<label>Mobile</label> <input type="text" readonly value="${editUser.phoneno }" name="phoneno">
		</div>
		<div>
			<label>Email</label> <input type="text" value="${editUser.email }" name="email">
		</div>
		<div>
			<input type="submit" value="Update">
		</div>
	</form>
</body>
</html>