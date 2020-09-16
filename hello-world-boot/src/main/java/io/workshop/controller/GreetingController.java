package io.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	// http://localhost:8080/
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String helloWorld() {
		return "Hello World - Spring Boot 2";
	}
}
