package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Customer;

@Component
public class PlatinumCustomer implements Customer{
	@Value("max")
	private String name;
	@Value("platinum customer")
	private String type;
	@Override
	public String getDetails() {
		return name+" is a "+type;
	}

}
