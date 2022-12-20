package com.axis.realestatemongoproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2 // import dependency with 'springfox-boot-starter' only
public class RealEstateMongoPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateMongoPropertyApplication.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver defaultViewResolver() {
		return new InternalResourceViewResolver();
	}

}
