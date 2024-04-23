package com.jsp;

import org.springframework.stereotype.Component;

@Component(value = "fr")
public class Fruit {
	private String name;
	private String tatse;
	private double weight;
	private double price;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTatse() {
		return tatse;
	}


	public void setTatse(String tatse) {
		this.tatse = tatse;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Fruit");
	}
	
}
