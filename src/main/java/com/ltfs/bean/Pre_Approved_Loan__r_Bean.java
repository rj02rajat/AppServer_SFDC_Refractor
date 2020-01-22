package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Pre_Approved_Loan__r")
public class Pre_Approved_Loan__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "PreApprovedLoan_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "No_Under_Writing__c", columnDefinition = "VARCHAR(20)")
	private String No_Under_Writing__c;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNo_Under_Writing__c() {
		return No_Under_Writing__c;
	}
	public void setNo_Under_Writing__c(String no_Under_Writing__c) {
		No_Under_Writing__c = no_Under_Writing__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Pre_Approved_Loan__r_Bean() {
		super();
	}
	public Pre_Approved_Loan__r_Bean(String id, String no_Under_Writing__c, AttributesBean attributes) {
		super();
		Id = id;
		No_Under_Writing__c = no_Under_Writing__c;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Pre_Approved_Loan__r_Bean [Id=" + Id + ", No_Under_Writing__c=" + No_Under_Writing__c + ", attributes="
				+ attributes + "]";
	}
}
