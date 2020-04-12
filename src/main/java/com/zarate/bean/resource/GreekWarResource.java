package com.zarate.bean.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zarate.bean.service.GreekWarService;

@Controller
public class GreekWarResource {

	@Autowired
	private GreekWarService service;
	
	@GetMapping("/war")
	@ResponseBody
	public String war() {
		
		service.notifyMessage();
		
		return "The war is over";
		
	}

}
