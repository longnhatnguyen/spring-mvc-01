package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.DTO.CustomerDTO;

public interface ICustomerService {
	List<CustomerDTO> findAll();
}
