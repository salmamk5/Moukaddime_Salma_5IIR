package com.example.eurika_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurikaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaServiceApplication.class, args);
	}

}
