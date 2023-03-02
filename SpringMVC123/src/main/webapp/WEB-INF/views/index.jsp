<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page isELIgnored="false"%>
<html>
<body>

	<div class="container mt-5">
		<h1 class="text-center">User Registration Form</h1>
		<form action="addUser" method="get">
		<div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" class="form-control" id="username" aria-describedby="username" placeholder="Enter username" name="username">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name = "passwrod">
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	</div>
</body>
</html>
