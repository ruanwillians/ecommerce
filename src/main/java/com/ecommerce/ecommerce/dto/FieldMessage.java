package com.ecommerce.ecommerce.dto;

public class FieldMessage {
	private String fieldMessage;
	private String messsage;
	
	
	public FieldMessage(String fieldMessage, String messsage) {
		super();
		this.fieldMessage = fieldMessage;
		this.messsage = messsage;
	}
	
	public String getFieldMessage() {
		return fieldMessage;
	}
	public String getMesssage() {
		return messsage;
	}
	
	
}
