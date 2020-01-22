package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Genesis__Parties__r_Records")
public class Genesis__Parties__r_Records implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "genesis__Party_Account_Name__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Party_Account_Name__c;
	@Column(name = "Applicant_Type__c", columnDefinition = "VARCHAR(50)")
	private String Applicant_Type__c;
	@Column(name = "genesis__Party_Type__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Party_Type__c;
	@Column(name = "LPC__c", columnDefinition = "VARCHAR(20)")
	private String LPC__c;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getGenesis__Party_Account_Name__c() {
		return genesis__Party_Account_Name__c;
	}
	public void setGenesis__Party_Account_Name__c(String genesis__Party_Account_Name__c) {
		this.genesis__Party_Account_Name__c = genesis__Party_Account_Name__c;
	}
	public String getApplicant_Type__c() {
		return Applicant_Type__c;
	}
	public void setApplicant_Type__c(String applicant_Type__c) {
		Applicant_Type__c = applicant_Type__c;
	}
	public String getGenesis__Party_Type__c() {
		return genesis__Party_Type__c;
	}
	public void setGenesis__Party_Type__c(String genesis__Party_Type__c) {
		this.genesis__Party_Type__c = genesis__Party_Type__c;
	}
	public String getLPC__c() {
		return LPC__c;
	}
	public void setLPC__c(String lPC__c) {
		LPC__c = lPC__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Genesis__Parties__r_Records() {
		super();
	}
	public Genesis__Parties__r_Records(String id, String genesis__Party_Account_Name__c, String applicant_Type__c,
			String genesis__Party_Type__c, String lPC__c, AttributesBean attributes) {
		super();
		Id = id;
		this.genesis__Party_Account_Name__c = genesis__Party_Account_Name__c;
		Applicant_Type__c = applicant_Type__c;
		this.genesis__Party_Type__c = genesis__Party_Type__c;
		LPC__c = lPC__c;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Genesis__Parties__r_Records [Id=" + Id + ", genesis__Party_Account_Name__c="
				+ genesis__Party_Account_Name__c + ", Applicant_Type__c=" + Applicant_Type__c
				+ ", genesis__Party_Type__c=" + genesis__Party_Type__c + ", LPC__c=" + LPC__c + ", attributes="
				+ attributes + "]";
	}
}
