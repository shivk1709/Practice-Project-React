package com.project.mobile.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class ApiResponse {
	
	private Integer id;
	private String message;
	private Boolean check;
	
	@Override
	public String toString() {
		return "ApiResponse [id=" + id + ", message=" + message + ", check=" + check + "]";
	}
	
	
}
