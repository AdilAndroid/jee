package com.freesoft.action;

import com.opensymphony.xwork2.ActionSupport;

public class BlankAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -63861866458356419L;

	@Override
	public String execute() throws Exception {
		System.out.println("BlankAction -- execute.");
		return SUCCESS;
	}
}
