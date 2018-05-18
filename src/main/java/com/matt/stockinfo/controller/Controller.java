package com.matt.stockinfo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Hello world");
		return "index";
	}

}
