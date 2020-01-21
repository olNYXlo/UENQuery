package com.uenquery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uenquery.model.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company,String>{
	
	
	@Query(value = "SELECT entity_name FROM Company WHERE uen = ?1", nativeQuery = true)
	String getEntityNameByUENNumberNative(String uen);
	

}
