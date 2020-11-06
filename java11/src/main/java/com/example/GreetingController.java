package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
	
	@Value("#{${test}}")
	private Map<String, String> bpmURL;

	
	@Value("${test}")
	private String mapStr;
	 
	@GetMapping("greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	    bpmURL.forEach((k,v) -> System.out.println("key - "+k +" value - "+v));
	    
	    return bpmURL.toString();
	}
}
