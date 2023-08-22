
package com;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
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
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
