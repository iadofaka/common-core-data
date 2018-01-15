package com.linked.system.response;

import java.io.Serializable;

import com.linked.system.vo.PositionCatalog;

public class PositionCatalogResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 419466055836105913L;
	private String responseCode;
	private String message;
	private boolean isSuccessFull;
	private PositionCatalog positionCatalog;
	
	public PositionCatalogResponse() {}
	
	public PositionCatalogResponse(String responseCode, String message, boolean isSuccessFull,
			PositionCatalog positionCatalog) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
		this.positionCatalog = positionCatalog;
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

	public PositionCatalog getPositionCatalog() {
		return positionCatalog;
	}

	public void setPositionCatalog(PositionCatalog positionCatalog) {
		this.positionCatalog = positionCatalog;
	}
}
