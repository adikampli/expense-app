package com.adi.storedetail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreDetailApplication {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		logger.info("---Starting Store Details Application--");
		SpringApplication.run(StoreDetailApplication.class, args);
	}

}
