package com.legion.boot.commons.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义拦截器
 * 
 * @class ManageCoreInterceptor.java
 * @author xinggx
 * @date 2018年5月28日
 */

@Component
public class ManageCoreInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(">>> 全局拦截器ManageCoreInterceptor >>> 将在处理请求>>" + request.getServletPath() + ">>前进行拦截");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(">>> 全局拦截器ManageCoreInterceptor >>> 请求>>" + request.getServletPath() + ">>允许通过");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception modelAndView) throws Exception {
		System.out.println(">>> 全局拦截器ManageCoreInterceptor >>> 请求>>" + request.getServletPath() + ">>处理结束");

	}

}
