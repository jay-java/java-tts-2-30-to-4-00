package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.tomcat.util.log.UserDataHelper.Mode;

import dao.UserDao;
import model.Model;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512)
public class UserController extends HttpServlet {

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Model m = new Model();
			String savePath = "C:\\Users\\jay-pc\\JAVA TTS 2-30 to 4-00\\AdvanceJAVA\\src\\main\\webapp\\img";   
			File fileSaveDir=new File(savePath);
	        if(!fileSaveDir.exists()){
	            fileSaveDir.mkdir();
	        }
	        Part file1 = request.getPart("image");
		 	String fileName=extractfilename(file1);
		    file1.write(savePath + File.separator + fileName);
		    String filePath= savePath + File.separator + fileName ;
		    
		    String savePath2 = "C:\\Users\\jay-pc\\JAVA TTS 2-30 to 4-00\\AdvanceJAVA\\src\\main\\webapp\\img";
	        File imgSaveDir=new File(savePath2);
	        if(!imgSaveDir.exists()){
	            imgSaveDir.mkdir();
	        }
	        m.setImage(fileName);
			m.setName(request.getParameter("name"));
			m.setContact(Long.parseLong(request.getParameter("contact")));
			m.setAddress(request.getParameter("address"));
			m.setEmail(request.getParameter("email"));
			m.setPassword(request.getParameter("password"));
			System.out.println(m);
			UserDao.insertUser(m);
			request.setAttribute("msg", "data inserted sucesfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			boolean flag = UserDao.checkEmail(email);
			if (flag == true) {
				Model m = new Model();
				m.setEmail(request.getParameter("email"));
				m.setPassword(request.getParameter("password"));
				Model m1 = UserDao.loginUser(m);
				if (m1 == null) {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", m1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "account not registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Model m = UserDao.getUserById(id);
			request.setAttribute("data", m);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("update")) {
			Model m = new Model();
			m.setId(Integer.parseInt(request.getParameter("id")));
			m.setName(request.getParameter("name"));
			m.setContact(Long.parseLong(request.getParameter("contact")));
			m.setAddress(request.getParameter("address"));
			m.setEmail(request.getParameter("email"));
			m.setPassword(request.getParameter("password"));
			UserDao.updateUser(m);
			response.sendRedirect("home.jsp");
		} else if (action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			UserDao.deleteUser(id);
			response.sendRedirect("home.jsp");
		}

	}

}
