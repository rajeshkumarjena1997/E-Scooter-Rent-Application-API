package com.E_Scooter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EScooterRentApplication {

	public static void main(String[] args) {
		// System.setProperty("org.springframework.boot.devtools.restart.enabled",
		// "false");
		SpringApplication.run(EScooterRentApplication.class, args);
		System.out.println("project start....");
	}

}