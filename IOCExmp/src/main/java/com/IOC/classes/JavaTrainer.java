package com.IOC.classes;

import com.IOC.interfaces.Trainer;

public class JavaTrainer implements Trainer {
	String name="Kshitij";
	@Override
	public String giveTask() {
		return name+" sir says practice coding daily";
	}
}
