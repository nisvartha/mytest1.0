package com.fullStack.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@RequestMapping(value = "/test")
	public String hello() {
		
		return "ONE";
	}

}
