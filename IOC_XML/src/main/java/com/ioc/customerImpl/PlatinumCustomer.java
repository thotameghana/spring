package com.ioc.customerImpl;

import com.ioc.customer.Customer;

public class PlatinumCustomer implements Customer{

	private String name="Nithish";
	private String type="platinum customer";
	
	@Override
	public void getCustomerType() {
		System.out.println(name+" is a "+type);
	}

}
