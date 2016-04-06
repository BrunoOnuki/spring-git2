package br.com.brunoonuki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldControllers {
	@RequestMapping("/ola")
	public String hello() {
		return "hello";
	}
	
}
