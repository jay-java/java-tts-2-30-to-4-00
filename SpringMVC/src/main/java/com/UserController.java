
package com;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	private Dao dao;
	
	@RequestMapping("/")
	public String index(Model m) {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("name", "java");
		List<String> list = new ArrayList();
		list.add("c");
		list.add("c++");
		list.add("java");
		list.add("python");
		m.addAttribute("list", list);
		return "about"; 
	}
	
	@RequestMapping("/addUser")
	public String contact() {
		return "add_user";
	}
	@RequestMapping("/home")
	public String home(Model m) {
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";
		
	}
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute User u,Model m) {
		this.dao.insertUpdteUser(u);
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") int id) {
		User u = this.dao.getUserById(id);
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		m.setViewName("update");
		return m;
	}
}
