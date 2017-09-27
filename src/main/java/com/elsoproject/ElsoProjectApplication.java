package com.elsoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SpringBootApplication
public class ElsoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElsoProjectApplication.class, args);
	}
	
}
