package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.converter.CustomerConverter;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.repository.ICustomerRepository;
import com.laptrinhjavaweb.repository.impl.CustomerRepository;
import com.laptrinhjavaweb.service.ICustomerService;

public class CustomerService implements ICustomerService {
	
	ICustomerRepository customerRepository = new CustomerRepository();
	CustomerConverter 	customerConverter = new CustomerConverter();
	
	@Override
	public List<CustomerDTO> findAll() {
		List<CustomerDTO> results = new ArrayList<CustomerDTO>(); // khai bao 1 list kieu DTO
		List<CustomerEntity> customerEntities = customerRepository.findAllJpa(); // goi thang findall ra de lay du lieu
		for (CustomerEntity item : customerEntities) {  
			CustomerDTO customerDTO = customerConverter.customerConvertDTO(item);
			results.add(customerDTO);		
		}
		return results;
	}

	@Override
	public void insert(CustomerDTO newCustomerDTO) {
		// TODO Auto-generated method stub
//		List<CustomerDTO> results = new ArrayList<CustomerDTO>();
//		for(CustomerDTO item : results) {
//			CustomerEntity customerEntity = customerConverter.customerConvertEntity(item);
//			results.add(item);
//			customerRepository.insert(results);
//		}
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setFullName(newCustomerDTO.getFullName()); // lay du lieu tu DTO nha ra cho entity
		customerEntity.setPhone(newCustomerDTO.getPhone()); // lay du lieu tu DTO nha ra cho entity		
		customerRepository.insert(customerEntity);
		
	}
	@Override
	public void delete(String id) {
		CustomerEntity customerEntity = new CustomerEntity();
		//buildingEntity.setId(deleteBuilding.getId());
		//buildingReporsitory.delete(buildingEntity);
		customerRepository.delete(id);
	}

//	@Override
//	public void insert(BuildingDTO newBuilding) {
//		List<BuildingDTO> results = new ArrayList<BuildingDTO>(); 		
//		for (BuildingDTO item: results ) {
//			BuildingEntity buildingEntity = buildingConverter.convertEntity(item);
//			results.add(item);
//			buildingReporsitory.insert(results);
//		}
	

}
