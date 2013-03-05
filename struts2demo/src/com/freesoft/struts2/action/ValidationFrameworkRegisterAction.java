package com.freesoft.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationFrameworkRegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1270845287243462058L;
	private String username;
	private String password;
	private String repassword;
	private Integer age;
	private Date birthday;
	private Date graduation;

	@Override
	public String execute() throws Exception {
		System.out.println("execute.");
		return SUCCESS;
	}

	public String getUsername() {
		return username;

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getGraduation() {
		return graduation;
	}

	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}

}
