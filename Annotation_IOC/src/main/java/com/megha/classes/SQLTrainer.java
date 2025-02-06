package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Trainer;
import com.megha.practicetime.SQLPracticeTime;

@Component("st")
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
	@Autowired
	public void setSpt(@Qualifier("spt")SQLPracticeTime spt) {
		this.spt = spt;
	}

	@Autowired
	public void setName(@Value("Somanna")String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}
	
	@Autowired
	public void setMessage(@Value("practice complex queries") String message) {
		this.message = message;
	}

	@Override
	public String giveTask() {
		return name+" say's "+message+" and practice for "+spt.getTime();
	}

}
