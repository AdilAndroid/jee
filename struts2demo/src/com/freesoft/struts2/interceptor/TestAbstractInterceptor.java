package com.freesoft.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TestAbstractInterceptor extends AbstractInterceptor{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7649074460254542836L;
	private String paramTest;
	
	public void destroy() {
		System.out.println("TestAbstractInterceptor destroy...");
	}

	public void init() {
		System.out.println("TestAbstractInterceptor init...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("TestAbstractInterceptor before execute..." + "param is " + paramTest);
		System.out.println("Action class: " + invocation.getAction().getClass());
		String result = invocation.invoke();
		System.out.println("TestAbstractInterceptor After execute...");
		return result;
	}

	public String getParamTest() {
		System.out.println("TestAbstractInterceptor getParamTest...");
		return paramTest;
	}

	public void setParamTest(String paramTest) {
		System.out.println("TestAbstractInterceptor setParamTest");
		this.paramTest = paramTest;
	}

}
