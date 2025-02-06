package com.ioc.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Animal;

@Component
public class Tiger implements Animal {
	@Autowired
	public Tiger(@Value("Tiger") String name,@Value("National animal") String type) {
		this.name=name;
		this.type=type;
	}
	private String name;
	private String type;
	@Override
	public String getDetails() {
		return name+" is a "+type;
	}

}
