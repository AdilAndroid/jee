package com.freesoft.struts2.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadFileAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4430675251393091295L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public InputStream getDownloadFile() {
		InputStream ins = ServletActionContext.getServletContext().getResourceAsStream("/upload/货币战争.txt");
		System.out.println(ins);
		return ins;
	}

}
