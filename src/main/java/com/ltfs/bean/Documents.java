package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Documents")
public class Documents implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "opsHoldReasons", columnDefinition = "VARCHAR(50)")
	private String opsHoldReasons;
	@Column(name = "name", columnDefinition = "VARCHAR(250)")
	private String name;
	@Column(name = "Los_Stage__c", columnDefinition = "VARCHAR(50)")
	private String LOS_Stage;
	@Column(name = "isUploaded", columnDefinition = "VARCHAR(20)")
	private String isUploaded;
	@Column(name = "isTechDoc", columnDefinition = "VARCHAR(20)")
	private String isTechDoc;
	@Column(name = "isOptional", columnDefinition = "VARCHAR(20)")
	private String isOptional;
	@Column(name = "isMultiple", columnDefinition = "VARCHAR(20)")
	private String isMultiple;
	@Column(name = "isMandatory", columnDefinition = "VARCHAR(20)")
	private String isMandatory;
	@Column(name = "isAdditional", columnDefinition = "VARCHAR(20)")
	private String isAdditional;
	@Id
	@Column(name = "docId", columnDefinition = "VARCHAR(100)")
	private String docId;
	@Column(name = "applicantName", columnDefinition = "VARCHAR(250)")
	private String applicantName;
	@Column(name = "applicantId", columnDefinition = "VARCHAR(50)")
	private String applicantId;
	@Column(name = "Is_Conditional__c", columnDefinition = "VARCHAR(20)")
	private String Is_Conditional__c;
	@Column(name = "Is_Multiple__c", columnDefinition = "VARCHAR(20)")
	private String Is_Multiple__c;
	
	public String getOpsHoldReasons() {
		return opsHoldReasons;
	}
	public void setOpsHoldReasons(String opsHoldReasons) {
		this.opsHoldReasons = opsHoldReasons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLOS_Stage() {
		return LOS_Stage;
	}
	public void setLOS_Stage(String lOS_Stage) {
		LOS_Stage = lOS_Stage;
	}
	public String getIsUploaded() {
		return isUploaded;
	}
	public void setIsUploaded(String isUploaded) {
		this.isUploaded = isUploaded;
	}
	public String getIsTechDoc() {
		return isTechDoc;
	}
	public void setIsTechDoc(String isTechDoc) {
		this.isTechDoc = isTechDoc;
	}
	public String getIsOptional() {
		return isOptional;
	}
	public void setIsOptional(String isOptional) {
		this.isOptional = isOptional;
	}
	public String getIsMultiple() {
		return isMultiple;
	}
	public void setIsMultiple(String isMultiple) {
		this.isMultiple = isMultiple;
	}
	public String getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}
	public String getIsAdditional() {
		return isAdditional;
	}
	public void setIsAdditional(String isAdditional) {
		this.isAdditional = isAdditional;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	public String getIs_Conditional__c() {
		return Is_Conditional__c;
	}
	public void setIs_Conditional__c(String is_Conditional__c) {
		Is_Conditional__c = is_Conditional__c;
	}
	public String getIs_Multiple__c() {
		return Is_Multiple__c;
	}
	public void setIs_Multiple__c(String is_Multiple__c) {
		Is_Multiple__c = is_Multiple__c;
	}
	public Documents() {
		super();
	}
	public Documents(String opsHoldReasons, String name, String lOS_Stage, String isUploaded, String isTechDoc,
			String isOptional, String isMultiple, String isMandatory, String isAdditional, String docId,
			String applicantName, String applicantId, String is_Conditional__c, String is_Multiple__c) {
		super();
		this.opsHoldReasons = opsHoldReasons;
		this.name = name;
		LOS_Stage = lOS_Stage;
		this.isUploaded = isUploaded;
		this.isTechDoc = isTechDoc;
		this.isOptional = isOptional;
		this.isMultiple = isMultiple;
		this.isMandatory = isMandatory;
		this.isAdditional = isAdditional;
		this.docId = docId;
		this.applicantName = applicantName;
		this.applicantId = applicantId;
		Is_Conditional__c = is_Conditional__c;
		Is_Multiple__c = is_Multiple__c;
	}
	@Override
	public String toString() {
		return "Documents [opsHoldReasons=" + opsHoldReasons + ", name=" + name + ", LOS_Stage=" + LOS_Stage
				+ ", isUploaded=" + isUploaded + ", isTechDoc=" + isTechDoc + ", isOptional=" + isOptional
				+ ", isMultiple=" + isMultiple + ", isMandatory=" + isMandatory + ", isAdditional=" + isAdditional
				+ ", docId=" + docId + ", applicantName=" + applicantName + ", applicantId=" + applicantId
				+ ", Is_Conditional__c=" + Is_Conditional__c + ", Is_Multiple__c=" + Is_Multiple__c + "]";
	}
}
