package com.laptrinhjavaweb.service;


import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;

public interface IBuildingService {
	List<BuildingDTO> findAll1();
	void update(BuildingDTO updateBuilding);// hàm update
	void insert(BuildingDTO newBuilding);
	void delete(String id);
	
}
