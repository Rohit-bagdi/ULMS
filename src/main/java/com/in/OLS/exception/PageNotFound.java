package com.in.OLS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

 
public class PageNotFound extends RuntimeException{
	
	private String errorMessage;
	
	
	
	public PageNotFound(String errorMessage) {
		// TODO Auto-generated constructor stub
		this.errorMessage=errorMessage;
	}
	 
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

 
}
