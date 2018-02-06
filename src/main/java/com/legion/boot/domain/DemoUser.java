package com.legion.boot.domain;

/**
 * Demo User Model
 * 
 * @class DemoUser.java
 * @author xinggx
 * @date 2018年2月6日
 */
public class DemoUser {
	/**
	 * 编号
	 */
	private String id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private String age;

	/**
	 * 邮箱
	 */
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
