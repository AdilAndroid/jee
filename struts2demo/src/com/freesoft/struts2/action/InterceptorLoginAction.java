package com.freesoft.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class InterceptorLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6694734909780302644L;
	private String username;
	private String password;
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
	@Override
	public String execute() throws Exception {
		System.out.println("execute...");
		
		return SUCCESS;
	}

}
