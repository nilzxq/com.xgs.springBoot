package com.xgs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 标志该类的所有请求方法 返回json格式 不做视图解析。
 * @author zxq
 *
 */
@RequestMapping("/springBoot")
@RestController
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	@RequestMapping("/index1")
	public String index1() {
		return "success1";
	}
	
	/**
	 * SpringBoot返回list格式
	 * @return
	 */
	@RequestMapping("/listIndex")
	public List<String> listIndex(){
		List<String> list=new ArrayList<String>();
		list.add("index1");
		list.add("index2");
		list.add("index3");
		return list;
	}
}
