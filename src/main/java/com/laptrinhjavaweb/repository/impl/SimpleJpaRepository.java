package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;
import com.laptrinhjavaweb.repository.JpaRepositoy;

public class SimpleJpaRepository<T> implements JpaRepositoy<T> {
	private Class<T> zClass;
	private String id = "";
	@SuppressWarnings("unchecked")
	public SimpleJpaRepository() {
		 //vi T la 1 generics nen phai ep sang Class va duoi day la syntax
		zClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; // syntax Ã‰p T sang class
	}
	protected Connection getConnection() { // connection xÃ i chung
		// STEP 2: Register JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estate62020module1part1", "root", "123456");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected database successfully...");
		return null;
	}

	@Override
	public List<T> findAllJpa() { // vi goi Jpa sang nen phai dung FindAll cua Jpa de ghi de lai
		// TODO Auto-generated method stub
		List<T> results = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // 3 thang nay thuoc truy van sql
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/estate62020module1part1", "root", "123456");
			System.out.println("Connected database successfully...");
			// STEP 4: Execute a query
			stmt = conn.createStatement();
			String tableName = " ";
			if (zClass.isAnnotationPresent(Table.class)) // check ben annotation
			{
				Table table = zClass.getAnnotation(Table.class);
				tableName = table.name();
			}

			String sql = "select *from " + tableName;
			rs = stmt.executeQuery(sql);

			if (zClass.isAnnotationPresent(Entity.class))// kiem tra zclass phai la entity trong annotation
			{
				ResultSetMetaData resultSetMetaData = rs.getMetaData(); // khai bao lay du lieu trong sql
				Field[] fields = zClass.getDeclaredFields(); // dung o dau thi lay dc data tu field do, cho vao mang[]
				while (rs.next()) { // quÃ©t tá»«ng row vÃ  tráº£ vá»� values
					@SuppressWarnings("unused")
					T object = zClass.newInstance(); // khoi tao T la 1 doi tuong
					for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) // chay cac cot trong bang
					{
						String columnName = resultSetMetaData.getColumnName(i + 1); // lay ten cot cua bang do ve
						Object columnValue = rs.getObject(i + 1); // lay gia tri tra ve doi tuong
						for (Field field : fields) { // chay vong lap trong mang
							if (field.isAnnotationPresent(Column.class)) // check xem field co phai la column ko
							{
								Column column = field.getAnnotation(Column.class); // get column
								if (column.name().equals(columnName) && columnValue != null) {
									BeanUtils.setProperty(object, field.getName(), columnValue);
									break;

								}
							}
						}
					}
					results.add(object);
				}

			}
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("load Repositoy");
		return results;

	} 
	@Override
	public void insert(Object object) {
		String sql = buildSqlInsert();
		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = getConnection();
			connection.setAutoCommit(false);
			stmt = connection.prepareStatement(sql.toString()); // chuyá»ƒn sang string
			Class<?> aClass = object.getClass();
			int index = 0;
			for (Field field : aClass.getDeclaredFields()) {
				index ++;
				field.setAccessible(true);
				stmt.setObject(index, field.get(object));
				
			}
			int i = stmt.executeUpdate();
			System.out.println(i + " Cáº­p nháº­t thÃ nh cÃ´ng");
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
		
	}

	private String buildSqlInsert() {		
		String tableName = "";
		if (zClass.isAnnotationPresent(Table.class)) // check ben annotation
		{
			Table table = zClass.getAnnotation(Table.class);
			tableName = table.name();
		}
		StringBuilder fields = new StringBuilder("");
		StringBuilder values = new StringBuilder("");
		for (Field field : zClass.getDeclaredFields()) {
			
			if(fields.length()>1) {
				fields.append(",");
				values.append(",");
			}
			if (field.isAnnotationPresent(Column.class)) // check ben annotation
			{
				Column column = field.getAnnotation(Column.class);
				fields.append(column.name());
				values.append("?");
			}
		}	
		String sql = "INSERT INTO " + tableName+"("+fields.toString()+") VALUES("+values.toString()+")";		
		return sql;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement statement = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			
			String tableName = "";
			if (zClass.isAnnotationPresent(Table.class)) {
				Table table = zClass.getAnnotation(Table.class);
				tableName = table.name();
			}
			
			String sql = "DELETE FROM "+tableName+" WHERE id = ?";

			statement = conn.prepareStatement(sql);
			if (conn != null) {
				statement.setObject(1, id);
				statement.executeUpdate();
				//int i = stmt.executeUpdate();
				System.out.println(" Cáº­p nháº­t thÃ nh cÃ´ng");
				conn.commit();
			}
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public List<T> findById(String id) {
		Connection conn = null;
		PreparedStatement statement = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			
			String tableName = "";
			if (zClass.isAnnotationPresent(Table.class)) {
				Table table = zClass.getAnnotation(Table.class);
				tableName = table.name();
			}
			
			String sql = "SELECT FROM "+tableName+" WHERE id = ?";

			statement = conn.prepareStatement(sql);
			if (conn != null) {
				statement.setObject(1, id);
				statement.executeUpdate();
				//int i = stmt.executeUpdate();
				System.out.println(" Cáº­p nháº­t thÃ nh cÃ´ng");
				conn.commit();
			}
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
