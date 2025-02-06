package com.ioc.animals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.interfaces.Animal;
import com.megha.config.Megha;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(Megha.class);

        Animal lion=(Lion)apx.getBean("lion");
        Animal tiger=(Tiger)apx.getBean("tiger");
        
        System.out.println(lion.getDetails());
        System.out.println(tiger.getDetails());
    }
}
