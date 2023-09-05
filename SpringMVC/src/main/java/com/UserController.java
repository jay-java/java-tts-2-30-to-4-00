
package com;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/register")
	public RedirectV registerUser(@ModelAttribute User u) {
		this.dao.insertUpdteUser(u);
	}
}
