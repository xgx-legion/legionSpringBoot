package com.legion.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.legion.boot.commons.interceptor.ManageCoreInterceptor;

/**
 * web mvc 配置类
 * @class InitWebConfiguration.java 
 * @author xinggx
 * @date 2018年5月28日
 */

@Configuration
public class InitWebConfiguration extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个完整的拦截器链
		// addPathPatterns用于添加拦截规则；excludePathPatterns用于排除拦截（白名单）
		registry.addInterceptor(new ManageCoreInterceptor())
			.addPathPatterns("/**")
			.excludePathPatterns("/demo/test");
		super.addInterceptors(registry);
	}
}
