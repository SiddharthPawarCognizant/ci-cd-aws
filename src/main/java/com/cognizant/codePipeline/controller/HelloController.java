package com.cognizant.codePipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		
		return  "CI/CD using CodePipeline and Elastic Bean Stalk";
		
	}
	
}
