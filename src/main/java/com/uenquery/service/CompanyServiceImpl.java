package com.uenquery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uenquery.dao.CompanyDao;
import com.uenquery.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyDao companyDao;
	


	@Override
	public String searchUENNative(String uen) {
		String EntityName = "";
		EntityName = companyDao.getEntityNameByUENNumberNative(uen);
		// runs native query that only returns 1 column of entity name
		if (EntityName == null) {
			EntityName = "Entered UEN Does Not Match Any Records";
		}		
		return EntityName;
	}

	
	@Override
	public boolean addCompany(ArrayList<Company> companies) {
		// Method to add an arraylist of company data into database
		boolean status = false;
		int count = 0;
		int max = companies.size();
		if (companies != null) {
			for (Company com : companies) {
				// for each loop that checks if company already exists in the database
				// If already exists, will just skip it
				// else will save it into the database
				Company retrievedCompany = companyDao.findById(com.getUenNumber()).orElse(null);
				if (retrievedCompany == null) {
					companyDao.save(com);
					count ++;
					status = true;
				}
				else {
					System.out.println("Company already exists");
				}				
			}
			
			
		}
		System.out.println(count + " Companies Successfully Added Into Database");
		System.out.println(max-count + " Companies Failed To Be Added Into Database");
		return status;
	}
	
	
	

}
