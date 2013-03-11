package com.freesoft.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5985543767871318322L;
	private String paramTest;
	
	public void destroy() {
		System.out.println("destroy...");
	}

	public void init() {
		System.out.println("init...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("before execute..." + "param is " + paramTest);
		String result = invocation.invoke();
		System.out.println("After execute...");
		return result;
	}

	public String getParamTest() {
		System.out.println("getParamTest...");
		return paramTest;
	}

	public void setParamTest(String paramTest) {
		System.out.println("setParamTest");
		this.paramTest = paramTest;
	}

}
