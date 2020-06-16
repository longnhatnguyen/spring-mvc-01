package com.laptrinhjavaweb.service;


import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public interface IBuildingService {
	List<BuildingDTO> findAll1();
	List<BuildingDTO> findAll1(String name, String ward, String street, String district);
	BuildingDTO update(BuildingDTO updateBuilding, Long id);// hàm update
	BuildingDTO insert(BuildingDTO newBuilding);
	void delete(Long id);
	void findID(Long id);
	
}
