package com.zarate.bean.config;

import org.springframework.context.annotation.Configuration;

import com.zarate.bean.service.FoodService;

@Configuration
public class OttomanTroopsConfig {

	public FoodService createFood() {

		FoodService service = new FoodService();
		service.setMeat(1000);
		service.setRice(99999);
		
		return service;

	}

}
