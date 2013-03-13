package com.freesoft.struts2.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MultiFileUploadAction extends ActionSupport {
	private String username;
	private List<File> fileupload;
	// filename
	private List<String> fileuploadFileName;
	// content-type
	private List<String> fileuploadContentType;
	
	@Override
	public String execute() throws Exception {
		String root = ServletActionContext.getRequest().getRealPath("/upload");
		for (int i = 0; i < fileupload.size(); i++) {
			InputStream ins = new FileInputStream(fileupload.get(i));
			OutputStream outs = new FileOutputStream(new File(root, fileuploadFileName.get(i)));
			
			byte[] buf = new byte[1024];
			int length = 0;
			while(-1 != (length = ins.read(buf))) {
				outs.write(buf, 0, length);
			}
			
			outs.close();
			ins.close();
		}
		
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<File> getFileupload() {
		return fileupload;
	}

	public void setFileupload(List<File> fileupload) {
		this.fileupload = fileupload;
	}

	public List<String> getFileuploadFileName() {
		return fileuploadFileName;
	}

	public void setFileuploadFileName(List<String> fileuploadFileName) {
		this.fileuploadFileName = fileuploadFileName;
	}

	public List<String> getFileuploadContentType() {
		return fileuploadContentType;
	}

	public void setFileuploadContentType(List<String> fileuploadContentType) {
		this.fileuploadContentType = fileuploadContentType;
	}
}
