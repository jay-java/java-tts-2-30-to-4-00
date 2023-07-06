<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Bootstrap demo</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
		crossorigin="anonymous">
	<%
	response.setHeader("Cache-Control","no-cache");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader ("Expires", 0);
	Model m = null;
	if (session.getAttribute("data") != null) {
		m = (Model) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	<div class="text-center">
		Welcome,
		<%=m.getName()%></div>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Contact</th>
					<th scope="col">Address</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Model> list = UserDao.getAllUsers();
				%>
				<%
				for (Model m1 : list) {
				%>
				<tr>
					<th scope="row"><%=m1.getId()%></th>
					<td><%=m1.getName()%></td>
					<td><%=m1.getContact()%></td>
					<td><%=m1.getAddress()%></td>
					<td><%=m1.getEmail()%></td>
					<td><%=m1.getPassword()%></td>
					<td>
						<form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=m1.getId()%>"> <input
								type="submit" name="action" value="edit">
						</form>
					</td>
					<td>
						<form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=m1.getId()%>"> <input
								type="submit" name="action" value="delete">
						</form>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<h1 class="text-center"><a href="logout.jsp">Logout...</a></h1>
</body>
</html>