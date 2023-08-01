<%@page import="model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Model m = (Model)request.getAttribute("data"); %>
<form action="UserController" method="post">
		<table>
		<tr>
				<td><input type="hidden" name="id" value="${m.id }"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" value="${m.name }"></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact" value="<%=m.getContact()%>"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" value="<%=m.getAddress()%>"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email" value="<%=m.getEmail()%>"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" value="<%=m.getPassword()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>