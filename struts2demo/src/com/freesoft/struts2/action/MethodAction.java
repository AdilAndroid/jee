package com.freesoft.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7495595853641879397L;

	public String method1() throws Exception {
		System.out.println("method1() invoke.");
		return SUCCESS;
	}

	public String method2() throws Exception {
		System.out.println("method2() invoke.");
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute() invoke.");
		return SUCCESS;
	}

}
