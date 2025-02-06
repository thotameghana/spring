package com.megha.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.megha.interfaces.Trainer;
import com.megha.practicetime.WebPracticeTime;

@Component("wt")
public class WebTrainer implements Trainer {
	private String name;
	private String message;
	private WebPracticeTime wpt;
	public String getName() {
		return name;
	}
	public WebPracticeTime getWpt() {
		return wpt;
	}
	@Autowired
	public void setWpt(@Qualifier("wpt") WebPracticeTime wpt) {
		this.wpt = wpt;
	}
	@Autowired
	public void setName(@Value("rohith") String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("build web applications") String message) {
		this.message = message;
	}
	@Override
	public String giveTask() {
		return name+" say's "+message+" and practice for "+wpt.getTime();
	}

}
