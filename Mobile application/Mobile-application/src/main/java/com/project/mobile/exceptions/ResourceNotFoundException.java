package com.project.mobile.exceptions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourceNotFoundException extends RuntimeException {
	
	private Integer id;
	private String message;
	
	public ResourceNotFoundException(String message, Integer id) {
		super(message+" : "+id);
		this.id = id;
		this.message = message;
	}
	
}
