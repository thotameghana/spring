package com.ioc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.customer.Customer;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer gc=(Customer)context.getBean("goldCustomer");
		Customer pc=(Customer)context.getBean("platinumCustomer");
		gc.getCustomerType();
		pc.getCustomerType();
	}
}
