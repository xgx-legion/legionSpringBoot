package com.legion.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 程序启动加载类
 * 
 * 实际应用中，有时会需要在项目服务启动时就去加载一些数据或进行一系列动作
 * 
 * @class StartStepRunner.java
 * @author xinggx
 * @date 2018年5月28日
 */

@Component
@Order(value = 1) // 设置启动加载类的优先级权值，值越小优先级越高
public class StartStepRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(">>>>>>>>> 服务启动执行，执行加载数据... >>>>>>>>>");
		System.out.println(">>>>>>>>> 加载完成");
	}

}
