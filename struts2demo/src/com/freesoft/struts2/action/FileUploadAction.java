package com.freesoft.struts2.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private String username;
	private File fileupload;
	// filename
	private String fileuploadFileName;
	// content-type
	private String fileuploadContentType;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getFileupload() {
		return fileupload;
	}
	public void setFileupload(File fileupload) {
		this.fileupload = fileupload;
	}
	@Override
	public String execute() throws Exception {
		String root = ServletActionContext.getRequest().getRealPath("/upload");
		InputStream ins = new FileInputStream(fileupload);
		OutputStream outs = new FileOutputStream(new File(root, fileuploadFileName));
		
		byte[] buf = new byte[1024];
		int length = 0;
		while(-1 != (length = ins.read(buf))) {
			outs.write(buf, 0, length);
		}
		
		outs.close();
		ins.close();
		
		return SUCCESS;
	}
	public String getFileuploadFileName() {
		return fileuploadFileName;
	}
	public void setFileuploadFileName(String fileuploadFileName) {
		this.fileuploadFileName = fileuploadFileName;
	}
	public String getFileuploadContentType() {
		return fileuploadContentType;
	}
	public void setFileuploadContentType(String fileuploadContentType) {
		this.fileuploadContentType = fileuploadContentType;
	}
}
