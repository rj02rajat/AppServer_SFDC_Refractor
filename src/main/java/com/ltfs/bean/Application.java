package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Application")
public class Application implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "Application_SrNo")
	private Long SrNo;
	@Column(name = "Product_Category__c", columnDefinition = "VARCHAR(50)")
	private String Product_Category__c;
	@Column(name = "genesis__Account__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Account__c;
	@Column(name = "Top_up_Calculated__c", columnDefinition = "VARCHAR(50)")
	private String Top_up_Calculated__c;
	@Column(name = "Scheme__c", columnDefinition = "VARCHAR(50)")
	private String Scheme__c;
	@Column(name = "Sub_Property_Type__c", columnDefinition = "VARCHAR(50)")
	private String Sub_Property_Type__c;
	@Column(name = "Is_SENP__c", columnDefinition = "VARCHAR(50)")
	private String Is_SENP__c;
	@Column(name = "Disbursal_To__c", columnDefinition = "VARCHAR(50)")
	private String Disbursal_To__c;
	@Column(name = "DST_FLS_City__c", columnDefinition = "VARCHAR(50)")
	private String DST_FLS_City__c;
	@Column(name = "isOnline__c", columnDefinition = "VARCHAR(50)")
	private String isOnline__c;
	@Column(name = "Login_Fees__c", columnDefinition = "VARCHAR(50)")
	private String Login_Fees__c;
	@Column(name = "Is_Non_APF__c", columnDefinition = "VARCHAR(50)")
	private String Is_Non_APF__c;
	@Column(name = "MFI_CLI_New_Grid__c", columnDefinition = "VARCHAR(50)")
	private String MFI_CLI_New_Grid__c;
	@Column(name = "Property_Type__c", columnDefinition = "VARCHAR(50)")
	private String Property_Type__c;
	@Column(name = "PDC_Deviation_FLAG__c", columnDefinition = "VARCHAR(20)")
	private String PDC_Deviation_FLAG__c;
	@Column(name = "RC_Deviation_Flag__c", columnDefinition = "VARCHAR(20)")
	private String RC_Deviation_Flag__c;
	@Column(name = "Margin_Money__c", columnDefinition = "VARCHAR(50)")
	private String Margin_Money__c;
	@Column(name = "Builder__c", columnDefinition = "VARCHAR(50)")
	private String Builder__c;
	@Column(name = "FLS_Agent__c", columnDefinition = "VARCHAR(50)")
	private String FLS_Agent__c;
	@Column(name = "BRE_MFI_TYPEOFLOAN__c", columnDefinition = "VARCHAR(50)")
	private String BRE_MFI_TYPEOFLOAN__c;
	@Column(name = "location__Longitude__s", columnDefinition = "VARCHAR(50)")
	private String location__Longitude__s;
	@Column(name = "location__Latitude__s", columnDefinition = "VARCHAR(50)")
	private String location__Latitude__s;
	@Column(name = "genesis__Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Loan_Amount__c;
	@Column(name = "Loan_Amount_In_Word__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Amount_In_Word__c;
	@Column(name = "Scheme_Name__c", columnDefinition = "VARCHAR(50)")
	private String Scheme_Name__c;
	@Column(name = "BRE_HL_Result__c", columnDefinition = "VARCHAR(50)")
	private String BRE_HL_Result__c;
	@Column(name = "genesis__Interest_Rate__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Interest_Rate__c;
	@Column(name = "Application_Id__c", columnDefinition = "VARCHAR(50)")
	private String Application_Id__c;
	@Column(name = "genesis__CL_Product__c", columnDefinition = "VARCHAR(50)")
	private String genesis__CL_Product__c;
	@Column(name = "Sub_Product__c", columnDefinition = "VARCHAR(50)")
	private String Sub_Product__c;
	@Column(name = "genesis__Term__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Term__c;
	@Column(name = "Asset_Cost__c", columnDefinition = "VARCHAR(50)")
	private String Asset_Cost__c;
	@Column(name = "Base_Price_per_sq_m__c", columnDefinition = "VARCHAR(50)")
	private String Base_Price_per_sq_m__c;
	@Column(name = "Super_Built_up_Area_sq_m__c", columnDefinition = "VARCHAR(50)")
	private String Super_Built_up_Area_sq_m__c;
	@Column(name = "Property_identified__c", columnDefinition = "VARCHAR(50)")
	private String Property_identified__c;
	@Column(name = "genesis__Interest_Calculation_Method__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Interest_Calculation_Method__c;
	@Column(name = "genesis__Status__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Status__c;
	@Column(name = "Application_Stage__c", columnDefinition = "VARCHAR(50)")
	private String Application_Stage__c;
	@Column(name = "Application_TAT__c", columnDefinition = "VARCHAR(50)")
	private String Application_TAT__c;
	@Column(name = "Loan_Type__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Type__c;
	@Column(name = "Applied_Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Applied_Loan_Amount__c;
	@Column(name = "Sub_Stage__c", columnDefinition = "VARCHAR(50)")
	private String Sub_Stage__c;
	@Column(name = "NID_Flag__c", columnDefinition = "VARCHAR(20)")
	private String NID_Flag__c;
	@Column(name = "Fi_Response_Received__c", columnDefinition = "VARCHAR(50)")
	private String Fi_Response_Received__c;
	@Column(name = "E_Sign_Complete__c", columnDefinition = "VARCHAR(50)")
	private String E_Sign_Complete__c;
	@Column(name = "Extended_Application__c", columnDefinition = "VARCHAR(50)")
	private String Extended_Application__c;
	@Column(name = "Promotions_HL__c", columnDefinition = "VARCHAR(50)")
	private String Promotions_HL__c;
	@Column(name = "No_of_Advance_Installments__c", columnDefinition = "VARCHAR(50)")
	private String No_of_Advance_Installments__c;
	@Column(name = "APF_Tower_Configuration__c", columnDefinition = "VARCHAR(50)")
	private String APF_Tower_Configuration__c;
	@Column(name = "APF_Project__c", columnDefinition = "VARCHAR(50)")
	private String APF_Project__c;
	@Column(name = "Credit_Check__c", columnDefinition = "VARCHAR(50)")
	private String Credit_Check__c;
	@Column(name = "Physical_Esign__c", columnDefinition = "VARCHAR(50)")
	private String Physical_Esign__c;
	@Column(name = "Swimlane_B_Required__c", columnDefinition = "VARCHAR(50)")
	private String Swimlane_B_Required__c;
	@Column(name = "RCU_Triggered__c", columnDefinition = "VARCHAR(50)")
	private String RCU_Triggered__c;
	@Column(name = "BRE_MFI_MAX_Slider__c", columnDefinition = "VARCHAR(50)")
	private String BRE_MFI_MAX_Slider__c;
	@Column(name = "BRE_MFI_Min_Slider__c", columnDefinition = "VARCHAR(50)")
	private String BRE_MFI_Min_Slider__c;
	@Column(name = "BRE_Subsidy_Flag__c", columnDefinition = "VARCHAR(50)")
	private String BRE_Subsidy_Flag__c;
	@Column(name = "Carpet_Area_sq_m__c", columnDefinition = "VARCHAR(50)")
	private String Carpet_Area_sq_m__c;
	@Column(name = "APF_Flat_Configuration__c", columnDefinition = "VARCHAR(50)")
	private String APF_Flat_Configuration__c;
	@Column(name = "Dealer__c", columnDefinition = "VARCHAR(50)")
	private String Dealer__c;
	@Column(name = "E_Sign_CLI_Id__c", columnDefinition = "VARCHAR(50)")
	private String E_Sign_CLI_Id__c;
	@Column(name = "E_Sign_Ref_Id__c", columnDefinition = "VARCHAR(50)")
	private String E_Sign_Ref_Id__c;
	@Column(name = "E_Sign_DOGH_Id__c", columnDefinition = "VARCHAR(50)")
	private String E_Sign_DOGH_Id__c;
	@Column(name = "Existing_Loan_IFSC__c", columnDefinition = "VARCHAR(50)")
	private String Existing_Loan_IFSC__c;
	@Column(name = "Existing_Loan_A_C_Number__c", columnDefinition = "VARCHAR(50)")
	private String Existing_Loan_A_C_Number__c;
	@Column(name = "Builder_Bank_Account_Number__c", columnDefinition = "VARCHAR(50)")
	private String Builder_Bank_Account_Number__c;
	@Column(name = "Builder_s_name_Seller_s_name__c", columnDefinition = "VARCHAR(50)")
	private String Builder_s_name_Seller_s_name__c;
	@Column(name = "PDC_Account_Number__c", columnDefinition = "VARCHAR(50)")
	private String PDC_Account_Number__c;
	@Column(name = "PDC_Account_Holder_Name__c", columnDefinition = "VARCHAR(50)")
	private String PDC_Account_Holder_Name__c;
	@Column(name = "Village_Name__c", columnDefinition = "VARCHAR(50)")
	private String Village_Name__c;
	@Column(name = "Vehicle_Insurance__c", columnDefinition = "VARCHAR(50)")
	private String Vehicle_Insurance__c;
	@Column(name = "UTR_Number__c", columnDefinition = "VARCHAR(50)")
	private String UTR_Number__c;
	@Column(name = "Applied_Tenure__c", columnDefinition = "VARCHAR(50)")
	private String Applied_Tenure__c;
	@Column(name = "BRE_Max_Tenure__c", columnDefinition = "VARCHAR(50)")
	private String BRE_Max_Tenure__c;
	@Column(name = "BRE_Min_Tenure__c", columnDefinition = "VARCHAR(50)")
	private String BRE_Min_Tenure__c;
	@Column(name = "Swimlane__c", columnDefinition = "VARCHAR(50)")
	private String  Swimlane__c;
	@Column(name = "Supplier__c", columnDefinition = "VARCHAR(50)")
	private String Supplier__c;
	@Column(name = "Send_To_Ops_Portal__c", columnDefinition = "VARCHAR(50)")
	private String Send_To_Ops_Portal__c;
	@Column(name = "Registration_Cost__c", columnDefinition = "VARCHAR(50)")
	private String Registration_Cost__c;
	@Column(name = "Reason_for_Rejection__c", columnDefinition = "VARCHAR(100)")
	private String Reason_for_Rejection__c;
	@Column(name = "FI_Status__c", columnDefinition = "VARCHAR(50)")
	private String FI_Status__c;
	@Column(name = "POST_SANCTION_TAT__c", columnDefinition = "VARCHAR(50)")
	private String POST_SANCTION_TAT__c;
	@Column(name = "Ops_Approved__c", columnDefinition = "VARCHAR(50)")
	private String Ops_Approved__c;
	@Column(name = "No_of_Credit_validity_days__c", columnDefinition = "VARCHAR(50)")
	private String No_of_Credit_validity_days__c;
	@Column(name = "Is_No_Hypo_Loan__c", columnDefinition = "VARCHAR(50)")
	private String Is_No_Hypo_Loan__c;
	@Column(name = "MANDATESETUP_TAT__c", columnDefinition = "VARCHAR(50)")
	private String MANDATESETUP_TAT__c;
	@Column(name = "Locality__c", columnDefinition = "VARCHAR(50)")
	private String Locality__c;
	@Column(name = "Loan_On_Boarding_Start_Time__c", columnDefinition = "VARCHAR(50)")
	private String Loan_On_Boarding_Start_Time__c;
	@Column(name = "Loan_EMI__c", columnDefinition = "VARCHAR(50)")
	private String Loan_EMI__c;
	@Column(name = "Invoice_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Invoice_Amount__c;
	@Column(name = "Group_Id__c", columnDefinition = "VARCHAR(50)")
	private String Group_Id__c;
	@Column(name = "FLS_ID__c", columnDefinition = "VARCHAR(50)")
	private String FLS_ID__c;
	@Column(name = "Ex_Showroom_price__c", columnDefinition = "VARCHAR(50)")
	private String Ex_Showroom_price__c;
	@Column(name = "ESIGN_TAT__c", columnDefinition = "VARCHAR(50)")
	private String ESIGN_TAT__c;
	@Column(name = "Due_Date_of_Commencement_of_EMI__c", columnDefinition = "VARCHAR(100)")
	private String Due_Date_of_Commencement_of_EMI__c;
	@Column(name = "Max_EMI_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Max_EMI_Amount__c;
	@Column(name = "DISBURSEMENTFORM_TAT__c", columnDefinition = "VARCHAR(50)")
	private String DISBURSEMENTFORM_TAT__c;
	@Column(name = "Disbursed_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Disbursed_Amount__c;
	@Column(name = "Dealer_Name__c", columnDefinition = "VARCHAR(50)")
	private String Dealer_Name__c;
	@Column(name = "Dealer_Portal_Status__c", columnDefinition = "VARCHAR(50)")
	private String Dealer_Portal_Status__c;
	@Column(name = "BRE_Rejection_Reason__c", columnDefinition = "VARCHAR(100)")
	private String BRE_Rejection_Reason__c;
	@Column(name = "txt_Asset_Description__c", columnDefinition = "VARCHAR(50)")
	private String txt_Asset_Description__c;
	@Column(name = "ASSET_DETAILS_TAT__c", columnDefinition = "VARCHAR(50)")
	private String ASSET_DETAILS_TAT__c;
	@Column(name = "Reason_for_Hold__c", columnDefinition = "VARCHAR(100)")
	private String Reason_for_Hold__c;
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "Advance_Emi__c", columnDefinition = "VARCHAR(50)")
	private String Advance_Emi__c;
	@Column(name = "Action_items_tasks__c", columnDefinition = "VARCHAR(50)")
	private String Action_items_tasks__c;
	@Column(name = "Accessories_Cost__c", columnDefinition = "VARCHAR(50)")
	private String Accessories_Cost__c;
	@Column(name = "Customer_Cycle__c", columnDefinition = "VARCHAR(50)")
	private String Customer_Cycle__c;
	@Column(name = "Assert_Type__c", columnDefinition = "VARCHAR(50)")
	private String Assert_Type__c;
	@Column(name = "Loan_Sanction_Date__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Sanction_Date__c;
	@Column(name = "Pre_Approved_Loan__c", columnDefinition = "VARCHAR(50)")
	private String Pre_Approved_Loan__c;
	@Column(name = "Promotion_Code__c", columnDefinition = "VARCHAR(50)")
	private String Promotion_Code__c;
	@Column(name = "Loan_EMI_In_Words__c", columnDefinition = "VARCHAR(50)")
	private String Loan_EMI_In_Words__c;
	@Column(name = "Model_Master__c", columnDefinition = "VARCHAR(50)")
	private String Model_Master__c;
	@Column(name = "LTFS_Hypothecation__c", columnDefinition = "VARCHAR(50)")
	private String LTFS_Hypothecation__c;
	@Column(name = "Implement_Type__c", columnDefinition = "VARCHAR(50)")
	private String Implement_Type__c;
	@Column(name = "Invoice_Amount_Implement__c", columnDefinition = "VARCHAR(50)")
	private String Invoice_Amount_Implement__c;
	@Column(name = "TW_BRE_Reason_for_Rejection__c", columnDefinition = "VARCHAR(100)")
	private String TW_BRE_Reason_for_Rejection__c;
	@Column(name = "Name", columnDefinition = "VARCHAR(50)")
	private String Name;
	@Column(name = "Dealer_Name_Supplier__c", columnDefinition = "VARCHAR(50)")
	private String Dealer_Name_Supplier__c;
	@Column(name = "createddate", columnDefinition = "VARCHAR(100)")
	private String createddate;
	@Column(name = "LastModifiedDate", columnDefinition = "VARCHAR(100)")
	private String LastModifiedDate;
	@Column(name = "EMI_Start_Date__c", columnDefinition = "VARCHAR(50)")
	private String EMI_Start_Date__c;
	@Column(name = "Loan_Agreement_ID__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Agreement_ID__c;
	@Column(name = "Upfront_Processing_Fee_Payment__c", columnDefinition = "VARCHAR(50)")
	private String Upfront_Processing_Fee_Payment__c;
	@Column(name = "Extra_Work_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Extra_Work_Amount__c;
	@Column(name = "Top_up_Amount_Required__c", columnDefinition = "VARCHAR(50)")
	private String Top_up_Amount_Required__c;
	@Column(name = "Additional_Docs_Required__c", columnDefinition = "VARCHAR(50)")
	private String Additional_Docs_Required__c;
	@Column(name = "TechProcessStatus__c", columnDefinition = "VARCHAR(50)")
	private String TechProcessStatus__c;
	@Column(name = "Ops_First_Check_Complete__c", columnDefinition = "VARCHAR(50)")
	private String Ops_First_Check_Complete__c;
	@Column(name = "Builder_Bank_IFSC_Code__c", columnDefinition = "VARCHAR(50)")
	private String Builder_Bank_IFSC_Code__c;
	@Column(name = "BPI_Charge__c", columnDefinition = "VARCHAR(50)")
	private String BPI_Charge__c;
	@Column(name = "Occupancy__c", columnDefinition = "VARCHAR(50)")
	private String Occupancy__c;
	@Column(name = "Min_IRR__c", columnDefinition = "VARCHAR(50)")
	private String Min_IRR__c;
	@Column(name = "genesis__Overall_Status__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Overall_Status__c;
	@Column(name = "TW_SC_Count__c", columnDefinition = "VARCHAR(50)")
	private String TW_SC_Count__c;
	@Column(name = "HLSC_Count__c", columnDefinition = "VARCHAR(50)")
	private String HLSC_Count__c;
	@Column(name = "Supplier_Manufacturer__c", columnDefinition = "VARCHAR(50)")
	private String Supplier_Manufacturer__c;
	@Column(name = "Manufacturer__c", columnDefinition = "VARCHAR(50)")
	private String Manufacturer__c;
	@Column(name = "Asset_Make__c", columnDefinition = "VARCHAR(50)")
	private String Asset_Make__c;
	@Column(name = "Asset_Model__c", columnDefinition = "VARCHAR(50)")
	private String Asset_Model__c;
	@Column(name = "Channel_Code__c", columnDefinition = "VARCHAR(50)")
	private String Channel_Code__c;
	@Column(name = "BRE_Max_EMI__c", columnDefinition = "VARCHAR(50)")
	private String BRE_Max_EMI__c;
	@Column(name = "BRE_Max_Loan_Eligibility__c", columnDefinition = "VARCHAR(50)")
	private String BRE_Max_Loan_Eligibility__c;
	@Column(name = "Hl_Category__c", columnDefinition = "VARCHAR(50)")
	private String Hl_Category__c;
	@Column(name = "HL_Sub_Category__c", columnDefinition = "VARCHAR(50)")
	private String HL_Sub_Category__c;
	@Column(name = "Total_Land_Holding_Area__c", columnDefinition = "VARCHAR(50)")
	private String Total_Land_Holding_Area__c;
	@Column(name = "Cultivated_Area__c", columnDefinition = "VARCHAR(50)")
	private String Cultivated_Area__c;
	@Column(name = "Property_Status__c", columnDefinition = "VARCHAR(50)")
	private String Property_Status__c;
	@Column(name = "Non_Agri_Owned__c", columnDefinition = "VARCHAR(50)")
	private String Non_Agri_Owned__c;
	@Column(name = "Non_AgriIncome__c", columnDefinition = "VARCHAR(50)")
	private String Non_AgriIncome__c;
	@Column(name = "Agri_Income__c", columnDefinition = "VARCHAR(50)")
	private String Agri_Income__c;
	@Column(name = "Supplier_Id__c", columnDefinition = "VARCHAR(50)")
	private String Supplier_Id__c;
	@Column(name = "Club__c", columnDefinition = "VARCHAR(50)")
	private String Club__c;
	@Column(name = "Asset_Model_Master__c", columnDefinition = "VARCHAR(50)")
	private String Asset_Model_Master__c;
	@Column(name = "LTV_C__c", columnDefinition = "VARCHAR(50)")
	private String LTV_C__c;
	@Column(name = "Net_Disbursement_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Net_Disbursement_Amount__c;
	@Column(name = "OCR_Amount__c", columnDefinition = "VARCHAR(50)")
	private String OCR_Amount__c;
	@Column(name = "txt_Disb_Date__c", columnDefinition = "VARCHAR(50)")
	private String txt_Disb_Date__c;
	@Column(name = "txt_Installment_Due_Date_Last__c", columnDefinition = "VARCHAR(50)")
	private String txt_Installment_Due_Date_Last__c;
	@Column(name = "LTV_AB__c", columnDefinition = "VARCHAR(50)")
	private String LTV_AB__c;
	@Column(name = "FARM_LTV__c", columnDefinition = "VARCHAR(50)")
	private String FARM_LTV__c;
	@Column(name = "Model_Master__r", columnDefinition = "VARCHAR(50)")
	private String Model_Master__r;
	@Column(name = "genesis__Payment_Frequency__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Payment_Frequency__c;
	@Column(name = "PDC_MICR_Code__c", columnDefinition = "VARCHAR(50)")
	private String PDC_MICR_Code__c;
	@Column(name = "PDC_Cheque_Number__c", columnDefinition = "VARCHAR(50)")
	private String PDC_Cheque_Number__c;
	@Column(name = "Loan_Period_from_Month__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Period_from_Month__c;
	@Column(name = "TransactionStatusMessage__c", columnDefinition = "VARCHAR(50)")
	private String TransactionStatusMessage__c;
	@Column(name = "E_Mandate_Ref_Id__c", columnDefinition = "VARCHAR(50)")
	private String E_Mandate_Ref_Id__c;
	@Column(name = "Loan_Period_to_Year__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Period_to_Year__c;
	@Column(name = "Installment_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Installment_Amount__c;
	@Column(name = "Installment_Date__c", columnDefinition = "VARCHAR(50)")
	private String Installment_Date__c;
	@Column(name = "Loan_Period_to_Month__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Period_to_Month__c;
	@Column(name = "Loan_Period_from_Year__c", columnDefinition = "VARCHAR(50)")
	private String Loan_Period_from_Year__c;
	@Column(name = "Cheque_Number__c", columnDefinition = "VARCHAR(50)")
	private String Cheque_Number__c;
	@Column(name = "MICR_Code__c", columnDefinition = "VARCHAR(50)")
	private String MICR_Code__c;
	@Column(name = "Branch__c", columnDefinition = "VARCHAR(50)")
	private String Branch__c;
	@Column(name = "IFSC_Code__c", columnDefinition = "VARCHAR(50)")
	private String IFSC_Code__c;
	@Column(name = "Account_Holder_Name__c", columnDefinition = "VARCHAR(50)")
	private String Account_Holder_Name__c;
	@Column(name = "genesis__Bank_Account_Number__c", columnDefinition = "VARCHAR(50)")
	private String genesis__Bank_Account_Number__c;
	@Column(name = "Chassis_number__c", columnDefinition = "VARCHAR(50)")
	private String Chassis_number__c;
	@Column(name = "Engine_number__c", columnDefinition = "VARCHAR(50)")
	private String Engine_number__c;
	@Column(name = "Invoice_number__c", columnDefinition = "VARCHAR(50)")
	private String Invoice_number__c;
	@Column(name = "S_Process_ESign_Id__c", columnDefinition = "VARCHAR(50)")
	private String S_Process_ESign_Id__c;
	@Column(name = "Max_Disbursal_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Max_Disbursal_Amount__c;
	@Column(name = "E_Sign_Docket_Id__c", columnDefinition = "VARCHAR(50)")
	private String E_Sign_Docket_Id__c;
	@Column(name = "RC_Doc_Status__c", columnDefinition = "VARCHAR(50)")
	private String RC_Doc_Status__c;
	@Column(name = "Tech_legal_eval_status__c", columnDefinition = "VARCHAR(50)")
	private String Tech_legal_eval_status__c;
	@Column(name = "Area_Sq_Ft__c", columnDefinition = "VARCHAR(50)")
	private String Area_Sq_Ft__c;
	@Column(name = "Area_Type__c", columnDefinition = "VARCHAR(50)")
	private String Area_Type__c;
	@Column(name = "Dealer_Error__c", columnDefinition = "VARCHAR(50)")
	private String Dealer_Error__c;
	@Column(name = "Premium_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Premium_Amount__c;
	@Column(name = "Subvention_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Subvention_Amount__c;
	@Column(name = "Asset_Category__c", columnDefinition = "VARCHAR(50)")
	private String Asset_Category__c;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Genesis__Account__r_Id")
	private Genesis__Account__r_Bean genesis__Account__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Genesis__CL_Product__r_Id")
	private Genesis__CL_Product__r_Bean genesis__CL_Product__r; 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Extended_Application__r_Id")
	private Extended_Application__r_Bean Extended_Application__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Pre_Approved_Loan__r_Id")
	private Pre_Approved_Loan__r_Bean Pre_Approved_Loan__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Dealer__r_Id")
	private Dealer__r_Bean Dealer__r;
	/*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GenesisAccount_SrNo")
	private Genesis__Account__r_Bean genesis__Account__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GenesisCLProduct_SrNo")
	private Genesis__CL_Product__r_Bean genesis__CL_Product__r; 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ExtendedApplication_SrNo")
	private Extended_Application__r_Bean Extended_Application__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PreApprovedLoan_SrNo")
	private Pre_Approved_Loan__r_Bean Pre_Approved_Loan__r;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Dealer_SrNo")
	private Dealer__r_Bean Dealer__r;*/
	@Embedded
	private AttributesBean attributes;
	public Long getSrNo() {
		return SrNo;
	}
	public void setSrNo(Long srNo) {
		SrNo = srNo;
	}
	public String getProduct_Category__c() {
		return Product_Category__c;
	}
	public void setProduct_Category__c(String product_Category__c) {
		Product_Category__c = product_Category__c;
	}
	public String getGenesis__Account__c() {
		return genesis__Account__c;
	}
	public void setGenesis__Account__c(String genesis__Account__c) {
		this.genesis__Account__c = genesis__Account__c;
	}
	public String getTop_up_Calculated__c() {
		return Top_up_Calculated__c;
	}
	public void setTop_up_Calculated__c(String top_up_Calculated__c) {
		Top_up_Calculated__c = top_up_Calculated__c;
	}
	public String getScheme__c() {
		return Scheme__c;
	}
	public void setScheme__c(String scheme__c) {
		Scheme__c = scheme__c;
	}
	public String getSub_Property_Type__c() {
		return Sub_Property_Type__c;
	}
	public void setSub_Property_Type__c(String sub_Property_Type__c) {
		Sub_Property_Type__c = sub_Property_Type__c;
	}
	public String getIs_SENP__c() {
		return Is_SENP__c;
	}
	public void setIs_SENP__c(String is_SENP__c) {
		Is_SENP__c = is_SENP__c;
	}
	public String getDisbursal_To__c() {
		return Disbursal_To__c;
	}
	public void setDisbursal_To__c(String disbursal_To__c) {
		Disbursal_To__c = disbursal_To__c;
	}
	public String getDST_FLS_City__c() {
		return DST_FLS_City__c;
	}
	public void setDST_FLS_City__c(String dST_FLS_City__c) {
		DST_FLS_City__c = dST_FLS_City__c;
	}
	public String getIsOnline__c() {
		return isOnline__c;
	}
	public void setIsOnline__c(String isOnline__c) {
		this.isOnline__c = isOnline__c;
	}
	public String getLogin_Fees__c() {
		return Login_Fees__c;
	}
	public void setLogin_Fees__c(String login_Fees__c) {
		Login_Fees__c = login_Fees__c;
	}
	public String getIs_Non_APF__c() {
		return Is_Non_APF__c;
	}
	public void setIs_Non_APF__c(String is_Non_APF__c) {
		Is_Non_APF__c = is_Non_APF__c;
	}
	public String getMFI_CLI_New_Grid__c() {
		return MFI_CLI_New_Grid__c;
	}
	public void setMFI_CLI_New_Grid__c(String mFI_CLI_New_Grid__c) {
		MFI_CLI_New_Grid__c = mFI_CLI_New_Grid__c;
	}
	public String getProperty_Type__c() {
		return Property_Type__c;
	}
	public void setProperty_Type__c(String property_Type__c) {
		Property_Type__c = property_Type__c;
	}
	public String getPDC_Deviation_FLAG__c() {
		return PDC_Deviation_FLAG__c;
	}
	public void setPDC_Deviation_FLAG__c(String pDC_Deviation_FLAG__c) {
		PDC_Deviation_FLAG__c = pDC_Deviation_FLAG__c;
	}
	public String getRC_Deviation_Flag__c() {
		return RC_Deviation_Flag__c;
	}
	public void setRC_Deviation_Flag__c(String rC_Deviation_Flag__c) {
		RC_Deviation_Flag__c = rC_Deviation_Flag__c;
	}
	public String getMargin_Money__c() {
		return Margin_Money__c;
	}
	public void setMargin_Money__c(String margin_Money__c) {
		Margin_Money__c = margin_Money__c;
	}
	public String getBuilder__c() {
		return Builder__c;
	}
	public void setBuilder__c(String builder__c) {
		Builder__c = builder__c;
	}
	public String getFLS_Agent__c() {
		return FLS_Agent__c;
	}
	public void setFLS_Agent__c(String fLS_Agent__c) {
		FLS_Agent__c = fLS_Agent__c;
	}
	public String getBRE_MFI_TYPEOFLOAN__c() {
		return BRE_MFI_TYPEOFLOAN__c;
	}
	public void setBRE_MFI_TYPEOFLOAN__c(String bRE_MFI_TYPEOFLOAN__c) {
		BRE_MFI_TYPEOFLOAN__c = bRE_MFI_TYPEOFLOAN__c;
	}
	public String getLocation__Longitude__s() {
		return location__Longitude__s;
	}
	public void setLocation__Longitude__s(String location__Longitude__s) {
		this.location__Longitude__s = location__Longitude__s;
	}
	public String getLocation__Latitude__s() {
		return location__Latitude__s;
	}
	public void setLocation__Latitude__s(String location__Latitude__s) {
		this.location__Latitude__s = location__Latitude__s;
	}
	public String getGenesis__Loan_Amount__c() {
		return genesis__Loan_Amount__c;
	}
	public void setGenesis__Loan_Amount__c(String genesis__Loan_Amount__c) {
		this.genesis__Loan_Amount__c = genesis__Loan_Amount__c;
	}
	public String getLoan_Amount_In_Word__c() {
		return Loan_Amount_In_Word__c;
	}
	public void setLoan_Amount_In_Word__c(String loan_Amount_In_Word__c) {
		Loan_Amount_In_Word__c = loan_Amount_In_Word__c;
	}
	public String getScheme_Name__c() {
		return Scheme_Name__c;
	}
	public void setScheme_Name__c(String scheme_Name__c) {
		Scheme_Name__c = scheme_Name__c;
	}
	public String getBRE_HL_Result__c() {
		return BRE_HL_Result__c;
	}
	public void setBRE_HL_Result__c(String bRE_HL_Result__c) {
		BRE_HL_Result__c = bRE_HL_Result__c;
	}
	public String getGenesis__Interest_Rate__c() {
		return genesis__Interest_Rate__c;
	}
	public void setGenesis__Interest_Rate__c(String genesis__Interest_Rate__c) {
		this.genesis__Interest_Rate__c = genesis__Interest_Rate__c;
	}
	public String getApplication_Id__c() {
		return Application_Id__c;
	}
	public void setApplication_Id__c(String application_Id__c) {
		Application_Id__c = application_Id__c;
	}
	public String getGenesis__CL_Product__c() {
		return genesis__CL_Product__c;
	}
	public void setGenesis__CL_Product__c(String genesis__CL_Product__c) {
		this.genesis__CL_Product__c = genesis__CL_Product__c;
	}
	public String getSub_Product__c() {
		return Sub_Product__c;
	}
	public void setSub_Product__c(String sub_Product__c) {
		Sub_Product__c = sub_Product__c;
	}
	public String getGenesis__Term__c() {
		return genesis__Term__c;
	}
	public void setGenesis__Term__c(String genesis__Term__c) {
		this.genesis__Term__c = genesis__Term__c;
	}
	public String getAsset_Cost__c() {
		return Asset_Cost__c;
	}
	public void setAsset_Cost__c(String asset_Cost__c) {
		Asset_Cost__c = asset_Cost__c;
	}
	public String getBase_Price_per_sq_m__c() {
		return Base_Price_per_sq_m__c;
	}
	public void setBase_Price_per_sq_m__c(String base_Price_per_sq_m__c) {
		Base_Price_per_sq_m__c = base_Price_per_sq_m__c;
	}
	public String getSuper_Built_up_Area_sq_m__c() {
		return Super_Built_up_Area_sq_m__c;
	}
	public void setSuper_Built_up_Area_sq_m__c(String super_Built_up_Area_sq_m__c) {
		Super_Built_up_Area_sq_m__c = super_Built_up_Area_sq_m__c;
	}
	public String getProperty_identified__c() {
		return Property_identified__c;
	}
	public void setProperty_identified__c(String property_identified__c) {
		Property_identified__c = property_identified__c;
	}
	public String getGenesis__Interest_Calculation_Method__c() {
		return genesis__Interest_Calculation_Method__c;
	}
	public void setGenesis__Interest_Calculation_Method__c(String genesis__Interest_Calculation_Method__c) {
		this.genesis__Interest_Calculation_Method__c = genesis__Interest_Calculation_Method__c;
	}
	public String getGenesis__Status__c() {
		return genesis__Status__c;
	}
	public void setGenesis__Status__c(String genesis__Status__c) {
		this.genesis__Status__c = genesis__Status__c;
	}
	public String getApplication_Stage__c() {
		return Application_Stage__c;
	}
	public void setApplication_Stage__c(String application_Stage__c) {
		Application_Stage__c = application_Stage__c;
	}
	public String getApplication_TAT__c() {
		return Application_TAT__c;
	}
	public void setApplication_TAT__c(String application_TAT__c) {
		Application_TAT__c = application_TAT__c;
	}
	public String getLoan_Type__c() {
		return Loan_Type__c;
	}
	public void setLoan_Type__c(String loan_Type__c) {
		Loan_Type__c = loan_Type__c;
	}
	public String getApplied_Loan_Amount__c() {
		return Applied_Loan_Amount__c;
	}
	public void setApplied_Loan_Amount__c(String applied_Loan_Amount__c) {
		Applied_Loan_Amount__c = applied_Loan_Amount__c;
	}
	public String getSub_Stage__c() {
		return Sub_Stage__c;
	}
	public void setSub_Stage__c(String sub_Stage__c) {
		Sub_Stage__c = sub_Stage__c;
	}
	public String getNID_Flag__c() {
		return NID_Flag__c;
	}
	public void setNID_Flag__c(String nID_Flag__c) {
		NID_Flag__c = nID_Flag__c;
	}
	public String getFi_Response_Received__c() {
		return Fi_Response_Received__c;
	}
	public void setFi_Response_Received__c(String fi_Response_Received__c) {
		Fi_Response_Received__c = fi_Response_Received__c;
	}
	public String getE_Sign_Complete__c() {
		return E_Sign_Complete__c;
	}
	public void setE_Sign_Complete__c(String e_Sign_Complete__c) {
		E_Sign_Complete__c = e_Sign_Complete__c;
	}
	public String getExtended_Application__c() {
		return Extended_Application__c;
	}
	public void setExtended_Application__c(String extended_Application__c) {
		Extended_Application__c = extended_Application__c;
	}
	public String getPromotions_HL__c() {
		return Promotions_HL__c;
	}
	public void setPromotions_HL__c(String promotions_HL__c) {
		Promotions_HL__c = promotions_HL__c;
	}
	public String getNo_of_Advance_Installments__c() {
		return No_of_Advance_Installments__c;
	}
	public void setNo_of_Advance_Installments__c(String no_of_Advance_Installments__c) {
		No_of_Advance_Installments__c = no_of_Advance_Installments__c;
	}
	public String getAPF_Tower_Configuration__c() {
		return APF_Tower_Configuration__c;
	}
	public void setAPF_Tower_Configuration__c(String aPF_Tower_Configuration__c) {
		APF_Tower_Configuration__c = aPF_Tower_Configuration__c;
	}
	public String getAPF_Project__c() {
		return APF_Project__c;
	}
	public void setAPF_Project__c(String aPF_Project__c) {
		APF_Project__c = aPF_Project__c;
	}
	public String getCredit_Check__c() {
		return Credit_Check__c;
	}
	public void setCredit_Check__c(String credit_Check__c) {
		Credit_Check__c = credit_Check__c;
	}
	public String getPhysical_Esign__c() {
		return Physical_Esign__c;
	}
	public void setPhysical_Esign__c(String physical_Esign__c) {
		Physical_Esign__c = physical_Esign__c;
	}
	public String getSwimlane_B_Required__c() {
		return Swimlane_B_Required__c;
	}
	public void setSwimlane_B_Required__c(String swimlane_B_Required__c) {
		Swimlane_B_Required__c = swimlane_B_Required__c;
	}
	public String getRCU_Triggered__c() {
		return RCU_Triggered__c;
	}
	public void setRCU_Triggered__c(String rCU_Triggered__c) {
		RCU_Triggered__c = rCU_Triggered__c;
	}
	public String getBRE_MFI_MAX_Slider__c() {
		return BRE_MFI_MAX_Slider__c;
	}
	public void setBRE_MFI_MAX_Slider__c(String bRE_MFI_MAX_Slider__c) {
		BRE_MFI_MAX_Slider__c = bRE_MFI_MAX_Slider__c;
	}
	public String getBRE_MFI_Min_Slider__c() {
		return BRE_MFI_Min_Slider__c;
	}
	public void setBRE_MFI_Min_Slider__c(String bRE_MFI_Min_Slider__c) {
		BRE_MFI_Min_Slider__c = bRE_MFI_Min_Slider__c;
	}
	public String getBRE_Subsidy_Flag__c() {
		return BRE_Subsidy_Flag__c;
	}
	public void setBRE_Subsidy_Flag__c(String bRE_Subsidy_Flag__c) {
		BRE_Subsidy_Flag__c = bRE_Subsidy_Flag__c;
	}
	public String getCarpet_Area_sq_m__c() {
		return Carpet_Area_sq_m__c;
	}
	public void setCarpet_Area_sq_m__c(String carpet_Area_sq_m__c) {
		Carpet_Area_sq_m__c = carpet_Area_sq_m__c;
	}
	public String getAPF_Flat_Configuration__c() {
		return APF_Flat_Configuration__c;
	}
	public void setAPF_Flat_Configuration__c(String aPF_Flat_Configuration__c) {
		APF_Flat_Configuration__c = aPF_Flat_Configuration__c;
	}
	public String getDealer__c() {
		return Dealer__c;
	}
	public void setDealer__c(String dealer__c) {
		Dealer__c = dealer__c;
	}
	public String getE_Sign_CLI_Id__c() {
		return E_Sign_CLI_Id__c;
	}
	public void setE_Sign_CLI_Id__c(String e_Sign_CLI_Id__c) {
		E_Sign_CLI_Id__c = e_Sign_CLI_Id__c;
	}
	public String getE_Sign_Ref_Id__c() {
		return E_Sign_Ref_Id__c;
	}
	public void setE_Sign_Ref_Id__c(String e_Sign_Ref_Id__c) {
		E_Sign_Ref_Id__c = e_Sign_Ref_Id__c;
	}
	public String getE_Sign_DOGH_Id__c() {
		return E_Sign_DOGH_Id__c;
	}
	public void setE_Sign_DOGH_Id__c(String e_Sign_DOGH_Id__c) {
		E_Sign_DOGH_Id__c = e_Sign_DOGH_Id__c;
	}
	public String getExisting_Loan_IFSC__c() {
		return Existing_Loan_IFSC__c;
	}
	public void setExisting_Loan_IFSC__c(String existing_Loan_IFSC__c) {
		Existing_Loan_IFSC__c = existing_Loan_IFSC__c;
	}
	public String getExisting_Loan_A_C_Number__c() {
		return Existing_Loan_A_C_Number__c;
	}
	public void setExisting_Loan_A_C_Number__c(String existing_Loan_A_C_Number__c) {
		Existing_Loan_A_C_Number__c = existing_Loan_A_C_Number__c;
	}
	public String getBuilder_Bank_Account_Number__c() {
		return Builder_Bank_Account_Number__c;
	}
	public void setBuilder_Bank_Account_Number__c(String builder_Bank_Account_Number__c) {
		Builder_Bank_Account_Number__c = builder_Bank_Account_Number__c;
	}
	public String getBuilder_s_name_Seller_s_name__c() {
		return Builder_s_name_Seller_s_name__c;
	}
	public void setBuilder_s_name_Seller_s_name__c(String builder_s_name_Seller_s_name__c) {
		Builder_s_name_Seller_s_name__c = builder_s_name_Seller_s_name__c;
	}
	public String getPDC_Account_Number__c() {
		return PDC_Account_Number__c;
	}
	public void setPDC_Account_Number__c(String pDC_Account_Number__c) {
		PDC_Account_Number__c = pDC_Account_Number__c;
	}
	public String getPDC_Account_Holder_Name__c() {
		return PDC_Account_Holder_Name__c;
	}
	public void setPDC_Account_Holder_Name__c(String pDC_Account_Holder_Name__c) {
		PDC_Account_Holder_Name__c = pDC_Account_Holder_Name__c;
	}
	public String getVillage_Name__c() {
		return Village_Name__c;
	}
	public void setVillage_Name__c(String village_Name__c) {
		Village_Name__c = village_Name__c;
	}
	public String getVehicle_Insurance__c() {
		return Vehicle_Insurance__c;
	}
	public void setVehicle_Insurance__c(String vehicle_Insurance__c) {
		Vehicle_Insurance__c = vehicle_Insurance__c;
	}
	public String getUTR_Number__c() {
		return UTR_Number__c;
	}
	public void setUTR_Number__c(String uTR_Number__c) {
		UTR_Number__c = uTR_Number__c;
	}
	public String getApplied_Tenure__c() {
		return Applied_Tenure__c;
	}
	public void setApplied_Tenure__c(String applied_Tenure__c) {
		Applied_Tenure__c = applied_Tenure__c;
	}
	public String getBRE_Max_Tenure__c() {
		return BRE_Max_Tenure__c;
	}
	public void setBRE_Max_Tenure__c(String bRE_Max_Tenure__c) {
		BRE_Max_Tenure__c = bRE_Max_Tenure__c;
	}
	public String getBRE_Min_Tenure__c() {
		return BRE_Min_Tenure__c;
	}
	public void setBRE_Min_Tenure__c(String bRE_Min_Tenure__c) {
		BRE_Min_Tenure__c = bRE_Min_Tenure__c;
	}
	public String getSwimlane__c() {
		return Swimlane__c;
	}
	public void setSwimlane__c(String swimlane__c) {
		Swimlane__c = swimlane__c;
	}
	public String getSupplier__c() {
		return Supplier__c;
	}
	public void setSupplier__c(String supplier__c) {
		Supplier__c = supplier__c;
	}
	public String getSend_To_Ops_Portal__c() {
		return Send_To_Ops_Portal__c;
	}
	public void setSend_To_Ops_Portal__c(String send_To_Ops_Portal__c) {
		Send_To_Ops_Portal__c = send_To_Ops_Portal__c;
	}
	public String getRegistration_Cost__c() {
		return Registration_Cost__c;
	}
	public void setRegistration_Cost__c(String registration_Cost__c) {
		Registration_Cost__c = registration_Cost__c;
	}
	public String getReason_for_Rejection__c() {
		return Reason_for_Rejection__c;
	}
	public void setReason_for_Rejection__c(String reason_for_Rejection__c) {
		Reason_for_Rejection__c = reason_for_Rejection__c;
	}
	public String getFI_Status__c() {
		return FI_Status__c;
	}
	public void setFI_Status__c(String fI_Status__c) {
		FI_Status__c = fI_Status__c;
	}
	public String getPOST_SANCTION_TAT__c() {
		return POST_SANCTION_TAT__c;
	}
	public void setPOST_SANCTION_TAT__c(String pOST_SANCTION_TAT__c) {
		POST_SANCTION_TAT__c = pOST_SANCTION_TAT__c;
	}
	public String getOps_Approved__c() {
		return Ops_Approved__c;
	}
	public void setOps_Approved__c(String ops_Approved__c) {
		Ops_Approved__c = ops_Approved__c;
	}
	public String getNo_of_Credit_validity_days__c() {
		return No_of_Credit_validity_days__c;
	}
	public void setNo_of_Credit_validity_days__c(String no_of_Credit_validity_days__c) {
		No_of_Credit_validity_days__c = no_of_Credit_validity_days__c;
	}
	public String getIs_No_Hypo_Loan__c() {
		return Is_No_Hypo_Loan__c;
	}
	public void setIs_No_Hypo_Loan__c(String is_No_Hypo_Loan__c) {
		Is_No_Hypo_Loan__c = is_No_Hypo_Loan__c;
	}
	public String getMANDATESETUP_TAT__c() {
		return MANDATESETUP_TAT__c;
	}
	public void setMANDATESETUP_TAT__c(String mANDATESETUP_TAT__c) {
		MANDATESETUP_TAT__c = mANDATESETUP_TAT__c;
	}
	public String getLocality__c() {
		return Locality__c;
	}
	public void setLocality__c(String locality__c) {
		Locality__c = locality__c;
	}
	public String getLoan_On_Boarding_Start_Time__c() {
		return Loan_On_Boarding_Start_Time__c;
	}
	public void setLoan_On_Boarding_Start_Time__c(String loan_On_Boarding_Start_Time__c) {
		Loan_On_Boarding_Start_Time__c = loan_On_Boarding_Start_Time__c;
	}
	public String getLoan_EMI__c() {
		return Loan_EMI__c;
	}
	public void setLoan_EMI__c(String loan_EMI__c) {
		Loan_EMI__c = loan_EMI__c;
	}
	public String getInvoice_Amount__c() {
		return Invoice_Amount__c;
	}
	public void setInvoice_Amount__c(String invoice_Amount__c) {
		Invoice_Amount__c = invoice_Amount__c;
	}
	public String getGroup_Id__c() {
		return Group_Id__c;
	}
	public void setGroup_Id__c(String group_Id__c) {
		Group_Id__c = group_Id__c;
	}
	public String getFLS_ID__c() {
		return FLS_ID__c;
	}
	public void setFLS_ID__c(String fLS_ID__c) {
		FLS_ID__c = fLS_ID__c;
	}
	public String getEx_Showroom_price__c() {
		return Ex_Showroom_price__c;
	}
	public void setEx_Showroom_price__c(String ex_Showroom_price__c) {
		Ex_Showroom_price__c = ex_Showroom_price__c;
	}
	public String getESIGN_TAT__c() {
		return ESIGN_TAT__c;
	}
	public void setESIGN_TAT__c(String eSIGN_TAT__c) {
		ESIGN_TAT__c = eSIGN_TAT__c;
	}
	public String getDue_Date_of_Commencement_of_EMI__c() {
		return Due_Date_of_Commencement_of_EMI__c;
	}
	public void setDue_Date_of_Commencement_of_EMI__c(String due_Date_of_Commencement_of_EMI__c) {
		Due_Date_of_Commencement_of_EMI__c = due_Date_of_Commencement_of_EMI__c;
	}
	public String getMax_EMI_Amount__c() {
		return Max_EMI_Amount__c;
	}
	public void setMax_EMI_Amount__c(String max_EMI_Amount__c) {
		Max_EMI_Amount__c = max_EMI_Amount__c;
	}
	public String getDISBURSEMENTFORM_TAT__c() {
		return DISBURSEMENTFORM_TAT__c;
	}
	public void setDISBURSEMENTFORM_TAT__c(String dISBURSEMENTFORM_TAT__c) {
		DISBURSEMENTFORM_TAT__c = dISBURSEMENTFORM_TAT__c;
	}
	public String getDisbursed_Amount__c() {
		return Disbursed_Amount__c;
	}
	public void setDisbursed_Amount__c(String disbursed_Amount__c) {
		Disbursed_Amount__c = disbursed_Amount__c;
	}
	public String getDealer_Name__c() {
		return Dealer_Name__c;
	}
	public void setDealer_Name__c(String dealer_Name__c) {
		Dealer_Name__c = dealer_Name__c;
	}
	public String getDealer_Portal_Status__c() {
		return Dealer_Portal_Status__c;
	}
	public void setDealer_Portal_Status__c(String dealer_Portal_Status__c) {
		Dealer_Portal_Status__c = dealer_Portal_Status__c;
	}
	public String getBRE_Rejection_Reason__c() {
		return BRE_Rejection_Reason__c;
	}
	public void setBRE_Rejection_Reason__c(String bRE_Rejection_Reason__c) {
		BRE_Rejection_Reason__c = bRE_Rejection_Reason__c;
	}
	public String getTxt_Asset_Description__c() {
		return txt_Asset_Description__c;
	}
	public void setTxt_Asset_Description__c(String txt_Asset_Description__c) {
		this.txt_Asset_Description__c = txt_Asset_Description__c;
	}
	public String getASSET_DETAILS_TAT__c() {
		return ASSET_DETAILS_TAT__c;
	}
	public void setASSET_DETAILS_TAT__c(String aSSET_DETAILS_TAT__c) {
		ASSET_DETAILS_TAT__c = aSSET_DETAILS_TAT__c;
	}
	public String getReason_for_Hold__c() {
		return Reason_for_Hold__c;
	}
	public void setReason_for_Hold__c(String reason_for_Hold__c) {
		Reason_for_Hold__c = reason_for_Hold__c;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getAdvance_Emi__c() {
		return Advance_Emi__c;
	}
	public void setAdvance_Emi__c(String advance_Emi__c) {
		Advance_Emi__c = advance_Emi__c;
	}
	public String getAction_items_tasks__c() {
		return Action_items_tasks__c;
	}
	public void setAction_items_tasks__c(String action_items_tasks__c) {
		Action_items_tasks__c = action_items_tasks__c;
	}
	public String getAccessories_Cost__c() {
		return Accessories_Cost__c;
	}
	public void setAccessories_Cost__c(String accessories_Cost__c) {
		Accessories_Cost__c = accessories_Cost__c;
	}
	public String getCustomer_Cycle__c() {
		return Customer_Cycle__c;
	}
	public void setCustomer_Cycle__c(String customer_Cycle__c) {
		Customer_Cycle__c = customer_Cycle__c;
	}
	public String getAssert_Type__c() {
		return Assert_Type__c;
	}
	public void setAssert_Type__c(String assert_Type__c) {
		Assert_Type__c = assert_Type__c;
	}
	public String getLoan_Sanction_Date__c() {
		return Loan_Sanction_Date__c;
	}
	public void setLoan_Sanction_Date__c(String loan_Sanction_Date__c) {
		Loan_Sanction_Date__c = loan_Sanction_Date__c;
	}
	public String getPre_Approved_Loan__c() {
		return Pre_Approved_Loan__c;
	}
	public void setPre_Approved_Loan__c(String pre_Approved_Loan__c) {
		Pre_Approved_Loan__c = pre_Approved_Loan__c;
	}
	public String getPromotion_Code__c() {
		return Promotion_Code__c;
	}
	public void setPromotion_Code__c(String promotion_Code__c) {
		Promotion_Code__c = promotion_Code__c;
	}
	public String getLoan_EMI_In_Words__c() {
		return Loan_EMI_In_Words__c;
	}
	public void setLoan_EMI_In_Words__c(String loan_EMI_In_Words__c) {
		Loan_EMI_In_Words__c = loan_EMI_In_Words__c;
	}
	public String getModel_Master__c() {
		return Model_Master__c;
	}
	public void setModel_Master__c(String model_Master__c) {
		Model_Master__c = model_Master__c;
	}
	public String getLTFS_Hypothecation__c() {
		return LTFS_Hypothecation__c;
	}
	public void setLTFS_Hypothecation__c(String lTFS_Hypothecation__c) {
		LTFS_Hypothecation__c = lTFS_Hypothecation__c;
	}
	public String getImplement_Type__c() {
		return Implement_Type__c;
	}
	public void setImplement_Type__c(String implement_Type__c) {
		Implement_Type__c = implement_Type__c;
	}
	public String getInvoice_Amount_Implement__c() {
		return Invoice_Amount_Implement__c;
	}
	public void setInvoice_Amount_Implement__c(String invoice_Amount_Implement__c) {
		Invoice_Amount_Implement__c = invoice_Amount_Implement__c;
	}
	public String getTW_BRE_Reason_for_Rejection__c() {
		return TW_BRE_Reason_for_Rejection__c;
	}
	public void setTW_BRE_Reason_for_Rejection__c(String tW_BRE_Reason_for_Rejection__c) {
		TW_BRE_Reason_for_Rejection__c = tW_BRE_Reason_for_Rejection__c;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDealer_Name_Supplier__c() {
		return Dealer_Name_Supplier__c;
	}
	public void setDealer_Name_Supplier__c(String dealer_Name_Supplier__c) {
		Dealer_Name_Supplier__c = dealer_Name_Supplier__c;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getLastModifiedDate() {
		return LastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}
	public String getEMI_Start_Date__c() {
		return EMI_Start_Date__c;
	}
	public void setEMI_Start_Date__c(String eMI_Start_Date__c) {
		EMI_Start_Date__c = eMI_Start_Date__c;
	}
	public String getLoan_Agreement_ID__c() {
		return Loan_Agreement_ID__c;
	}
	public void setLoan_Agreement_ID__c(String loan_Agreement_ID__c) {
		Loan_Agreement_ID__c = loan_Agreement_ID__c;
	}
	public String getUpfront_Processing_Fee_Payment__c() {
		return Upfront_Processing_Fee_Payment__c;
	}
	public void setUpfront_Processing_Fee_Payment__c(String upfront_Processing_Fee_Payment__c) {
		Upfront_Processing_Fee_Payment__c = upfront_Processing_Fee_Payment__c;
	}
	public String getExtra_Work_Amount__c() {
		return Extra_Work_Amount__c;
	}
	public void setExtra_Work_Amount__c(String extra_Work_Amount__c) {
		Extra_Work_Amount__c = extra_Work_Amount__c;
	}
	public String getTop_up_Amount_Required__c() {
		return Top_up_Amount_Required__c;
	}
	public void setTop_up_Amount_Required__c(String top_up_Amount_Required__c) {
		Top_up_Amount_Required__c = top_up_Amount_Required__c;
	}
	public String getAdditional_Docs_Required__c() {
		return Additional_Docs_Required__c;
	}
	public void setAdditional_Docs_Required__c(String additional_Docs_Required__c) {
		Additional_Docs_Required__c = additional_Docs_Required__c;
	}
	public String getTechProcessStatus__c() {
		return TechProcessStatus__c;
	}
	public void setTechProcessStatus__c(String techProcessStatus__c) {
		TechProcessStatus__c = techProcessStatus__c;
	}
	public String getOps_First_Check_Complete__c() {
		return Ops_First_Check_Complete__c;
	}
	public void setOps_First_Check_Complete__c(String ops_First_Check_Complete__c) {
		Ops_First_Check_Complete__c = ops_First_Check_Complete__c;
	}
	public String getBuilder_Bank_IFSC_Code__c() {
		return Builder_Bank_IFSC_Code__c;
	}
	public void setBuilder_Bank_IFSC_Code__c(String builder_Bank_IFSC_Code__c) {
		Builder_Bank_IFSC_Code__c = builder_Bank_IFSC_Code__c;
	}
	public String getBPI_Charge__c() {
		return BPI_Charge__c;
	}
	public void setBPI_Charge__c(String bPI_Charge__c) {
		BPI_Charge__c = bPI_Charge__c;
	}
	public String getOccupancy__c() {
		return Occupancy__c;
	}
	public void setOccupancy__c(String occupancy__c) {
		Occupancy__c = occupancy__c;
	}
	public String getMin_IRR__c() {
		return Min_IRR__c;
	}
	public void setMin_IRR__c(String min_IRR__c) {
		Min_IRR__c = min_IRR__c;
	}
	public String getGenesis__Overall_Status__c() {
		return genesis__Overall_Status__c;
	}
	public void setGenesis__Overall_Status__c(String genesis__Overall_Status__c) {
		this.genesis__Overall_Status__c = genesis__Overall_Status__c;
	}
	public String getTW_SC_Count__c() {
		return TW_SC_Count__c;
	}
	public void setTW_SC_Count__c(String tW_SC_Count__c) {
		TW_SC_Count__c = tW_SC_Count__c;
	}
	public String getHLSC_Count__c() {
		return HLSC_Count__c;
	}
	public void setHLSC_Count__c(String hLSC_Count__c) {
		HLSC_Count__c = hLSC_Count__c;
	}
	public String getSupplier_Manufacturer__c() {
		return Supplier_Manufacturer__c;
	}
	public void setSupplier_Manufacturer__c(String supplier_Manufacturer__c) {
		Supplier_Manufacturer__c = supplier_Manufacturer__c;
	}
	public String getManufacturer__c() {
		return Manufacturer__c;
	}
	public void setManufacturer__c(String manufacturer__c) {
		Manufacturer__c = manufacturer__c;
	}
	public String getAsset_Make__c() {
		return Asset_Make__c;
	}
	public void setAsset_Make__c(String asset_Make__c) {
		Asset_Make__c = asset_Make__c;
	}
	public String getAsset_Model__c() {
		return Asset_Model__c;
	}
	public void setAsset_Model__c(String asset_Model__c) {
		Asset_Model__c = asset_Model__c;
	}
	public String getChannel_Code__c() {
		return Channel_Code__c;
	}
	public void setChannel_Code__c(String channel_Code__c) {
		Channel_Code__c = channel_Code__c;
	}
	public String getBRE_Max_EMI__c() {
		return BRE_Max_EMI__c;
	}
	public void setBRE_Max_EMI__c(String bRE_Max_EMI__c) {
		BRE_Max_EMI__c = bRE_Max_EMI__c;
	}
	public String getBRE_Max_Loan_Eligibility__c() {
		return BRE_Max_Loan_Eligibility__c;
	}
	public void setBRE_Max_Loan_Eligibility__c(String bRE_Max_Loan_Eligibility__c) {
		BRE_Max_Loan_Eligibility__c = bRE_Max_Loan_Eligibility__c;
	}
	public String getHl_Category__c() {
		return Hl_Category__c;
	}
	public void setHl_Category__c(String hl_Category__c) {
		Hl_Category__c = hl_Category__c;
	}
	public String getHL_Sub_Category__c() {
		return HL_Sub_Category__c;
	}
	public void setHL_Sub_Category__c(String hL_Sub_Category__c) {
		HL_Sub_Category__c = hL_Sub_Category__c;
	}
	public String getTotal_Land_Holding_Area__c() {
		return Total_Land_Holding_Area__c;
	}
	public void setTotal_Land_Holding_Area__c(String total_Land_Holding_Area__c) {
		Total_Land_Holding_Area__c = total_Land_Holding_Area__c;
	}
	public String getCultivated_Area__c() {
		return Cultivated_Area__c;
	}
	public void setCultivated_Area__c(String cultivated_Area__c) {
		Cultivated_Area__c = cultivated_Area__c;
	}
	public String getProperty_Status__c() {
		return Property_Status__c;
	}
	public void setProperty_Status__c(String property_Status__c) {
		Property_Status__c = property_Status__c;
	}
	public String getNon_Agri_Owned__c() {
		return Non_Agri_Owned__c;
	}
	public void setNon_Agri_Owned__c(String non_Agri_Owned__c) {
		Non_Agri_Owned__c = non_Agri_Owned__c;
	}
	public String getNon_AgriIncome__c() {
		return Non_AgriIncome__c;
	}
	public void setNon_AgriIncome__c(String non_AgriIncome__c) {
		Non_AgriIncome__c = non_AgriIncome__c;
	}
	public String getAgri_Income__c() {
		return Agri_Income__c;
	}
	public void setAgri_Income__c(String agri_Income__c) {
		Agri_Income__c = agri_Income__c;
	}
	public String getSupplier_Id__c() {
		return Supplier_Id__c;
	}
	public void setSupplier_Id__c(String supplier_Id__c) {
		Supplier_Id__c = supplier_Id__c;
	}
	public String getClub__c() {
		return Club__c;
	}
	public void setClub__c(String club__c) {
		Club__c = club__c;
	}
	public String getAsset_Model_Master__c() {
		return Asset_Model_Master__c;
	}
	public void setAsset_Model_Master__c(String asset_Model_Master__c) {
		Asset_Model_Master__c = asset_Model_Master__c;
	}
	public String getLTV_C__c() {
		return LTV_C__c;
	}
	public void setLTV_C__c(String lTV_C__c) {
		LTV_C__c = lTV_C__c;
	}
	public String getNet_Disbursement_Amount__c() {
		return Net_Disbursement_Amount__c;
	}
	public void setNet_Disbursement_Amount__c(String net_Disbursement_Amount__c) {
		Net_Disbursement_Amount__c = net_Disbursement_Amount__c;
	}
	public String getOCR_Amount__c() {
		return OCR_Amount__c;
	}
	public void setOCR_Amount__c(String oCR_Amount__c) {
		OCR_Amount__c = oCR_Amount__c;
	}
	public String getTxt_Disb_Date__c() {
		return txt_Disb_Date__c;
	}
	public void setTxt_Disb_Date__c(String txt_Disb_Date__c) {
		this.txt_Disb_Date__c = txt_Disb_Date__c;
	}
	public String getTxt_Installment_Due_Date_Last__c() {
		return txt_Installment_Due_Date_Last__c;
	}
	public void setTxt_Installment_Due_Date_Last__c(String txt_Installment_Due_Date_Last__c) {
		this.txt_Installment_Due_Date_Last__c = txt_Installment_Due_Date_Last__c;
	}
	public String getLTV_AB__c() {
		return LTV_AB__c;
	}
	public void setLTV_AB__c(String lTV_AB__c) {
		LTV_AB__c = lTV_AB__c;
	}
	public String getFARM_LTV__c() {
		return FARM_LTV__c;
	}
	public void setFARM_LTV__c(String fARM_LTV__c) {
		FARM_LTV__c = fARM_LTV__c;
	}
	public String getModel_Master__r() {
		return Model_Master__r;
	}
	public void setModel_Master__r(String model_Master__r) {
		Model_Master__r = model_Master__r;
	}
	public String getGenesis__Payment_Frequency__c() {
		return genesis__Payment_Frequency__c;
	}
	public void setGenesis__Payment_Frequency__c(String genesis__Payment_Frequency__c) {
		this.genesis__Payment_Frequency__c = genesis__Payment_Frequency__c;
	}
	public String getPDC_MICR_Code__c() {
		return PDC_MICR_Code__c;
	}
	public void setPDC_MICR_Code__c(String pDC_MICR_Code__c) {
		PDC_MICR_Code__c = pDC_MICR_Code__c;
	}
	public String getPDC_Cheque_Number__c() {
		return PDC_Cheque_Number__c;
	}
	public void setPDC_Cheque_Number__c(String pDC_Cheque_Number__c) {
		PDC_Cheque_Number__c = pDC_Cheque_Number__c;
	}
	public String getLoan_Period_from_Month__c() {
		return Loan_Period_from_Month__c;
	}
	public void setLoan_Period_from_Month__c(String loan_Period_from_Month__c) {
		Loan_Period_from_Month__c = loan_Period_from_Month__c;
	}
	public String getTransactionStatusMessage__c() {
		return TransactionStatusMessage__c;
	}
	public void setTransactionStatusMessage__c(String transactionStatusMessage__c) {
		TransactionStatusMessage__c = transactionStatusMessage__c;
	}
	public String getE_Mandate_Ref_Id__c() {
		return E_Mandate_Ref_Id__c;
	}
	public void setE_Mandate_Ref_Id__c(String e_Mandate_Ref_Id__c) {
		E_Mandate_Ref_Id__c = e_Mandate_Ref_Id__c;
	}
	public String getLoan_Period_to_Year__c() {
		return Loan_Period_to_Year__c;
	}
	public void setLoan_Period_to_Year__c(String loan_Period_to_Year__c) {
		Loan_Period_to_Year__c = loan_Period_to_Year__c;
	}
	public String getInstallment_Amount__c() {
		return Installment_Amount__c;
	}
	public void setInstallment_Amount__c(String installment_Amount__c) {
		Installment_Amount__c = installment_Amount__c;
	}
	public String getInstallment_Date__c() {
		return Installment_Date__c;
	}
	public void setInstallment_Date__c(String installment_Date__c) {
		Installment_Date__c = installment_Date__c;
	}
	public String getLoan_Period_to_Month__c() {
		return Loan_Period_to_Month__c;
	}
	public void setLoan_Period_to_Month__c(String loan_Period_to_Month__c) {
		Loan_Period_to_Month__c = loan_Period_to_Month__c;
	}
	public String getLoan_Period_from_Year__c() {
		return Loan_Period_from_Year__c;
	}
	public void setLoan_Period_from_Year__c(String loan_Period_from_Year__c) {
		Loan_Period_from_Year__c = loan_Period_from_Year__c;
	}
	public String getCheque_Number__c() {
		return Cheque_Number__c;
	}
	public void setCheque_Number__c(String cheque_Number__c) {
		Cheque_Number__c = cheque_Number__c;
	}
	public String getMICR_Code__c() {
		return MICR_Code__c;
	}
	public void setMICR_Code__c(String mICR_Code__c) {
		MICR_Code__c = mICR_Code__c;
	}
	public String getBranch__c() {
		return Branch__c;
	}
	public void setBranch__c(String branch__c) {
		Branch__c = branch__c;
	}
	public String getIFSC_Code__c() {
		return IFSC_Code__c;
	}
	public void setIFSC_Code__c(String iFSC_Code__c) {
		IFSC_Code__c = iFSC_Code__c;
	}
	public String getAccount_Holder_Name__c() {
		return Account_Holder_Name__c;
	}
	public void setAccount_Holder_Name__c(String account_Holder_Name__c) {
		Account_Holder_Name__c = account_Holder_Name__c;
	}
	public String getGenesis__Bank_Account_Number__c() {
		return genesis__Bank_Account_Number__c;
	}
	public void setGenesis__Bank_Account_Number__c(String genesis__Bank_Account_Number__c) {
		this.genesis__Bank_Account_Number__c = genesis__Bank_Account_Number__c;
	}
	public String getChassis_number__c() {
		return Chassis_number__c;
	}
	public void setChassis_number__c(String chassis_number__c) {
		Chassis_number__c = chassis_number__c;
	}
	public String getEngine_number__c() {
		return Engine_number__c;
	}
	public void setEngine_number__c(String engine_number__c) {
		Engine_number__c = engine_number__c;
	}
	public String getInvoice_number__c() {
		return Invoice_number__c;
	}
	public void setInvoice_number__c(String invoice_number__c) {
		Invoice_number__c = invoice_number__c;
	}
	public String getS_Process_ESign_Id__c() {
		return S_Process_ESign_Id__c;
	}
	public void setS_Process_ESign_Id__c(String s_Process_ESign_Id__c) {
		S_Process_ESign_Id__c = s_Process_ESign_Id__c;
	}
	public String getMax_Disbursal_Amount__c() {
		return Max_Disbursal_Amount__c;
	}
	public void setMax_Disbursal_Amount__c(String max_Disbursal_Amount__c) {
		Max_Disbursal_Amount__c = max_Disbursal_Amount__c;
	}
	public String getE_Sign_Docket_Id__c() {
		return E_Sign_Docket_Id__c;
	}
	public void setE_Sign_Docket_Id__c(String e_Sign_Docket_Id__c) {
		E_Sign_Docket_Id__c = e_Sign_Docket_Id__c;
	}
	public String getRC_Doc_Status__c() {
		return RC_Doc_Status__c;
	}
	public void setRC_Doc_Status__c(String rC_Doc_Status__c) {
		RC_Doc_Status__c = rC_Doc_Status__c;
	}
	public String getTech_legal_eval_status__c() {
		return Tech_legal_eval_status__c;
	}
	public void setTech_legal_eval_status__c(String tech_legal_eval_status__c) {
		Tech_legal_eval_status__c = tech_legal_eval_status__c;
	}
	public String getArea_Sq_Ft__c() {
		return Area_Sq_Ft__c;
	}
	public void setArea_Sq_Ft__c(String area_Sq_Ft__c) {
		Area_Sq_Ft__c = area_Sq_Ft__c;
	}
	public String getArea_Type__c() {
		return Area_Type__c;
	}
	public void setArea_Type__c(String area_Type__c) {
		Area_Type__c = area_Type__c;
	}
	public String getDealer_Error__c() {
		return Dealer_Error__c;
	}
	public void setDealer_Error__c(String dealer_Error__c) {
		Dealer_Error__c = dealer_Error__c;
	}
	public String getPremium_Amount__c() {
		return Premium_Amount__c;
	}
	public void setPremium_Amount__c(String premium_Amount__c) {
		Premium_Amount__c = premium_Amount__c;
	}
	public String getSubvention_Amount__c() {
		return Subvention_Amount__c;
	}
	public void setSubvention_Amount__c(String subvention_Amount__c) {
		Subvention_Amount__c = subvention_Amount__c;
	}
	public String getAsset_Category__c() {
		return Asset_Category__c;
	}
	public void setAsset_Category__c(String asset_Category__c) {
		Asset_Category__c = asset_Category__c;
	}
	public Genesis__Account__r_Bean getGenesis__Account__r() {
		return genesis__Account__r;
	}
	public void setGenesis__Account__r(Genesis__Account__r_Bean genesis__Account__r) {
		this.genesis__Account__r = genesis__Account__r;
	}
	public Genesis__CL_Product__r_Bean getGenesis__CL_Product__r() {
		return genesis__CL_Product__r;
	}
	public void setGenesis__CL_Product__r(Genesis__CL_Product__r_Bean genesis__CL_Product__r) {
		this.genesis__CL_Product__r = genesis__CL_Product__r;
	}
	public Extended_Application__r_Bean getExtended_Application__r() {
		return Extended_Application__r;
	}
	public void setExtended_Application__r(Extended_Application__r_Bean extended_Application__r) {
		Extended_Application__r = extended_Application__r;
	}
	public Pre_Approved_Loan__r_Bean getPre_Approved_Loan__r() {
		return Pre_Approved_Loan__r;
	}
	public void setPre_Approved_Loan__r(Pre_Approved_Loan__r_Bean pre_Approved_Loan__r) {
		Pre_Approved_Loan__r = pre_Approved_Loan__r;
	}
	public Dealer__r_Bean getDealer__r() {
		return Dealer__r;
	}
	public void setDealer__r(Dealer__r_Bean dealer__r) {
		Dealer__r = dealer__r;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Application() {
		super();
	}
	public Application(String product_Category__c, String genesis__Account__c, String top_up_Calculated__c,
			String scheme__c, String sub_Property_Type__c, String is_SENP__c, String disbursal_To__c,
			String dST_FLS_City__c, String isOnline__c, String login_Fees__c, String is_Non_APF__c,
			String mFI_CLI_New_Grid__c, String property_Type__c, String pDC_Deviation_FLAG__c,
			String rC_Deviation_Flag__c, String margin_Money__c, String builder__c, String fLS_Agent__c,
			String bRE_MFI_TYPEOFLOAN__c, String location__Longitude__s, String location__Latitude__s,
			String genesis__Loan_Amount__c, String loan_Amount_In_Word__c, String scheme_Name__c,
			String bRE_HL_Result__c, String genesis__Interest_Rate__c, String application_Id__c,
			String genesis__CL_Product__c, String sub_Product__c, String genesis__Term__c, String asset_Cost__c,
			String base_Price_per_sq_m__c, String super_Built_up_Area_sq_m__c, String property_identified__c,
			String genesis__Interest_Calculation_Method__c, String genesis__Status__c, String application_Stage__c,
			String application_TAT__c, String loan_Type__c, String applied_Loan_Amount__c, String sub_Stage__c,
			String nID_Flag__c, String fi_Response_Received__c, String e_Sign_Complete__c,
			String extended_Application__c, String promotions_HL__c, String no_of_Advance_Installments__c,
			String aPF_Tower_Configuration__c, String aPF_Project__c, String credit_Check__c, String physical_Esign__c,
			String swimlane_B_Required__c, String rCU_Triggered__c, String bRE_MFI_MAX_Slider__c,
			String bRE_MFI_Min_Slider__c, String bRE_Subsidy_Flag__c, String carpet_Area_sq_m__c,
			String aPF_Flat_Configuration__c, String dealer__c, String e_Sign_CLI_Id__c, String e_Sign_Ref_Id__c,
			String e_Sign_DOGH_Id__c, String existing_Loan_IFSC__c, String existing_Loan_A_C_Number__c,
			String builder_Bank_Account_Number__c, String builder_s_name_Seller_s_name__c, String pDC_Account_Number__c,
			String pDC_Account_Holder_Name__c, String village_Name__c, String vehicle_Insurance__c,
			String uTR_Number__c, String applied_Tenure__c, String bRE_Max_Tenure__c, String bRE_Min_Tenure__c,
			String swimlane__c, String supplier__c, String send_To_Ops_Portal__c, String registration_Cost__c,
			String reason_for_Rejection__c, String fI_Status__c, String pOST_SANCTION_TAT__c, String ops_Approved__c,
			String no_of_Credit_validity_days__c, String is_No_Hypo_Loan__c, String mANDATESETUP_TAT__c,
			String locality__c, String loan_On_Boarding_Start_Time__c, String loan_EMI__c, String invoice_Amount__c,
			String group_Id__c, String fLS_ID__c, String ex_Showroom_price__c, String eSIGN_TAT__c,
			String due_Date_of_Commencement_of_EMI__c, String max_EMI_Amount__c, String dISBURSEMENTFORM_TAT__c,
			String disbursed_Amount__c, String dealer_Name__c, String dealer_Portal_Status__c,
			String bRE_Rejection_Reason__c, String txt_Asset_Description__c, String aSSET_DETAILS_TAT__c,
			String reason_for_Hold__c, String id, String advance_Emi__c, String action_items_tasks__c,
			String accessories_Cost__c, String customer_Cycle__c, String assert_Type__c, String loan_Sanction_Date__c,
			String pre_Approved_Loan__c, String promotion_Code__c, String loan_EMI_In_Words__c, String model_Master__c,
			String lTFS_Hypothecation__c, String implement_Type__c, String invoice_Amount_Implement__c,
			String tW_BRE_Reason_for_Rejection__c, String name, String dealer_Name_Supplier__c, String createddate,
			String lastModifiedDate, String eMI_Start_Date__c, String loan_Agreement_ID__c,
			String upfront_Processing_Fee_Payment__c, String extra_Work_Amount__c, String top_up_Amount_Required__c,
			String additional_Docs_Required__c, String techProcessStatus__c, String ops_First_Check_Complete__c,
			String builder_Bank_IFSC_Code__c, String bPI_Charge__c, String occupancy__c, String min_IRR__c,
			String genesis__Overall_Status__c, String tW_SC_Count__c, String hLSC_Count__c,
			String supplier_Manufacturer__c, String manufacturer__c, String asset_Make__c, String asset_Model__c,
			String channel_Code__c, String bRE_Max_EMI__c, String bRE_Max_Loan_Eligibility__c, String hl_Category__c,
			String hL_Sub_Category__c, String total_Land_Holding_Area__c, String cultivated_Area__c,
			String property_Status__c, String non_Agri_Owned__c, String non_AgriIncome__c, String agri_Income__c,
			String supplier_Id__c, String club__c, String asset_Model_Master__c, String lTV_C__c,
			String net_Disbursement_Amount__c, String oCR_Amount__c, String txt_Disb_Date__c,
			String txt_Installment_Due_Date_Last__c, String lTV_AB__c, String fARM_LTV__c, String model_Master__r,
			String genesis__Payment_Frequency__c, String pDC_MICR_Code__c, String pDC_Cheque_Number__c,
			String loan_Period_from_Month__c, String transactionStatusMessage__c, String e_Mandate_Ref_Id__c,
			String loan_Period_to_Year__c, String installment_Amount__c, String installment_Date__c,
			String loan_Period_to_Month__c, String loan_Period_from_Year__c, String cheque_Number__c,
			String mICR_Code__c, String branch__c, String iFSC_Code__c, String account_Holder_Name__c,
			String genesis__Bank_Account_Number__c, String chassis_number__c, String engine_number__c,
			String invoice_number__c, String s_Process_ESign_Id__c, String max_Disbursal_Amount__c,
			String e_Sign_Docket_Id__c, String rC_Doc_Status__c, String tech_legal_eval_status__c, String area_Sq_Ft__c,
			String area_Type__c, String dealer_Error__c, String premium_Amount__c, String subvention_Amount__c,
			String asset_Category__c, Genesis__Account__r_Bean genesis__Account__r,
			Genesis__CL_Product__r_Bean genesis__CL_Product__r, Extended_Application__r_Bean extended_Application__r,
			Pre_Approved_Loan__r_Bean pre_Approved_Loan__r, Dealer__r_Bean dealer__r, AttributesBean attributes) {
		super();
		Product_Category__c = product_Category__c;
		this.genesis__Account__c = genesis__Account__c;
		Top_up_Calculated__c = top_up_Calculated__c;
		Scheme__c = scheme__c;
		Sub_Property_Type__c = sub_Property_Type__c;
		Is_SENP__c = is_SENP__c;
		Disbursal_To__c = disbursal_To__c;
		DST_FLS_City__c = dST_FLS_City__c;
		this.isOnline__c = isOnline__c;
		Login_Fees__c = login_Fees__c;
		Is_Non_APF__c = is_Non_APF__c;
		MFI_CLI_New_Grid__c = mFI_CLI_New_Grid__c;
		Property_Type__c = property_Type__c;
		PDC_Deviation_FLAG__c = pDC_Deviation_FLAG__c;
		RC_Deviation_Flag__c = rC_Deviation_Flag__c;
		Margin_Money__c = margin_Money__c;
		Builder__c = builder__c;
		FLS_Agent__c = fLS_Agent__c;
		BRE_MFI_TYPEOFLOAN__c = bRE_MFI_TYPEOFLOAN__c;
		this.location__Longitude__s = location__Longitude__s;
		this.location__Latitude__s = location__Latitude__s;
		this.genesis__Loan_Amount__c = genesis__Loan_Amount__c;
		Loan_Amount_In_Word__c = loan_Amount_In_Word__c;
		Scheme_Name__c = scheme_Name__c;
		BRE_HL_Result__c = bRE_HL_Result__c;
		this.genesis__Interest_Rate__c = genesis__Interest_Rate__c;
		Application_Id__c = application_Id__c;
		this.genesis__CL_Product__c = genesis__CL_Product__c;
		Sub_Product__c = sub_Product__c;
		this.genesis__Term__c = genesis__Term__c;
		Asset_Cost__c = asset_Cost__c;
		Base_Price_per_sq_m__c = base_Price_per_sq_m__c;
		Super_Built_up_Area_sq_m__c = super_Built_up_Area_sq_m__c;
		Property_identified__c = property_identified__c;
		this.genesis__Interest_Calculation_Method__c = genesis__Interest_Calculation_Method__c;
		this.genesis__Status__c = genesis__Status__c;
		Application_Stage__c = application_Stage__c;
		Application_TAT__c = application_TAT__c;
		Loan_Type__c = loan_Type__c;
		Applied_Loan_Amount__c = applied_Loan_Amount__c;
		Sub_Stage__c = sub_Stage__c;
		NID_Flag__c = nID_Flag__c;
		Fi_Response_Received__c = fi_Response_Received__c;
		E_Sign_Complete__c = e_Sign_Complete__c;
		Extended_Application__c = extended_Application__c;
		Promotions_HL__c = promotions_HL__c;
		No_of_Advance_Installments__c = no_of_Advance_Installments__c;
		APF_Tower_Configuration__c = aPF_Tower_Configuration__c;
		APF_Project__c = aPF_Project__c;
		Credit_Check__c = credit_Check__c;
		Physical_Esign__c = physical_Esign__c;
		Swimlane_B_Required__c = swimlane_B_Required__c;
		RCU_Triggered__c = rCU_Triggered__c;
		BRE_MFI_MAX_Slider__c = bRE_MFI_MAX_Slider__c;
		BRE_MFI_Min_Slider__c = bRE_MFI_Min_Slider__c;
		BRE_Subsidy_Flag__c = bRE_Subsidy_Flag__c;
		Carpet_Area_sq_m__c = carpet_Area_sq_m__c;
		APF_Flat_Configuration__c = aPF_Flat_Configuration__c;
		Dealer__c = dealer__c;
		E_Sign_CLI_Id__c = e_Sign_CLI_Id__c;
		E_Sign_Ref_Id__c = e_Sign_Ref_Id__c;
		E_Sign_DOGH_Id__c = e_Sign_DOGH_Id__c;
		Existing_Loan_IFSC__c = existing_Loan_IFSC__c;
		Existing_Loan_A_C_Number__c = existing_Loan_A_C_Number__c;
		Builder_Bank_Account_Number__c = builder_Bank_Account_Number__c;
		Builder_s_name_Seller_s_name__c = builder_s_name_Seller_s_name__c;
		PDC_Account_Number__c = pDC_Account_Number__c;
		PDC_Account_Holder_Name__c = pDC_Account_Holder_Name__c;
		Village_Name__c = village_Name__c;
		Vehicle_Insurance__c = vehicle_Insurance__c;
		UTR_Number__c = uTR_Number__c;
		Applied_Tenure__c = applied_Tenure__c;
		BRE_Max_Tenure__c = bRE_Max_Tenure__c;
		BRE_Min_Tenure__c = bRE_Min_Tenure__c;
		Swimlane__c = swimlane__c;
		Supplier__c = supplier__c;
		Send_To_Ops_Portal__c = send_To_Ops_Portal__c;
		Registration_Cost__c = registration_Cost__c;
		Reason_for_Rejection__c = reason_for_Rejection__c;
		FI_Status__c = fI_Status__c;
		POST_SANCTION_TAT__c = pOST_SANCTION_TAT__c;
		Ops_Approved__c = ops_Approved__c;
		No_of_Credit_validity_days__c = no_of_Credit_validity_days__c;
		Is_No_Hypo_Loan__c = is_No_Hypo_Loan__c;
		MANDATESETUP_TAT__c = mANDATESETUP_TAT__c;
		Locality__c = locality__c;
		Loan_On_Boarding_Start_Time__c = loan_On_Boarding_Start_Time__c;
		Loan_EMI__c = loan_EMI__c;
		Invoice_Amount__c = invoice_Amount__c;
		Group_Id__c = group_Id__c;
		FLS_ID__c = fLS_ID__c;
		Ex_Showroom_price__c = ex_Showroom_price__c;
		ESIGN_TAT__c = eSIGN_TAT__c;
		Due_Date_of_Commencement_of_EMI__c = due_Date_of_Commencement_of_EMI__c;
		Max_EMI_Amount__c = max_EMI_Amount__c;
		DISBURSEMENTFORM_TAT__c = dISBURSEMENTFORM_TAT__c;
		Disbursed_Amount__c = disbursed_Amount__c;
		Dealer_Name__c = dealer_Name__c;
		Dealer_Portal_Status__c = dealer_Portal_Status__c;
		BRE_Rejection_Reason__c = bRE_Rejection_Reason__c;
		this.txt_Asset_Description__c = txt_Asset_Description__c;
		ASSET_DETAILS_TAT__c = aSSET_DETAILS_TAT__c;
		Reason_for_Hold__c = reason_for_Hold__c;
		Id = id;
		Advance_Emi__c = advance_Emi__c;
		Action_items_tasks__c = action_items_tasks__c;
		Accessories_Cost__c = accessories_Cost__c;
		Customer_Cycle__c = customer_Cycle__c;
		Assert_Type__c = assert_Type__c;
		Loan_Sanction_Date__c = loan_Sanction_Date__c;
		Pre_Approved_Loan__c = pre_Approved_Loan__c;
		Promotion_Code__c = promotion_Code__c;
		Loan_EMI_In_Words__c = loan_EMI_In_Words__c;
		Model_Master__c = model_Master__c;
		LTFS_Hypothecation__c = lTFS_Hypothecation__c;
		Implement_Type__c = implement_Type__c;
		Invoice_Amount_Implement__c = invoice_Amount_Implement__c;
		TW_BRE_Reason_for_Rejection__c = tW_BRE_Reason_for_Rejection__c;
		Name = name;
		Dealer_Name_Supplier__c = dealer_Name_Supplier__c;
		this.createddate = createddate;
		LastModifiedDate = lastModifiedDate;
		EMI_Start_Date__c = eMI_Start_Date__c;
		Loan_Agreement_ID__c = loan_Agreement_ID__c;
		Upfront_Processing_Fee_Payment__c = upfront_Processing_Fee_Payment__c;
		Extra_Work_Amount__c = extra_Work_Amount__c;
		Top_up_Amount_Required__c = top_up_Amount_Required__c;
		Additional_Docs_Required__c = additional_Docs_Required__c;
		TechProcessStatus__c = techProcessStatus__c;
		Ops_First_Check_Complete__c = ops_First_Check_Complete__c;
		Builder_Bank_IFSC_Code__c = builder_Bank_IFSC_Code__c;
		BPI_Charge__c = bPI_Charge__c;
		Occupancy__c = occupancy__c;
		Min_IRR__c = min_IRR__c;
		this.genesis__Overall_Status__c = genesis__Overall_Status__c;
		TW_SC_Count__c = tW_SC_Count__c;
		HLSC_Count__c = hLSC_Count__c;
		Supplier_Manufacturer__c = supplier_Manufacturer__c;
		Manufacturer__c = manufacturer__c;
		Asset_Make__c = asset_Make__c;
		Asset_Model__c = asset_Model__c;
		Channel_Code__c = channel_Code__c;
		BRE_Max_EMI__c = bRE_Max_EMI__c;
		BRE_Max_Loan_Eligibility__c = bRE_Max_Loan_Eligibility__c;
		Hl_Category__c = hl_Category__c;
		HL_Sub_Category__c = hL_Sub_Category__c;
		Total_Land_Holding_Area__c = total_Land_Holding_Area__c;
		Cultivated_Area__c = cultivated_Area__c;
		Property_Status__c = property_Status__c;
		Non_Agri_Owned__c = non_Agri_Owned__c;
		Non_AgriIncome__c = non_AgriIncome__c;
		Agri_Income__c = agri_Income__c;
		Supplier_Id__c = supplier_Id__c;
		Club__c = club__c;
		Asset_Model_Master__c = asset_Model_Master__c;
		LTV_C__c = lTV_C__c;
		Net_Disbursement_Amount__c = net_Disbursement_Amount__c;
		OCR_Amount__c = oCR_Amount__c;
		this.txt_Disb_Date__c = txt_Disb_Date__c;
		this.txt_Installment_Due_Date_Last__c = txt_Installment_Due_Date_Last__c;
		LTV_AB__c = lTV_AB__c;
		FARM_LTV__c = fARM_LTV__c;
		Model_Master__r = model_Master__r;
		this.genesis__Payment_Frequency__c = genesis__Payment_Frequency__c;
		PDC_MICR_Code__c = pDC_MICR_Code__c;
		PDC_Cheque_Number__c = pDC_Cheque_Number__c;
		Loan_Period_from_Month__c = loan_Period_from_Month__c;
		TransactionStatusMessage__c = transactionStatusMessage__c;
		E_Mandate_Ref_Id__c = e_Mandate_Ref_Id__c;
		Loan_Period_to_Year__c = loan_Period_to_Year__c;
		Installment_Amount__c = installment_Amount__c;
		Installment_Date__c = installment_Date__c;
		Loan_Period_to_Month__c = loan_Period_to_Month__c;
		Loan_Period_from_Year__c = loan_Period_from_Year__c;
		Cheque_Number__c = cheque_Number__c;
		MICR_Code__c = mICR_Code__c;
		Branch__c = branch__c;
		IFSC_Code__c = iFSC_Code__c;
		Account_Holder_Name__c = account_Holder_Name__c;
		this.genesis__Bank_Account_Number__c = genesis__Bank_Account_Number__c;
		Chassis_number__c = chassis_number__c;
		Engine_number__c = engine_number__c;
		Invoice_number__c = invoice_number__c;
		S_Process_ESign_Id__c = s_Process_ESign_Id__c;
		Max_Disbursal_Amount__c = max_Disbursal_Amount__c;
		E_Sign_Docket_Id__c = e_Sign_Docket_Id__c;
		RC_Doc_Status__c = rC_Doc_Status__c;
		Tech_legal_eval_status__c = tech_legal_eval_status__c;
		Area_Sq_Ft__c = area_Sq_Ft__c;
		Area_Type__c = area_Type__c;
		Dealer_Error__c = dealer_Error__c;
		Premium_Amount__c = premium_Amount__c;
		Subvention_Amount__c = subvention_Amount__c;
		Asset_Category__c = asset_Category__c;
		this.genesis__Account__r = genesis__Account__r;
		this.genesis__CL_Product__r = genesis__CL_Product__r;
		Extended_Application__r = extended_Application__r;
		Pre_Approved_Loan__r = pre_Approved_Loan__r;
		Dealer__r = dealer__r;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Application [SrNo=" + SrNo + ", Product_Category__c=" + Product_Category__c + ", genesis__Account__c="
				+ genesis__Account__c + ", Top_up_Calculated__c=" + Top_up_Calculated__c + ", Scheme__c=" + Scheme__c
				+ ", Sub_Property_Type__c=" + Sub_Property_Type__c + ", Is_SENP__c=" + Is_SENP__c + ", Disbursal_To__c="
				+ Disbursal_To__c + ", DST_FLS_City__c=" + DST_FLS_City__c + ", isOnline__c=" + isOnline__c
				+ ", Login_Fees__c=" + Login_Fees__c + ", Is_Non_APF__c=" + Is_Non_APF__c + ", MFI_CLI_New_Grid__c="
				+ MFI_CLI_New_Grid__c + ", Property_Type__c=" + Property_Type__c + ", PDC_Deviation_FLAG__c="
				+ PDC_Deviation_FLAG__c + ", RC_Deviation_Flag__c=" + RC_Deviation_Flag__c + ", Margin_Money__c="
				+ Margin_Money__c + ", Builder__c=" + Builder__c + ", FLS_Agent__c=" + FLS_Agent__c
				+ ", BRE_MFI_TYPEOFLOAN__c=" + BRE_MFI_TYPEOFLOAN__c + ", location__Longitude__s="
				+ location__Longitude__s + ", location__Latitude__s=" + location__Latitude__s
				+ ", genesis__Loan_Amount__c=" + genesis__Loan_Amount__c + ", Loan_Amount_In_Word__c="
				+ Loan_Amount_In_Word__c + ", Scheme_Name__c=" + Scheme_Name__c + ", BRE_HL_Result__c="
				+ BRE_HL_Result__c + ", genesis__Interest_Rate__c=" + genesis__Interest_Rate__c + ", Application_Id__c="
				+ Application_Id__c + ", genesis__CL_Product__c=" + genesis__CL_Product__c + ", Sub_Product__c="
				+ Sub_Product__c + ", genesis__Term__c=" + genesis__Term__c + ", Asset_Cost__c=" + Asset_Cost__c
				+ ", Base_Price_per_sq_m__c=" + Base_Price_per_sq_m__c + ", Super_Built_up_Area_sq_m__c="
				+ Super_Built_up_Area_sq_m__c + ", Property_identified__c=" + Property_identified__c
				+ ", genesis__Interest_Calculation_Method__c=" + genesis__Interest_Calculation_Method__c
				+ ", genesis__Status__c=" + genesis__Status__c + ", Application_Stage__c=" + Application_Stage__c
				+ ", Application_TAT__c=" + Application_TAT__c + ", Loan_Type__c=" + Loan_Type__c
				+ ", Applied_Loan_Amount__c=" + Applied_Loan_Amount__c + ", Sub_Stage__c=" + Sub_Stage__c
				+ ", NID_Flag__c=" + NID_Flag__c + ", Fi_Response_Received__c=" + Fi_Response_Received__c
				+ ", E_Sign_Complete__c=" + E_Sign_Complete__c + ", Extended_Application__c=" + Extended_Application__c
				+ ", Promotions_HL__c=" + Promotions_HL__c + ", No_of_Advance_Installments__c="
				+ No_of_Advance_Installments__c + ", APF_Tower_Configuration__c=" + APF_Tower_Configuration__c
				+ ", APF_Project__c=" + APF_Project__c + ", Credit_Check__c=" + Credit_Check__c + ", Physical_Esign__c="
				+ Physical_Esign__c + ", Swimlane_B_Required__c=" + Swimlane_B_Required__c + ", RCU_Triggered__c="
				+ RCU_Triggered__c + ", BRE_MFI_MAX_Slider__c=" + BRE_MFI_MAX_Slider__c + ", BRE_MFI_Min_Slider__c="
				+ BRE_MFI_Min_Slider__c + ", BRE_Subsidy_Flag__c=" + BRE_Subsidy_Flag__c + ", Carpet_Area_sq_m__c="
				+ Carpet_Area_sq_m__c + ", APF_Flat_Configuration__c=" + APF_Flat_Configuration__c + ", Dealer__c="
				+ Dealer__c + ", E_Sign_CLI_Id__c=" + E_Sign_CLI_Id__c + ", E_Sign_Ref_Id__c=" + E_Sign_Ref_Id__c
				+ ", E_Sign_DOGH_Id__c=" + E_Sign_DOGH_Id__c + ", Existing_Loan_IFSC__c=" + Existing_Loan_IFSC__c
				+ ", Existing_Loan_A_C_Number__c=" + Existing_Loan_A_C_Number__c + ", Builder_Bank_Account_Number__c="
				+ Builder_Bank_Account_Number__c + ", Builder_s_name_Seller_s_name__c="
				+ Builder_s_name_Seller_s_name__c + ", PDC_Account_Number__c=" + PDC_Account_Number__c
				+ ", PDC_Account_Holder_Name__c=" + PDC_Account_Holder_Name__c + ", Village_Name__c=" + Village_Name__c
				+ ", Vehicle_Insurance__c=" + Vehicle_Insurance__c + ", UTR_Number__c=" + UTR_Number__c
				+ ", Applied_Tenure__c=" + Applied_Tenure__c + ", BRE_Max_Tenure__c=" + BRE_Max_Tenure__c
				+ ", BRE_Min_Tenure__c=" + BRE_Min_Tenure__c + ", Swimlane__c=" + Swimlane__c + ", Supplier__c="
				+ Supplier__c + ", Send_To_Ops_Portal__c=" + Send_To_Ops_Portal__c + ", Registration_Cost__c="
				+ Registration_Cost__c + ", Reason_for_Rejection__c=" + Reason_for_Rejection__c + ", FI_Status__c="
				+ FI_Status__c + ", POST_SANCTION_TAT__c=" + POST_SANCTION_TAT__c + ", Ops_Approved__c="
				+ Ops_Approved__c + ", No_of_Credit_validity_days__c=" + No_of_Credit_validity_days__c
				+ ", Is_No_Hypo_Loan__c=" + Is_No_Hypo_Loan__c + ", MANDATESETUP_TAT__c=" + MANDATESETUP_TAT__c
				+ ", Locality__c=" + Locality__c + ", Loan_On_Boarding_Start_Time__c=" + Loan_On_Boarding_Start_Time__c
				+ ", Loan_EMI__c=" + Loan_EMI__c + ", Invoice_Amount__c=" + Invoice_Amount__c + ", Group_Id__c="
				+ Group_Id__c + ", FLS_ID__c=" + FLS_ID__c + ", Ex_Showroom_price__c=" + Ex_Showroom_price__c
				+ ", ESIGN_TAT__c=" + ESIGN_TAT__c + ", Due_Date_of_Commencement_of_EMI__c="
				+ Due_Date_of_Commencement_of_EMI__c + ", Max_EMI_Amount__c=" + Max_EMI_Amount__c
				+ ", DISBURSEMENTFORM_TAT__c=" + DISBURSEMENTFORM_TAT__c + ", Disbursed_Amount__c="
				+ Disbursed_Amount__c + ", Dealer_Name__c=" + Dealer_Name__c + ", Dealer_Portal_Status__c="
				+ Dealer_Portal_Status__c + ", BRE_Rejection_Reason__c=" + BRE_Rejection_Reason__c
				+ ", txt_Asset_Description__c=" + txt_Asset_Description__c + ", ASSET_DETAILS_TAT__c="
				+ ASSET_DETAILS_TAT__c + ", Reason_for_Hold__c=" + Reason_for_Hold__c + ", Id=" + Id
				+ ", Advance_Emi__c=" + Advance_Emi__c + ", Action_items_tasks__c=" + Action_items_tasks__c
				+ ", Accessories_Cost__c=" + Accessories_Cost__c + ", Customer_Cycle__c=" + Customer_Cycle__c
				+ ", Assert_Type__c=" + Assert_Type__c + ", Loan_Sanction_Date__c=" + Loan_Sanction_Date__c
				+ ", Pre_Approved_Loan__c=" + Pre_Approved_Loan__c + ", Promotion_Code__c=" + Promotion_Code__c
				+ ", Loan_EMI_In_Words__c=" + Loan_EMI_In_Words__c + ", Model_Master__c=" + Model_Master__c
				+ ", LTFS_Hypothecation__c=" + LTFS_Hypothecation__c + ", Implement_Type__c=" + Implement_Type__c
				+ ", Invoice_Amount_Implement__c=" + Invoice_Amount_Implement__c + ", TW_BRE_Reason_for_Rejection__c="
				+ TW_BRE_Reason_for_Rejection__c + ", Name=" + Name + ", Dealer_Name_Supplier__c="
				+ Dealer_Name_Supplier__c + ", createddate=" + createddate + ", LastModifiedDate=" + LastModifiedDate
				+ ", EMI_Start_Date__c=" + EMI_Start_Date__c + ", Loan_Agreement_ID__c=" + Loan_Agreement_ID__c
				+ ", Upfront_Processing_Fee_Payment__c=" + Upfront_Processing_Fee_Payment__c + ", Extra_Work_Amount__c="
				+ Extra_Work_Amount__c + ", Top_up_Amount_Required__c=" + Top_up_Amount_Required__c
				+ ", Additional_Docs_Required__c=" + Additional_Docs_Required__c + ", TechProcessStatus__c="
				+ TechProcessStatus__c + ", Ops_First_Check_Complete__c=" + Ops_First_Check_Complete__c
				+ ", Builder_Bank_IFSC_Code__c=" + Builder_Bank_IFSC_Code__c + ", BPI_Charge__c=" + BPI_Charge__c
				+ ", Occupancy__c=" + Occupancy__c + ", Min_IRR__c=" + Min_IRR__c + ", genesis__Overall_Status__c="
				+ genesis__Overall_Status__c + ", TW_SC_Count__c=" + TW_SC_Count__c + ", HLSC_Count__c=" + HLSC_Count__c
				+ ", Supplier_Manufacturer__c=" + Supplier_Manufacturer__c + ", Manufacturer__c=" + Manufacturer__c
				+ ", Asset_Make__c=" + Asset_Make__c + ", Asset_Model__c=" + Asset_Model__c + ", Channel_Code__c="
				+ Channel_Code__c + ", BRE_Max_EMI__c=" + BRE_Max_EMI__c + ", BRE_Max_Loan_Eligibility__c="
				+ BRE_Max_Loan_Eligibility__c + ", Hl_Category__c=" + Hl_Category__c + ", HL_Sub_Category__c="
				+ HL_Sub_Category__c + ", Total_Land_Holding_Area__c=" + Total_Land_Holding_Area__c
				+ ", Cultivated_Area__c=" + Cultivated_Area__c + ", Property_Status__c=" + Property_Status__c
				+ ", Non_Agri_Owned__c=" + Non_Agri_Owned__c + ", Non_AgriIncome__c=" + Non_AgriIncome__c
				+ ", Agri_Income__c=" + Agri_Income__c + ", Supplier_Id__c=" + Supplier_Id__c + ", Club__c=" + Club__c
				+ ", Asset_Model_Master__c=" + Asset_Model_Master__c + ", LTV_C__c=" + LTV_C__c
				+ ", Net_Disbursement_Amount__c=" + Net_Disbursement_Amount__c + ", OCR_Amount__c=" + OCR_Amount__c
				+ ", txt_Disb_Date__c=" + txt_Disb_Date__c + ", txt_Installment_Due_Date_Last__c="
				+ txt_Installment_Due_Date_Last__c + ", LTV_AB__c=" + LTV_AB__c + ", FARM_LTV__c=" + FARM_LTV__c
				+ ", Model_Master__r=" + Model_Master__r + ", genesis__Payment_Frequency__c="
				+ genesis__Payment_Frequency__c + ", PDC_MICR_Code__c=" + PDC_MICR_Code__c + ", PDC_Cheque_Number__c="
				+ PDC_Cheque_Number__c + ", Loan_Period_from_Month__c=" + Loan_Period_from_Month__c
				+ ", TransactionStatusMessage__c=" + TransactionStatusMessage__c + ", E_Mandate_Ref_Id__c="
				+ E_Mandate_Ref_Id__c + ", Loan_Period_to_Year__c=" + Loan_Period_to_Year__c
				+ ", Installment_Amount__c=" + Installment_Amount__c + ", Installment_Date__c=" + Installment_Date__c
				+ ", Loan_Period_to_Month__c=" + Loan_Period_to_Month__c + ", Loan_Period_from_Year__c="
				+ Loan_Period_from_Year__c + ", Cheque_Number__c=" + Cheque_Number__c + ", MICR_Code__c=" + MICR_Code__c
				+ ", Branch__c=" + Branch__c + ", IFSC_Code__c=" + IFSC_Code__c + ", Account_Holder_Name__c="
				+ Account_Holder_Name__c + ", genesis__Bank_Account_Number__c=" + genesis__Bank_Account_Number__c
				+ ", Chassis_number__c=" + Chassis_number__c + ", Engine_number__c=" + Engine_number__c
				+ ", Invoice_number__c=" + Invoice_number__c + ", S_Process_ESign_Id__c=" + S_Process_ESign_Id__c
				+ ", Max_Disbursal_Amount__c=" + Max_Disbursal_Amount__c + ", E_Sign_Docket_Id__c="
				+ E_Sign_Docket_Id__c + ", RC_Doc_Status__c=" + RC_Doc_Status__c + ", Tech_legal_eval_status__c="
				+ Tech_legal_eval_status__c + ", Area_Sq_Ft__c=" + Area_Sq_Ft__c + ", Area_Type__c=" + Area_Type__c
				+ ", Dealer_Error__c=" + Dealer_Error__c + ", Premium_Amount__c=" + Premium_Amount__c
				+ ", Subvention_Amount__c=" + Subvention_Amount__c + ", Asset_Category__c=" + Asset_Category__c
				+ ", genesis__Account__r=" + genesis__Account__r + ", genesis__CL_Product__r=" + genesis__CL_Product__r
				+ ", Extended_Application__r=" + Extended_Application__r + ", Pre_Approved_Loan__r="
				+ Pre_Approved_Loan__r + ", Dealer__r=" + Dealer__r + ", attributes=" + attributes + "]";
	}
}
