package com.in.OLS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler<ApiResponse> {
	
	@ExceptionHandler(PageNotFound.class)
	public ResponseEntity<String> PageNotFound(PageNotFound pg)
	{
		System.out.println("jjiiji");
		return new ResponseEntity<>(pg.getErrorMessage().toString(),HttpStatus.NOT_FOUND);
		
	}

}
