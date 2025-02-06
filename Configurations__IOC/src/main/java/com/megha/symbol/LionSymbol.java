package com.megha.symbol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LionSymbol {
	private String lionSymbol;
	@Autowired
	public LionSymbol(@Value("symbolizing strength")String lionSymbol) {
		this.lionSymbol=lionSymbol;
	}
	
	public String getSymbol() {
		return lionSymbol;
	}
}
