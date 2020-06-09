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
//				System.out.println("TÃªn tÃ²a nhÃ  : " + item.getName());
//				System.out.println("TÃªn phÆ°á»�ng : " + item.getWard());
//				System.out.println("TÃªn Ä‘Æ°á»�ng : " + item.getStreet());
//				System.out.println(" SÃ´ táº§ng háº§m : " + item.getNumberofbasement());
//				System.out.println("---------------------");
//			}
//		}
//		BuildingDTO buildingDTO = new BuildingDTO();
		// buildingDTO.setId(3L);
//		buildingDTO.setName(" Testttt name");
//		buildingDTO.setWard(" Testttt wward");
		// buildingDTO.setWard(" quáº­n 100000sdas");
		// buildingService.insert(buildingDTO); // náº¡p chá»“ng phÆ°Æ¡ng thá»©c
		// buildingService.save(buildingDTO); // náº¡p chá»“ng phÆ°Æ¡ng thá»©c
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
			System.out.println("ID Building : " + item.getId());
			System.out.println("Name  : " + item.getName());
			System.out.println("Ward : " + item.getWard());
			System.out.println("Street: " + item.getStreet());
			System.out.println(" Numberofbasement: " + item.getNumberofbasement());
			
			
			for (DistrictEnum district : DistrictEnum.values()) {
				if(district.name().equals(item.getDistrict())) {
					System.out.println(" District: " + district.getValue());
					break;
				}
				
			}
			
			System.out.println("---------------------");
		}

	}

	public static void findById() {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> results = buildingService.findAll1();
		System.out.print("Import Id You want to find :");
		String id = new Scanner(System.in).nextLine();
		buildingService.findID(id);
			boolean stt = false;
		for (BuildingDTO item : results) {
			if (item.getId().equalsIgnoreCase(id)) {
				stt = true;
				System.out.println(" Name  : " + item.getName());
				System.out.println("Ward : " + item.getWard());
				System.out.println("Street : " + item.getStreet());
				System.out.println(" Numberofbasement: " + item.getNumberofbasement());
				System.out.println(" Numberofbasement " + item.getNumberofbasement());
				System.out.println("---------------------");
			}
		}
		if (!stt) {
			System.out.println("Not Found " + id);
		}

	}

	public static void update() {
		IBuildingService buildingService = new BuildingService();
		List<BuildingDTO> results = buildingService.findAll1();
		BuildingDTO buildingDTO = new BuildingDTO();
		boolean stt = false;
		System.out.print("Import Id You want to edit : ");
		String id = new Scanner(System.in).nextLine();
		for (BuildingDTO item : results) {
			if (item.getId().equalsIgnoreCase(id)) {
				stt = true;
				buildingDTO.setId(id);
				System.out.print("Import new name of building  : ");
				String name = new Scanner(System.in).nextLine();
				buildingDTO.setName(name);
				System.out.print("Import new ward of building : ");
				String ward = new Scanner(System.in).nextLine();
				buildingDTO.setWard(ward);
				buildingService.update(buildingDTO,id); // náº¡p chá»“ng phÆ°Æ¡ng thá»©c
			}
		}
		if (!stt) {
			System.out.println("Not Found  " + id);
		}

	}

	public static void insert() {
		IBuildingService buildingService = new BuildingService();
		BuildingDTO buildingDTO = new BuildingDTO();
		System.out.print("Import new name of building: ");
		String name = new Scanner(System.in).nextLine();
		buildingDTO.setName(name);
		System.out.print("Import new ward of building: ");
		String ward = new Scanner(System.in).nextLine();
		buildingDTO.setWard(ward);
		System.out.print("Import  numberofbasement of building: ");
		int numberofbasement = new Scanner(System.in).nextInt();
		buildingDTO.setNumberofbasement(numberofbasement);
		buildingService.insert(buildingDTO); // náº¡p chá»“ng phÆ°Æ¡ng thá»©c
	}

	public static void delete() {
		IBuildingService buildingService = new BuildingService();
		BuildingDTO buildingDTO = new BuildingDTO();
		System.out.print("Import Id You want to delete : ");
		String id = new Scanner(System.in).nextLine();
		buildingService.delete(id); // náº¡p chá»“ng phÆ°Æ¡ng thá»©c
	}

}
