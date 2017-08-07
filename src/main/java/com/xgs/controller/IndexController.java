package com.xgs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController ��־������������󷽷� ����json��ʽ ������ͼ������
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
	 * SpringBoot����list��ʽ
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
