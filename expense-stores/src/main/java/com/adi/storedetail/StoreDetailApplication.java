package com.adi.storedetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreDetailApplication.class, args);
	}

}
