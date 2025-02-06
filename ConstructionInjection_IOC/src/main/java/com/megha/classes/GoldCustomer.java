package com.megha.classes;

import com.megha.address.Address;
import com.megha.interfaces.Customer;

public class GoldCustomer implements Customer {
	private String name;
	private String type;
	private Address bgl;
	
	public GoldCustomer(String name, String type,Address bgl) {
		super();
		this.name = name;
		this.type = type;
		this.bgl=bgl;
	}

	@Override
	public String customerType() {
		return name+" is a "+type+" from "+bgl;
	}

}
