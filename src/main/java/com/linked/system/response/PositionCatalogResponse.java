package com.linked.system.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.linked.system.vo.PositionCatalog;
/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public class PositionCatalogResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 419466055836105913L;
	private String responseCode;
	private String message;
	private boolean isSuccessFull;
	@JsonInclude(Include.NON_NULL)
	private PositionCatalog position;
	@JsonInclude(Include.NON_NULL)
	private List<PositionCatalog> positions;
	@JsonInclude(Include.NON_NULL)
	private Iterable<PositionCatalog> iterablePositions; 
	
	public PositionCatalogResponse() {}
	
	public PositionCatalogResponse(String responseCode, String message, boolean isSuccessFull,
			PositionCatalog position) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
		this.position = position;
	}
	
	public PositionCatalogResponse(String responseCode, String message, boolean isSuccessFull) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
	}
	
	public PositionCatalogResponse(String responseCode, String message, boolean isSuccessFull,
			List<PositionCatalog> positions) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
		this.positions = positions;
	}

	public PositionCatalogResponse(String responseCode, String message, boolean isSuccessFull,
			Iterable<PositionCatalog> iterablePositions) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.isSuccessFull = isSuccessFull;
		this.iterablePositions = iterablePositions;
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

	public PositionCatalog getPosition() {
		return position;
	}

	public void setPosition(PositionCatalog position) {
		this.position = position;
	}

	public List<PositionCatalog> getPositions() {
		return positions;
	}

	public void setPositions(List<PositionCatalog> positions) {
		this.positions = positions;
	}

	public Iterable<PositionCatalog> getIterablePositions() {
		return iterablePositions;
	}

	public void setIterablePositions(Iterable<PositionCatalog> iterablePositions) {
		this.iterablePositions = iterablePositions;
	}
}
