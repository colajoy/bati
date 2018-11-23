package com.bati.common.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainController {
	@RequestMapping("/sayHello")
	public String hello(String name) {
		
		return "hello.jsp";
	}
}
