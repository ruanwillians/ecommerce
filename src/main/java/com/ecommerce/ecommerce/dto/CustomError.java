package com.ecommerce.ecommerce.dto;

import java.time.Instant;

public class CustomError {
	private Instant timestamp;
	private Integer status;
	private String error;
	private String Path;
	
	
	
	public CustomError(Instant timestamp, Integer status, String error, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		Path = path;
	}
	
	public Instant getTimestamp() {
		return timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public String getError() {
		return error;
	}
	public String getPath() {
		return Path;
	}
	
	
}
