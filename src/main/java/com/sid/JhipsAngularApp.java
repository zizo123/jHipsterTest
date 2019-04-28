package com.sid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties({ApplicationProperties.class })
public class JhipsAngularApp {

	private static final Logger log = LoggerFactory.getLogger(JhipsAngularApp.class);

	public static void main(String[] args) {
		SpringApplication.run(JhipsAngularApp.class);
	}

}
