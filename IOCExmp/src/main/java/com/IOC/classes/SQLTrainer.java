package com.IOC.classes;

import com.IOC.interfaces.Trainer;

public class SQLTrainer implements Trainer {
	String name="Somanna";
	@Override
	public String giveTask() {
		return name+" sir says practice complex queries";
	}
}
