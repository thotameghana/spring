package com.IOC.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.IOC.interfaces.Trainer;

public class Launch {
	public static void main(String[] args) {
		//Programmer creating Objects
//		Trainer jt=new JavaTrainer();
//		Trainer st=new SQLTrainer();
//		Trainer wt=new WebTrainer();
//		System.out.println(jt.giveTask());
//		System.out.println(st.giveTask());
//		System.out.println(wt.giveTask());
		
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("beans.xml");
		Trainer jt=(JavaTrainer)cpx.getBean("jt");
		Trainer st=(SQLTrainer)cpx.getBean("st");
		Trainer wt=(WebTrainer)cpx.getBean("wt");
		
		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());
		
		/*1.in pom.xml
				->add spring core from mvn repository
				->add spring context from mvn repository
		  2.create an xml file with any name
		  		->go to google-> xml schema based configurations copy xml code paste in xml file
		  		create bean tag and add id and class
		*/
		
	}
}
