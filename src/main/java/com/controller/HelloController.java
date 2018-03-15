package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@ComponentScan("com")
public class HelloController {
	@RequestMapping("/index")
	public String index() {
		System.out.println("------index()-----");
		return "index";
	}
	@RequestMapping("/hello")
	public @ResponseBody
	String hello(@RequestParam String userName,@RequestParam String pwd) {
		System.out.println("------hello()-----userName:"+userName+",pwd:"+pwd);
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}