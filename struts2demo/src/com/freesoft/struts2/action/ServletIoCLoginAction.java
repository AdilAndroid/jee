package com.freesoft.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServletIoCLoginAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware, ServletContextAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7226476435239165363L;
	
	private String username;
	private String password;
	
	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	public void setServletContext(ServletContext context) {
		this.application = context;
	}

	public void setServletResponse(HttpServletResponse response) {
		
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}

	@Override
	public String execute() throws Exception {
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
