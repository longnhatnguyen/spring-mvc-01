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
		List<BuildingDTO> results = new ArrayList<BuildingDTO>(); // gọi DTO vào
		List<BuildingEntity> buildingEntities = buildingReporsitory.findAllJpa(); // đổ dữ liệu từ hàm tìm kiếm kia vào list Entity
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = buildingConverter.convertDto(item);
			
//			buildingDTO.setName(item.getName());
//			buildingDTO.setId(item.getId());
//			buildingDTO.setWard(item.getWard());
//			buildingDTO.setStreet(item.getStreet());
//			buildingDTO.setNumberofbasement(item.getNumberofbasement()); // đổ lại dữ liệu từ Entity vào DTO
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
		// sau khi mình có dữ liệu thì mình nạp lại cho bên repo để đẩy lên
		buildingReporsitory.update(buildingEntity);
	}


	@Override
	public void insert(BuildingDTO newBuilding) {
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setName(newBuilding.getName()); // lay du lieu tu DTO nha ra cho entity
		buildingEntity.setWard(newBuilding.getWard()); // lay du lieu tu DTO nha ra cho entity		
		buildingEntity.setNumberofbasement(newBuilding.getNumberofbasement()); // lay du lieu tu DTO nha ra cho entity		
		buildingReporsitory.insert(buildingEntity);
		
	}

	@Override
	public void delete(BuildingDTO deleteBuilding) {
		// TODO Auto-generated method stub
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setId(deleteBuilding.getId());
		buildingReporsitory.delete(buildingEntity);
		
	}

}
