package com.laptrinhjavaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingReprository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {
    @Override
    public List<BuildingEntity> findAll(String name, String ward, String street, String district) {
        StringBuilder where = new StringBuilder(" and A.name like '%"+ name+"%' and A.ward like '%"+ ward+"%'");
        where.append(" and A.street like '%"+ street+"%' and A.district like '%"+district+"%'");
        return this.findAllJpa(where.toString());
    }
}
