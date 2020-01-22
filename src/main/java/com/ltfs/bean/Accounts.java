package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Accounts")
public class Accounts implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "Is_guarantor__c", columnDefinition = "VARCHAR(20)")
	private String Is_guarantor__c;
	@Column(name = "ITR_Done__c", columnDefinition = "VARCHAR(20)")
	private String ITR_Done__c;
	@Column(name = "Is_L_T_Employee__c", columnDefinition = "VARCHAR(20)")
	private String Is_L_T_Employee__c;
	@Column(name = "Tech_Process_Count__c", columnDefinition = "VARCHAR(50)")
	private String Tech_Process_Count__c;
	@Column(name = "Total_No_Of_Partners__c", columnDefinition = "VARCHAR(20)")
	private String Total_No_Of_Partners__c;
	@Column(name = "ITR_Received__c", columnDefinition = "VARCHAR(50)")
	private String ITR_Received__c;
	@Column(name = "Perfios_Report_Recieved__c", columnDefinition = "VARCHAR(50)")
	private String Perfios_Report_Recieved__c;
	@Column(name = "FirstName", columnDefinition = "VARCHAR(50)")
	private String FirstName;
	@Column(name = "NID_Flag__c", columnDefinition = "VARCHAR(20)")
	private String NID_Flag__c;
	@Column(name = "Constitution__c", columnDefinition = "VARCHAR(50)")
	private String Constitution__c;
	@Column(name = "Gender__c", columnDefinition = "VARCHAR(20)")
	private String Gender__c;
	@Column(name = "LastName", columnDefinition = "VARCHAR(50)")
	private String LastName;
	@Column(name = "PersonBirthdate", columnDefinition = "VARCHAR(50)")
	private String PersonBirthdate;
	@Column(name = "PersonEmail", columnDefinition = "VARCHAR(100)")
	private String PersonEmail;
	@Column(name = "PersonMobilePhone", columnDefinition = "VARCHAR(50)")
	private String PersonMobilePhone;
	@Column(name = "Occupation__c", columnDefinition = "VARCHAR(50)")
	private String Occupation__c;
	@Column(name = "Constitution_of_the_employer__c", columnDefinition = "VARCHAR(50)")
	private String Constitution_of_the_employer__c;
	@Column(name = "Present_Employer_Name__c", columnDefinition = "VARCHAR(100)")
	private String Present_Employer_Name__c;
	@Column(name = "Perfios_Salary_Zero__c", columnDefinition = "VARCHAR(50)")
	private String Perfios_Salary_Zero__c;
	@Column(name = "Fuzzy_logic__c", columnDefinition = "VARCHAR(50)")
	private String Fuzzy_logic__c;
	@Column(name = "Applicant_Reference_Id__c", columnDefinition = "VARCHAR(50)")
	private String Applicant_Reference_Id__c;
	@Column(name = "ESign_Complete__c", columnDefinition = "VARCHAR(20)")
	private String ESign_Complete__c;
	@Column(name = "Aadhaar_Number__c", columnDefinition = "VARCHAR(50)")
	private String Aadhaar_Number__c;
	@Column(name = "Father_Husband_Name__c", columnDefinition = "VARCHAR(100)")
	private String Father_Husband_Name__c;
	@Column(name = "PAN_ID__c", columnDefinition = "VARCHAR(50)")
	private String PAN_ID__c;
	@Column(name = "KYC_FLAG__c", columnDefinition = "VARCHAR(20)")
	private String KYC_FLAG__c;
	@Column(name = "Relationship__c", columnDefinition = "VARCHAR(50)")
	private String Relationship__c;
	@Column(name = "BRE_Rejection_Reason__c", columnDefinition = "VARCHAR(100)")
	private String BRE_Rejection_Reason__c;
	@Column(name = "Last_Digit_Aadhar__c", columnDefinition = "VARCHAR(50)")
	private String Last_Digit_Aadhar__c;
	@Column(name = "Business_constitution__c", columnDefinition = "VARCHAR(50)")
	private String Business_constitution__c;
	@Column(name = "Business_Pan_Number__c", columnDefinition = "VARCHAR(50)")
	private String Business_Pan_Number__c;
	@Column(name = "GST_Registration_Number__c", columnDefinition = "VARCHAR(50)")
	private String GST_Registration_Number__c;
	@Column(name = "IFSCCode__c", columnDefinition = "VARCHAR(20)")
	private String IFSCCode__c;
	@Column(name = "Caste__c", columnDefinition = "VARCHAR(50)")
	private String Caste__c;
	@Column(name = "Religion__c", columnDefinition = "VARCHAR(50)")
	private String Religion__c;
	@Column(name = "Preference_Given_Based_On__c", columnDefinition = "VARCHAR(50)")
	private String Preference_Given_Based_On__c;
	@Column(name = "Mother_s_Name__c", columnDefinition = "VARCHAR(100)")
	private String Mother_s_Name__c;
	@Column(name = "Entity_Type__c", columnDefinition = "VARCHAR(50)")
	private String Entity_Type__c;
	@Column(name = "Co_Business_Name__c", columnDefinition = "VARCHAR(100)")
	private String Co_Business_Name__c;
	@Column(name = "Marital_Status__c", columnDefinition = "VARCHAR(20)")
	private String Marital_Status__c;
	@Column(name = "Business_Category__c", columnDefinition = "VARCHAR(50)")
	private String Business_Category__c;
	@Column(name = "Business_SubCategory__c", columnDefinition = "VARCHAR(50)")
	private String Business_SubCategory__c;
	@Column(name = "FD__c", columnDefinition = "VARCHAR(50)")
	private String FD__c;
	@Column(name = "Mutual_fund__c", columnDefinition = "VARCHAR(50)")
	private String Mutual_fund__c;
	@Column(name = "Equity__c", columnDefinition = "VARCHAR(50)")
	private String Equity__c;
	@Column(name = "Cash_Income__c", columnDefinition = "VARCHAR(50)")
	private String Cash_Income__c;
	@Column(name = "Other_Income__c", columnDefinition = "VARCHAR(50)")
	private String Other_Income__c;
	@Column(name = "BankAccountNo__c", columnDefinition = "VARCHAR(50)")
	private String BankAccountNo__c;
	@Column(name = "Hl_Bank_Name__c", columnDefinition = "VARCHAR(100)")
	private String Hl_Bank_Name__c;
	@Column(name = "Nature_Of_Bank_Account__c", columnDefinition = "VARCHAR(50)")
	private String Nature_Of_Bank_Account__c;
	@Column(name = "Source_For_OCR_Funds__C", columnDefinition = "VARCHAR(50)")
	private String Source_For_OCR_Funds__C;
	@Column(name = "EMI_Payable__c", columnDefinition = "VARCHAR(50)")
	private String EMI_Payable__c;
	@Column(name = "FI_Address_Traceable__c", columnDefinition = "VARCHAR(50)")
	private String FI_Address_Traceable__c;
	@Column(name = "FI_Negative_Area__c", columnDefinition = "VARCHAR(50)")
	private String FI_Negative_Area__c;
	@Column(name = "FI_Stay_Confirmation__c", columnDefinition = "VARCHAR(50)")
	private String FI_Stay_Confirmation__c;
	@Column(name = "FI_Reference_Check_Positive__c", columnDefinition = "VARCHAR(50)")
	private String FI_Reference_Check_Positive__c;
	@Column(name = "FI_Shifted_Address__c", columnDefinition = "VARCHAR(50)")
	private String FI_Shifted_Address__c;
	@Column(name = "FI_Filled_By__c", columnDefinition = "VARCHAR(50)")
	private String FI_Filled_By__c;
	@Column(name = "businessPremisesExist__c", columnDefinition = "VARCHAR(50)")
	private String businessPremisesExist__c;
	@Column(name = "employedForMoreThanSixMonths__c", columnDefinition = "VARCHAR(50)")
	private String employedForMoreThanSixMonths__c;
	@Column(name = "levelOfActivity__c", columnDefinition = "VARCHAR(50)")
	private String levelOfActivity__c;
	@Column(name = "Trade__c", columnDefinition = "VARCHAR(50)")
	private String Trade__c;
	@Column(name = "Mother_tongue__c", columnDefinition = "VARCHAR(20)")
	private String Mother_tongue__c;
	@Column(name = "Mode_Of_Disbursement__c", columnDefinition = "VARCHAR(50)")
	private String Mode_Of_Disbursement__c;
	@Column(name = "Phone", columnDefinition = "VARCHAR(50)")
	private String Phone;
	@Column(name = "Voter_Id__c", columnDefinition = "VARCHAR(50)")
	private String Voter_Id__c;
	@Column(name = "Ration_Card_Id__c", columnDefinition = "VARCHAR(50)")
	private String Ration_Card_Id__c;
	@Column(name = "mobileNumber", columnDefinition = "VARCHAR(50)")
	private String mobileNumber;
	@Column(name = "Name", columnDefinition = "VARCHAR(100)")
	private String Name;
	@Column(name = "Salutation", columnDefinition = "VARCHAR(50)")
	private String Salutation;
	@Column(name = "Financial_Applicant__c", columnDefinition = "VARCHAR(50)")
	private String Financial_Applicant__c;
	@Column(name = "Name_of_business__c", columnDefinition = "VARCHAR(100)")
	private String Name_of_business__c;
	@Column(name = "Company_Share__c", columnDefinition = "VARCHAR(50)")
	private String Company_Share__c;
	@Column(name = "Hunter_Severity__c", columnDefinition = "VARCHAR(50)")
	private String Hunter_Severity__c;
	@Embedded
	private AttributesBean attributes;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id")
	private Address__r_Bean Address__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GenesisParties_Id")
	private Genesis__Parties__r_Bean genesis__Parties__r;
	/*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_SrNo")
	private Address__r_Bean Address__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GenesisParties_SrNo")
	private Genesis__Parties__r_Bean genesis__Parties__r;*/
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getIs_guarantor__c() {
		return Is_guarantor__c;
	}
	public void setIs_guarantor__c(String is_guarantor__c) {
		Is_guarantor__c = is_guarantor__c;
	}
	public String getITR_Done__c() {
		return ITR_Done__c;
	}
	public void setITR_Done__c(String iTR_Done__c) {
		ITR_Done__c = iTR_Done__c;
	}
	public String getIs_L_T_Employee__c() {
		return Is_L_T_Employee__c;
	}
	public void setIs_L_T_Employee__c(String is_L_T_Employee__c) {
		Is_L_T_Employee__c = is_L_T_Employee__c;
	}
	public String getTech_Process_Count__c() {
		return Tech_Process_Count__c;
	}
	public void setTech_Process_Count__c(String tech_Process_Count__c) {
		Tech_Process_Count__c = tech_Process_Count__c;
	}
	public String getTotal_No_Of_Partners__c() {
		return Total_No_Of_Partners__c;
	}
	public void setTotal_No_Of_Partners__c(String total_No_Of_Partners__c) {
		Total_No_Of_Partners__c = total_No_Of_Partners__c;
	}
	public String getITR_Received__c() {
		return ITR_Received__c;
	}
	public void setITR_Received__c(String iTR_Received__c) {
		ITR_Received__c = iTR_Received__c;
	}
	public String getPerfios_Report_Recieved__c() {
		return Perfios_Report_Recieved__c;
	}
	public void setPerfios_Report_Recieved__c(String perfios_Report_Recieved__c) {
		Perfios_Report_Recieved__c = perfios_Report_Recieved__c;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getNID_Flag__c() {
		return NID_Flag__c;
	}
	public void setNID_Flag__c(String nID_Flag__c) {
		NID_Flag__c = nID_Flag__c;
	}
	public String getConstitution__c() {
		return Constitution__c;
	}
	public void setConstitution__c(String constitution__c) {
		Constitution__c = constitution__c;
	}
	public String getGender__c() {
		return Gender__c;
	}
	public void setGender__c(String gender__c) {
		Gender__c = gender__c;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPersonBirthdate() {
		return PersonBirthdate;
	}
	public void setPersonBirthdate(String personBirthdate) {
		PersonBirthdate = personBirthdate;
	}
	public String getPersonEmail() {
		return PersonEmail;
	}
	public void setPersonEmail(String personEmail) {
		PersonEmail = personEmail;
	}
	public String getPersonMobilePhone() {
		return PersonMobilePhone;
	}
	public void setPersonMobilePhone(String personMobilePhone) {
		PersonMobilePhone = personMobilePhone;
	}
	public String getOccupation__c() {
		return Occupation__c;
	}
	public void setOccupation__c(String occupation__c) {
		Occupation__c = occupation__c;
	}
	public String getConstitution_of_the_employer__c() {
		return Constitution_of_the_employer__c;
	}
	public void setConstitution_of_the_employer__c(String constitution_of_the_employer__c) {
		Constitution_of_the_employer__c = constitution_of_the_employer__c;
	}
	public String getPresent_Employer_Name__c() {
		return Present_Employer_Name__c;
	}
	public void setPresent_Employer_Name__c(String present_Employer_Name__c) {
		Present_Employer_Name__c = present_Employer_Name__c;
	}
	public String getPerfios_Salary_Zero__c() {
		return Perfios_Salary_Zero__c;
	}
	public void setPerfios_Salary_Zero__c(String perfios_Salary_Zero__c) {
		Perfios_Salary_Zero__c = perfios_Salary_Zero__c;
	}
	public String getFuzzy_logic__c() {
		return Fuzzy_logic__c;
	}
	public void setFuzzy_logic__c(String fuzzy_logic__c) {
		Fuzzy_logic__c = fuzzy_logic__c;
	}
	public String getApplicant_Reference_Id__c() {
		return Applicant_Reference_Id__c;
	}
	public void setApplicant_Reference_Id__c(String applicant_Reference_Id__c) {
		Applicant_Reference_Id__c = applicant_Reference_Id__c;
	}
	public String getESign_Complete__c() {
		return ESign_Complete__c;
	}
	public void setESign_Complete__c(String eSign_Complete__c) {
		ESign_Complete__c = eSign_Complete__c;
	}
	public String getAadhaar_Number__c() {
		return Aadhaar_Number__c;
	}
	public void setAadhaar_Number__c(String aadhaar_Number__c) {
		Aadhaar_Number__c = aadhaar_Number__c;
	}
	public String getFather_Husband_Name__c() {
		return Father_Husband_Name__c;
	}
	public void setFather_Husband_Name__c(String father_Husband_Name__c) {
		Father_Husband_Name__c = father_Husband_Name__c;
	}
	public String getPAN_ID__c() {
		return PAN_ID__c;
	}
	public void setPAN_ID__c(String pAN_ID__c) {
		PAN_ID__c = pAN_ID__c;
	}
	public String getKYC_FLAG__c() {
		return KYC_FLAG__c;
	}
	public void setKYC_FLAG__c(String kYC_FLAG__c) {
		KYC_FLAG__c = kYC_FLAG__c;
	}
	public String getRelationship__c() {
		return Relationship__c;
	}
	public void setRelationship__c(String relationship__c) {
		Relationship__c = relationship__c;
	}
	public String getBRE_Rejection_Reason__c() {
		return BRE_Rejection_Reason__c;
	}
	public void setBRE_Rejection_Reason__c(String bRE_Rejection_Reason__c) {
		BRE_Rejection_Reason__c = bRE_Rejection_Reason__c;
	}
	public String getLast_Digit_Aadhar__c() {
		return Last_Digit_Aadhar__c;
	}
	public void setLast_Digit_Aadhar__c(String last_Digit_Aadhar__c) {
		Last_Digit_Aadhar__c = last_Digit_Aadhar__c;
	}
	public String getBusiness_constitution__c() {
		return Business_constitution__c;
	}
	public void setBusiness_constitution__c(String business_constitution__c) {
		Business_constitution__c = business_constitution__c;
	}
	public String getBusiness_Pan_Number__c() {
		return Business_Pan_Number__c;
	}
	public void setBusiness_Pan_Number__c(String business_Pan_Number__c) {
		Business_Pan_Number__c = business_Pan_Number__c;
	}
	public String getGST_Registration_Number__c() {
		return GST_Registration_Number__c;
	}
	public void setGST_Registration_Number__c(String gST_Registration_Number__c) {
		GST_Registration_Number__c = gST_Registration_Number__c;
	}
	public String getIFSCCode__c() {
		return IFSCCode__c;
	}
	public void setIFSCCode__c(String iFSCCode__c) {
		IFSCCode__c = iFSCCode__c;
	}
	public String getCaste__c() {
		return Caste__c;
	}
	public void setCaste__c(String caste__c) {
		Caste__c = caste__c;
	}
	public String getReligion__c() {
		return Religion__c;
	}
	public void setReligion__c(String religion__c) {
		Religion__c = religion__c;
	}
	public String getPreference_Given_Based_On__c() {
		return Preference_Given_Based_On__c;
	}
	public void setPreference_Given_Based_On__c(String preference_Given_Based_On__c) {
		Preference_Given_Based_On__c = preference_Given_Based_On__c;
	}
	public String getMother_s_Name__c() {
		return Mother_s_Name__c;
	}
	public void setMother_s_Name__c(String mother_s_Name__c) {
		Mother_s_Name__c = mother_s_Name__c;
	}
	public String getEntity_Type__c() {
		return Entity_Type__c;
	}
	public void setEntity_Type__c(String entity_Type__c) {
		Entity_Type__c = entity_Type__c;
	}
	public String getCo_Business_Name__c() {
		return Co_Business_Name__c;
	}
	public void setCo_Business_Name__c(String co_Business_Name__c) {
		Co_Business_Name__c = co_Business_Name__c;
	}
	public String getMarital_Status__c() {
		return Marital_Status__c;
	}
	public void setMarital_Status__c(String marital_Status__c) {
		Marital_Status__c = marital_Status__c;
	}
	public String getBusiness_Category__c() {
		return Business_Category__c;
	}
	public void setBusiness_Category__c(String business_Category__c) {
		Business_Category__c = business_Category__c;
	}
	public String getBusiness_SubCategory__c() {
		return Business_SubCategory__c;
	}
	public void setBusiness_SubCategory__c(String business_SubCategory__c) {
		Business_SubCategory__c = business_SubCategory__c;
	}
	public String getFD__c() {
		return FD__c;
	}
	public void setFD__c(String fD__c) {
		FD__c = fD__c;
	}
	public String getMutual_fund__c() {
		return Mutual_fund__c;
	}
	public void setMutual_fund__c(String mutual_fund__c) {
		Mutual_fund__c = mutual_fund__c;
	}
	public String getEquity__c() {
		return Equity__c;
	}
	public void setEquity__c(String equity__c) {
		Equity__c = equity__c;
	}
	public String getCash_Income__c() {
		return Cash_Income__c;
	}
	public void setCash_Income__c(String cash_Income__c) {
		Cash_Income__c = cash_Income__c;
	}
	public String getOther_Income__c() {
		return Other_Income__c;
	}
	public void setOther_Income__c(String other_Income__c) {
		Other_Income__c = other_Income__c;
	}
	public String getBankAccountNo__c() {
		return BankAccountNo__c;
	}
	public void setBankAccountNo__c(String bankAccountNo__c) {
		BankAccountNo__c = bankAccountNo__c;
	}
	public String getHl_Bank_Name__c() {
		return Hl_Bank_Name__c;
	}
	public void setHl_Bank_Name__c(String hl_Bank_Name__c) {
		Hl_Bank_Name__c = hl_Bank_Name__c;
	}
	public String getNature_Of_Bank_Account__c() {
		return Nature_Of_Bank_Account__c;
	}
	public void setNature_Of_Bank_Account__c(String nature_Of_Bank_Account__c) {
		Nature_Of_Bank_Account__c = nature_Of_Bank_Account__c;
	}
	public String getSource_For_OCR_Funds__C() {
		return Source_For_OCR_Funds__C;
	}
	public void setSource_For_OCR_Funds__C(String source_For_OCR_Funds__C) {
		Source_For_OCR_Funds__C = source_For_OCR_Funds__C;
	}
	public String getEMI_Payable__c() {
		return EMI_Payable__c;
	}
	public void setEMI_Payable__c(String eMI_Payable__c) {
		EMI_Payable__c = eMI_Payable__c;
	}
	public String getFI_Address_Traceable__c() {
		return FI_Address_Traceable__c;
	}
	public void setFI_Address_Traceable__c(String fI_Address_Traceable__c) {
		FI_Address_Traceable__c = fI_Address_Traceable__c;
	}
	public String getFI_Negative_Area__c() {
		return FI_Negative_Area__c;
	}
	public void setFI_Negative_Area__c(String fI_Negative_Area__c) {
		FI_Negative_Area__c = fI_Negative_Area__c;
	}
	public String getFI_Stay_Confirmation__c() {
		return FI_Stay_Confirmation__c;
	}
	public void setFI_Stay_Confirmation__c(String fI_Stay_Confirmation__c) {
		FI_Stay_Confirmation__c = fI_Stay_Confirmation__c;
	}
	public String getFI_Reference_Check_Positive__c() {
		return FI_Reference_Check_Positive__c;
	}
	public void setFI_Reference_Check_Positive__c(String fI_Reference_Check_Positive__c) {
		FI_Reference_Check_Positive__c = fI_Reference_Check_Positive__c;
	}
	public String getFI_Shifted_Address__c() {
		return FI_Shifted_Address__c;
	}
	public void setFI_Shifted_Address__c(String fI_Shifted_Address__c) {
		FI_Shifted_Address__c = fI_Shifted_Address__c;
	}
	public String getFI_Filled_By__c() {
		return FI_Filled_By__c;
	}
	public void setFI_Filled_By__c(String fI_Filled_By__c) {
		FI_Filled_By__c = fI_Filled_By__c;
	}
	public String getBusinessPremisesExist__c() {
		return businessPremisesExist__c;
	}
	public void setBusinessPremisesExist__c(String businessPremisesExist__c) {
		this.businessPremisesExist__c = businessPremisesExist__c;
	}
	public String getEmployedForMoreThanSixMonths__c() {
		return employedForMoreThanSixMonths__c;
	}
	public void setEmployedForMoreThanSixMonths__c(String employedForMoreThanSixMonths__c) {
		this.employedForMoreThanSixMonths__c = employedForMoreThanSixMonths__c;
	}
	public String getLevelOfActivity__c() {
		return levelOfActivity__c;
	}
	public void setLevelOfActivity__c(String levelOfActivity__c) {
		this.levelOfActivity__c = levelOfActivity__c;
	}
	public String getTrade__c() {
		return Trade__c;
	}
	public void setTrade__c(String trade__c) {
		Trade__c = trade__c;
	}
	public String getMother_tongue__c() {
		return Mother_tongue__c;
	}
	public void setMother_tongue__c(String mother_tongue__c) {
		Mother_tongue__c = mother_tongue__c;
	}
	public String getMode_Of_Disbursement__c() {
		return Mode_Of_Disbursement__c;
	}
	public void setMode_Of_Disbursement__c(String mode_Of_Disbursement__c) {
		Mode_Of_Disbursement__c = mode_Of_Disbursement__c;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getVoter_Id__c() {
		return Voter_Id__c;
	}
	public void setVoter_Id__c(String voter_Id__c) {
		Voter_Id__c = voter_Id__c;
	}
	public String getRation_Card_Id__c() {
		return Ration_Card_Id__c;
	}
	public void setRation_Card_Id__c(String ration_Card_Id__c) {
		Ration_Card_Id__c = ration_Card_Id__c;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalutation() {
		return Salutation;
	}
	public void setSalutation(String salutation) {
		Salutation = salutation;
	}
	public String getFinancial_Applicant__c() {
		return Financial_Applicant__c;
	}
	public void setFinancial_Applicant__c(String financial_Applicant__c) {
		Financial_Applicant__c = financial_Applicant__c;
	}
	public String getName_of_business__c() {
		return Name_of_business__c;
	}
	public void setName_of_business__c(String name_of_business__c) {
		Name_of_business__c = name_of_business__c;
	}
	public String getCompany_Share__c() {
		return Company_Share__c;
	}
	public void setCompany_Share__c(String company_Share__c) {
		Company_Share__c = company_Share__c;
	}
	public String getHunter_Severity__c() {
		return Hunter_Severity__c;
	}
	public void setHunter_Severity__c(String hunter_Severity__c) {
		Hunter_Severity__c = hunter_Severity__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Address__r_Bean getAddress__r() {
		return Address__r;
	}
	public void setAddress__r(Address__r_Bean address__r) {
		Address__r = address__r;
	}
	public Genesis__Parties__r_Bean getGenesis__Parties__r() {
		return genesis__Parties__r;
	}
	public void setGenesis__Parties__r(Genesis__Parties__r_Bean genesis__Parties__r) {
		this.genesis__Parties__r = genesis__Parties__r;
	}
	public Accounts() {
		super();
	}
	public Accounts(String id, String is_guarantor__c, String iTR_Done__c, String is_L_T_Employee__c,
			String tech_Process_Count__c, String total_No_Of_Partners__c, String iTR_Received__c,
			String perfios_Report_Recieved__c, String firstName, String nID_Flag__c, String constitution__c,
			String gender__c, String lastName, String personBirthdate, String personEmail, String personMobilePhone,
			String occupation__c, String constitution_of_the_employer__c, String present_Employer_Name__c,
			String perfios_Salary_Zero__c, String fuzzy_logic__c, String applicant_Reference_Id__c,
			String eSign_Complete__c, String aadhaar_Number__c, String father_Husband_Name__c, String pAN_ID__c,
			String kYC_FLAG__c, String relationship__c, String bRE_Rejection_Reason__c, String last_Digit_Aadhar__c,
			String business_constitution__c, String business_Pan_Number__c, String gST_Registration_Number__c,
			String iFSCCode__c, String caste__c, String religion__c, String preference_Given_Based_On__c,
			String mother_s_Name__c, String entity_Type__c, String co_Business_Name__c, String marital_Status__c,
			String business_Category__c, String business_SubCategory__c, String fD__c, String mutual_fund__c,
			String equity__c, String cash_Income__c, String other_Income__c, String bankAccountNo__c,
			String hl_Bank_Name__c, String nature_Of_Bank_Account__c, String source_For_OCR_Funds__C,
			String eMI_Payable__c, String fI_Address_Traceable__c, String fI_Negative_Area__c,
			String fI_Stay_Confirmation__c, String fI_Reference_Check_Positive__c, String fI_Shifted_Address__c,
			String fI_Filled_By__c, String businessPremisesExist__c, String employedForMoreThanSixMonths__c,
			String levelOfActivity__c, String trade__c, String mother_tongue__c, String mode_Of_Disbursement__c,
			String phone, String voter_Id__c, String ration_Card_Id__c, String mobileNumber, String name,
			String salutation, String financial_Applicant__c, String name_of_business__c, String company_Share__c,
			String hunter_Severity__c, AttributesBean attributes, Address__r_Bean address__r,
			Genesis__Parties__r_Bean genesis__Parties__r) {
		super();
		Id = id;
		Is_guarantor__c = is_guarantor__c;
		ITR_Done__c = iTR_Done__c;
		Is_L_T_Employee__c = is_L_T_Employee__c;
		Tech_Process_Count__c = tech_Process_Count__c;
		Total_No_Of_Partners__c = total_No_Of_Partners__c;
		ITR_Received__c = iTR_Received__c;
		Perfios_Report_Recieved__c = perfios_Report_Recieved__c;
		FirstName = firstName;
		NID_Flag__c = nID_Flag__c;
		Constitution__c = constitution__c;
		Gender__c = gender__c;
		LastName = lastName;
		PersonBirthdate = personBirthdate;
		PersonEmail = personEmail;
		PersonMobilePhone = personMobilePhone;
		Occupation__c = occupation__c;
		Constitution_of_the_employer__c = constitution_of_the_employer__c;
		Present_Employer_Name__c = present_Employer_Name__c;
		Perfios_Salary_Zero__c = perfios_Salary_Zero__c;
		Fuzzy_logic__c = fuzzy_logic__c;
		Applicant_Reference_Id__c = applicant_Reference_Id__c;
		ESign_Complete__c = eSign_Complete__c;
		Aadhaar_Number__c = aadhaar_Number__c;
		Father_Husband_Name__c = father_Husband_Name__c;
		PAN_ID__c = pAN_ID__c;
		KYC_FLAG__c = kYC_FLAG__c;
		Relationship__c = relationship__c;
		BRE_Rejection_Reason__c = bRE_Rejection_Reason__c;
		Last_Digit_Aadhar__c = last_Digit_Aadhar__c;
		Business_constitution__c = business_constitution__c;
		Business_Pan_Number__c = business_Pan_Number__c;
		GST_Registration_Number__c = gST_Registration_Number__c;
		IFSCCode__c = iFSCCode__c;
		Caste__c = caste__c;
		Religion__c = religion__c;
		Preference_Given_Based_On__c = preference_Given_Based_On__c;
		Mother_s_Name__c = mother_s_Name__c;
		Entity_Type__c = entity_Type__c;
		Co_Business_Name__c = co_Business_Name__c;
		Marital_Status__c = marital_Status__c;
		Business_Category__c = business_Category__c;
		Business_SubCategory__c = business_SubCategory__c;
		FD__c = fD__c;
		Mutual_fund__c = mutual_fund__c;
		Equity__c = equity__c;
		Cash_Income__c = cash_Income__c;
		Other_Income__c = other_Income__c;
		BankAccountNo__c = bankAccountNo__c;
		Hl_Bank_Name__c = hl_Bank_Name__c;
		Nature_Of_Bank_Account__c = nature_Of_Bank_Account__c;
		Source_For_OCR_Funds__C = source_For_OCR_Funds__C;
		EMI_Payable__c = eMI_Payable__c;
		FI_Address_Traceable__c = fI_Address_Traceable__c;
		FI_Negative_Area__c = fI_Negative_Area__c;
		FI_Stay_Confirmation__c = fI_Stay_Confirmation__c;
		FI_Reference_Check_Positive__c = fI_Reference_Check_Positive__c;
		FI_Shifted_Address__c = fI_Shifted_Address__c;
		FI_Filled_By__c = fI_Filled_By__c;
		this.businessPremisesExist__c = businessPremisesExist__c;
		this.employedForMoreThanSixMonths__c = employedForMoreThanSixMonths__c;
		this.levelOfActivity__c = levelOfActivity__c;
		Trade__c = trade__c;
		Mother_tongue__c = mother_tongue__c;
		Mode_Of_Disbursement__c = mode_Of_Disbursement__c;
		Phone = phone;
		Voter_Id__c = voter_Id__c;
		Ration_Card_Id__c = ration_Card_Id__c;
		this.mobileNumber = mobileNumber;
		Name = name;
		Salutation = salutation;
		Financial_Applicant__c = financial_Applicant__c;
		Name_of_business__c = name_of_business__c;
		Company_Share__c = company_Share__c;
		Hunter_Severity__c = hunter_Severity__c;
		this.attributes = attributes;
		Address__r = address__r;
		this.genesis__Parties__r = genesis__Parties__r;
	}
	@Override
	public String toString() {
		return "Accounts [Id=" + Id + ", Is_guarantor__c=" + Is_guarantor__c + ", ITR_Done__c=" + ITR_Done__c
				+ ", Is_L_T_Employee__c=" + Is_L_T_Employee__c + ", Tech_Process_Count__c=" + Tech_Process_Count__c
				+ ", Total_No_Of_Partners__c=" + Total_No_Of_Partners__c + ", ITR_Received__c=" + ITR_Received__c
				+ ", Perfios_Report_Recieved__c=" + Perfios_Report_Recieved__c + ", FirstName=" + FirstName
				+ ", NID_Flag__c=" + NID_Flag__c + ", Constitution__c=" + Constitution__c + ", Gender__c=" + Gender__c
				+ ", LastName=" + LastName + ", PersonBirthdate=" + PersonBirthdate + ", PersonEmail=" + PersonEmail
				+ ", PersonMobilePhone=" + PersonMobilePhone + ", Occupation__c=" + Occupation__c
				+ ", Constitution_of_the_employer__c=" + Constitution_of_the_employer__c + ", Present_Employer_Name__c="
				+ Present_Employer_Name__c + ", Perfios_Salary_Zero__c=" + Perfios_Salary_Zero__c + ", Fuzzy_logic__c="
				+ Fuzzy_logic__c + ", Applicant_Reference_Id__c=" + Applicant_Reference_Id__c + ", ESign_Complete__c="
				+ ESign_Complete__c + ", Aadhaar_Number__c=" + Aadhaar_Number__c + ", Father_Husband_Name__c="
				+ Father_Husband_Name__c + ", PAN_ID__c=" + PAN_ID__c + ", KYC_FLAG__c=" + KYC_FLAG__c
				+ ", Relationship__c=" + Relationship__c + ", BRE_Rejection_Reason__c=" + BRE_Rejection_Reason__c
				+ ", Last_Digit_Aadhar__c=" + Last_Digit_Aadhar__c + ", Business_constitution__c="
				+ Business_constitution__c + ", Business_Pan_Number__c=" + Business_Pan_Number__c
				+ ", GST_Registration_Number__c=" + GST_Registration_Number__c + ", IFSCCode__c=" + IFSCCode__c
				+ ", Caste__c=" + Caste__c + ", Religion__c=" + Religion__c + ", Preference_Given_Based_On__c="
				+ Preference_Given_Based_On__c + ", Mother_s_Name__c=" + Mother_s_Name__c + ", Entity_Type__c="
				+ Entity_Type__c + ", Co_Business_Name__c=" + Co_Business_Name__c + ", Marital_Status__c="
				+ Marital_Status__c + ", Business_Category__c=" + Business_Category__c + ", Business_SubCategory__c="
				+ Business_SubCategory__c + ", FD__c=" + FD__c + ", Mutual_fund__c=" + Mutual_fund__c + ", Equity__c="
				+ Equity__c + ", Cash_Income__c=" + Cash_Income__c + ", Other_Income__c=" + Other_Income__c
				+ ", BankAccountNo__c=" + BankAccountNo__c + ", Hl_Bank_Name__c=" + Hl_Bank_Name__c
				+ ", Nature_Of_Bank_Account__c=" + Nature_Of_Bank_Account__c + ", Source_For_OCR_Funds__C="
				+ Source_For_OCR_Funds__C + ", EMI_Payable__c=" + EMI_Payable__c + ", FI_Address_Traceable__c="
				+ FI_Address_Traceable__c + ", FI_Negative_Area__c=" + FI_Negative_Area__c
				+ ", FI_Stay_Confirmation__c=" + FI_Stay_Confirmation__c + ", FI_Reference_Check_Positive__c="
				+ FI_Reference_Check_Positive__c + ", FI_Shifted_Address__c=" + FI_Shifted_Address__c
				+ ", FI_Filled_By__c=" + FI_Filled_By__c + ", businessPremisesExist__c=" + businessPremisesExist__c
				+ ", employedForMoreThanSixMonths__c=" + employedForMoreThanSixMonths__c + ", levelOfActivity__c="
				+ levelOfActivity__c + ", Trade__c=" + Trade__c + ", Mother_tongue__c=" + Mother_tongue__c
				+ ", Mode_Of_Disbursement__c=" + Mode_Of_Disbursement__c + ", Phone=" + Phone + ", Voter_Id__c="
				+ Voter_Id__c + ", Ration_Card_Id__c=" + Ration_Card_Id__c + ", mobileNumber=" + mobileNumber
				+ ", Name=" + Name + ", Salutation=" + Salutation + ", Financial_Applicant__c=" + Financial_Applicant__c
				+ ", Name_of_business__c=" + Name_of_business__c + ", Company_Share__c=" + Company_Share__c
				+ ", Hunter_Severity__c=" + Hunter_Severity__c + ", attributes=" + attributes + ", Address__r="
				+ Address__r + ", genesis__Parties__r=" + genesis__Parties__r + "]";
	}
}
