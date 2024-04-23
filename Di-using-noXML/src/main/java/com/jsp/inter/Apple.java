package com.jsp.inter;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Mobile{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("apple");
	}

}
