package com.xgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/springBoot")
@Controller
public class IndexController {

	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	
}
