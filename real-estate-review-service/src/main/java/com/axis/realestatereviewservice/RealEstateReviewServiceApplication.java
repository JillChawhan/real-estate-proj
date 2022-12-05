package com.axis.realestatereviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RealEstateReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateReviewServiceApplication.class, args);
	}

}
