package com.laptrinhjavaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingReprository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {
//
//	@Override
//	public void update(BuildingEntity buildingEntity) {
//		Connection connection = null;
//		PreparedStatement stmt = null;
//		try {
//			connection = this.getConnection();
//			connection.setAutoCommit(false);
//			stmt = connection.prepareStatement("update building set name = ?, ward = ?  where id = ?");
//			stmt.setString(1, buildingEntity.getName());
//			stmt.setString(2, buildingEntity.getWard());
//			stmt.setString(3, buildingEntity.getId());
//			int i = stmt.executeUpdate();
//			System.out.println(i + " Cập nhật thành công");
//			connection.commit();
//
//		} catch (Exception e) {
//			System.out.println(e);
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		} finally {
//
//			try {
//				if (connection != null) {
//					connection.close();
//				}
//				if (stmt != null) {
//					stmt.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	/*public void delete(BuildingEntity deleteBuildingEntity) {
		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = this.getConnection();
			connection.setAutoCommit(false);
			stmt = connection.prepareStatement("DELETE FROM building WHERE id =?");
			stmt.setString(1, deleteBuildingEntity.getId());
			stmt.executeUpdate();
			System.out.println( " Update Success");
			connection.commit();

		} catch (Exception e) {
			System.out.println(e);
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}*/

} 
