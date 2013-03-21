package com.freesoft.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class IoCLoginAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8932371611454827957L;
	private String username;
	private String password;
	
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public String execute() throws Exception {
		request.put("param", "request paramValue is " + username);
		session.put("param", "session paramValue is " + username);
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
