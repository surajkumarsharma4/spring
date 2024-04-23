package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/second")
	public String m2() {
		// TODO Auto-generated method stub
		return "home.jsp";
	}
}
