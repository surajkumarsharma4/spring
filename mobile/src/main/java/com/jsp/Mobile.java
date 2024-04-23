package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String name;
	private String company;
	private double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("mobile");
	}
}
