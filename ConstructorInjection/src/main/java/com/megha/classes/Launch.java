package com.megha.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.megha.interfaces.Customer;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cfx = new ClassPathXmlApplicationContext("megha.xml");
		Customer gc=(Customer) cfx.getBean("gold");
		Customer pc=(Customer) cfx.getBean("platinum");

		System.out.println(gc.typeOfCustomer());
		System.out.println(pc.typeOfCustomer());
	}
}
