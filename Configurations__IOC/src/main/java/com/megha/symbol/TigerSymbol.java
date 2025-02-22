package com.megha.symbol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TigerSymbol {
	private String tigerSymbol;
	@Autowired
	public TigerSymbol(@Value("symbolizing leadership")String tigerSymbol) {
		this.tigerSymbol=tigerSymbol;
	}
	
	public String getSymbol() {
		return tigerSymbol;
	}
}
