package com.legion.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LegionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegionSpringBootApplication.class, args);
	}
}
