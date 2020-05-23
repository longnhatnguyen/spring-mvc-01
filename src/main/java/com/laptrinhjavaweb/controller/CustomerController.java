package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.ICustomerService;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.service.impl.CustomerService;

public class CustomerController {
	

	public static void main(String[] args) {	
		ICustomerService customerService = new CustomerService();
		List<CustomerDTO> results = customerService.findAll();
		
		for (CustomerDTO item : results) {
			System.out.println("ID : " + item.getId());
			System.out.println("Tên  " + item.getFullName());
			System.out.println("SDT " + item.getPhone());
			
			System.out.println("---------------------");
		}
	}
}
