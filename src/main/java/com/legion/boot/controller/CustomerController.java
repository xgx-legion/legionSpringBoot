package com.legion.boot.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legion.boot.domain.DemoUser;

/**
 * SpringBoot Controller
 * @class CustomerController.java 
 * @author xinggx
 * @date 2018年2月6日
 */

@RestController
public class CustomerController {
	
	/**
	 * test
	 * @return
	 */
	@RequestMapping("/boot/test")
	public String bootTest(){
		return "Hello Spring Boot!";
	}
	
	/**
	 * demo user
	 * @return
	 */
	@RequestMapping("/demo/user")
	public DemoUser getUser(){
		DemoUser user = new DemoUser();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		user.setId(uuid);
		user.setName("xgx");
		user.setAge("27");
		user.setEmail("test@qq.com");
		return user;
	}
}
