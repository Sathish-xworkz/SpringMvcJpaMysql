<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/OnlineShoppingMVCJpaMysql/URLToResources/css/mystyle.css">
</head>
<body>
<jsp:include page="../../header.jsp"></jsp:include>
<h4>User Registration</h4>
<!-- <a href="view">View All Users</a> -->
<form class="col-md-4 reg-form" method="post" action="newRegister" modelAttribute="user">
<div class="form-group">
    <label for="exampleInputEmail1">ID</label>
    <input type="text" class="form-control" id="id" name="id" aria-describedby="emailHelp" placeholder="Enter ID">
  </div>
 <div class="form-group">
    <label for="exampleInputEmail1">User Name</label>
    <input type="text" class="form-control" id="name" name="name"  aria-describedby="emailHelp" placeholder="Enter User name">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Password">
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Phone No</label>
    <input type="text" class="form-control" name="phoneno" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Phone Number">
  </div>
 
  <button type="submit" class="btn btn-primary">Register</button>
</form>
</body>
</html>