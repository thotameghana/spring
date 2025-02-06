package com.megha.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Customer;
@Component
public class GoldCustomer implements Customer {
	@Value("Meghana")
	private String name;
	@Value("gold customer")
	private String type;
	@Override
	public String getDetails() {
		return name+" is a "+type;
	}

}
