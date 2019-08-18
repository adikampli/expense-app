package com.adi.expenseconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableConfigServer
public class ExpenseConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseConfigApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
	     return Sampler.ALWAYS_SAMPLE;
	}
}
