package com.jsp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bike {
	private String name;
	private String company;
	private List list;
	private Set set;
	private int[] a;
	private Map<Integer, String> map;	
	private Mobile mobile;
	
	
	
	public Bike(String name, String company, List list, Set set, int[] a, Map<Integer, String> map, Mobile mobile) {
		super();
		this.name = name;
		this.company = company;
		this.list = list;
		this.set = set;
		this.a = a;
		this.map = map;
		this.mobile = mobile;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
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
	
}
