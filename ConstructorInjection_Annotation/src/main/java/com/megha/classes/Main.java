package com.megha.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.megha.customer.Customer;

public class Main {
	public static void main(String[] args)  {
		
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("beans.xml");
		Customer gc=(GoldCustomer)cpx.getBean("gc");
//		Customer pc=(PlatinumCustomer)cpx.getBean("pc");
//		
		System.out.println(gc.getCustomer());
//		System.out.println(pc.getCustomer());
	}
}
