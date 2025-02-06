package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.customer.Customer;

@Component("gc")
public class GoldCustomer implements Customer {
	
	private String name;
	private String type;
	
	@Autowired
	public GoldCustomer(@Value("Meghana") String name,@Value("Gold Customer") String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String getCustomer() {
		return name+" is a "+type;
	}

}
