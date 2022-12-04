package com.axis.realestateuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RealEstateUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateUserServiceApplication.class, args);
	}

}
