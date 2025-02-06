package com.ioc.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Animal;
import com.megha.symbol.LionSymbol;

@Component("lion") // Register Lion as a Spring Bean
public class Lion implements Animal {
	private String name;
	private String type;
	private LionSymbol ls;
	@Autowired
	public Lion(
			@Value("Lion") String name,
			@Value("King of Forest") String type,
			@Qualifier("lionSymbol") LionSymbol ls) {
		this.name=name;
		this.type=type;
		this.ls=ls;
	}
    @Override
    public String getDetails() {
        return name+" is a "+type+" "+ls.getSymbol();
    }
}
