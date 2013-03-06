package com.freesoft.struts2.action;

import com.freesoft.struts2.bean.UserModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelDrivenLoginAction extends ActionSupport implements
		ModelDriven<UserModel> {
	
	private UserModel user = new UserModel();

	/**
	 * 
	 */
	private static final long serialVersionUID = -2376240238807589136L;

	public UserModel getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
