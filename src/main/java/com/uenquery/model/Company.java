package com.uenquery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {
	
	@Id
	@Column(name = "uen")
	private String uen;
	
	@Column(name = "issuance_agency_id")
	private String issuance_agency_id;
	
	@Column(name = "uen_status")
	private String uen_status;
	
	@Column(name = "entity_name")
	private String entity_name;
	
	@Column(name = "entity_type")
	private String entity_type;
	
	@Column(name = "uen_issue_date")
	private String uen_issue_date;
	
	@Column(name = "reg_street_name")
	private String reg_street_name;
	
	@Column(name = "reg_postal_code")
	private String reg_postal_code;

	public String getUenNumber() {
		return uen;
	}

	public void setUenNumber(String uenNumber) {
		this.uen = uenNumber;
	}

	public String getIssuanceAgency() {
		return issuance_agency_id;
	}

	public void setIssuanceAgency(String issuanceAgency) {
		this.issuance_agency_id = issuanceAgency;
	}

	public String getUenStatus() {
		return uen_status;
	}

	public void setUenStatus(String uenStatus) {
		this.uen_status = uenStatus;
	}

	public String getEntityName() {
		return entity_name;
	}

	public void setEntityName(String entityName) {
		this.entity_name = entityName;
	}

	public String getEntityType() {
		return entity_type;
	}

	public void setEntityType(String entityType) {
		this.entity_type = entityType;
	}

	public String getUenIssueDate() {
		return uen_issue_date;
	}

	public void setUenIssueDate(String uenIssueDate) {
		this.uen_issue_date = uenIssueDate;
	}

	public String getRegisteredStreetName() {
		return reg_street_name;
	}

	public void setRegisteredStreetName(String registeredStreetName) {
		this.reg_street_name = registeredStreetName;
	}

	public String getRegisteredPostalCode() {
		return reg_postal_code;
	}

	public void setRegisteredPostalCode(String registeredPostalCode) {
		this.reg_postal_code = registeredPostalCode;
	}
	
	
	
	
	
	

}
