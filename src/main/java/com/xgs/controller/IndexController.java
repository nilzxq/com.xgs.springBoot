package com.xgs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/springBoot")
@Controller
@EnableAutoConfiguration
public class IndexController {

	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class,args);
	}
}
