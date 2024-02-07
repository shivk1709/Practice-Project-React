package com.project.mobile.service;

import java.util.List;

import com.project.mobile.dtos.MobileDto;

public interface MobileService {
	
	MobileDto saveInfo(MobileDto mobile);
	List<MobileDto> getMobiles();
	MobileDto getMobileById(int id);
	MobileDto updateMobileInfoById(int id, MobileDto mobile);
	List<MobileDto> deleteMobileInfoById(int id);
	MobileDto resetQuantity(int id);

}
