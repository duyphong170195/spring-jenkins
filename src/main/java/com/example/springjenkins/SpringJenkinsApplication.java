package com.example.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void hello() {
		logger.info("Application started...");
	}
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
