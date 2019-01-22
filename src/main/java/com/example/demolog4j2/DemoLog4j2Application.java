package com.example.demolog4j2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;

@Log
@SpringBootApplication
public class DemoLog4j2Application implements ApplicationRunner {

	public static void main(String[] args) {
		
		log.info("start application");
		
		SpringApplication.run(DemoLog4j2Application.class, args);
	}
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

		log.info("testing...");
    }	

}

 