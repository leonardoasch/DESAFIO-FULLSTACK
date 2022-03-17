package com.example.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@SpringBootApplication
public class Application {
	
	public static Logger Logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		Logger.info("Starting App");
		SpringApplication.run(Application.class, args);
		Logger.info("Ready for requests");
	}

}
