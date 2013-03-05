package com.freesoft.struts2.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationRegisterAction extends ActionSupport {
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

	@Override
	public void validate() {
		System.out.println("validate.");
		
//		if (username == null || username.length() < 4 || username.length() > 6) {
//			addFieldError("username", "用户名不合法，用户名长度必须在4~6之间。");
//		} 
//		if (password == null || repassword == null || password.length() < 4 || password.length() >8 || repassword.length() < 4 || repassword.length() > 8) {
//			addFieldError("password", "密码不合法，密码长度必须在4~8之间。");
//		} else if (!password.equals(repassword)) {
//			addFieldError("password", "两次密码不同。");
//		} 
//		if (age < 0 | age > 100) {
//			addFieldError("age", "年龄必须在0~100之间。");
//		} 
//		if (birthday == null) {
//			addFieldError("birthday", "年龄不能为空。");
//		}
//		if (graduation == null) {
//			addFieldError("graduation", "毕业日期不能为空。");
//		} else{
//			Calendar c1 = Calendar.getInstance();
//			c1.setTime(birthday);
//			
//			Calendar c2 = Calendar.getInstance();
//			c2.setTime(graduation);
//			
//			if (c1.after(c2)) {
//				addFieldError("graduation", "毕业日期不能为空。");
//			}
//		}
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
