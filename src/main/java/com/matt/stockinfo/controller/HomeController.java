package com.matt.stockinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
    public String index(){
        return "index";
    }
	
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public ResponseEntity<?> search(@RequestParam(value="name", required = true) String name) {
//		
//	}

}
