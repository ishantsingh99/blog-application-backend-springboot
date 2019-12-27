package com.example.blognew_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BlognewBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlognewBackApplication.class, args);
	}

}
