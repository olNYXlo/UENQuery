package com.uenquery.service;

import java.util.ArrayList;

import com.uenquery.model.Company;

public interface CompanyService {
	
	
	String searchUENNative(String uen);
	
	
	boolean addCompany(ArrayList<Company> c);

}
