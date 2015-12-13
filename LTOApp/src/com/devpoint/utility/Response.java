package com.devpoint.utility;

public class Response {
	private String status;
	private Object dataParam;
	private String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getDataParam() {
		return dataParam;
	}
	public void setDataParam(Object dataParam) {
		this.dataParam = dataParam;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
