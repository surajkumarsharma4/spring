package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Vehicle vehicle=(Vehicle) context.getBean("vehicle");
	vehicle.v1();
}
}
