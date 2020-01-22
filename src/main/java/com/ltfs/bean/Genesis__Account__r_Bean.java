package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Genesis__Account__r")
public class Genesis__Account__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "GenesisAccount_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "PersonEmail", columnDefinition = "VARCHAR(100)")
	private String PersonEmail;
	@Column(name = "Salutation", columnDefinition = "VARCHAR(50)")
	private String Salutation;
	@Column(name = "Name", columnDefinition = "VARCHAR(100)")
	private String Name;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPersonEmail() {
		return PersonEmail;
	}
	public void setPersonEmail(String personEmail) {
		PersonEmail = personEmail;
	}
	public String getSalutation() {
		return Salutation;
	}
	public void setSalutation(String salutation) {
		Salutation = salutation;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Genesis__Account__r_Bean(String id, String personEmail, String salutation, String name,
			AttributesBean attributes) {
		super();
		Id = id;
		PersonEmail = personEmail;
		Salutation = salutation;
		Name = name;
		this.attributes = attributes;
	}
	public Genesis__Account__r_Bean() {
		super();
	}
	@Override
	public String toString() {
		return "Genesis__Account__r_Bean [Id=" + Id + ", PersonEmail=" + PersonEmail + ", Salutation=" + Salutation
				+ ", Name=" + Name + ", attributes=" + attributes + "]";
	}
}
