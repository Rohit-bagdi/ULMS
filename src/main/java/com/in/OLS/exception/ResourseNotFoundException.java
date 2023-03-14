package com.in.OLS.exception;

public class ResourseNotFoundException extends RuntimeException {

	
	private String resourceName;
	private String fieldName;
	private String FieldValue;
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldValue() {
		return FieldValue;
	}
	public ResourseNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		FieldValue = fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		FieldValue = fieldValue;
	}
	
}
