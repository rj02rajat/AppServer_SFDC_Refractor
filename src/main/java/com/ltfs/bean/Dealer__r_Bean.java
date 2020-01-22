package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Dealer__r")
public class Dealer__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "Dealer_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Dealer__r_Bean() {
		super();
	}
	public Dealer__r_Bean(String id, AttributesBean attributes) {
		super();
		Id = id;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Dealer__r_Bean [Id=" + Id + ", attributes=" + attributes + "]";
	}
}
