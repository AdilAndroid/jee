package com.freesoft.struts2.exception;

public class PasswordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4478811861592328103L;
	private String mesasge;

	public PasswordException(String mesasge) {
		super();
		this.mesasge = mesasge;
	}

	public String getMesasge() {
		return mesasge;
	}

	public void setMesasge(String mesasge) {
		this.mesasge = mesasge;
	}
}
