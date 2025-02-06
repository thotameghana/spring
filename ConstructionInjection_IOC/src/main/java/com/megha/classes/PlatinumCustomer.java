package com.megha.classes;

import com.megha.address.Address;
import com.megha.interfaces.Customer;

public class PlatinumCustomer implements Customer{
	private String name;
	private String type;
	private Address hyd;
	
	public PlatinumCustomer(String name, String type, Address hyd) {
		super();
		this.name = name;
		this.type = type;
		this.hyd = hyd;
	}
	@Override
	public String customerType() {
		return name+" is a "+type+" from "+hyd;
	}
}
