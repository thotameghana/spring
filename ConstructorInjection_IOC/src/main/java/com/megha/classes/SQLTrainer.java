package com.megha.classes;

import com.megha.interfaces.Trainer;
import com.megha.practiceTime.SQLPracticeTime;

public class SQLTrainer implements Trainer {
	
	private String name;
	private String message;
	private SQLPracticeTime spt;
	
	public SQLTrainer(String name, String message,SQLPracticeTime spt) {
		super();
		this.name = name;
		this.message = message;
		this.spt=spt;
	}

	@Override
	public String giveTask() {
		return name+" say's "+message+" and practice for "+spt;
	}

}
