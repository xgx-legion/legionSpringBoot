package com.legion.boot.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legion.boot.domain.DemoUser;

/**
 * SpringBoot Controller
 * 
 * @class CustomerController.java
 * @author xinggx
 * @date 2018年2月6日
 */

@RestController
public class CustomerController {

	/**
	 * test_1
	 * 
	 * @return
	 */
	@RequestMapping("/boot/test")
	public String bootTest() {
		return "Hello Spring Boot!";
	}

	/**
	 * test_2
	 * 
	 * @return
	 */
	@RequestMapping("/demo/test")
	public void test(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		session.setAttribute("test", uuid);
		session.invalidate();
	}

	/**
	 * demo user
	 * 
	 * @return
	 */
	@RequestMapping("/demo/user")
	public DemoUser getUser() {
		DemoUser user = new DemoUser();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		user.setId(uuid);
		user.setName("xgx");
		user.setAge("27");
		user.setEmail("test@qq.com");
		return user;
	}

}
