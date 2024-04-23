package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
	Bike bike=context.getBean(Bike.class,"myBike");
	
	System.out.println(bike.getName());
	System.out.println(bike.getCompany());
	System.out.println(bike.getList());
	System.out.println(bike.getSet());
	System.out.println(bike.getA()[0]);
	System.out.println(bike.getMap());
	System.out.println(bike.getMobile());
	System.out.println(bike.getMobile().getBrand());
	System.out.println(bike.getMobile().getId());
}
}
