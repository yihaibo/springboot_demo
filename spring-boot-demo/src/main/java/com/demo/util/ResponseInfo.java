package com.demo.util;


/**
 * 
 * @ClassName: ResponseInfo  
 * @Description:统一响应类  
 * @author yhb 
 * @param <T>
 */
public class ResponseInfo<T> {

	private boolean success;
	private String message;
	private T body;

	public ResponseInfo() {
		this.success = true;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	
	
}
