package com.IOC.classes;

import com.IOC.interfaces.Trainer;

public class WebTrainer implements Trainer{
	String name="Rohith";
	@Override
	public String giveTask() {
		return name+" Sir say's create web application's daily";
	}
}
