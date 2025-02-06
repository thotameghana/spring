package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.customer.Customer;

@Component("pc")
public class PlatinumCustomer implements Customer {

	private String name;
	private String type;
	
	@Autowired
	public PlatinumCustomer(@Value("Leo") String name,@Value("Platinum customer") String type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String getCustomer() {
		return name+" is a "+type;
	}

}
