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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_JMSResponse")
public class JMSResponseBean implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "JMSResponse_SrNo", unique = true, nullable = false)
	private Long SrNo;
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "Builderbanks", columnDefinition = "VARCHAR(50)")
	private String Builderbanks;
	@Column(name = "Is_CII_App", columnDefinition = "VARCHAR(10)")
	private String Is_CII_App;
	@Column(name = "esignDocuments", columnDefinition = "VARCHAR(50)")
	private String esignDocuments;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ExtndApp_SrNo")
	private ExtendedApplication extendedApplication;
	@Column(name = "Is_RSA_EligibleApp", columnDefinition = "VARCHAR(10)")
	private String Is_RSA_EligibleApp;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "JMSResponse_SrNo")
	private List<Documents> documents;
	@Column(name = "nextActions", columnDefinition = "VARCHAR(100)")
	private String nextActions;
	@Column(name = "deDupeStatus", columnDefinition = "VARCHAR(50)")
	private String deDupeStatus;
	@Column(name = "breHLResponse", columnDefinition = "VARCHAR(50)")
	private String breHLResponse;
	@Column(name = "breMFIResponse", columnDefinition = "VARCHAR(50)")
	private String breMFIResponse;
	@Column(name = "breResult", columnDefinition = "VARCHAR(50)")
	private String breResult;
	@Column(name = "breTWBCResponse", columnDefinition = "VARCHAR(50)")
	private String breTWBCResponse;
	@Column(name = "breTWSCResponse", columnDefinition = "VARCHAR(50)")
	private String breTWSCResponse;
	@Column(name = "breFARMResponse", columnDefinition = "VARCHAR(50)")
	private String breFARMResponse;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Application_SrNo")
	private Application application;
	@Column(name = "applicants", columnDefinition = "VARCHAR(100)")
	private String applicants;
	@Column(name = "DerivedRejectReason", columnDefinition = "VARCHAR(100)")
	private String DerivedRejectReason;
	@Column(name = "Errors", columnDefinition = "VARCHAR(50)")
	private String Errors;
	@Column(name = "RejectReason", columnDefinition = "VARCHAR(100)")
	private String RejectReason;
	@Column(name = "errorCode", columnDefinition = "VARCHAR(20)")
	private String errorCode;
	@Column(name = "errorMessage", columnDefinition = "VARCHAR(100)")
	private String errorMessage;
	@Column(name = "status", columnDefinition = "VARCHAR(20)")
	private String status;
	@Column(name = "statusCode", columnDefinition = "VARCHAR(20)")
	private String statusCode;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "JMSResponse_SrNo")
	private List<Accounts> Accounts;
	
	public Long getSrNo() {
		return SrNo;
	}
	public void setSrNo(Long srNo) {
		SrNo = srNo;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getBuilderbanks() {
		return Builderbanks;
	}
	public void setBuilderbanks(String builderbanks) {
		Builderbanks = builderbanks;
	}
	public String getIs_CII_App() {
		return Is_CII_App;
	}
	public void setIs_CII_App(String is_CII_App) {
		Is_CII_App = is_CII_App;
	}
	public String getEsignDocuments() {
		return esignDocuments;
	}
	public void setEsignDocuments(String esignDocuments) {
		this.esignDocuments = esignDocuments;
	}
	public ExtendedApplication getExtendedApplication() {
		return extendedApplication;
	}
	public void setExtendedApplication(ExtendedApplication extendedApplication) {
		this.extendedApplication = extendedApplication;
	}
	public String getIs_RSA_EligibleApp() {
		return Is_RSA_EligibleApp;
	}
	public void setIs_RSA_EligibleApp(String is_RSA_EligibleApp) {
		Is_RSA_EligibleApp = is_RSA_EligibleApp;
	}
	public List<Documents> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}
	public String getNextActions() {
		return nextActions;
	}
	public void setNextActions(String nextActions) {
		this.nextActions = nextActions;
	}
	public String getDeDupeStatus() {
		return deDupeStatus;
	}
	public void setDeDupeStatus(String deDupeStatus) {
		this.deDupeStatus = deDupeStatus;
	}
	public String getBreHLResponse() {
		return breHLResponse;
	}
	public void setBreHLResponse(String breHLResponse) {
		this.breHLResponse = breHLResponse;
	}
	public String getBreMFIResponse() {
		return breMFIResponse;
	}
	public void setBreMFIResponse(String breMFIResponse) {
		this.breMFIResponse = breMFIResponse;
	}
	public String getBreResult() {
		return breResult;
	}
	public void setBreResult(String breResult) {
		this.breResult = breResult;
	}
	public String getBreTWBCResponse() {
		return breTWBCResponse;
	}
	public void setBreTWBCResponse(String breTWBCResponse) {
		this.breTWBCResponse = breTWBCResponse;
	}
	public String getBreTWSCResponse() {
		return breTWSCResponse;
	}
	public void setBreTWSCResponse(String breTWSCResponse) {
		this.breTWSCResponse = breTWSCResponse;
	}
	public String getBreFARMResponse() {
		return breFARMResponse;
	}
	public void setBreFARMResponse(String breFARMResponse) {
		this.breFARMResponse = breFARMResponse;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public String getApplicants() {
		return applicants;
	}
	public void setApplicants(String applicants) {
		this.applicants = applicants;
	}
	public String getDerivedRejectReason() {
		return DerivedRejectReason;
	}
	public void setDerivedRejectReason(String derivedRejectReason) {
		DerivedRejectReason = derivedRejectReason;
	}
	public String getErrors() {
		return Errors;
	}
	public void setErrors(String errors) {
		Errors = errors;
	}
	public String getRejectReason() {
		return RejectReason;
	}
	public void setRejectReason(String rejectReason) {
		RejectReason = rejectReason;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public List<Accounts> getAccounts() {
		return Accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		Accounts = accounts;
	}
	public JMSResponseBean() {
		super();
	}
	public JMSResponseBean(String id, String builderbanks, String is_CII_App, String esignDocuments,
			ExtendedApplication extendedApplication, String is_RSA_EligibleApp, List<Documents> documents,
			String nextActions, String deDupeStatus, String breHLResponse, String breMFIResponse, String breResult,
			String breTWBCResponse, String breTWSCResponse, String breFARMResponse, Application application,
			String applicants, String derivedRejectReason, String errors, String rejectReason, String errorCode,
			String errorMessage, String status, String statusCode, List<com.ltfs.bean.Accounts> accounts) {
		super();
		Id = id;
		Builderbanks = builderbanks;
		Is_CII_App = is_CII_App;
		this.esignDocuments = esignDocuments;
		this.extendedApplication = extendedApplication;
		Is_RSA_EligibleApp = is_RSA_EligibleApp;
		this.documents = documents;
		this.nextActions = nextActions;
		this.deDupeStatus = deDupeStatus;
		this.breHLResponse = breHLResponse;
		this.breMFIResponse = breMFIResponse;
		this.breResult = breResult;
		this.breTWBCResponse = breTWBCResponse;
		this.breTWSCResponse = breTWSCResponse;
		this.breFARMResponse = breFARMResponse;
		this.application = application;
		this.applicants = applicants;
		DerivedRejectReason = derivedRejectReason;
		Errors = errors;
		RejectReason = rejectReason;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.status = status;
		this.statusCode = statusCode;
		Accounts = accounts;
	}
	@Override
	public String toString() {
		return "JMSResponseBean [SrNo=" + SrNo + ", Id=" + Id + ", Builderbanks=" + Builderbanks + ", Is_CII_App="
				+ Is_CII_App + ", esignDocuments=" + esignDocuments + ", extendedApplication=" + extendedApplication
				+ ", Is_RSA_EligibleApp=" + Is_RSA_EligibleApp + ", documents=" + documents + ", nextActions="
				+ nextActions + ", deDupeStatus=" + deDupeStatus + ", breHLResponse=" + breHLResponse
				+ ", breMFIResponse=" + breMFIResponse + ", breResult=" + breResult + ", breTWBCResponse="
				+ breTWBCResponse + ", breTWSCResponse=" + breTWSCResponse + ", breFARMResponse=" + breFARMResponse
				+ ", application=" + application + ", applicants=" + applicants + ", DerivedRejectReason="
				+ DerivedRejectReason + ", Errors=" + Errors + ", RejectReason=" + RejectReason + ", errorCode="
				+ errorCode + ", errorMessage=" + errorMessage + ", status=" + status + ", statusCode=" + statusCode
				+ ", Accounts=" + Accounts + "]";
	}
}
