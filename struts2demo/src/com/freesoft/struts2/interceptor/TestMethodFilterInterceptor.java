package com.freesoft.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class TestMethodFilterInterceptor extends MethodFilterInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1756088932163760869L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("TestMethodFilterInterceptor before doIntercept");
		String result = invocation.invoke();
		System.out.println("TestMethodFilterInterceptor after doIntercept");
		return result;
	}

}
