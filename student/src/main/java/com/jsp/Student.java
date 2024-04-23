package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int roll;
	private int classname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	public void s1() {
		// TODO Auto-generated method stub
		System.out.println("student");
	}
}
