package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingConverter {
	ModelMapper mapper = new ModelMapper();
	public BuildingDTO convertDto(BuildingEntity buildingEntity) {
		BuildingDTO dto = mapper.map(buildingEntity, BuildingDTO.class);
		return dto;	
	}
	public BuildingEntity convertEntity(BuildingDTO buildingDTO) {
		BuildingEntity entity = mapper.map(buildingDTO, BuildingEntity.class);
		return entity;	
	}
}
