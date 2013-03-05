package com.freesoft.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class CRUDAction extends ActionSupport {

<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = -9080641834324035479L;

=======
>>>>>>> d4d04652d79b83a9ee979eed33dda3eef74cdc3a
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String create() throws Exception {
		System.out.println("create");
		return SUCCESS;
	}
	
	public String retrieve() throws Exception {
		System.out.println("retrieve");
		return SUCCESS;
	}
	
	public String update() throws Exception {
		System.out.println("update");
		return SUCCESS;
	}
	
	public String delete() throws Exception {
		System.out.println("delete");
		return SUCCESS;
	}
}
