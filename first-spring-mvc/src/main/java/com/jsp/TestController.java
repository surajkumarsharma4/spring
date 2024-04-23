package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/first")
	public String m1() {
		// TODO Auto-generated method stub
		return "home.jsp";
	}
}
