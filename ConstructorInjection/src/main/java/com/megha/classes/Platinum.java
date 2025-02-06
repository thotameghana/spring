package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Customer;
@Component
public class Platinum implements Customer{
	private String name;
	private String type;
	
	@Autowired
	public Platinum(@Value("max")String name,@Value("Platinum customer") String type) {
		this.name=name;
		this.type=type;
	}
	@Override
	public String typeOfCustomer() {
		return name+" is a "+type;
	}
}
