package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private String name;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void v1() {
		// TODO Auto-generated method stub
		System.out.println("vehicle");
	}
}
