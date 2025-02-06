package com.megha.classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.megha.config.Megha;
import com.megha.interfaces.Customer;

public class Launch {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext apx=new AnnotationConfigApplicationContext(Megha.class);
		Customer gc=(GoldCustomer)apx.getBean("goldCustomer");
		Customer pc=(PlatinumCustomer)apx.getBean("platinumCustomer");
		
		System.out.println(gc.getDetails());
		System.out.println(pc.getDetails());
	}
}
