package com.freesoft.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ServletActionContextLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128483452443451164L;
	private String username;
	private String password;
	
	private ServletContext application;
	private HttpServletRequest request;
	private HttpSession session;
	
	@Override
	public String execute() throws Exception {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = ServletActionContext.getServletContext();
		
		request.setAttribute("param", "request paramValue is " + username);
		session.setAttribute("param", "session paramValue is " + username);
		application.setAttribute("param", "application paramValue is " + username);
		
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
