package com.freesoft.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class SessionTokenLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1015781625016446090L;
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
		return SUCCESS;
	}
}
