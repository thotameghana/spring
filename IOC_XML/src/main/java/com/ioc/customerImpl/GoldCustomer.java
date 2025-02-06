package com.ioc.customerImpl;

import com.ioc.customer.Customer;

public class GoldCustomer implements Customer {
	
	private String name="Virat";
	private String type="gold customer";
	
	@Override
	public void getCustomerType() {
		System.out.println(name+" is a "+type);
	}

}
