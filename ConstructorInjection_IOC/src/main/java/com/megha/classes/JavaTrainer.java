package com.megha.classes;

import com.megha.interfaces.Trainer;
import com.megha.practiceTime.JavaPracticeTime;

public class JavaTrainer implements Trainer {

	private String name;
	private String message;
	private JavaPracticeTime jpt;
	
	public JavaTrainer(String name, String message,JavaPracticeTime jpt) {
		this.name = name;
		this.message = message;
		this.jpt=jpt;
	}

	@Override
	public String giveTask() {
		return name+" Say's "+message+"and practice for "+jpt;
	}

}
