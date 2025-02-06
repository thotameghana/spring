package com.megha.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.megha.interfaces.Trainer;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("megha.xml");
		
		Trainer jt=(JavaTrainer)cpx.getBean("jt");
		Trainer st=(SQLTrainer)cpx.getBean("st");
		Trainer wt=(WebTrainer)cpx.getBean("wt");
		
		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());
	}
}
