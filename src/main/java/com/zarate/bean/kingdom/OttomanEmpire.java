package com.zarate.bean.kingdom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zarate.bean.service.FoodService;

@Component
public class OttomanEmpire {

	@Autowired(required = false)
	private FoodService service;

	public void hasFood() {

		if (service != null) {
			System.out.println("I brought my food");

		} else {
			System.out.println("I don't need food.");
		}

	}

}
