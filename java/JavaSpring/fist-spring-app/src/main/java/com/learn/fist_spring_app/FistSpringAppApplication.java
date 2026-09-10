package com.learn.fist_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class FistSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FistSpringAppApplication.class, args);
	}

}
