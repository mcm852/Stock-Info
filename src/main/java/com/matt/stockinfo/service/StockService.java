package com.matt.stockinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	@RequestMapping(name = "/symbols", method = RequestMethod.GET)
//	ResponseEntity<?> getSymbols(@RequestParam(value="name", required=true) String name) {
//		
//	}

}
