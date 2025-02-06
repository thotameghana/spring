package com.megha.classes;

import com.megha.interfaces.Trainer;
import com.megha.practiceTime.WebPracticeTime;

public class WebTrainer implements Trainer{
	private String name;
	private String message;
	private WebPracticeTime wpt;
	public WebTrainer(String name,String message,WebPracticeTime wpt) {
		this.name=name;
		this.message=message;
		this.wpt=wpt;
	}
	@Override
	public String giveTask() {
		return name+" say's "+message+" and practice for "+wpt;
	}
}
