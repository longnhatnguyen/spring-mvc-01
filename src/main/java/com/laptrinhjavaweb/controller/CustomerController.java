package com.laptrinhjavaweb.controller;

import java.util.List;
import java.util.Scanner;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.ICustomerService;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.service.impl.CustomerService;

public class CustomerController {
	

	public static void main(String[] args) {	
//		ICustomerService customerService = new CustomerService();
//		List<CustomerDTO> results = customerService.findAll();
//		
//		for (CustomerDTO item : results) {
//			System.out.println("ID : " + item.getId());
//			System.out.println("Tên  " + item.getFullName());
//			System.out.println("SDT " + item.getPhone());
//			System.out.println("---------------------");
//		}
		update();
	}
	public static void insert() {
		ICustomerService customerService = new CustomerService();
		CustomerDTO customerDTO = new CustomerDTO();
		System.out.print("Import new name : ");
		String name = new Scanner(System.in).nextLine();
		customerDTO.setFullName(name);
		System.out.print("Import new phone : ");
		String phone = new Scanner(System.in).nextLine();
		customerDTO.setPhone(phone);
		customerService.insert(customerDTO);
	}
	public static void delete() {
		ICustomerService customerService = new CustomerService();
		//CustomerDTO customerDTO = new CustomerDTO();
		System.out.print("Import Id You want to delete : ");
		String id = new Scanner(System.in).nextLine();
		customerService.delete(id); // nạp chồng phương thức

	}
	public static void find() {
		System.out.print("Import Id You want to find : ");
		String id = new Scanner(System.in).nextLine();
		ICustomerService customerService = new CustomerService();
		customerService.findID(id); // nạp chồng phương thức
	}
	public static void update() {
		ICustomerService customerService = new CustomerService();
		CustomerDTO customerDTO = new CustomerDTO();
		System.out.print("Import Id You want to edit : ");
		String id = new Scanner(System.in).nextLine();
		customerDTO.setId(id);
		System.out.print("Import new name of custom� : ");
		String name = new Scanner(System.in).nextLine();
		customerDTO.setFullName(name);
		System.out.print("Import new phone of custom : ");
		String phone = new Scanner(System.in).nextLine();
		customerDTO.setPhone(phone);
		customerService.update(customerDTO,id);
	}


}
