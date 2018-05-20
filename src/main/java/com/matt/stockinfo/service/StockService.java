package com.matt.stockinfo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping(name = "/symbols", method = RequestMethod.GET)
	ResponseEntity<?> getSymbols(@RequestParam(value="name", required=true) String name) {
		
		List<Map<String,Object>> res = jdbcTemplate.queryForList("SELECT Symbol, Name FROM stocks "
				+ "where Name like '" + name + "%';");
		
		System.out.println("Returning results");
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
