package com.freesoft.struts2.action;

import java.util.Date;

import com.freesoft.struts2.exception.PasswordException;
import com.freesoft.struts2.exception.UsernameException;
import com.opensymphony.xwork2.ActionSupport;

public class ExceptionRegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5003104950098474115L;
	private String username;
	private String password;
	private String repassword;
	private int age;
	private Date birthday;
	private Date graduation;
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
	public Date getGraduation() {
		return graduation;
	}
	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}
	@Override
	public String execute() throws Exception {
		if (!username.equals("zhangsan")) {
			throw new UsernameException("username isn't correct.");
		}
		if (!password.equals("password")) {
			throw new PasswordException("password isn't correct.");
		}			
		return SUCCESS;
	}
}
