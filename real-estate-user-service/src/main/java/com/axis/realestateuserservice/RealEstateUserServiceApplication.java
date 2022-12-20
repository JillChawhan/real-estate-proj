package com.axis.realestateuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2 // put in pom.xml after the mysql or in the dependencies placed above
//import dependency with 'springfox-boot-starter' only
public class RealEstateUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateUserServiceApplication.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver defaultViewResolver() {
		return new InternalResourceViewResolver();
	}
}
