package com.cakeshop_springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CakeshopRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakeshopRegistryMsApiApplication.class, args);
		System.out.println("Started...");
	}
	

}
