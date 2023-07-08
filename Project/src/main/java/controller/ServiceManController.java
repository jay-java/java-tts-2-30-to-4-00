package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ServiceManDao;
import model.ServiceMan;

/**
 * Servlet implementation class ServiceManController
 */
@WebServlet("/ServiceManController")
public class ServiceManController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			ServiceMan s = new ServiceMan();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			ServiceManDao.insertData(s);
			request.setAttribute("msg", "data inserted successfully");
			request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("login")) {
			ServiceMan s = new ServiceMan();
			String email  = request.getParameter("email");
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			
			boolean flag = ServiceManDao.checkEmail(email);
			if(flag == true) {
				ServiceMan s1 = ServiceManDao.servicemanLogin(s);
				if(s1 == null) {
					request.setAttribute("msg3", "password is incorrect");
					request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
				}
				else {
					HttpSession session  =request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("serviceman-home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg2", "accout not registered");
				request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			ServiceMan s = new ServiceMan();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			ServiceManDao.updateData(s);
			HttpSession session  =request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("serviceman-home.jsp").forward(request, response);
		}
	}

}
