<%@page import="dao.ServicemanServiceDao"%>
<%@page import="model.ServicemanServices"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="customer-navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	%>
	<%
	ServicemanServices s1 = ServicemanServiceDao.getServiceBySid(id);
	%>

	<!-- Contact Start -->
	<div class="container-xxl py-5">
		<div class="container">
			<div class="row g-12">
				<div class="col-md-8 wow fadeInUp" data-wow-delay="0.1s">
					<div class="bg-light p-5 h-100 d-flex align-items-center">
						<br>
						<%
						out.print(s1.getService_name());
						%>
						<br>
						<form action="BookingController" method="post">
							<div class="row g-3">
								<input type="hidden" name="cid" value="<%=s.getId()%>">
								<input type="hidden" name="sid" value="<%=s1.getSid()%>">


								<div class="col-md-12">
									<div class="form-floating">
										<input type="text" class="form-control" id="name"
											name="sprice" value="<%=s1.getSprice()%>"> <label
											for="name"></label>
									</div>
								</div>
								<div class="col-12">
									<button class="btn btn-primary w-100 py-3" type="submit"
										name="action" value="book">Book</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Contact End -->

</body>
</html>