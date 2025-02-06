package com.IOC.classes;

import com.IOC.PracticeTime.JavaPracticeTime;
import com.IOC.interfaces.Trainer;

public class JavaTrainer implements Trainer {
	private String name;
	private String message;
	private JavaPracticeTime jpt;
	public JavaPracticeTime getJpt() {
		return jpt;
	}

	public void setJpt(JavaPracticeTime jpt) {
		this.jpt = jpt;
	}

	public String getName() {
		return name;
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
		return name+" Say's "+message+"and practice for "+jpt.getTime();
	}
	
}
