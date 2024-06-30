package com.project.securequeue.exception;

public class ErrorResponse {

	private String error;
	private String message;
	private Integer code;

	public ErrorResponse(String error, String message, Integer code) {
		this.error = error;
		this.message = message;
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
