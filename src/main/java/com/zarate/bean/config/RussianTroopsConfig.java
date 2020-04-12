package com.zarate.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zarate.bean.service.TroopsService;

@Configuration
public class RussianTroopsConfig {

	@Bean
	public TroopsService createTroops() {

		TroopsService service = new TroopsService();
		service.setArmy(100000);
		service.setNavy(4000);

		return service;

	}

}
