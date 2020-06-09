package com.laptrinhjavaweb.service;


import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public interface IBuildingService {
	List<BuildingDTO> findAll1();
	BuildingDTO update(BuildingDTO updateBuilding, String id);// hàm update
	BuildingDTO insert(BuildingDTO newBuilding);
	void delete(String id);
	void findID(String id);
	
}
