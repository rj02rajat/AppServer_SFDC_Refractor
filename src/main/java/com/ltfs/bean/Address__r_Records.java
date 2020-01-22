package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Address__r_Records")
public class Address__r_Records implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "Applicant__c", columnDefinition = "VARCHAR(50)")
	private String Applicant__c;
	@Column(name = "Address_Line1__c", columnDefinition = "VARCHAR(250)")
	private String Address_Line1__c;
	@Column(name = "Address_Line2__c", columnDefinition = "VARCHAR(250)")
	private String Address_Line2__c;
	@Column(name = "City__c", columnDefinition = "VARCHAR(20)")
	private String City__c;
	@Column(name = "Pin_Code__c", columnDefinition = "VARCHAR(20)")
	private String Pin_Code__c;
	@Column(name = "State__c", columnDefinition = "VARCHAR(20)")
	private String State__c;
	@Column(name = "Address_Type__c", columnDefinition = "VARCHAR(20)")
	private String Address_Type__c;
	@Embedded
	private AttributesBean attributes;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getApplicant__c() {
		return Applicant__c;
	}
	public void setApplicant__c(String applicant__c) {
		Applicant__c = applicant__c;
	}
	public String getAddress_Line1__c() {
		return Address_Line1__c;
	}
	public void setAddress_Line1__c(String address_Line1__c) {
		Address_Line1__c = address_Line1__c;
	}
	public String getAddress_Line2__c() {
		return Address_Line2__c;
	}
	public void setAddress_Line2__c(String address_Line2__c) {
		Address_Line2__c = address_Line2__c;
	}
	public String getCity__c() {
		return City__c;
	}
	public void setCity__c(String city__c) {
		City__c = city__c;
	}
	public String getPin_Code__c() {
		return Pin_Code__c;
	}
	public void setPin_Code__c(String pin_Code__c) {
		Pin_Code__c = pin_Code__c;
	}
	public String getState__c() {
		return State__c;
	}
	public void setState__c(String state__c) {
		State__c = state__c;
	}
	public String getAddress_Type__c() {
		return Address_Type__c;
	}
	public void setAddress_Type__c(String address_Type__c) {
		Address_Type__c = address_Type__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Address__r_Records() {
		super();
	}
	public Address__r_Records(String id, String applicant__c, String address_Line1__c, String address_Line2__c, String city__c,
			String pin_Code__c, String state__c, String address_Type__c, AttributesBean attributes) {
		super();
		Id = id;
		Applicant__c = applicant__c;
		Address_Line1__c = address_Line1__c;
		Address_Line2__c = address_Line2__c;
		City__c = city__c;
		Pin_Code__c = pin_Code__c;
		State__c = state__c;
		Address_Type__c = address_Type__c;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Records [Id=" + Id + ", Applicant__c=" + Applicant__c + ", Address_Line1__c=" + Address_Line1__c
				+ ", Address_Line2__c=" + Address_Line2__c + ", City__c=" + City__c + ", Pin_Code__c=" + Pin_Code__c
				+ ", State__c=" + State__c + ", Address_Type__c=" + Address_Type__c + ", attributes=" + attributes
				+ "]";
	}
}
