package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.repository.ICustomerRepository;
import com.laptrinhjavaweb.repository.impl.CustomerRepository;
import com.laptrinhjavaweb.service.ICustomerService;

public class CustomerService implements ICustomerService {
	
	ICustomerRepository customerRepository = new CustomerRepository();
	
	@Override
	public List<CustomerDTO> findAll() {
		List<CustomerDTO> results = new ArrayList<CustomerDTO>(); // khai bao 1 list kieu DTO
		List<CustomerEntity> customerEntities = customerRepository.findAllJpa(); // goi thang findall ra de lay du lieu
		for (CustomerEntity item : customerEntities) {  
			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setFullName(item.getFullName()); // do du lieu tu findall vao trong cusDTO
			customerDTO.setPhone(item.getPhone());
			customerDTO.setId(item.getId());
			results.add(customerDTO);
		}
		return results;
	}


}
