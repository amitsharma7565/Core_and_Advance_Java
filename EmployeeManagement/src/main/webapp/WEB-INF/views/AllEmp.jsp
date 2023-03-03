<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

</style>
<title>All Employees</title>
</head>
<body>
<h2>All Employee data</h2>
	<table class="table">
		<tbody>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
			<th>PhoneNumber</th>
			<th>Gender</th>
			<th>Dept</th>
			<th>Insurance</th>
			<th>Action</th>
		</tr>
			<c:forEach items="${Employees}" var="e">
		
				<tr>
					<th scope="row">${e.id}</th>
					<td>${e.name}</td>
					<td>${e.email}</td>
					<td>${e.salary}</td>
					<td>${e.phoneNumber}</td>
					<td>${e.gender}</td>
					<td>${e.dept}</td>
					<td>${e.insurance}</td>
					<td>
					<a href="delete/${e.id}">Delete</a>
					<a href="update/${e.id}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	



</body>
</html>