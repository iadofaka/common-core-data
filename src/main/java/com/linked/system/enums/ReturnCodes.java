package com.linked.system.enums;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public enum ReturnCodes {
	
	SUCCESFULL_RESPONSE("0","SUCCESFULL PROCESS."),
	THERE_ARE_NOT_RESULTS("1000","THERE ARE NOT RESULT"),
	POSITION_EXIST("1001","THIS POSITION ALREADY EXIST"),
	POSITION_NOT_EXIST("1002","THIS POSITION NOT EXIST");
	
	private String code;
	private String message;

	ReturnCodes(final String code,final String message){
		this.code = code;
		this.message = message;
	}
	
	public String getCode(){
		return code;
	}

	public String getMessage(){
		return message;
	}
}
