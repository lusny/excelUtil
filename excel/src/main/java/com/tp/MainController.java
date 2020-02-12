package com.tp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages="com.tp.web, com.tp.service, com.tp.dao")
public class MainController {
	public static void main(String[] args) {
		
		SpringApplication.run(MainController.class, args);
	}
}  
