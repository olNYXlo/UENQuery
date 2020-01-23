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
	private String uenNumber;
	
	@Column(name = "issuance_agency_id")
	private String issuanceAgency;
	
	@Column(name = "uen_status")
	private String uenStatus;
	
	@Column(name = "entity_name")
	private String entityName;
	
	@Column(name = "entity_type")
	private String entityType;
	
	@Column(name = "uen_issue_date")
	private String uenIssueDate;
	
	@Column(name = "reg_street_name")
	private String registeredStreetName;
	
	@Column(name = "reg_postal_code")
	private String registeredPostalCode;

	public String getUenNumber() {
		return uenNumber;
	}

	public void setUenNumber(String uenNumber) {
		this.uenNumber = uenNumber;
	}

	public String getIssuanceAgency() {
		return issuanceAgency;
	}

	public void setIssuanceAgency(String issuanceAgency) {
		this.issuanceAgency = issuanceAgency;
	}

	public String getUenStatus() {
		return uenStatus;
	}

	public void setUenStatus(String uenStatus) {
		this.uenStatus = uenStatus;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getUenIssueDate() {
		return uenIssueDate;
	}

	public void setUenIssueDate(String uenIssueDate) {
		this.uenIssueDate = uenIssueDate;
	}

	public String getRegisteredStreetName() {
		return registeredStreetName;
	}

	public void setRegisteredStreetName(String registeredStreetName) {
		this.registeredStreetName = registeredStreetName;
	}

	public String getRegisteredPostalCode() {
		return registeredPostalCode;
	}

	public void setRegisteredPostalCode(String registeredPostalCode) {
		this.registeredPostalCode = registeredPostalCode;
	}
	
	
	
	
	
	

}
