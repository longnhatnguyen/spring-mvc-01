package com.laptrinhjavaweb.repository;

import java.util.List;

public interface JpaRepositoy<T> { // khai bao 1 generics T
	List<T> findAllJpa(); // List T co ham Findall
	void insert(Object object); // 
	void update(Object object, String id);
	void delete(String id);
	List<T> findById(String id);
	

}
