package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Extended_Application__r")
public class Extended_Application__r_Bean implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQ_SRNO")
	@SequenceGenerator(name = "HIBERNATE_SEQ_SRNO", sequenceName = "HIBERNATE_SEQ_SRNO", allocationSize = 1)
	@Column(name = "ExtendedApplication_SrNo", unique = true, nullable = false)
	private Long SrNo;*/
	@Id
	@Column(name = "Id", columnDefinition = "VARCHAR(50)")
	private String Id;
	@Column(name = "HMSI_app__c", columnDefinition = "VARCHAR(50)")
	private String HMSI_app__c;
	@Column(name = "NRI_Flag__c", columnDefinition = "VARCHAR(20)")
	private String NRI_Flag__c;
	@Column(name = "Bureau_Error__c", columnDefinition = "VARCHAR(100)")
	private String Bureau_Error__c;
	@Column(name = "FUNDINGELIGIBILITY__c", columnDefinition = "VARCHAR(50)")
	private String FUNDINGELIGIBILITY__c;
	@Column(name = "IMPLEMENTFUNDINGELIGIBILITY__c", columnDefinition = "VARCHAR(50)")
	private String IMPLEMENTFUNDINGELIGIBILITY__c;
	@Column(name = "Implement_Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Implement_Loan_Amount__c;
	@Column(name = "TRACTORLTV__c", columnDefinition = "VARCHAR(50)")
	private String TRACTORLTV__c;
	@Column(name = "IMPLEMENTLTV__c", columnDefinition = "VARCHAR(50)")
	private String IMPLEMENTLTV__c;
	@Column(name = "LTVASSETCOSTIMPLEMENT__c", columnDefinition = "VARCHAR(50)")
	private String LTVASSETCOSTIMPLEMENT__c;
	@Column(name = "LTVDLPIMPLEMENT__c", columnDefinition = "VARCHAR(50)")
	private String LTVDLPIMPLEMENT__c;
	@Column(name = "LTVMAXIMPLEMENT__c", columnDefinition = "VARCHAR(50)")
	private String LTVMAXIMPLEMENT__c;
	@Column(name = "Disbursed_To__c", columnDefinition = "VARCHAR(50)")
	private String Disbursed_To__c;
	@Column(name = "Old_Processing_Fee__c", columnDefinition = "VARCHAR(50)")
	private String Old_Processing_Fee__c;
	@Column(name = "CLI_Deviation_Status__c", columnDefinition = "VARCHAR(50)")
	private String CLI_Deviation_Status__c;
	@Column(name = "CLI_Deviation_Flag__c", columnDefinition = "VARCHAR(50)")
	private String CLI_Deviation_Flag__c;
	@Column(name = "CLI_Deviation_Reason__c", columnDefinition = "VARCHAR(50)")
	private String CLI_Deviation_Reason__c;
	@Column(name = "File_Tracking_Status__c", columnDefinition = "VARCHAR(50)")
	private String File_Tracking_Status__c;
	@Column(name = "File_Tracking_Remark__c", columnDefinition = "VARCHAR(50)")
	private String File_Tracking_Remark__c;
	@Column(name = "Invoice_number_2__c", columnDefinition = "VARCHAR(50)")
	private String Invoice_number_2__c;
	@Column(name = "Split_Sanction_Letter__c", columnDefinition = "VARCHAR(50)")
	private String Split_Sanction_Letter__c;
	@Column(name = "Top_up_Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Top_up_Loan_Amount__c;
	@Column(name = "BT_Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String BT_Loan_Amount__c;
	@Column(name = "CLI_Deviation_Count__c", columnDefinition = "VARCHAR(50)")
	private String CLI_Deviation_Count__c  ;
	@Column(name = "PDC_Mandate_Done__c", columnDefinition = "VARCHAR(50)")
	private String PDC_Mandate_Done__c;
	@Column(name = "Current_Owner_Pincode__c", columnDefinition = "VARCHAR(50)")
	private String Current_Owner_Pincode__c;
	@Column(name = "Imd_Cheque_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Cheque_Amount__c;
	@Column(name = "Imd_Cheque_Date__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Cheque_Date__c;
	@Column(name = "Imd_Cheque_Number__c", columnDefinition = "VARCHAR(100)")
	private String Imd_Cheque_Number__c;
	@Column(name = "Imd_City__c", columnDefinition = "VARCHAR(100)")
	private String Imd_City__c;
	@Column(name = "Imd_Deposit_Slip_Number__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Deposit_Slip_Number__c;
	@Column(name = "Imd_Drawn_On__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Drawn_On__c;
	@Column(name = "Imd_Receipt_Date__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Receipt_Date__c;
	@Column(name = "Imd_Total_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Total_Amount__c;
	@Column(name = "Imd_Mode_Of_Payment__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Mode_Of_Payment__c;
	@Column(name = "Imd_Receipt_Number__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Receipt_Number__c;
	@Column(name = "Imd_Status__c", columnDefinition = "VARCHAR(50)")
	private String Imd_Status__c;
	@Column(name = "Imd_In_Favour_OF__c", columnDefinition = "VARCHAR(50)")
	private String Imd_In_Favour_OF__c;
	@Column(name = "Flat_Rate__c", columnDefinition = "VARCHAR(50)")
	private String Flat_Rate__c;
	@Column(name = "Max_Flat_Rate__c", columnDefinition = "VARCHAR(50)")
	private String Max_Flat_Rate__c;
	@Column(name = "Min_Accounting_IRR__c", columnDefinition = "VARCHAR(50)")
	private String Min_Accounting_IRR__c;
	@Column(name = "Max_Accounting_IRR__c", columnDefinition = "VARCHAR(50)")
	private String Max_Accounting_IRR__c;
	@Column(name = "Min_Financial_IRR__c", columnDefinition = "VARCHAR(50)")
	private String Min_Financial_IRR__c;
	@Column(name = "Max_Financial_IRR__c", columnDefinition = "VARCHAR(50)")
	private String Max_Financial_IRR__c;
	@Column(name = "valuation_price__c", columnDefinition = "VARCHAR(50)")
	private String valuation_price__c;
	@Column(name = "valuation_date__c", columnDefinition = "VARCHAR(50)")
	private String valuation_date__c;
	@Column(name = "old_opportunity_id__c", columnDefinition = "VARCHAR(50)")
	private String old_opportunity_id__c;
	@Column(name = "RTO_Code__c", columnDefinition = "VARCHAR(50)")
	private String RTO_Code__c;
	@Column(name = "Partner_Name__c", columnDefinition = "VARCHAR(100)")
	private String Partner_Name__c;
	@Column(name = "Existing_Application__c", columnDefinition = "VARCHAR(50)")
	private String Existing_Application__c;
	@Column(name = "First_Emi_Amount__c", columnDefinition = "VARCHAR(50)")
	private String First_Emi_Amount__c;
	@Column(name = "Invoice_Date__c", columnDefinition = "VARCHAR(50)")
	private String Invoice_Date__c;
	@Column(name = "Hmr_Km__c", columnDefinition = "VARCHAR(50)")
	private String Hmr_Km__c;
	@Column(name = "Business_Stability__c", columnDefinition = "VARCHAR(50)")
	private String Business_Stability__c;
	@Column(name = "Annual_Liabilities__c", columnDefinition = "VARCHAR(50)")
	private String Annual_Liabilities__c;
	@Column(name = "Implement_Category__c", columnDefinition = "VARCHAR(50)")
	private String Implement_Category__c;
	@Column(name = "Total_Loan_Amount__c", columnDefinition = "VARCHAR(50)")
	private String Total_Loan_Amount__c;
	@Column(name = "ASM_Dedupe_RePunch_Status__c", columnDefinition = "VARCHAR(50)")
	private String ASM_Dedupe_RePunch_Status__c;
	@Column(name = "is_Passbook_Required__c", columnDefinition = "VARCHAR(50)")
	private String is_Passbook_Required__c;
	@Embedded
	private AttributesBean attributes;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getHMSI_app__c() {
		return HMSI_app__c;
	}
	public void setHMSI_app__c(String hMSI_app__c) {
		HMSI_app__c = hMSI_app__c;
	}
	public String getNRI_Flag__c() {
		return NRI_Flag__c;
	}
	public void setNRI_Flag__c(String nRI_Flag__c) {
		NRI_Flag__c = nRI_Flag__c;
	}
	public String getBureau_Error__c() {
		return Bureau_Error__c;
	}
	public void setBureau_Error__c(String bureau_Error__c) {
		Bureau_Error__c = bureau_Error__c;
	}
	public String getFUNDINGELIGIBILITY__c() {
		return FUNDINGELIGIBILITY__c;
	}
	public void setFUNDINGELIGIBILITY__c(String fUNDINGELIGIBILITY__c) {
		FUNDINGELIGIBILITY__c = fUNDINGELIGIBILITY__c;
	}
	public String getIMPLEMENTFUNDINGELIGIBILITY__c() {
		return IMPLEMENTFUNDINGELIGIBILITY__c;
	}
	public void setIMPLEMENTFUNDINGELIGIBILITY__c(String iMPLEMENTFUNDINGELIGIBILITY__c) {
		IMPLEMENTFUNDINGELIGIBILITY__c = iMPLEMENTFUNDINGELIGIBILITY__c;
	}
	public String getImplement_Loan_Amount__c() {
		return Implement_Loan_Amount__c;
	}
	public void setImplement_Loan_Amount__c(String implement_Loan_Amount__c) {
		Implement_Loan_Amount__c = implement_Loan_Amount__c;
	}
	public String getTRACTORLTV__c() {
		return TRACTORLTV__c;
	}
	public void setTRACTORLTV__c(String tRACTORLTV__c) {
		TRACTORLTV__c = tRACTORLTV__c;
	}
	public String getIMPLEMENTLTV__c() {
		return IMPLEMENTLTV__c;
	}
	public void setIMPLEMENTLTV__c(String iMPLEMENTLTV__c) {
		IMPLEMENTLTV__c = iMPLEMENTLTV__c;
	}
	public String getLTVASSETCOSTIMPLEMENT__c() {
		return LTVASSETCOSTIMPLEMENT__c;
	}
	public void setLTVASSETCOSTIMPLEMENT__c(String lTVASSETCOSTIMPLEMENT__c) {
		LTVASSETCOSTIMPLEMENT__c = lTVASSETCOSTIMPLEMENT__c;
	}
	public String getLTVDLPIMPLEMENT__c() {
		return LTVDLPIMPLEMENT__c;
	}
	public void setLTVDLPIMPLEMENT__c(String lTVDLPIMPLEMENT__c) {
		LTVDLPIMPLEMENT__c = lTVDLPIMPLEMENT__c;
	}
	public String getLTVMAXIMPLEMENT__c() {
		return LTVMAXIMPLEMENT__c;
	}
	public void setLTVMAXIMPLEMENT__c(String lTVMAXIMPLEMENT__c) {
		LTVMAXIMPLEMENT__c = lTVMAXIMPLEMENT__c;
	}
	public String getDisbursed_To__c() {
		return Disbursed_To__c;
	}
	public void setDisbursed_To__c(String disbursed_To__c) {
		Disbursed_To__c = disbursed_To__c;
	}
	public String getOld_Processing_Fee__c() {
		return Old_Processing_Fee__c;
	}
	public void setOld_Processing_Fee__c(String old_Processing_Fee__c) {
		Old_Processing_Fee__c = old_Processing_Fee__c;
	}
	public String getCLI_Deviation_Status__c() {
		return CLI_Deviation_Status__c;
	}
	public void setCLI_Deviation_Status__c(String cLI_Deviation_Status__c) {
		CLI_Deviation_Status__c = cLI_Deviation_Status__c;
	}
	public String getCLI_Deviation_Flag__c() {
		return CLI_Deviation_Flag__c;
	}
	public void setCLI_Deviation_Flag__c(String cLI_Deviation_Flag__c) {
		CLI_Deviation_Flag__c = cLI_Deviation_Flag__c;
	}
	public String getCLI_Deviation_Reason__c() {
		return CLI_Deviation_Reason__c;
	}
	public void setCLI_Deviation_Reason__c(String cLI_Deviation_Reason__c) {
		CLI_Deviation_Reason__c = cLI_Deviation_Reason__c;
	}
	public String getFile_Tracking_Status__c() {
		return File_Tracking_Status__c;
	}
	public void setFile_Tracking_Status__c(String file_Tracking_Status__c) {
		File_Tracking_Status__c = file_Tracking_Status__c;
	}
	public String getFile_Tracking_Remark__c() {
		return File_Tracking_Remark__c;
	}
	public void setFile_Tracking_Remark__c(String file_Tracking_Remark__c) {
		File_Tracking_Remark__c = file_Tracking_Remark__c;
	}
	public String getInvoice_number_2__c() {
		return Invoice_number_2__c;
	}
	public void setInvoice_number_2__c(String invoice_number_2__c) {
		Invoice_number_2__c = invoice_number_2__c;
	}
	public String getSplit_Sanction_Letter__c() {
		return Split_Sanction_Letter__c;
	}
	public void setSplit_Sanction_Letter__c(String split_Sanction_Letter__c) {
		Split_Sanction_Letter__c = split_Sanction_Letter__c;
	}
	public String getTop_up_Loan_Amount__c() {
		return Top_up_Loan_Amount__c;
	}
	public void setTop_up_Loan_Amount__c(String top_up_Loan_Amount__c) {
		Top_up_Loan_Amount__c = top_up_Loan_Amount__c;
	}
	public String getBT_Loan_Amount__c() {
		return BT_Loan_Amount__c;
	}
	public void setBT_Loan_Amount__c(String bT_Loan_Amount__c) {
		BT_Loan_Amount__c = bT_Loan_Amount__c;
	}
	public String getCLI_Deviation_Count__c() {
		return CLI_Deviation_Count__c;
	}
	public void setCLI_Deviation_Count__c(String cLI_Deviation_Count__c) {
		CLI_Deviation_Count__c = cLI_Deviation_Count__c;
	}
	public String getPDC_Mandate_Done__c() {
		return PDC_Mandate_Done__c;
	}
	public void setPDC_Mandate_Done__c(String pDC_Mandate_Done__c) {
		PDC_Mandate_Done__c = pDC_Mandate_Done__c;
	}
	public String getCurrent_Owner_Pincode__c() {
		return Current_Owner_Pincode__c;
	}
	public void setCurrent_Owner_Pincode__c(String current_Owner_Pincode__c) {
		Current_Owner_Pincode__c = current_Owner_Pincode__c;
	}
	public String getImd_Cheque_Amount__c() {
		return Imd_Cheque_Amount__c;
	}
	public void setImd_Cheque_Amount__c(String imd_Cheque_Amount__c) {
		Imd_Cheque_Amount__c = imd_Cheque_Amount__c;
	}
	public String getImd_Cheque_Date__c() {
		return Imd_Cheque_Date__c;
	}
	public void setImd_Cheque_Date__c(String imd_Cheque_Date__c) {
		Imd_Cheque_Date__c = imd_Cheque_Date__c;
	}
	public String getImd_Cheque_Number__c() {
		return Imd_Cheque_Number__c;
	}
	public void setImd_Cheque_Number__c(String imd_Cheque_Number__c) {
		Imd_Cheque_Number__c = imd_Cheque_Number__c;
	}
	public String getImd_City__c() {
		return Imd_City__c;
	}
	public void setImd_City__c(String imd_City__c) {
		Imd_City__c = imd_City__c;
	}
	public String getImd_Deposit_Slip_Number__c() {
		return Imd_Deposit_Slip_Number__c;
	}
	public void setImd_Deposit_Slip_Number__c(String imd_Deposit_Slip_Number__c) {
		Imd_Deposit_Slip_Number__c = imd_Deposit_Slip_Number__c;
	}
	public String getImd_Drawn_On__c() {
		return Imd_Drawn_On__c;
	}
	public void setImd_Drawn_On__c(String imd_Drawn_On__c) {
		Imd_Drawn_On__c = imd_Drawn_On__c;
	}
	public String getImd_Receipt_Date__c() {
		return Imd_Receipt_Date__c;
	}
	public void setImd_Receipt_Date__c(String imd_Receipt_Date__c) {
		Imd_Receipt_Date__c = imd_Receipt_Date__c;
	}
	public String getImd_Total_Amount__c() {
		return Imd_Total_Amount__c;
	}
	public void setImd_Total_Amount__c(String imd_Total_Amount__c) {
		Imd_Total_Amount__c = imd_Total_Amount__c;
	}
	public String getImd_Mode_Of_Payment__c() {
		return Imd_Mode_Of_Payment__c;
	}
	public void setImd_Mode_Of_Payment__c(String imd_Mode_Of_Payment__c) {
		Imd_Mode_Of_Payment__c = imd_Mode_Of_Payment__c;
	}
	public String getImd_Receipt_Number__c() {
		return Imd_Receipt_Number__c;
	}
	public void setImd_Receipt_Number__c(String imd_Receipt_Number__c) {
		Imd_Receipt_Number__c = imd_Receipt_Number__c;
	}
	public String getImd_Status__c() {
		return Imd_Status__c;
	}
	public void setImd_Status__c(String imd_Status__c) {
		Imd_Status__c = imd_Status__c;
	}
	public String getImd_In_Favour_OF__c() {
		return Imd_In_Favour_OF__c;
	}
	public void setImd_In_Favour_OF__c(String imd_In_Favour_OF__c) {
		Imd_In_Favour_OF__c = imd_In_Favour_OF__c;
	}
	public String getFlat_Rate__c() {
		return Flat_Rate__c;
	}
	public void setFlat_Rate__c(String flat_Rate__c) {
		Flat_Rate__c = flat_Rate__c;
	}
	public String getMax_Flat_Rate__c() {
		return Max_Flat_Rate__c;
	}
	public void setMax_Flat_Rate__c(String max_Flat_Rate__c) {
		Max_Flat_Rate__c = max_Flat_Rate__c;
	}
	public String getMin_Accounting_IRR__c() {
		return Min_Accounting_IRR__c;
	}
	public void setMin_Accounting_IRR__c(String min_Accounting_IRR__c) {
		Min_Accounting_IRR__c = min_Accounting_IRR__c;
	}
	public String getMax_Accounting_IRR__c() {
		return Max_Accounting_IRR__c;
	}
	public void setMax_Accounting_IRR__c(String max_Accounting_IRR__c) {
		Max_Accounting_IRR__c = max_Accounting_IRR__c;
	}
	public String getMin_Financial_IRR__c() {
		return Min_Financial_IRR__c;
	}
	public void setMin_Financial_IRR__c(String min_Financial_IRR__c) {
		Min_Financial_IRR__c = min_Financial_IRR__c;
	}
	public String getMax_Financial_IRR__c() {
		return Max_Financial_IRR__c;
	}
	public void setMax_Financial_IRR__c(String max_Financial_IRR__c) {
		Max_Financial_IRR__c = max_Financial_IRR__c;
	}
	public String getValuation_price__c() {
		return valuation_price__c;
	}
	public void setValuation_price__c(String valuation_price__c) {
		this.valuation_price__c = valuation_price__c;
	}
	public String getValuation_date__c() {
		return valuation_date__c;
	}
	public void setValuation_date__c(String valuation_date__c) {
		this.valuation_date__c = valuation_date__c;
	}
	public String getOld_opportunity_id__c() {
		return old_opportunity_id__c;
	}
	public void setOld_opportunity_id__c(String old_opportunity_id__c) {
		this.old_opportunity_id__c = old_opportunity_id__c;
	}
	public String getRTO_Code__c() {
		return RTO_Code__c;
	}
	public void setRTO_Code__c(String rTO_Code__c) {
		RTO_Code__c = rTO_Code__c;
	}
	public String getPartner_Name__c() {
		return Partner_Name__c;
	}
	public void setPartner_Name__c(String partner_Name__c) {
		Partner_Name__c = partner_Name__c;
	}
	public String getExisting_Application__c() {
		return Existing_Application__c;
	}
	public void setExisting_Application__c(String existing_Application__c) {
		Existing_Application__c = existing_Application__c;
	}
	public String getFirst_Emi_Amount__c() {
		return First_Emi_Amount__c;
	}
	public void setFirst_Emi_Amount__c(String first_Emi_Amount__c) {
		First_Emi_Amount__c = first_Emi_Amount__c;
	}
	public String getInvoice_Date__c() {
		return Invoice_Date__c;
	}
	public void setInvoice_Date__c(String invoice_Date__c) {
		Invoice_Date__c = invoice_Date__c;
	}
	public String getHmr_Km__c() {
		return Hmr_Km__c;
	}
	public void setHmr_Km__c(String hmr_Km__c) {
		Hmr_Km__c = hmr_Km__c;
	}
	public String getBusiness_Stability__c() {
		return Business_Stability__c;
	}
	public void setBusiness_Stability__c(String business_Stability__c) {
		Business_Stability__c = business_Stability__c;
	}
	public String getAnnual_Liabilities__c() {
		return Annual_Liabilities__c;
	}
	public void setAnnual_Liabilities__c(String annual_Liabilities__c) {
		Annual_Liabilities__c = annual_Liabilities__c;
	}
	public String getImplement_Category__c() {
		return Implement_Category__c;
	}
	public void setImplement_Category__c(String implement_Category__c) {
		Implement_Category__c = implement_Category__c;
	}
	public String getTotal_Loan_Amount__c() {
		return Total_Loan_Amount__c;
	}
	public void setTotal_Loan_Amount__c(String total_Loan_Amount__c) {
		Total_Loan_Amount__c = total_Loan_Amount__c;
	}
	public String getASM_Dedupe_RePunch_Status__c() {
		return ASM_Dedupe_RePunch_Status__c;
	}
	public void setASM_Dedupe_RePunch_Status__c(String aSM_Dedupe_RePunch_Status__c) {
		ASM_Dedupe_RePunch_Status__c = aSM_Dedupe_RePunch_Status__c;
	}
	public String getIs_Passbook_Required__c() {
		return is_Passbook_Required__c;
	}
	public void setIs_Passbook_Required__c(String is_Passbook_Required__c) {
		this.is_Passbook_Required__c = is_Passbook_Required__c;
	}
	public AttributesBean getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributesBean attributes) {
		this.attributes = attributes;
	}
	public Extended_Application__r_Bean() {
		super();
	}
	public Extended_Application__r_Bean(String id, String hMSI_app__c, String nRI_Flag__c, String bureau_Error__c,
			String fUNDINGELIGIBILITY__c, String iMPLEMENTFUNDINGELIGIBILITY__c, String implement_Loan_Amount__c,
			String tRACTORLTV__c, String iMPLEMENTLTV__c, String lTVASSETCOSTIMPLEMENT__c, String lTVDLPIMPLEMENT__c,
			String lTVMAXIMPLEMENT__c, String disbursed_To__c, String old_Processing_Fee__c,
			String cLI_Deviation_Status__c, String cLI_Deviation_Flag__c, String cLI_Deviation_Reason__c,
			String file_Tracking_Status__c, String file_Tracking_Remark__c, String invoice_number_2__c,
			String split_Sanction_Letter__c, String top_up_Loan_Amount__c, String bT_Loan_Amount__c,
			String cLI_Deviation_Count__c, String pDC_Mandate_Done__c, String current_Owner_Pincode__c,
			String imd_Cheque_Amount__c, String imd_Cheque_Date__c, String imd_Cheque_Number__c, String imd_City__c,
			String imd_Deposit_Slip_Number__c, String imd_Drawn_On__c, String imd_Receipt_Date__c,
			String imd_Total_Amount__c, String imd_Mode_Of_Payment__c, String imd_Receipt_Number__c,
			String imd_Status__c, String imd_In_Favour_OF__c, String flat_Rate__c, String max_Flat_Rate__c,
			String min_Accounting_IRR__c, String max_Accounting_IRR__c, String min_Financial_IRR__c,
			String max_Financial_IRR__c, String valuation_price__c, String valuation_date__c,
			String old_opportunity_id__c, String rTO_Code__c, String partner_Name__c, String existing_Application__c,
			String first_Emi_Amount__c, String invoice_Date__c, String hmr_Km__c, String business_Stability__c,
			String annual_Liabilities__c, String implement_Category__c, String total_Loan_Amount__c,
			String aSM_Dedupe_RePunch_Status__c, String is_Passbook_Required__c, AttributesBean attributes) {
		super();
		Id = id;
		HMSI_app__c = hMSI_app__c;
		NRI_Flag__c = nRI_Flag__c;
		Bureau_Error__c = bureau_Error__c;
		FUNDINGELIGIBILITY__c = fUNDINGELIGIBILITY__c;
		IMPLEMENTFUNDINGELIGIBILITY__c = iMPLEMENTFUNDINGELIGIBILITY__c;
		Implement_Loan_Amount__c = implement_Loan_Amount__c;
		TRACTORLTV__c = tRACTORLTV__c;
		IMPLEMENTLTV__c = iMPLEMENTLTV__c;
		LTVASSETCOSTIMPLEMENT__c = lTVASSETCOSTIMPLEMENT__c;
		LTVDLPIMPLEMENT__c = lTVDLPIMPLEMENT__c;
		LTVMAXIMPLEMENT__c = lTVMAXIMPLEMENT__c;
		Disbursed_To__c = disbursed_To__c;
		Old_Processing_Fee__c = old_Processing_Fee__c;
		CLI_Deviation_Status__c = cLI_Deviation_Status__c;
		CLI_Deviation_Flag__c = cLI_Deviation_Flag__c;
		CLI_Deviation_Reason__c = cLI_Deviation_Reason__c;
		File_Tracking_Status__c = file_Tracking_Status__c;
		File_Tracking_Remark__c = file_Tracking_Remark__c;
		Invoice_number_2__c = invoice_number_2__c;
		Split_Sanction_Letter__c = split_Sanction_Letter__c;
		Top_up_Loan_Amount__c = top_up_Loan_Amount__c;
		BT_Loan_Amount__c = bT_Loan_Amount__c;
		CLI_Deviation_Count__c = cLI_Deviation_Count__c;
		PDC_Mandate_Done__c = pDC_Mandate_Done__c;
		Current_Owner_Pincode__c = current_Owner_Pincode__c;
		Imd_Cheque_Amount__c = imd_Cheque_Amount__c;
		Imd_Cheque_Date__c = imd_Cheque_Date__c;
		Imd_Cheque_Number__c = imd_Cheque_Number__c;
		Imd_City__c = imd_City__c;
		Imd_Deposit_Slip_Number__c = imd_Deposit_Slip_Number__c;
		Imd_Drawn_On__c = imd_Drawn_On__c;
		Imd_Receipt_Date__c = imd_Receipt_Date__c;
		Imd_Total_Amount__c = imd_Total_Amount__c;
		Imd_Mode_Of_Payment__c = imd_Mode_Of_Payment__c;
		Imd_Receipt_Number__c = imd_Receipt_Number__c;
		Imd_Status__c = imd_Status__c;
		Imd_In_Favour_OF__c = imd_In_Favour_OF__c;
		Flat_Rate__c = flat_Rate__c;
		Max_Flat_Rate__c = max_Flat_Rate__c;
		Min_Accounting_IRR__c = min_Accounting_IRR__c;
		Max_Accounting_IRR__c = max_Accounting_IRR__c;
		Min_Financial_IRR__c = min_Financial_IRR__c;
		Max_Financial_IRR__c = max_Financial_IRR__c;
		this.valuation_price__c = valuation_price__c;
		this.valuation_date__c = valuation_date__c;
		this.old_opportunity_id__c = old_opportunity_id__c;
		RTO_Code__c = rTO_Code__c;
		Partner_Name__c = partner_Name__c;
		Existing_Application__c = existing_Application__c;
		First_Emi_Amount__c = first_Emi_Amount__c;
		Invoice_Date__c = invoice_Date__c;
		Hmr_Km__c = hmr_Km__c;
		Business_Stability__c = business_Stability__c;
		Annual_Liabilities__c = annual_Liabilities__c;
		Implement_Category__c = implement_Category__c;
		Total_Loan_Amount__c = total_Loan_Amount__c;
		ASM_Dedupe_RePunch_Status__c = aSM_Dedupe_RePunch_Status__c;
		this.is_Passbook_Required__c = is_Passbook_Required__c;
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "Extended_Application__r_Bean [Id=" + Id + ", HMSI_app__c=" + HMSI_app__c + ", NRI_Flag__c="
				+ NRI_Flag__c + ", Bureau_Error__c=" + Bureau_Error__c + ", FUNDINGELIGIBILITY__c="
				+ FUNDINGELIGIBILITY__c + ", IMPLEMENTFUNDINGELIGIBILITY__c=" + IMPLEMENTFUNDINGELIGIBILITY__c
				+ ", Implement_Loan_Amount__c=" + Implement_Loan_Amount__c + ", TRACTORLTV__c=" + TRACTORLTV__c
				+ ", IMPLEMENTLTV__c=" + IMPLEMENTLTV__c + ", LTVASSETCOSTIMPLEMENT__c=" + LTVASSETCOSTIMPLEMENT__c
				+ ", LTVDLPIMPLEMENT__c=" + LTVDLPIMPLEMENT__c + ", LTVMAXIMPLEMENT__c=" + LTVMAXIMPLEMENT__c
				+ ", Disbursed_To__c=" + Disbursed_To__c + ", Old_Processing_Fee__c=" + Old_Processing_Fee__c
				+ ", CLI_Deviation_Status__c=" + CLI_Deviation_Status__c + ", CLI_Deviation_Flag__c="
				+ CLI_Deviation_Flag__c + ", CLI_Deviation_Reason__c=" + CLI_Deviation_Reason__c
				+ ", File_Tracking_Status__c=" + File_Tracking_Status__c + ", File_Tracking_Remark__c="
				+ File_Tracking_Remark__c + ", Invoice_number_2__c=" + Invoice_number_2__c
				+ ", Split_Sanction_Letter__c=" + Split_Sanction_Letter__c + ", Top_up_Loan_Amount__c="
				+ Top_up_Loan_Amount__c + ", BT_Loan_Amount__c=" + BT_Loan_Amount__c + ", CLI_Deviation_Count__c="
				+ CLI_Deviation_Count__c + ", PDC_Mandate_Done__c=" + PDC_Mandate_Done__c
				+ ", Current_Owner_Pincode__c=" + Current_Owner_Pincode__c + ", Imd_Cheque_Amount__c="
				+ Imd_Cheque_Amount__c + ", Imd_Cheque_Date__c=" + Imd_Cheque_Date__c + ", Imd_Cheque_Number__c="
				+ Imd_Cheque_Number__c + ", Imd_City__c=" + Imd_City__c + ", Imd_Deposit_Slip_Number__c="
				+ Imd_Deposit_Slip_Number__c + ", Imd_Drawn_On__c=" + Imd_Drawn_On__c + ", Imd_Receipt_Date__c="
				+ Imd_Receipt_Date__c + ", Imd_Total_Amount__c=" + Imd_Total_Amount__c + ", Imd_Mode_Of_Payment__c="
				+ Imd_Mode_Of_Payment__c + ", Imd_Receipt_Number__c=" + Imd_Receipt_Number__c + ", Imd_Status__c="
				+ Imd_Status__c + ", Imd_In_Favour_OF__c=" + Imd_In_Favour_OF__c + ", Flat_Rate__c=" + Flat_Rate__c
				+ ", Max_Flat_Rate__c=" + Max_Flat_Rate__c + ", Min_Accounting_IRR__c=" + Min_Accounting_IRR__c
				+ ", Max_Accounting_IRR__c=" + Max_Accounting_IRR__c + ", Min_Financial_IRR__c=" + Min_Financial_IRR__c
				+ ", Max_Financial_IRR__c=" + Max_Financial_IRR__c + ", valuation_price__c=" + valuation_price__c
				+ ", valuation_date__c=" + valuation_date__c + ", old_opportunity_id__c=" + old_opportunity_id__c
				+ ", RTO_Code__c=" + RTO_Code__c + ", Partner_Name__c=" + Partner_Name__c + ", Existing_Application__c="
				+ Existing_Application__c + ", First_Emi_Amount__c=" + First_Emi_Amount__c + ", Invoice_Date__c="
				+ Invoice_Date__c + ", Hmr_Km__c=" + Hmr_Km__c + ", Business_Stability__c=" + Business_Stability__c
				+ ", Annual_Liabilities__c=" + Annual_Liabilities__c + ", Implement_Category__c="
				+ Implement_Category__c + ", Total_Loan_Amount__c=" + Total_Loan_Amount__c
				+ ", ASM_Dedupe_RePunch_Status__c=" + ASM_Dedupe_RePunch_Status__c + ", is_Passbook_Required__c="
				+ is_Passbook_Required__c + ", attributes=" + attributes + "]";
	}
}
