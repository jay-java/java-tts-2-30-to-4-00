package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.Model;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			Model m  = new Model();
			m.setName(request.getParameter("name"));
			m.setContact(Long.parseLong(request.getParameter("contact")));
			m.setAddress(request.getParameter("address"));
			m.setEmail(request.getParameter("email"));
			m.setPassword(request.getParameter("password"));
			System.out.println(m);
			UserDao.insertUser(m);
			request.setAttribute("msg", "data inserted sucesfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
