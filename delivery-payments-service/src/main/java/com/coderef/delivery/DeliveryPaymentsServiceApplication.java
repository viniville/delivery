package com.coderef.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeliveryPaymentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryPaymentsServiceApplication.class, args);
	}
}
