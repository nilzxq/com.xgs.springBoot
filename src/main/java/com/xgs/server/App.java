package com.xgs.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot		∆Ù∂Ø¿‡
 * @author zxq
 *
 */
@ComponentScan(basePackages= {"com.xgs.controller"})
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
