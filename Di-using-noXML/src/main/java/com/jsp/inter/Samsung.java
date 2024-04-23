package com.jsp.inter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Samsung implements Mobile{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("samsung");
	}
	
}
