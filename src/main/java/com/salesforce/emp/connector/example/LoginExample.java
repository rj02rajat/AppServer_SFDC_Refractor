/*
 * Copyright (c) 2016, salesforce.com, inc.
 * All rights reserved.
 * Licensed under the BSD 3-Clause license.
 * For full license text, see LICENSE.TXT file in the repo root  or https://opensource.org/licenses/BSD-3-Clause
 */
package com.salesforce.emp.connector.example;

import static com.salesforce.emp.connector.LoginHelper.login;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.eclipse.jetty.util.ajax.JSON;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.google.gson.Gson;
import com.ltfs.bean.Accounts;
import com.ltfs.bean.JMSResponseBean;
import com.salesforce.emp.connector.BayeuxParameters;
import com.salesforce.emp.connector.EmpConnector;
import com.salesforce.emp.connector.TopicSubscription;

/**
 * An example of using the EMP connector using login credentials
 *
 * @author hal.hildebrand
 * @since API v37.0
 */
public class LoginExample {

	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();

		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
	}

	public static void main(String[] argv) throws Exception {
		System.out.println("Let's Start...........");
		if (argv.length < 3 || argv.length > 4) {
			System.err.println("Usage: LoginExample username password topic [replayFrom]");
			System.exit(1);
		}
		long replayFrom = EmpConnector.REPLAY_FROM_EARLIEST;
		if (argv.length == 4) {
			replayFrom = Long.parseLong(argv[3]);
		}

		BearerTokenProvider tokenProvider = new BearerTokenProvider(() -> {
			try {
				return login(argv[0], argv[1]);
			} catch (Exception e) {
				e.printStackTrace(System.err);
				System.exit(1);
				throw new RuntimeException(e);
			}
		});
		BayeuxParameters params = tokenProvider.login();
		//Consumer<Map<String, Object>> consumer = event -> System.out.println(String.format("Received:\n%s", JSON.toString(event)));
		//Consumer<Map<String, Object>> consumer = event -> {String response = String.format("\n%s", JSON.toString(event)).replace("\"[", "[").replace("]\"", "]");
		/*Consumer<Map<String, Object>> consumer = event -> {
			String response = String.format("\n%s", JSON.toString(event)).replace("\"[", "[").replace("]\"", "]")
					.replace("\\", "").trim();*/
			//String response = "{\"schema\":\"Rajat\",\"payload\":{\"Parties__c\":null,\"CreatedById\":\"Jain\",\"Document__c\":[{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c__Modi/a3c0T00000003afQAA\"},\"Id\":\"a3c0T00000003afQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":CCCCCCCCCCC},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003agQAA\"},\"Id\":\"a3c0T00000003agQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003ahQAA\"},\"Id\":\"a3c0T00000003ahQAA\",\"genesis__Required__c\":true,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003aiQAA\"},\"Id\":\"a3c0T00000003aiQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003ajQAA\"},\"Id\":\"a3c0T00000003ajQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003akQAA\"},\"Id\":\"a3c0T00000003akQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003alQAA\"},\"Id\":\"a3c0T00000003alQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003amQAA\"},\"Id\":\"a3c0T00000003amQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003anQAA\"},\"Id\":\"a3c0T00000003anQAA\",\"genesis__Required__c\":true,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003aoQAA\"},\"Id\":\"a3c0T00000003aoQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":true,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003apQAA\"},\"Id\":\"a3c0T00000003apQAA\",\"genesis__Required__c\":true,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003aqQAA\"},\"Id\":\"a3c0T00000003aqQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003arQAA\"},\"Id\":\"a3c0T00000003arQAA\",\"genesis__Required__c\":true,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003asQAA\"},\"Id\":\"a3c0T00000003asQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003atQAA\"},\"Id\":\"a3c0T00000003atQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003auQAA\"},\"Id\":\"a3c0T00000003auQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003avQAA\"},\"Id\":\"a3c0T00000003avQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003awQAA\"},\"Id\":\"a3c0T00000003awQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003axQAA\"},\"Id\":\"a3c0T00000003axQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003ayQAA\"},\"Id\":\"a3c0T00000003ayQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003azQAA\"},\"Id\":\"a3c0T00000003azQAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b0QAA\"},\"Id\":\"a3c0T00000003b0QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b1QAA\"},\"Id\":\"a3c0T00000003b1QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b2QAA\"},\"Id\":\"a3c0T00000003b2QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b3QAA\"},\"Id\":\"a3c0T00000003b3QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b4QAA\"},\"Id\":\"a3c0T00000003b4QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b5QAA\"},\"Id\":\"a3c0T00000003b5QAA\",\"genesis__Required__c\":false,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false},{\"attributes\":{\"type\":\"genesis__Application_Document_Category__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Application_Document_Category__c/a3c0T00000003b6QAA\"},\"Id\":\"a3c0T00000003b6QAA\",\"genesis__Required__c\":true,\"Is_Multiple__c\":false,\"Is_Uploaded__c\":false}],\"CreatedDate\":\"2020-01-08T10:02:48.752Z\",\"Applicant__c\":[{\"attributes\":{\"type\":\"Account\",\"url\":\"/services/data/v48.0/sobjects/Account/0010T000003mJ6RQAU\"},\"Aadhaar_Number__c\":\"10031597\",\"LastName\":\"Shivajitest\",\"Total_No_Of_Partners__c\":0,\"Applicant_Reference_Id__c\":\"ARN261119025549092\",\"Is_guarantor__c\":false,\"Perfios_Report_Recieved__c\":false,\"Id\":\"0010T000003mJ6RQAU\",\"NID_Flag__c\":false,\"Perfios_Salary_Zero__c\":false,\"Gender__c\":\"Male\",\"Is_L_T_Employee__c\":false,\"Constitution__c\":\"Individual Salaried\",\"ITR_Done__c\":false,\"ESign_Complete__c\":false,\"PAN_ID__c\":\"BTXPS3301K\",\"Occupation__c\":\"Salaried\",\"ITR_Received__c\":false,\"KYC_FLAG__c\":\"M\",\"Fuzzy_logic__c\":\"Pass\",\"RecordTypeId\":\"0127F000000DgdvQAC\"},{\"attributes\":{\"type\":\"Account\",\"url\":\"/services/data/v48.0/sobjects/Account/0010T000003mJ6SQAU\"},\"Aadhaar_Number__c\":\"10060728\",\"LastName\":\"Rastogi\",\"Total_No_Of_Partners__c\":0,\"Applicant_Reference_Id__c\":\"ARN261119025754037\",\"Is_guarantor__c\":false,\"Perfios_Report_Recieved__c\":false,\"Id\":\"0010T000003mJ6SQAU\",\"NID_Flag__c\":false,\"Perfios_Salary_Zero__c\":false,\"Gender__c\":\"Male\",\"Is_L_T_Employee__c\":false,\"Constitution__c\":\"Individual Self-Employed\",\"ITR_Done__c\":false,\"ESign_Complete__c\":false,\"PAN_ID__c\":\"BNUPS4602Q\",\"Occupation__c\":\"Self Employed\",\"ITR_Received__c\":false,\"KYC_FLAG__c\":\"M\",\"Fuzzy_logic__c\":\"Pass\",\"Relationship__c\":\"Brother\",\"RecordTypeId\":\"0127F000000DgdvQAC\"}],\"Application__c\":[{\"attributes\":{\"type\":\"genesis__Applications__c\",\"url\":\"/services/data/v48.0/sobjects/genesis__Applications__c/a3m0T0000008PDUQA2\"},\"isOnline__c\":false,\"genesis__Status__c\":\"NEW - ENTERED\",\"Property_identified__c\":false,\"BRE_MFI_TYPEOFLOAN__c\":\"JLG\",\"Base_Price_per_sq_m__c\":0.00,\"Due_Date_of_Commencement_of_EMI__c\":\"7th of Every Month\",\"Sanction_on_Hold__c\":false,\"Upfront_Processing_Fee_Payment__c\":false,\"Carpet_Area_sq_m__c\":0,\"RCU_Triggered__c\":false,\"Loan_Type__c\":\"Home Loan\",\"Physical_Esign__c\":false,\"Advance_Emi__c\":0,\"FLS_Agent__c\":\"HLUSER2\",\"Credit_Check__c\":\"Not Required\",\"Applied_Loan_Amount__c\":4000000.00,\"Top_up_Calculated__c\":false,\"Id\":\"a3m0T0000008PDUQA2\",\"MFI_CLI_New_Grid__c\":false,\"NID_Flag__c\":false,\"Ops_Approved__c\":false,\"Product_Category__c\":\"Home Loan\",\"Margin_Money__c\":-4000000.00,\"Is_No_Hypo_Loan__c\":false,\"BRE_MFI_Min_Slider__c\":0.00,\"Application_Id__c\":\"HUSER2611190254100\",\"Loan_Amount_In_Word__c\":\"Forty Lakh Rupees Only\",\"Fi_Response_Received__c\":false,\"E_Sign_Complete__c\":false,\"genesis__CL_Product__c\":\"a0a7F000001m3IpQAI\",\"genesis__Loan_Amount__c\":4000000.00,\"Is_Non_APF__c\":false,\"Max_EMI_Amount__c\":0.00,\"genesis__Account__c\":\"0010T000003mJ6RQAU\",\"Asset_Cost__c\":0.00,\"PDC_Deviation_FLAG__c\":false,\"Send_To_Ops_Portal__c\":false,\"Sub_Stage__c\":\"Bureau Check\",\"Is_SENP__c\":true,\"Promotions_HL__c\":\"a6V7F000000fxgfUAA\",\"Swimlane_B_Required__c\":false,\"Application_Stage__c\":\"Login\",\"genesis__Term__c\":12,\"BRE_MFI_MAX_Slider__c\":0.00,\"Extended_Application__c\":\"a6g0T000000005BQAQ\",\"Application_TAT__c\":4075,\"genesis__Interest_Rate__c\":12.0000,\"Dealer__c\":\"a5F7F000000L6UHUA0\",\"RecordTypeId\":\"0127F000000VIcVQAW\"}]},\"event\":{\"replayId\":11}}";
			String response = "{\"statusCode\":200,\"status\":\"SUCCESS\",\"errorMessage\":null,\"errorCode\":\"NO_ERROR\",\"RejectReason\":null,\"nextActions\":\"Bureau\",\"Is_RSA_EligibleApp\":false,\"Is_CII_App\":true,\"extendedApplication\":{\"attributes\":{\"type\":\"Extended_Application__c\",\"url\":\"/services/data/v40.0/sobjects/Extended_Application__c/a6g0T000000008ZQAQ\"},\"Id\":\"a6g0T000000008ZQAQ\",\"Name\":\"T175390912191048356660016\",\"Is_Loan_Amt_Changed__c\":false,\"Imd_Applicable__c\":false,\"Dealer_Subvention_Flag__c\":false,\"BPI_FLag__c\":true,\"MTRP_Loan__c\":false},\"esignDocuments\":null,\"Errors\":null,\"documents\":[{\"opsHoldReasons\":\"\",\"name\":\"BankStatement(12months)\",\"LOS_Stage\":\"IncomeDocsNID\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":false,\"isMultiple\":false,\"isMandatory\":true,\"isAdditional\":null,\"docId\":\"a3c0T00000005vfQAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"PDC\",\"LOS_Stage\":\"DocumentUpload\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":true,\"isMultiple\":false,\"isMandatory\":false,\"isAdditional\":null,\"docId\":\"a3c0T00000005vjQAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"PhysicalMandate\",\"LOS_Stage\":\"DocumentUpload\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":true,\"isMultiple\":false,\"isMandatory\":true,\"isAdditional\":null,\"docId\":\"a3c0T00000005vlQAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"OCR\",\"LOS_Stage\":\"DocumentUpload\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":false,\"isMultiple\":false,\"isMandatory\":true,\"isAdditional\":null,\"docId\":\"a3c0T00000005vnQAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"NOC(Developer_Society_RelevantAuthority)\",\"LOS_Stage\":\"DocumentUpload\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":false,\"isMultiple\":false,\"isMandatory\":true,\"isAdditional\":null,\"docId\":\"a3c0T00000005vpQAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"PANCARD\",\"LOS_Stage\":\"DocumentUpload\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":true,\"isMultiple\":false,\"isMandatory\":false,\"isAdditional\":null,\"docId\":\"a3c0T00000005w3QAA\",\"applicantName\":null,\"applicantId\":null},{\"opsHoldReasons\":\"\",\"name\":\"BankPassbook\",\"LOS_Stage\":\"IncomeDocsNID\",\"isUploaded\":false,\"isTechDoc\":null,\"isOptional\":false,\"isMultiple\":false,\"isMandatory\":true,\"isAdditional\":null,\"docId\":\"a3c0T00000005w4QAA\",\"applicantName\":null,\"applicantId\":null}],\"DerivedRejectReason\":null,\"deDupeStatus\":null,\"Builderbanks\":null,\"breTWSCResponse\":null,\"breTWBCResponse\":null,\"breResult\":\"\",\"breMFIResponse\":null,\"breHLResponse\":null,\"breFARMResponse\":null,\"application\":{\"attributes\":{\"type\":\"genesis__Applications__c\",\"url\":\"/services/data/v40.0/sobjects/genesis__Applications__c/a3m0T0000008PtLQAU\"},\"Id\":\"a3m0T0000008PtLQAU\",\"Product_Category__c\":\"HomeLoan\",\"Upfront_Processing_Fee_Payment__c\":false,\"genesis__Account__c\":\"0010T000004B4CpQAK\",\"Top_up_Calculated__c\":false,\"Sanction_on_Hold__c\":false,\"Is_SENP__c\":true,\"isOnline__c\":false,\"Is_Non_APF__c\":false,\"MFI_CLI_New_Grid__c\":false,\"PDC_Deviation_FLAG__c\":false,\"Margin_Money__c\":-4000000.0,\"FLS_Agent__c\":\"HLUSER2\",\"BRE_MFI_TYPEOFLOAN__c\":\"JLG\",\"location__Longitude__s\":0.0,\"location__Latitude__s\":0.0,\"genesis__Loan_Amount__c\":4000000.0,\"genesis__Interest_Rate__c\":12.0,\"Application_Id__c\":\"T175390912191048356660016\",\"genesis__CL_Product__c\":\"a0a7F000001m3IpQAI\",\"genesis__Term__c\":12,\"Asset_Cost__c\":0.0,\"Base_Price_per_sq_m__c\":0.0,\"Super_Built_up_Area_sq_m__c\":0.0,\"Property_identified__c\":false,\"genesis__Status__c\":\"NEW-ENTERED\",\"Application_Stage__c\":\"Login\",\"Application_TAT__c\":4075,\"Loan_Type__c\":\"HomeLoan\",\"Applied_Loan_Amount__c\":4000000.0,\"Sub_Stage__c\":\"BureauCheck\",\"NID_Flag__c\":false,\"Fi_Response_Received__c\":false,\"FARM_LTV__c\":0.0,\"E_Sign_Complete__c\":false,\"Extended_Application__c\":\"a6g0T000000008ZQAQ\",\"No_of_Advance_Installments__c\":0,\"Credit_Check__c\":\"NotRequired\",\"Physical_Esign__c\":false,\"Swimlane_B_Required__c\":false,\"RCU_Triggered__c\":false,\"BRE_MFI_MAX_Slider__c\":0.0,\"BRE_MFI_Min_Slider__c\":0.0,\"BRE_Subsidy_Flag__c\":false,\"Carpet_Area_sq_m__c\":0,\"Dealer__c\":\"a5F7F000000L6UHUA0\",\"Pre_Approved_Loan__c\":\"a7c0T000000005zQAA\",\"Loan_Amount_In_Word__c\":\"FortyLakhRupeesOnly\",\"Send_To_Ops_Portal__c\":false,\"Ops_Approved__c\":false,\"Due_Date_of_Commencement_of_EMI__c\":\"7thofEveryMonth\",\"Max_EMI_Amount__c\":0.0,\"Advance_Emi__c\":0,\"Is_No_Hypo_Loan__c\":false,\"Name\":\"APP-0001096330\",\"CreatedDate\":\"2020-01-18T14:54:55.000+0000\",\"LastModifiedDate\":\"2020-01-18T14:54:56.000+0000\",\"genesis__Account__r\":{\"attributes\":{\"type\":\"Account\",\"url\":\"/services/data/v40.0/sobjects/Account/0010T000004B4CpQAK\"},\"Id\":\"0010T000004B4CpQAK\",\"PersonEmail\":\"hussain_dudekula@persistent.com\",\"Salutation\":\"Mr.\",\"Name\":\"PriyankaShivajitest\"},\"genesis__CL_Product__r\":{\"attributes\":{\"type\":\"clcommon__CL_Product__c\",\"url\":\"/services/data/v40.0/sobjects/clcommon__CL_Product__c/a0a7F000001m3IpQAI\"},\"Id\":\"a0a7F000001m3IpQAI\",\"Name\":\"PRO-00000006\",\"ProductUniqueId__c\":\"HOME_HL\"},\"Extended_Application__r\":{\"attributes\":{\"type\":\"Extended_Application__c\",\"url\":\"/services/data/v40.0/sobjects/Extended_Application__c/a6g0T000000008ZQAQ\"},\"Id\":\"a6g0T000000008ZQAQ\",\"NRI_Flag__c\":false,\"is_Passbook_Required__c\":false,\"CII_Application__c\":false,\"HMSI_app__c\":false,\"Split_Sanction_Letter__c\":false,\"Is_Loan_Amt_Changed__c\":false,\"Imd_Applicable__c\":false,\"Dealer_Subvention_Flag__c\":false,\"MTRP_Loan__c\":false,\"Name\":\"T175390912191048356660016\",\"BPI_FLag__c\":true,\"CLI_Deviation_Flag__c\":false,\"is_RSA_App__c\":false},\"Pre_Approved_Loan__r\":{\"attributes\":{\"type\":\"Pre_Approved_Loan__c\",\"url\":\"/services/data/v40.0/sobjects/Pre_Approved_Loan__c/a7c0T000000005zQAA\"},\"Id\":\"a7c0T000000005zQAA\",\"No_Under_Writing__c\":false},\"Dealer__r\":{\"attributes\":{\"type\":\"DST_DSA_DME_FLS_Master__c\",\"url\":\"/services/data/v40.0/sobjects/DST_DSA_DME_FLS_Master__c/a5F7F000000L6UHUA0\"},\"Id\":\"a5F7F000000L6UHUA0\"},\"FI_Status__c\":null},\"applicants\":null,\"Accounts\":[{\"attributes\":{\"type\":\"Account\",\"url\":\"/services/data/v40.0/sobjects/Account/0010T000004B4CpQAK\"},\"Id\":\"0010T000004B4CpQAK\",\"Is_guarantor__c\":false,\"ITR_Done__c\":false,\"Is_L_T_Employee__c\":false,\"Total_No_Of_Partners__c\":0,\"ITR_Received__c\":false,\"Perfios_Report_Recieved__c\":false,\"FirstName\":\"Priyanka\",\"NID_Flag__c\":false,\"Constitution__c\":\"IndividualSalaried\",\"Gender__c\":\"Male\",\"LastName\":\"Shivajitest\",\"PersonBirthdate\":\"1986-11-26\",\"PersonEmail\":\"hussain_dudekula@persistent.com\",\"PersonMobilePhone\":\"9775585552\",\"Occupation__c\":\"Salaried\",\"Perfios_Salary_Zero__c\":false,\"Fuzzy_logic__c\":\"Pass\",\"Applicant_Reference_Id__c\":\"ARN261119025549092\",\"ESign_Complete__c\":false,\"Phone\":\"7799056280\",\"Aadhaar_Number__c\":\"10031597\",\"Father_Husband_Name__c\":\"dgdd\",\"PAN_ID__c\":\"BTXPS3301K\",\"KYC_FLAG__c\":\"M\",\"Address__r\":{\"totalSize\":2,\"done\":true,\"records\":[{\"attributes\":{\"type\":\"Address__c\",\"url\":\"/services/data/v40.0/sobjects/Address__c/a590T0000008OfOQAU\"},\"\":\"0010T000004B4CpQAK\",\"Id\":\"a590T0000008OfOQAU\",\"Address_Line1__c\":\"Fyfyfufhcgchhc\",\"Address_Line2__c\":\"Xggxxg\",\"City__c\":\"Mumbai\",\"Pin_Code__c\":\"400080\",\"StApplicant__cate__c\":\"Maharashtra\",\"Address_Type__c\":\"Permanent\"},{\"attributes\":{\"type\":\"Address__c\",\"url\":\"/services/data/v40.0/sobjects/Address__c/a590T0000008OfPQAU\"},\"Applicant__c\":\"0010T000004B4CpQAK\",\"Id\":\"a590T0000008OfPQAU\",\"Address_Line1__c\":\"Fyfyfufhcgchhc\",\"Address_Line2__c\":\"Xggxxg\",\"City__c\":\"Mumbai\",\"Pin_Code__c\":\"400080\",\"State__c\":\"Maharashtra\",\"Address_Type__c\":\"Current\"}]},\"genesis__Parties__r\":{\"totalSize\":1,\"done\":true,\"records\":[{\"attributes\":{\"type\":\"genesis__Application_Parties__c\",\"url\":\"/services/data/v40.0/sobjects/genesis__Application_Parties__c/a3f0T0000008PKlQAM\"},\"genesis__Party_Account_Name__c\":\"0010T000004B4CpQAK\",\"Id\":\"a3f0T0000008PKlQAM\",\"Applicant_Type__c\":\"Financial\",\"genesis__Party_Type__c\":\"PrimaryApplicant\",\"LPC__c\":false}]}},{\"attributes\":{\"type\":\"Account\",\"url\":\"/services/data/v40.0/sobjects/Account/0010T000004B4CqQAK\"},\"Id\":\"0010T000004B4CqQAK\",\"Is_guarantor__c\":false,\"ITR_Done__c\":false,\"Is_L_T_Employee__c\":false,\"Total_No_Of_Partners__c\":0,\"ITR_Received__c\":false,\"Perfios_Report_Recieved__c\":false,\"FirstName\":\"Sachin\",\"NID_Flag__c\":false,\"Constitution__c\":\"IndividualSelf-Employed\",\"Gender__c\":\"Male\",\"LastName\":\"Rastogi\",\"PersonBirthdate\":\"1983-11-26\",\"PersonEmail\":\"gsgsh@gmail.com\",\"PersonMobilePhone\":\"9767645488\",\"Occupation__c\":\"SelfEmployed\",\"Relationship__c\":\"Brother\",\"Perfios_Salary_Zero__c\":false,\"Fuzzy_logic__c\":\"Pass\",\"Applicant_Reference_Id__c\":\"ARN261119025754037\",\"ESign_Complete__c\":false,\"Aadhaar_Number__c\":\"10060728\",\"Father_Husband_Name__c\":\"hdhdhdh\",\"PAN_ID__c\":\"BNUPS4602Q\",\"KYC_FLAG__c\":\"M\",\"Address__r\":{\"totalSize\":2,\"done\":true,\"records\":[{\"attributes\":{\"type\":\"Address__c\",\"url\":\"/services/data/v40.0/sobjects/Address__c/a590T0000008OfQQAU\"},\"Applicant__c\":\"0010T000004B4CqQAK\",\"Id\":\"a590T0000008OfQQAU\",\"Address_Line1__c\":\"Mahaoe\",\"Address_Line2__c\":\"Mahsh\",\"City__c\":\"Mumbai\",\"Pin_Code__c\":\"400080\",\"State__c\":\"Maharashtra\",\"Address_Type__c\":\"Permanent\"},{\"attributes\":{\"type\":\"Address__c\",\"url\":\"/services/data/v40.0/sobjects/Address__c/a590T0000008OfRQAU\"},\"Applicant__c\":\"0010T000004B4CqQAK\",\"Id\":\"a590T0000008OfRQAU\",\"Address_Line1__c\":\"Mahaoe\",\"Address_Line2__c\":\"Mahsh\",\"City__c\":\"Mumbai\",\"Pin_Code__c\":\"400080\",\"State__c\":\"Maharashtra\",\"Address_Type__c\":\"Current\"}]},\"genesis__Parties__r\":{\"totalSize\":1,\"done\":true,\"records\":[{\"attributes\":{\"type\":\"genesis__Application_Parties__c\",\"url\":\"/services/data/v40.0/sobjects/genesis__Application_Parties__c/a3f0T0000008PKmQAM\"},\"genesis__Party_Account_Name__c\":\"0010T000004B4CqQAK\",\"Id\":\"a3f0T0000008PKmQAM\",\"Applicant_Type__c\":\"Financial\",\"genesis__Party_Type__c\":\"CO-APPLICANT\",\"LPC__c\":false}]}}]}";
			System.out.println("Response Before Response --> " + response);
			Transaction transaction = null;
			try 
			{
				System.out.println("Before............");
				sessionObj = buildSessionFactory().openSession();
				JMSResponseBean jmsResponseBean = null;
				String applicationId = null, accountsId = null;
				Long JmsSrNo = null, extendedApplicationSrNo = null, applicationSrNo = null;
				Gson gson = new Gson();
				jmsResponseBean = gson.fromJson(response, JMSResponseBean.class);
				applicationId = jmsResponseBean.getApplication().getId();
				System.out.println("applicationId --> " + applicationId);
				if (null != applicationId)
				{
					jmsResponseBean.setId(applicationId);
					List<Accounts> accountsBean = jmsResponseBean.getAccounts();
					for (Accounts accounts : accountsBean) 
					{
						accountsId = accounts.getId();
						accounts.getAddress__r().setId(accountsId);
						accounts.getGenesis__Parties__r().setId(accountsId);
					}
					Criteria criteria = null;
					Criterion criterion = null;
					List<JMSResponseBean> listDetails = null;
					System.out.println("jmsResponseBean --> " + jmsResponseBean.toString());
					criteria = sessionObj.createCriteria(JMSResponseBean.class);
					criterion = Restrictions.eq("Id", applicationId);
					criteria.add(criterion).uniqueResult();
					listDetails = criteria.list();
					System.out.println("listDetails.isEmpty() --> " + listDetails.isEmpty() + " , Size --> " + listDetails.size());
					if (null != listDetails && !listDetails.isEmpty())
					{
						System.out.println(" [Inside If Condition] ");
						for (JMSResponseBean jmBean : listDetails) 
						{
							JmsSrNo = jmBean.getSrNo();
							System.out.println("JmsSrNo --> " + JmsSrNo);
							extendedApplicationSrNo = jmBean.getExtendedApplication().getSrNo();
							System.out.println("extendedApplicationSrNo --> " + extendedApplicationSrNo);
							applicationSrNo = jmBean.getApplication().getSrNo();
							System.out.println("applicationSrNo --> " + applicationSrNo);
							break;
						}
						jmsResponseBean.setSrNo(JmsSrNo);
						jmsResponseBean.getExtendedApplication().setSrNo(extendedApplicationSrNo);
						jmsResponseBean.getApplication().setSrNo(applicationSrNo);
						transaction = sessionObj.beginTransaction();
						sessionObj.merge(jmsResponseBean);
						transaction.commit();
						System.out.println("**************  update Successfully  **************");
					}
					else
					{
						System.out.println(" [Inside else Condition] ");
						transaction = sessionObj.beginTransaction();
						sessionObj.save(jmsResponseBean);
						transaction.commit();
						System.out.println("**************  Insert Successfully  **************");
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error Message --> " + e.getMessage());
				System.out.println("Error Cause --> " + e.getCause());
				if (null != transaction || transaction.isActive())
					transaction.rollback();
			} finally {
				if (sessionObj != null || sessionObj.isOpen())
					sessionObj.close();
			}
		/*};
		EmpConnector connector = new EmpConnector(params);
		connector.setBearerTokenProvider(tokenProvider);
		connector.start().get(5, TimeUnit.SECONDS);
		TopicSubscription subscription = connector.subscribe(argv[2], replayFrom, consumer).get(5, TimeUnit.SECONDS);
		System.out.println(String.format("Subscribed: %s", subscription));*/
	}
}
