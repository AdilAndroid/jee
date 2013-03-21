package com.freesoft.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionContextLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3577253549354910730L;
	private String username;
	private String password;
	@Override
	public String execute() throws Exception {
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("param", "request paramValue is " + username);
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("param", "session paramValue is " + username);
		
		Map<String, Object> application = ActionContext.getContext().getApplication();
		application.put("param", "application paramValue is " + username);
		
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
}
