package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Trainer;
import com.megha.practicetime.JavaPracticeTime;


@Component("jt")
public class JavaTrainer implements Trainer {
	private String name;
	private String message;
	private JavaPracticeTime jpt;
	public JavaPracticeTime getJpt() {
		return jpt;
	}
	@Autowired
	public void setJpt(@Qualifier("jpt") JavaPracticeTime jpt) {
		this.jpt = jpt;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Kshitij") String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}
	
	@Autowired
	public void setMessage(@Value("keep coding keep smiling") String message) {
		this.message = message;
	}

	@Override
	public String giveTask() {
		return name+" say's "+message+" and practice for "+jpt.getTime();
	}

}
