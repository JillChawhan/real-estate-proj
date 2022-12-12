package com.axis.realestatemongoproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RealEstateMongoPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateMongoPropertyApplication.class, args);
	}

}
