package com.freesoft.struts2.exception;

public class UsernameException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8307256530939047732L;
	
	private String mesasge;

	public UsernameException(String mesasge) {
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
