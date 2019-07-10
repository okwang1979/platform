package com.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimplfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplfeignApplication.class, args);
	}

}
