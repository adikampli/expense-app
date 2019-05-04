package com.adi.productdetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ProductDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailApplication.class, args);
	}

}
