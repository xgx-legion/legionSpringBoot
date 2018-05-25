package com.legion.boot.commons.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * session监听器
 * 
 * @class CustomerHttpSessionListener.java
 * @author xinggx
 * @date 2018年5月25日
 */

@WebListener
public class CustomerHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Created a session");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("A session was destroyed");
		
	}
	
}
