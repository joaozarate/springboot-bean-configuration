package com.zarate.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zarate.bean.service.FoodService;

@Configuration
public class OttomanTroopsConfig {

	@Primary //Works using autowired too
	@Bean
	public FoodService createFood() {

		FoodService service = new FoodService();
		service.setMeat(1000);
		service.setRice(99999);
		
		return service;

	}

}
