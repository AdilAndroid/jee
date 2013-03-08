package com.freesoft.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ResultTypeLogin2Action extends ActionSupport {
	private String username;
	private String password;
	private int age;
	private Date birthday;
	private String usernameAndPassword;
	
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getUsernameAndPassword() {
		return usernameAndPassword;
	}
	public void setUsernameAndPassword(String usernameAndPassword) {
		this.usernameAndPassword = usernameAndPassword;
	}
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
