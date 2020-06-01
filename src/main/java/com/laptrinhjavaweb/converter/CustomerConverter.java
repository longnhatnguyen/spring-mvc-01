package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.entity.CustomerEntity;

public class CustomerConverter {
	ModelMapper mapper = new ModelMapper();
	
	public CustomerDTO customerConvertDTO(CustomerEntity customerEntity) {		
		CustomerDTO dto = mapper.map(customerEntity,CustomerDTO.class);
		return dto;
	}
	public CustomerEntity customerConvertEntity(CustomerDTO customerDTO) {		
		CustomerEntity entity = mapper.map(customerDTO,CustomerEntity.class);
		return entity;
	}
}
