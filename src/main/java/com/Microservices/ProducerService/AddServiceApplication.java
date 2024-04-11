package com.Microservices.ProducerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddServiceApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "9090");
		SpringApplication.run(AddServiceApplication.class, args);
	}

}
