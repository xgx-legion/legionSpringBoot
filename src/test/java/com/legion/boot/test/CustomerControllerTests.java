package com.legion.boot.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.legion.boot.controller.CustomerController;

/**
 * SpringBoot Controller Tests
 * @class CustemerControllerTests.java 
 * @author xinggx
 * @date 2018年2月6日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTests {
	private MockMvc mvc;
	
	private String requestMapping = "/demo/user";
	
	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new CustomerController()).build();
	}
	
	@Test
	public void getCustomer() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get(requestMapping).accept(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andDo(MockMvcResultHandlers.print())
			.andReturn();
	}
}
