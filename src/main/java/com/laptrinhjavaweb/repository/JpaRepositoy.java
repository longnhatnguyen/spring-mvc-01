package com.laptrinhjavaweb.repository;

import java.util.List;

public interface JpaRepositoy<T> { // khai bao 1 generics T
	List<T> findAllJpa(); // List T co ham Findall
	void insert(Object object); // 
	void update(Object object, Long id);
	void delete(Long id);
	List<T> findById(Long id);
	

}
