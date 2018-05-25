package com.legion.boot;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legion.boot.commons.filter.ManageFilter;

/**
 * 全局配置
 * 
 * @class GlobalConfiguration.java
 * @author xinggx
 * @date 2018年2月7日
 */
@Configuration
public class GlobalConfiguration {
	@Bean
	public RemoteIpFilter remoterIpFilter() {
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean filterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new ManageFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("ManageFilter");
		registration.setOrder(1);
		return registration;
	}
}
