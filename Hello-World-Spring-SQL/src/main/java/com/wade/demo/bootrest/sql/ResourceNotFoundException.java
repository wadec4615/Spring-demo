package com.wade.demo.bootrest.sql;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -6129602899410863872L;
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
	super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
	this.resourceName = resourceName;
	this.fieldName = fieldName;
	this.fieldValue = fieldValue;
    }

    public String getFieldName() {
	return fieldName;
    }

    public Object getFieldValue() {
	return fieldValue;
    }

    public String getResourceName() {
	return resourceName;
    }
}