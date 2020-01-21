package com.uenquery.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uenquery.model.Company;
import com.uenquery.service.CompanyServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyServiceImpl companyServiceImpl;
	
	
	@GetMapping(value = "/query/{uen}")
	@ApiOperation(value = "Queries for company name using uen")
	public String getCompanyName(@PathVariable String uen) {
		return companyServiceImpl.searchUENNative(uen);
	}
	
	
	@PostMapping(value = "/add")
	@ApiOperation(value = "Adding Company Records into DB")
	public boolean addCompany(@RequestBody ArrayList<Company> c) {
		return companyServiceImpl.addCompany(c);
	}

}
