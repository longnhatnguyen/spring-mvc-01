package com.laptrinhjavaweb.controller;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.enums.DistrictEnum;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;

@Controller(value = "controllerOfAdmin")
public class BuildingController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
		
	}
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView homePageEdit() {
		ModelAndView mav = new ModelAndView("admin/edit");
		return mav;	
	}
	public static void main(String[] args) {

//		IBuildingService buildingService = new BuildingService();
//		// DATA nhan tu client
////		String[] types = new String[] { "TANG_TRET", "NGUYEN_CAN" };
////		int rentArialFrom = 300;
////		int rentArialTo = 400;
//
//		List<BuildingDTO> results = buildingService.findAll1();
//
//		for (BuildingDTO item : results) {
//			if (item.getId() == 3) {
//				System.out.println("Tên tòa nhà : " + item.getName());
//				System.out.println("Tên phường : " + item.getWard());
//				System.out.println("Tên đường : " + item.getStreet());
//				System.out.println(" Sô tầng hầm : " + item.getNumberofbasement());
//				System.out.println("---------------------");
//			}
//		}
//		BuildingDTO buildingDTO = new BuildingDTO();
		// buildingDTO.setId(3L);
//		buildingDTO.setName(" Testttt name");
//		buildingDTO.setWard(" Testttt wward");
		// buildingDTO.setWard(" quận 100000sdas");
		// buildingService.insert(buildingDTO); // nạp chồng phương thức
		// buildingService.save(buildingDTO); // nạp chồng phương thức
		do {
			System.out.println("1 - Tìm kiếm thông tin qua ID");
			System.out.println("2 - Update");
			System.out.println("3 - insert");
			System.out.println("4 - delete");
			System.out.println("5 - exportAll");
			System.out.println("6- exit");
			System.out.print("Hay chon 1 chuc nang :");
			int chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				findById();
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
			case 5:
				exportAll();
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

	public static void exportAll() {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> results = buildingService.findAll1();
		for (BuildingDTO item : results) {
			System.out.println("ID tòa nhà : " + item.getId());
			System.out.println("Tên tòa nhà : " + item.getName());
			System.out.println("Tên phường : " + item.getWard());
			System.out.println("Tên đường : " + item.getStreet());
			System.out.println(" Sô tầng hầm : " + item.getNumberofbasement());
			
			
			for (DistrictEnum district : DistrictEnum.values()) {
				if(district.name().equals(item.getDistrict())) {
					System.out.println(" Quận: " + district.getValue());
					break;
				}
				
			}
			
			System.out.println("---------------------");
		}

	}

	public static void findById() {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> results = buildingService.findAll1();
		System.out.print("Nhập vào id tòa nhà bạn muốn tìm kiếm :");
		String id = "";
		String renumber = "\\d{1,3}";
		// sl = new Scanner(System.in).nextLine();
		do {
			id = new Scanner(System.in).nextLine();
			if (id.matches(renumber))
				break;
			else {
				System.out.println("Vui long nhap so : ");
			}
		} while (!id.matches(renumber));
		boolean stt = false;
		System.out.println("Thông tin tòa nhà có id = " + id + " là :");
		for (BuildingDTO item : results) {
			if (item.getId().equalsIgnoreCase(id)) {
				stt = true;
				System.out.println("Tên tòa nhà : " + item.getName());
				System.out.println("Tên phường : " + item.getWard());
				System.out.println("Tên đường : " + item.getStreet());
				System.out.println(" Sô tầng hầm : " + item.getNumberofbasement());
				System.out.println(" Quận: " + item.getDistrict());
				System.out.println("---------------------");
			}
		}
		if (!stt) {
			System.out.println("không tìm thấy tòa nhà có id " + id);
		}

	}

	public static void update() {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> results = buildingService.findAll1();
		BuildingDTO buildingDTO = new BuildingDTO();
		boolean stt = false;
		System.out.print("Nhap vào ID tòa nhà bạn muốn sửa : ");
		String id = new Scanner(System.in).nextLine();
		for (BuildingDTO item : results) {
			if (item.getId().equalsIgnoreCase(id)) {
				stt = true;
				buildingDTO.setId(id);
				System.out.print("Nhap vào tên tòa nhà : ");
				String name = new Scanner(System.in).nextLine();
				buildingDTO.setName(name);
				System.out.print("Nhap vào tên phường tòa nhà : ");
				String ward = new Scanner(System.in).nextLine();
				buildingDTO.setWard(ward);
				buildingService.update(buildingDTO); // nạp chồng phương thức
			}
		}
		if (!stt) {
			System.out.println("không tìm thấy tòa nhà có id " + id);
		}

	}

	public static void insert() {
		IBuildingService buildingService = new BuildingService();
		BuildingDTO buildingDTO = new BuildingDTO();
		System.out.print("Nhập vào tên tòa nhà: ");
		String name = new Scanner(System.in).nextLine();
		buildingDTO.setName(name);
		System.out.print("Nhập vào tên phường: ");
		String ward = new Scanner(System.in).nextLine();
		buildingDTO.setWard(ward);
		System.out.print("Nhập vào số tầng hầm: ");
		int numberofbasement = new Scanner(System.in).nextInt();
		buildingDTO.setNumberofbasement(numberofbasement);
		buildingService.insert(buildingDTO); // nạp chồng phương thức
	}

	public static void delete() {
		IBuildingService buildingService = new BuildingService();
		BuildingDTO buildingDTO = new BuildingDTO();
		System.out.print("Nhap vào ID tòa nhà bạn muốn xóa : ");
		String id = new Scanner(System.in).nextLine();
		buildingDTO.setId(id);
		buildingService.delete(buildingDTO); // nạp chồng phương thức

	}

}
