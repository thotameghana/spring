package com.ioc.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Animal;

@Component
public class Lion implements Animal {
	private String name;
	private String type;
	@Autowired
	public Lion(@Value("Lion") String name,@Value("king")String type) {
		this.name=name;
		this.type=type;
	}
	@Override
	public String getDetails() {
		return name+" is a "+type;
	}

}
