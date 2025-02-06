package com.ioc.animals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.interfaces.Animal;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(Megha.class);

        Animal tiger=(Tiger)apx.getBean("tiger");
        Animal lion=(Tiger)apx.getBean("lion");
        
        System.out.println(tiger.getDetails());
        System.out.println(lion.getDetails());
        
    }
}
