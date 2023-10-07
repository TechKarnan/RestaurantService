package com.example.restaturant;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestaturantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaturantApplication.class, args);
	}

	 @Bean
	    public ModelMapper getModelMapper() { 
	        return new ModelMapper(); 
	    } 
}
