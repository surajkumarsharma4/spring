package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Bike bike=(Bike) context.getBean("myBike");
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
