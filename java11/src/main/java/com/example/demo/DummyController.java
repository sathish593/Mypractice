package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping("/test/{pathVar}")
	public String testController(@PathVariable("pathVar") String pathVar, @RequestParam String reqParam) {

		return pathVar + "--" + reqParam;
	}

}
