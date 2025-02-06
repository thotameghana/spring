package com.ioc.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.Animal;
import com.megha.symbol.TigerSymbol;

@Component("tiger") // Register Tiger as a Spring Bean
public class Tiger implements Animal {
	private String name;
	private String type;
	private TigerSymbol ts;
	@Autowired
	public Tiger(@Value("Tiger") String name,
			@Value("National Animal") String type,
			@Qualifier("tigerSymbol") TigerSymbol ts) {
		this.name=name;
		this.type=type;
		this.ts=ts;
	}
    @Override
    public String getDetails() {
        return name+" is a "+type+" "+ts.getSymbol();
    }
}
