<%@page import="com.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Home</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
		
				<c:forEach items="${list }" var="u">
				<tr>
					<td>${u.id }</td>
					<td>${u.name }</td>
					<td>${u.contact }</td>
					<td>${u.address }</td>
					<td>${u.email }</td>
					<td>${u.password }</td>
					<td><a href="edit/${u.id }">Edit</a></td>
					<td><a href="delete/${u.id }">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
