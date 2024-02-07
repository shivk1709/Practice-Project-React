package com.project.mobile.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.mobile.dao.MobileDao;
import com.project.mobile.dtos.MobileDto;
import com.project.mobile.entity.MobileEntity;
import com.project.mobile.exceptions.ResourceNotFoundException;
import com.project.mobile.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	private MobileDao dao;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public MobileDto saveInfo(MobileDto mobile) {
		// TODO Auto-generated method stub
//		System.out.println(mobile);
		MobileEntity mobileEntity = modelMapper.map(mobile, MobileEntity.class);
		MobileEntity savedEntity = dao.save(mobileEntity);
		return modelMapper.map(savedEntity, MobileDto.class);
	}

	@Override
	public List<MobileDto> getMobiles() {
		// TODO Auto-generated method stub
		List<MobileEntity> mobileEntity = dao.findAll();
		return mobileEntity.stream().map((entity) -> (this.modelMapper.map(entity, MobileDto.class))).collect(Collectors.toList());
	}
 
	@Override
	public MobileDto getMobileById(int id) { 
		// TODO Auto-generated method stub
		MobileEntity entity = dao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found", id));
		return modelMapper.map(entity, MobileDto.class);
	}

	@Override
	public MobileDto updateMobileInfoById(int id, MobileDto mobile) {
		// TODO Auto-generated method stub
		MobileEntity entity = dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found", id));
		entity.setName(mobile.getName());
		entity.setDescription(mobile.getDescription());
		entity.setPrice(mobile.getPrice());
		entity.setQuantity(mobile.getQuantity());
		MobileEntity saved = dao.save(entity);
		return modelMapper.map(saved, MobileDto.class);
	}

	@Override
	public List<MobileDto> deleteMobileInfoById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		List<MobileEntity> mobiles = dao.findAll();
		return  mobiles.stream().map((element) -> modelMapper.map(element, MobileDto.class)).collect(Collectors.toList());
		
	}

	@Override
	public MobileDto resetQuantity(int id) {
		// TODO Auto-generated method stub
		MobileEntity entity = dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found ", id));
		entity.setQuantity(0);
		MobileEntity saved = dao.save(entity);
		return this.modelMapper.map(saved, MobileDto.class);
	}

}
