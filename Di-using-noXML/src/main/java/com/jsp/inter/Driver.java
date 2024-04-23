package com.jsp.inter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.Config;

public class Driver {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	User user=(User) context.getBean("user");
	System.out.println(user);
	user.getMobile().call();
}
}
