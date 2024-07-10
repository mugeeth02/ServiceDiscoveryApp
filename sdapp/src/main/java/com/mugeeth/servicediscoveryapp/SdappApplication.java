package com.mugeeth.servicediscoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //product & home microservices will register its url to service discovery app

public class SdappApplication { //http://localhost:8761

	public static void main(String[] args) {
		SpringApplication.run(SdappApplication.class, args);
	}

}
