package com.linked.system.response;

import java.io.Serializable;

import com.linked.system.vo.UserInformation;

public class UserInformationResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2995151708101232720L;
	private String responseCode;
	private String message;
	private boolean isSuccessFull;
	private UserInformation userInformation;
	
	public UserInformationResponse() {

	}

	
	public UserInformationResponse(String responseCode, String message, boolean isSuccessFull,
			UserInformation userInformation) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
		this.userInformation = userInformation;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccessFull() {
		return isSuccessFull;
	}

	public void setSuccessFull(boolean isSuccessFull) {
		this.isSuccessFull = isSuccessFull;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}
}
