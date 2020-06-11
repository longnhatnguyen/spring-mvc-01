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
		
		do {
			System.out.println("1 - Find by ID");
			System.out.println("2 - Update");
			System.out.println("3 - insert");
			System.out.println("4 - delete");
			System.out.println("5 - exportAll");
			System.out.println("6- exit");
			System.out.print("Hay chon 1 chuc nang :");
			int chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				find();
				break;
			case 2:
				update();
				break;
			case 3:
				insert();
				break;
			case 4:
				delete();
				break;
			case 6:
				System.out.println("Chuong trinh da thoat");
				System.exit(0);
				break;
			default:
				System.out.println("Ban Nhap sai, vui long nhap lai");
			}
		} while (true);

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
		Long id = new Scanner(System.in).nextLong();
		customerService.delete(id); // nạp chồng phương thức

	}
	public static void find() {
		System.out.print("Import Id You want to find : ");
		Long id = new Scanner(System.in).nextLong();
		ICustomerService customerService = new CustomerService();
		customerService.findID(id); // nạp chồng phương thức
	}
	public static void update() {
		ICustomerService customerService = new CustomerService();
		CustomerDTO customerDTO = new CustomerDTO();
		System.out.print("Import Id You want to edit : ");
		Long id = new Scanner(System.in).nextLong();
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
