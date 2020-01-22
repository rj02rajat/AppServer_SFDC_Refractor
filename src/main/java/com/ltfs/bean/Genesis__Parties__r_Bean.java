package com.ltfs.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Genesis__Parties__r")
public class Genesis__Parties__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "GenesisParties_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(20)")
	private String Id;
	@Column(name = "totalSize", columnDefinition = "VARCHAR(10)")
	private String totalSize;
	@Column(name = "done", columnDefinition = "VARCHAR(20)")
	private String done;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GenesisParties_Id")
	private List<Genesis__Parties__r_Records> records;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getDone() {
		return done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	public List<Genesis__Parties__r_Records> getRecords() {
		return records;
	}
	public void setRecords(List<Genesis__Parties__r_Records> records) {
		this.records = records;
	}
	public Genesis__Parties__r_Bean() {
		super();
	}
	public Genesis__Parties__r_Bean(String id, String totalSize, String done,
			List<Genesis__Parties__r_Records> records) {
		super();
		Id = id;
		this.totalSize = totalSize;
		this.done = done;
		this.records = records;
	}
	@Override
	public String toString() {
		return "Genesis__Parties__r_Bean [Id=" + Id + ", totalSize=" + totalSize + ", done=" + done + ", records="
				+ records + "]";
	}
}
