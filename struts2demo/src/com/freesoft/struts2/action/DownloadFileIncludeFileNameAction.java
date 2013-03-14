package com.freesoft.struts2.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadFileIncludeFileNameAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9192890264761613759L;
	private String filename;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getFilename() {
		try {
			filename=new String(filename.getBytes(),"ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public InputStream getDownloadFile() {
		return ServletActionContext.getServletContext().getResourceAsStream("/upload/" + filename);
	}

}
