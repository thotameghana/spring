package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Customer;

@Component
public class Gold implements Customer{
	private String name;
	private String type;
	@Autowired
	public Gold(@Value("meghana")String name,@Value("Gold customer") String type) {
		this.name=name;
		this.type=type;
	}
	@Override
	public String typeOfCustomer() {
		return name+" is a "+type;
	}
}
