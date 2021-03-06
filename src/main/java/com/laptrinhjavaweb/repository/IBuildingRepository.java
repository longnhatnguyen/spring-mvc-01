package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.BuildingEntity;

import java.util.List;

public interface IBuildingRepository extends JpaRepositoy<BuildingEntity>{ // extend findall va cho T = buildingEntity
	//void update(BuildingEntity buildingEntity); // cap nhat du lieu cho enity vì đang ở trong repo
	//void save(BuildingEntity newbuildingEntity); // cap nhat du lieu cho enity
	//void delete(BuildingEntity deleteBuildingEntity); // cap nhat du lieu cho enity

    List<BuildingEntity> findAll(String name, String ward, String street, String district);
}
