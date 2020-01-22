package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Genesis__CL_Product__r")
public class Genesis__CL_Product__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "GenesisCLProduct_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "Name", columnDefinition = "VARCHAR(100)")
	private String Name;
	@Column(name = "ProductUniqueId__c", columnDefinition = "VARCHAR(50)")
	private String ProductUniqueId__c;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProductUniqueId__c() {
		return ProductUniqueId__c;
	}
	public void setProductUniqueId__c(String productUniqueId__c) {
		ProductUniqueId__c = productUniqueId__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Genesis__CL_Product__r_Bean(String id, String name, String productUniqueId__c, AttributesBean attributes) {
		super();
		Id = id;
		Name = name;
		ProductUniqueId__c = productUniqueId__c;
		this.attributes = attributes;
	}
	public Genesis__CL_Product__r_Bean() {
		super();
	}
	@Override
	public String toString() {
		return "Genesis__CL_Product__r_Bean [Id=" + Id + ", Name=" + Name + ", ProductUniqueId__c=" + ProductUniqueId__c
				+ ", attributes=" + attributes + "]";
	}
}
