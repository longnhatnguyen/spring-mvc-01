package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingReprository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService {
	IBuildingRepository buildingReporsitory = new BuildingReprository();
	BuildingConverter buildingConverter = new BuildingConverter();
	 
	@Override
	public List<BuildingDTO> findAll1() {
		List<BuildingDTO> results = new ArrayList<BuildingDTO>(); // gá»�i DTO vÃ o
		List<BuildingEntity> buildingEntities = buildingReporsitory.findAllJpa(); // Ä‘á»• dá»¯ liá»‡u tá»« hÃ m tÃ¬m kiáº¿m kia vÃ o list Entity
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = buildingConverter.convertDto(item);		
//			buildingDTO.setName(item.getName());
//			buildingDTO.setId(item.getId());
//			buildingDTO.setWard(item.getWard());
//			buildingDTO.setStreet(item.getStreet());
//			buildingDTO.setNumberofbasement(item.getNumberofbasement()); // Ä‘á»• láº¡i dá»¯ liá»‡u tá»« Entity vÃ o DTO
			results.add(buildingDTO);
		}
		return results;
	}

	@Override
	public void update(BuildingDTO updateBuilding) { // service // DTO -> entity 
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setName(updateBuilding.getName()); // lay du lieu tu DTO nha ra cho entity
		buildingEntity.setId(updateBuilding.getId()); // lay du lieu tu DTO nha ra cho entity
		buildingEntity.setWard(updateBuilding.getWard()); // lay du lieu tu DTO nha ra cho entity	
		//buildingEntity.set(updateBuilding.getIdUpDate()); // lay du lieu tu DTO nha ra cho entity	
		// sau khi mÃ¬nh cÃ³ dá»¯ liá»‡u thÃ¬ mÃ¬nh náº¡p láº¡i cho bÃªn repo Ä‘á»ƒ Ä‘áº©y lÃªn
		buildingReporsitory.update(buildingEntity);
	}


	@Override
	public void insert(BuildingDTO newBuilding) {
		//List<BuildingDTO> results = new ArrayList<BuildingDTO>(); 	 // khai bao list DTO	
//	==	for (BuildingDTO item: results ) { // duyet list tra ra du lieu c
//			BuildingEntity buildingEntity = buildingConverter.convertEntity(item);
//			results.add(item);
//			buildingReporsitory.insert(results);
//		}
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setName(newBuilding.getName()); // lay du lieu tu DTO nha ra cho entity
		buildingEntity.setWard(newBuilding.getWard()); // lay du lieu tu DTO nha ra cho entity		
		buildingEntity.setNumberofbasement(newBuilding.getNumberofbasement()); // lay du lieu tu DTO nha ra cho entity		
		buildingReporsitory.insert(buildingEntity);
		
	}

	@Override
	public void delete(String id) {
		BuildingEntity buildingEntity = new BuildingEntity();
		//buildingEntity.setId(deleteBuilding.getId());
		//buildingReporsitory.delete(buildingEntity);
		buildingReporsitory.delete(id);
	}


}
