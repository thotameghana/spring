package com.megha.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.megha.interfaces.Customer;

public class Launch {
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("megha.xml");
	
		Customer gc=(GoldCustomer)cpx.getBean("gc");
		Customer pc=(PlatinumCustomer)cpx.getBean("pc");
		
		System.out.println(gc.customerType());
		System.out.println(pc.customerType());
	}
}
