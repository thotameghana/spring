package com.IOC.classes;

import com.IOC.PracticeTime.SQLPracticeTime;
import com.IOC.interfaces.Trainer;

public class SQLTrainer implements Trainer {
	private String name;
	private String message;
	private SQLPracticeTime spt;
	
	public String getName() {
		return name;
	}

	public SQLPracticeTime getSpt() {
		return spt;
	}

	public void setSpt(SQLPracticeTime spt) {
		this.spt = spt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String giveTask() {
		return name+" Say's "+message+" and practice for "+spt.getTime();
	}
}
