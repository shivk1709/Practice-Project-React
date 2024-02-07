package com.project.mobile.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MobileDto {
	
	private Integer id;
	private String name;
	private String description;
	private Integer quantity;
	private Integer price;

}
