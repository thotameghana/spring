package com.megha.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ioc.animals,com.megha.symbol") // Ensures scanning of classes in com.ioc.animals package
public class Megha {
}
