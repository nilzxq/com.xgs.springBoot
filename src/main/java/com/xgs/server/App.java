package com.xgs.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.xgs.controller.IndexController;
/**
 * SpringBoot		������
 * @author zxq
 *
 */
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class,args);
	}
}
