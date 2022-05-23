package com.example.software.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

	@GetMapping
	public String testEndpoint(){
		return "Hello world from my test program";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
