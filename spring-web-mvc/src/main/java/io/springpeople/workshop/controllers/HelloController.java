package io.springpeople.workshop.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {

//	Request Handler Method

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Welcome to Spring MVC!!");
		model.addAttribute("birthDate", new Date());
		return "hello";// logical view name
	}
}
