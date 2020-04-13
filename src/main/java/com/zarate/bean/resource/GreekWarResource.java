package com.zarate.bean.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zarate.bean.kingdom.Kingdom;
import com.zarate.bean.service.GreekWarService;

@Controller
public class GreekWarResource {

	@Autowired
	private GreekWarService service;

	@Autowired
	private List<Kingdom> kingdoms;

	@GetMapping("/war")
	@ResponseBody
	public String war() {

		service.notifyMessage();

		return "The war is over";

	}

	@GetMapping("/kingdoms")
	@ResponseBody
	public void kingdoms() {

		for (Kingdom kingdom : kingdoms) {
			System.out.println(kingdom.getName());
		}

	}

}
