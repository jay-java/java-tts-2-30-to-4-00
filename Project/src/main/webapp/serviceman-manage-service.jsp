<%@page import="dao.ServicemanServiceDao"%>
<%@page import="model.ServicemanServices"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="serviceman-navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h2>Your Services</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Service Name</th>
					<th>Service Price</th>
					<th>Service Duration</th>
					<th>Service Category</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<ServicemanServices> list = ServicemanServiceDao.getServiceListBySid(s.getId());
				%>
				<%
				for (ServicemanServices s1 : list) {
				%>
				<tr>
					<td><%=s1.getService_name()%></td>
					<td><%=s1.getSprice()%></td>
					<td><%=s1.getService_duration()%></td>
					<td><%=s1.getService_category()%></td>
					<td><a href="ServiceController?action=edit&sid=<%=s1.getSid()%>">Edit</a></td>
					<td><a href="">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>