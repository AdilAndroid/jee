package com.freesoft.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestExecAndWaitInterceptorAction extends ActionSupport {
	private String username;

	@Override
	public String execute() throws Exception {
		for (int i = 0; i < 100; i++) {
			if (isOdd(i))
				System.out.println(i);
		}
		return SUCCESS;
	}

	private boolean isOdd(int i) {
		if ((i % 2) == 0)
			return true;
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
