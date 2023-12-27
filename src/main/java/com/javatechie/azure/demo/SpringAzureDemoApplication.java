package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "WELCOME TO Anup TECHNOLOGIES IN Azure DevOps Platform, Binaya Mohapatra, Pravakar kumar And Bren Sahu is expert in Azure platform WELCOME we are going to cloud!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
