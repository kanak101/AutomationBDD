package pageObject_OR;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

import javax.swing.JOptionPane;

import static org.junit.Assert.*;

import org.apache.commons.codec.language.bm.Languages.SomeLanguages;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import junit.framework.Assert;
import utilities.AlertPopupHandle;
import utilities.Log;
import utilities.TestBase;
import utilities.WindowsHandle;
import utilities.GetandSentValue;

public class Solicitation extends TestBase {
	WindowsHandle windowHandle;
	AlertPopupHandle alertPopupHandle;
	WorkloadManager workloadmanager;
	GetandSentValue getandSentValue;
	public static String PRANumber;

	public Solicitation() {
		super();

	}

	/*******************************************************************************************************************************************************
	 * OBJECT REPO For Contract File page
	 *
	 *****************************************************************************************************************************************************/

	By Transaction = By.xpath("//*[@id='wfx-transactions']");
	By Transaction_Link = By.xpath("//*[@id='z2EVjZT_menu']//*[@name='linkTransaction']");
	By Acquisitions = By.xpath("//*[@id='wfx-transactions-subnav']//span[contains(text(), 'Acquisitions')]");
	By New = By.xpath("//*[@id='wfx-transactions-subnav']/li[4]/ul/li/button//*[contains(text(),'New')]");
	By Solicitation = By.xpath("//*[@id='wfx-transactions-subnav']/li[4]/ul/li[1]//*[contains(text(),'Solicitation')]");
	By Contract_File_Create_Button_Drop_Down_Solicitation_Link = By
			.xpath("//*[@id='z2EVjZT_menu']//*[contains(text(),'Solicitation')]");
	By Contract_File = By.xpath("//*[@id='wfx-transactions-subnav']//*[contains(text(),'Contract File')]");
	By Identifier_Field = By.xpath("//*[@id='y1qvayR'][@title='Identifier']");
	By Search_Button = By.xpath("//*[@name='searchButton'][@id='y9aoCN']");
	By Ownder_ID_Field = By.xpath("//*[@id='z1EeeEw']");
	By Security_Org_Field = By.xpath("//*[@id='z13Fq3r']");
	By Select_Identifier = By.xpath("//table[@id='default_ItemCollection']//*[contains(text(), 'CCF-W58RGZ-19-0008')]");
	By Search_Result_Select_1st_Radio_Button = By
			.xpath("//tr[@id=0]//td[@role='gridcell']//label[@class='radio cbox']/span");
	By Search_Result_New_Button = By.xpath("//*[@id='y1eF3Pl']");
	By Contract_File_Create_Button = By.xpath("//*[@id='itemMenu_default_ItemCollection']//*[@id='z2EVjZT']");
	By Search_Open_Button = By.xpath("//*[@id='y1nSVld']");
	By Open_Button = By.xpath("//*[@name='editButton' ]");
	By Box_Card = By.xpath("//*[@data-unique-view-name='cards-0']//*[@ng-click='inbox.openTaskSummaryModal(task)']");
	By Box_Card_Open_Button = By.xpath("//*[@id='view']");
	By Contract_File_Folder = By.cssSelector("#\\30 > td:nth-child(1) > div > div");
	By Item_Number_Field = By.xpath("//*[@name='taskName']");
	By Search_Button_landing_page = By.xpath("//*[@title='Search']");
	By Workload_Card = By.xpath("//*[@ng-click='inbox.openTaskSummaryModal(task)']");
	By Open_Acquire_Button = By.xpath("//*[@id='open-and-acquire']");
	By Contract_File_Tab = By.xpath("//*[@id='z1KEABr']");
	By ContractFile_Action_Button = By.xpath("//*[@name='linkActionButton']");
	By Correct_All_Line_Button = By.xpath("//*[@name='linkCorrectAllLines']");
	By Action_Btn_DropDown_Create_Button = By.xpath("//*[@name='linkCreate']");
	By Contract_File_Template_Field = By.xpath("//*[@name='contractFileTemplate']");
	By File_Type_DODAAC_FIELD = By.xpath("//*[@name='prefix']");
	By Title_Field = By.xpath("//*[@name='title']");
	By Contract_Idnt_Genrt_Button = By.xpath("//*[@name='generateIdentifierButton']");
	By New_Contract_Page_Save_Button = By.xpath("//*[@name='wizardNextButton']");
	By New_Contract_Identifier_Input_field = By.xpath("//*[@id='yOiJcy']");
	By Contract_File_Expand_All_Button = By.xpath("//*[@title='Expand All']");
	By Contract_File_Request_Sub_folder_link = By.xpath("//*[@title='Request']");
	By Contract_File_Action_Button = By.xpath("//*[@name='linkActionButton']");
	By Contract_File_Action_Copy_Frwd_Trnsction_button = By.xpath("//*[@name='linkCopyForward']");
	By Contract_File_Action_Copy_Frwd_Trnsction_button_Solcitation_Link = By.xpath("//*[@name='linkCFSolicitation']");
	By Work_Load_Assignment_Link = By.xpath("//*[contains(text(),'Form W912HQ19R0171 was saved successfully.')]");
	By Contract_File_Solicition_Pick = By.xpath("//*[@title='W91QV119R0092']");
	By Contract_File_Action_Copy_Frwd_Trnsction_button_Announcement_Link = By.xpath("//*[@name='linkCFAnnouncement']");
	By Confirmation_Continue_link = By.xpath("//*[@name='continue']");

	/*******************************************************************************************************************************************************
	 * OBJECT REPO For New Announcement page
	 *
	 *****************************************************************************************************************************************************/
	By DODAAC_ANNOUNCEMENT_LINK = By.xpath("//*[@id='zdtmbZFavorites']");
	By DODAAC_ANNOUNCEMENT_FAV_CODE = By.xpath("//*[@id='fav0']/a/span[1]");
	By Type_of_Announcement_Dropdown = By.xpath("//*[@id='zfNJDy_selectpicker']");
	By Type_of_Announce_Dropdown_value = By.xpath("//*[@id='zfNJDy_selectpickerOption_1']");
	By Announcement_Title_Field = By.xpath("//*[@name='subject']");
	By Announcement_Descreption_Field = By.xpath("//*[@name='extendedDescription']");
	By Response_Date_Field = By.xpath("//*[@name='responseDate']");
	By Product_Service_Field = By.xpath("//*[@name='productServiceCode']");
	By Office_Adds_Tab = By.xpath("//*[@title='Display Office Addresses']");
	By Office_Add_Button = By.xpath("//*[@name='newButton']");
	By Office_Type_field = By.xpath("//*[@id='y1GEBQW_selectpicker']");
	By Office_Type_Blank_field = By.xpath("//*[@aria-controls='y1GEBQW_selectpickerMenu']");
	By Office_Address_TOC = By.xpath("//*[@id='z209XKz_selectpicker']");
	By Office_Address_Sub_value_TOC = By.xpath("//*[@id='z209XKz_selectpickerOption_65']");
	By Office_Type_sub_value = By.xpath("//*[@id='y1GEBQW_selectpickerOption_65']");
	By Office_Doddac_Fav = By.xpath("//*[@id='z5heUaFavorites']");
	By Office_Doddac_TC = By.xpath("//*[@id='y1ZlvmTFavorites']");
	By Office_Doddac_code = By.xpath("//*[@title='Select favorite']");
	By Default_Mailing_Adds = By.xpath("//*[@name='dodaacDefaultButton']");
	By Offic_Phone_num_Field = By.xpath("//*[@name='addressPhoneNumber']");
	By Offic_Email_adds_Field = By.xpath("//*[@name='addressEmail']");
	By Add_office_verify_button = By.xpath("//*[@name='verifyButton']");
	By Add_office_submit_button = By.xpath("//*[@name='processButton']");
	By Continue_Button = By.xpath("//*[@name='continueHybridButton']");
	By Additonal_Tab = By.xpath("//*[@id='viewNavigation']//*[@class='dropdown']");
	By TermsAnd_Condition_link = By.xpath("//*[@title='Display Terms and Conditions']");
	By RecommendTC_Button = By.xpath("//*[@name='recommendedTCButton']");
	By TCNumber_checkbox_52_222 = By.xpath("//*[@title='52.222-50']");
	By TCNumber_checkbox_52_250 = By.xpath("//*[@title='52.250-2']");
	By TOC_Accept_selected_button = By.xpath("//*[@name='acceptSelectedButton']");
	By TOC_Action_Button = By.xpath("//*[@name='actionsButton']");
	By TOC_Create_Link = By.xpath("//*[@name='createLink']");
	By TOC_Create_TC_SubLink = By.xpath("//*[@name='createTCLink']");
	By TOC_Section_Field = By.xpath("//*[@name='physicalSectionCode']");
	By TOC_Number_Field = By.xpath("//*[@name='number']");
	By TOC_Title_Field = By.xpath("//*[@name='title']");
	By TOC_Iframe_TC_Text = By.xpath("//*[@id='id=clauseText_ifr']");
	By TOC_TC_Text_Field = By.xpath("//*[@id='tinymce']");
	By Regulation_Type_DropDown = By.xpath("//*[@id='y1szQXx_selectpicker']");
	By Regulation_sub_value = By.xpath("//*[@id='y1szQXx_selectpickerOption_3']//*[contains(text(), 'LOCAL')]");

	/*******************************************************************************************************************************************************
	 * OBJECT REPO For New Solicitation page
	 *
	 *****************************************************************************************************************************************************/

	By Document_Type_Input_Field = By.xpath("//*[@name='documentType']");
	By DODAAC_Input_Field = By.xpath("//*[@id='zQ7iWh'][@name='dodaacForm']");
	By DODAAC_Favorite_Link = By.xpath("//*[@id='zQ7iWhFavorites']");
	By DODAAC_Favorite_code = By.xpath("//*[@id='fav0']/a");
	By Instrument_Type_Input_Field = By.xpath("//*[@name='instrumentType']");
	By Instrument_Type_Fav_Link = By.xpath("//*[@id='y1Nih9IFavorites']");
	By Instrument_Type__Fav_Code = By.xpath("//*[@id='fav0']/a");
	By Document_Num_Generate_Button = By.xpath("//*[@name='generateDocumentNumberButton']");
	By Document_Num_Field = By.xpath("//*[@name='documentNumber']");
	By Finish_Button = By.xpath("//*[@name='wizardNextButton']");
	By Document_Type_Field_ErrorMsg = By.xpath(
			"//*[@title='DocumentType >> Code/DocumentType >> Code No value was provided. Please Enter a value.']");
	By Sort_Task_Button = By.xpath("//*[@title='Sort Tasks']");
	By Sort_By_Field = By.xpath("//*[@name='sort-tasks-input']");
	By Sort_Decending_Arrow = By.xpath("//*[@id='sort-descending']");
	By Sort_Button = By.xpath("//*[@title='Sort']");
	By Approve_Form = By.xpath("//*[@name='approveForm']");

	/*******************************************************************************************************************************************************
	 * OBJECT REPO For New Solicitation Header page
	 *
	 *****************************************************************************************************************************************************/

	By Form_Type_Input_Field = By.xpath("//*[@name ='subTypeCode']");
	By Printing_Format_Input_Field = By.xpath("//*[@name ='formatName']");
	By Procurement_Input_Field = By.xpath("//*[@name ='title']");
	By Descreption_input_Field = By.xpath("//*[@name='extendedDescription']");
	By VSS_Checkbox = By.xpath("//*[@id='electronicCommerceSection']/div/div/div[1]/div/label/span");
	By FBO_Checkbox = By.xpath("//*[@id='electronicCommerceSection']/div/div/div[2]/div/label/span");
	By Document_Remove = By.xpath("//*[@name='documentRemovalDate']");
	By Code_Input_Field = By.xpath("//*[@name='fboPostingCode']");
	By Login_ID_Input_Field = By.xpath("//*[@name='contractingSpecialist']");
	By Web_Site_Removel_Date_Input_field = By.xpath("//*[@name='ecRemovalDate' ]");
	By Closing_Date_Input_field = By.xpath("//*[@name='closingDate']");
	By Contracting_Officer_Input_field = By.xpath("//*[@name='contractingOfficer']");
	By Contracting_Specialist_Input_field = By.xpath("//*[@name='contractingSpecialist']");
	By Method_of_Acquisition_Field = By.xpath("//*[@id='y1NfNp0_selectpicker']");
	By Closing_Time_Field = By.xpath("//*[@name='closingTime']");
	By Removal_Time_Field = By.xpath("//*[@name='ecRemovalTime']");
	By Close_Time_Zone_Field = By.xpath("//*[@id='zgRyBe_selectpicker']");
	By New_SOL_Header_Save_Button = By.xpath("//*[@name='saveButton']");
	By New_SOL_Header_Save_Message = By.xpath("//*[@name='messagesList_ItemCollection']");

	/*******************************************************************************************************************************************************
	 * ACTIONS METHODS FOR Contract File
	 *
	 *****************************************************************************************************************************************************/

	// Method to Navigate to Contract File Search page
	public void navigateToContractSearch() {
		driver.findElement(Transaction).click();
		driver.findElement(Acquisitions).click();
		driver.findElement(Contract_File).click();

	}

	// Method for Inbox Search Datatable for search workload
	public void inboxSearchWorkloadandViewDataTable(DataTable table) throws Exception {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Item_Number_Field))
					.sendKeys(data.get("Item Number"));
			driver.findElement(Search_Button_landing_page).click();
			try {
				WebElement workloadcard = driver.findElement(Workload_Card);
				workloadcard.click();
			} catch (Exception StaleElementReferenceException) {
				WebElement workloadcard = driver.findElement(Workload_Card);
				workloadcard.click();
			}

		}
	}

	// Method to click Open and Acquire Button
	public void clickOpenAndAcquire() {
		driver.findElement(Open_Acquire_Button).click();

	}

	// Method to click contract file tab
	public void clickContractFileTab() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(Contract_File_Tab).click();
		driver.findElement(ContractFile_Action_Button).click();
		driver.findElement(Action_Btn_DropDown_Create_Button).click();

	}

	// Method for Contract File search Data Table
	public void contractFileDataTable(DataTable table) {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			driver.findElement(Identifier_Field).clear();
			driver.findElement(Identifier_Field).sendKeys(data.get("Identifier"));

		}

	}

	// Method for Create New Cotract File DataTable
	public void createNewContractFileDataTable(DataTable table) throws Exception {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			driver.findElement(Contract_File_Template_Field).sendKeys(data.get("Contract File Template"));
			driver.findElement(File_Type_DODAAC_FIELD).sendKeys(data.get("FileTypeDODAAC"));
			driver.findElement(Title_Field).sendKeys(data.get("Title"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Contract_Idnt_Genrt_Button));
			driver.findElement(Contract_Idnt_Genrt_Button).click();
			// String abc = driver.findElement(Contract_Idnt_Genrt_Button).getText();
			// System.out.println("My genenrated value: " + abc);
			// getContractFileIdentValue();

		}

	}

	// Mehtod to click New Contract Save button
	public void clickNewContrctPageSaveButton() {
		driver.findElement(New_Contract_Page_Save_Button).click();
	}

	// Method to capture dynamically generated New Contract File Identifier
	public String getContractFileIdentValue() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(New_Contract_Identifier_Input_field));
		String text = driver.findElement(New_Contract_Identifier_Input_field).getAttribute("value");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("My copied value: " + text);
		// return elementText;
		return text;
	}

	public void verifySaveMessge() throws Exception {
		workloadmanager = new WorkloadManager();
		String expected_value = driver.findElement(By.xpath("//*[contains(text(),'Contract File: CCF-W91QV1-19')]"))
				.getText();
		System.out.println(expected_value);
		assertTrue(expected_value.contains("Contract File: CCF-W91QV1"));
		driver.findElement(Work_Load_Assignment_Link).click();
		driver.findElement(workloadmanager.Save_Button).click();
		String actual_message = driver.findElement(workloadmanager.Save_Message).getText();
		String expected_message = "Action was successful.";
		assertEquals(expected_message, actual_message);
	}

	// Method for selecting first row of result
	public void selectFirstRowResult() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Search_Result_Select_1st_Radio_Button)).click();
			synchronized (Search_Result_Select_1st_Radio_Button) {
				Search_Result_Select_1st_Radio_Button.wait(2000);
				driver.findElement(Search_Result_Select_1st_Radio_Button).click();
			}
			// driver.findElement(Search_Result_Select_1st_Radio_Button).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(Search_Open_Button).click();
	}

	// Method for Clicking Search Button
	public void clickSearch() {
		WebElement Search_Button_xp = driver.findElement(By.xpath("//*[@name='searchButton'][@id='y9aoCN']"));
		Search_Button_xp.click();
		Log.info("Hello Ansib");

	}

	// Method for selecting Requation Folder from Contract File
	public void selectReqFolder() throws Exception {
		windowHandle = new WindowsHandle();
		driver.findElement(Contract_File_Expand_All_Button).click();
		driver.findElement(Contract_File_Request_Sub_folder_link).click();
		driver.findElement(ContractFile_Action_Button).click();
		driver.findElement(Contract_File_Action_Copy_Frwd_Trnsction_button).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Contract_File_Action_Copy_Frwd_Trnsction_button_Solcitation_Link).click();
		try {
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Search_Result_Select_1st_Radio_Button)).click();
			synchronized (windowHandle) {
				windowHandle.wait(2000);
				windowHandle.windowsHandle();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// Method for Create New Solicitation page
	public void createSolicitationLink() throws Exception {
		windowHandle = new WindowsHandle();
		driver.findElement(Contract_File_Create_Button).click();
		driver.findElement(Transaction_Link).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Contract_File_Create_Button_Drop_Down_Solicitation_Link).click();
		driver.manage().window().maximize();
		windowHandle.windowsHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	/*******************************************************************************************************************************************************
	 * ACTIONS METHODS FOR New Solicitation Page
	 * 
	 * @throws Exception
	 *
	 * 
	 *
	 *****************************************************************************************************************************************************/

	// Method for New Solicitation Data Table
	public void newSolicitationDataTable(DataTable table) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Document_Type_Input_Field))
					.sendKeys(data.get("Document Type"));
			// driver.findElement(Document_Type_Input_Field).sendKeys(data.get("Document
			// Type"));
			// driver.findElement(DODAAC_Input_Field).sendKeys(data.get("DODAAC"));
			driver.findElement(DODAAC_Favorite_Link).click();
			driver.findElement(DODAAC_Favorite_code).click();

			// driver.findElement(Instrument_Type_Input_Field).clear();
			// Object lock = new Object();
			synchronized (Instrument_Type_Input_Field) {
				Instrument_Type_Input_Field.wait(4000);
				driver.findElement(Instrument_Type_Input_Field).sendKeys(data.get("Instrument Type"));
				driver.findElement(Instrument_Type_Input_Field).clear();
				driver.findElement(Instrument_Type_Input_Field).sendKeys(data.get("Instrument Type"));
			}
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Instrument_Type_Input_Field)).sendKeys(data.get("Instrument
			// Type"));
			// driver.findElement(Instrument_Type_Input_Field).clear();
			// driver.findElement(Instrument_Type_Input_Field).sendKeys(data.get("Instrument
			// Type"));

		}
	}

	// Method for Generate Button
	public void clickGenerateButton() throws Exception {
		alertPopupHandle = new AlertPopupHandle();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Document_Num_Generate_Button).click();
		// getTextOfElement();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (alertPopupHandle.isAlertPreset() == true) {
			alertPopupHandle.AlertDemo();

			// assertEquals(false,driver.findElement(Document_Num_Generate_Button).isDisplayed());

		}
	}

	// Verify Generate Button is Displaying
	public void verifyGenerateButton() throws Exception {
		assertEquals(driver.findElement(Document_Num_Generate_Button).isDisplayed(), true);
	}

	// Verify Field level Error messages
	public void verifyErrorMessage() {
		String actual_error = driver.findElement(Document_Type_Field_ErrorMsg).getText();
		String expted_error = "DocumentType >> Code/DocumentType >> Code No value was provided. Please Enter a value.";
		assertEquals(expted_error, actual_error);

	}

	// Method copy dynamically generated document value and use it on other filed
	public String getTextOfElement() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Document_Num_Field));
		String text = driver.findElement(Document_Num_Field).getAttribute("value");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("My copied value: " + text);
		// return elementText;
		return text;
	}

	// Method to enter document value and use it on other filed
	public void enterTextInField() throws Exception {
		synchoWait();
		driver.findElement(Descreption_input_Field).clear();
		driver.findElement(Descreption_input_Field).sendKeys(getTextOfElement());
		// System.out.println("value copied");
	}

	// Verify Generated Document Number
	public void verifyGeneratedDocNum() {
		assertEquals(driver.findElement(Document_Num_Field).getText().isEmpty(), true);
		Log.info("Verify Assertion ");

	}

	// Method to click on Finish Button
	public void clickFinishButton() {
		driver.findElement(Finish_Button).click();
	}

	public void synchoWait() throws InterruptedException {
		Object lock = new Object();
		synchronized (lock) {
			lock.wait(4000);
		}
	}

	/*******************************************************************************************************************************************************
	 * ACTIONS METHODS FOR New Solicitation Header Page
	 * 
	 *
	 * 
	 *
	 *****************************************************************************************************************************************************/

	public void newSolicitationHeaderPageDataTable(DataTable table) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			driver.findElement(Form_Type_Input_Field).sendKeys(data.get("Form Type"));
			driver.findElement(Printing_Format_Input_Field).sendKeys(data.get("Printing Format"));
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Descreption_input_Field));

			// driver.findElement(Descreption_input_Field).sendKeys(enterTextInField());
			// driver.findElement(Procurement_Input_Field).sendKeys(data.get("Procurement
			// Title"));
			synchoWait();
			js.executeScript("window.scrollBy(0,1600)", "");
			synchoWait();
			driver.findElement(VSS_Checkbox).click();
			synchoWait();
			driver.findElement(FBO_Checkbox).click();
			driver.findElement(Code_Input_Field).sendKeys(data.get("CODE"));
			driver.findElement(Web_Site_Removel_Date_Input_field).sendKeys(data.get("Removel Date"));
			driver.findElement(Closing_Date_Input_field).sendKeys(data.get("Closing Date"));
			driver.findElement(Method_of_Acquisition_Field).sendKeys(data.get("Method of Acquisition"));
			driver.findElement(Closing_Time_Field).sendKeys(data.get("Closing Time"));
			driver.findElement(Removal_Time_Field).sendKeys(data.get("Removel Time"));
			driver.findElement(Close_Time_Zone_Field).sendKeys(data.get("Close Time Zone"));

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}

	}

	public void newSolHeaderSave() throws Exception {
		driver.findElement(New_SOL_Header_Save_Button).click();
		String expected = driver.findElement(New_SOL_Header_Save_Message).getText();
		String getDocumentNum = getTextOfElement();
		System.out.println(getDocumentNum);
		System.out.println(expected);
		// String actual = "";
		assertTrue(expected.contains("Form " + getDocumentNum + " was saved successfully."));
		// This will return the number of windows opened by Webdriver and will return
		// Set of Strings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator to go over the totoal windows
		Iterator<String> I1 = s1.iterator();

		// List of the windows

		String parent = I1.next();
		String child_window = I1.next();
		// String third_window = I1.next();

		// Here we will compare if parent window and title back
		driver.switchTo().window(parent);
		System.out.println(driver.switchTo().window(parent).getTitle());

		// switch to first window perform operation and close
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();

		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);

	}

	public void navigateToContractFile() {

		driver.findElement(Transaction).click();
		driver.findElement(Acquisitions).click();
		driver.findElement(Contract_File).click();
		// driver.findElement(Confirmation_Continue_link).click();
	}

	public void selectAnnouncementFolder() throws Exception {
		windowHandle = new WindowsHandle();
		// open main folder
		driver.findElement(Contract_File_Expand_All_Button).click();
		// Click to select the Solicitation sub folder
		driver.findElement(Contract_File_Solicition_Pick).click();
		// click on action button
		driver.findElement(ContractFile_Action_Button).click();
		// click on action>sub link "copy forward button'
		driver.findElement(Contract_File_Action_Copy_Frwd_Trnsction_button).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// click on action>foward>Announcment button
		driver.findElement(Contract_File_Action_Copy_Frwd_Trnsction_button_Announcement_Link).click();

		try {
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Search_Result_Select_1st_Radio_Button)).click();
			synchronized (windowHandle) {
				windowHandle.wait(2000);
				windowHandle.windowsHandle();
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void selectCorrectALLLinesFolder() throws Exception {
		windowHandle = new WindowsHandle();
		// open main folder
		driver.findElement(Contract_File_Expand_All_Button).click();
		// Click to select the Solicitation sub folder
		driver.findElement(Contract_File_Solicition_Pick).click();
		// click on action button
		driver.findElement(ContractFile_Action_Button).click();
		// click on action>sub link "copy forward button'
		driver.findElement(Correct_All_Line_Button).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// click on action>foward>Announcment button
		// driver.findElement(Contract_File_Action_Copy_Frwd_Trnsction_button_Announcement_Link).click();

		try {
			// wait.until(ExpectedConditions.visibilityOfElementLocated(Search_Result_Select_1st_Radio_Button)).click();
			synchronized (windowHandle) {
				windowHandle.wait(2000);
				windowHandle.windowsHandle();
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void newAnnoucementDataTable(DataTable table) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			getandSentValue = new GetandSentValue();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Document_Type_Input_Field))
					.sendKeys(data.get("Document Type"));
			driver.findElement(DODAAC_ANNOUNCEMENT_LINK).click();
			driver.findElement(DODAAC_ANNOUNCEMENT_FAV_CODE).click();
			alertPopupHandle = new AlertPopupHandle();
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			synchoWait();
			driver.findElement(Document_Num_Generate_Button).click();

			// PRANumber = getTextOfElement(Document_Num_Generate_Button);
			// getTextOfElement();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (alertPopupHandle.isAlertPreset() == true) {
				alertPopupHandle.AlertDemo();

			}
		}

		synchoWait();
		driver.findElement(Document_Num_Generate_Button).click();
		synchoWait();
		PRANumber = getandSentValue.getAttributeValueOfElement(Document_Num_Field);

		driver.findElement(Finish_Button).click();
	}

	public void getAnnoucmentDocumentNumber() {

	}

	public void newAnnouncementHeaderDataTable(DataTable table) throws Exception {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			driver.findElement(Type_of_Announcement_Dropdown).click();
			driver.findElement(Type_of_Announce_Dropdown_value).click();
			driver.findElement(Announcement_Title_Field).sendKeys(data.get("Announcement Title"));
			driver.findElement(Announcement_Descreption_Field).sendKeys(data.get("Description"));
			driver.findElement(Response_Date_Field).sendKeys(data.get("Response Date"));
			driver.findElement(Product_Service_Field).sendKeys(data.get("Product Service Code"));
			synchoWait();
			// driver.findElement(VSS_Checkbox).click();
			synchoWait();
			driver.findElement(FBO_Checkbox).click();
			driver.findElement(Document_Remove).sendKeys("05/19/2020");
			driver.findElement(Code_Input_Field).sendKeys("cgifedera");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(Office_Adds_Tab).click();
			driver.findElement(Office_Add_Button).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(Office_Type_field).click();
			driver.findElement(Office_Type_Blank_field).sendKeys("Contract Issuing Office");
			driver.findElement(Office_Type_sub_value).click();
			synchoWait();
			driver.findElement(Office_Doddac_Fav).click();
			driver.findElement(Office_Doddac_code).click();
			driver.findElement(Default_Mailing_Adds).click();
			driver.findElement(Offic_Email_adds_Field).sendKeys("gharrison@mail.mil");
			driver.findElement(Offic_Phone_num_Field).sendKeys("202-555-5555");
			synchoWait();
			driver.findElement(New_SOL_Header_Save_Button).click();
			driver.findElement(Add_office_verify_button).click();
			driver.findElement(Add_office_submit_button).click();

		}

	}

	public void addOfficeDataTable(DataTable table) throws Exception {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			// synchoWait();
			driver.findElement(Office_Adds_Tab).click();
			driver.findElement(Office_Add_Button).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(Office_Address_TOC).click();
			driver.findElement(Office_Address_TOC).sendKeys(data.get("Administerted"));
			driver.findElement(Office_Address_Sub_value_TOC).click();
			synchoWait();
			driver.findElement(Office_Doddac_TC).click();
			driver.findElement(Office_Doddac_code).click();
			driver.findElement(Default_Mailing_Adds).click();
			driver.findElement(Offic_Email_adds_Field).sendKeys(data.get("Email"));
			driver.findElement(Offic_Phone_num_Field).sendKeys(data.get("Phone"));

		}
	}

	public void addTermsAndCondition() throws Exception {
		driver.findElement(Additonal_Tab).click();
		driver.findElement(TermsAnd_Condition_link).click();
		driver.findElement(RecommendTC_Button).click();
		driver.findElement(TCNumber_checkbox_52_222).click();
		driver.findElement(TCNumber_checkbox_52_250).click();
		driver.findElement(TOC_Accept_selected_button).click();
		driver.findElement(TOC_Action_Button).click();
		driver.findElement(TOC_Create_Link).click();
		driver.findElement(TOC_Create_TC_SubLink).click();
		driver.findElement(TOC_Section_Field).sendKeys("2");
		driver.findElement(TOC_Number_Field).sendKeys("2.1");
		driver.findElement(TOC_Title_Field).sendKeys("Damage to Government Property");
		WebElement iframe = driver.findElement(By.xpath("//*[@id='clauseText_ifr']"));
		driver.switchTo().frame(iframe);
		synchoWait();
		// driver.switchTo().frame(driver.findElement(TOC_Iframe_TC_Text));
		driver.findElement(TOC_TC_Text_Field).sendKeys("ABC");
		driver.findElement(Regulation_Type_DropDown).click();
		driver.findElement(Regulation_sub_value).click();
		driver.findElement(New_SOL_Header_Save_Button).click();

	}

	public void sortKoApproveSOL() throws Exception {
		getandSentValue = new GetandSentValue();
		synchronized (Item_Number_Field) {
			Item_Number_Field.wait(15000);
			driver.findElement(Item_Number_Field).sendKeys("PRA " + PRANumber);
		}
		// synchoWait();
		// driver.findElement(Item_Number_Field).sendKeys("PRA " + PRANumber);
		// getandSentValue.enterTextInField(PRANumber, Item_Number_Field);
		driver.findElement(Search_Button_landing_page).click();

		// driver.findElement(Sort_Task_Button).click();
		// driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		// driver.findElement(Sort_Decending_Arrow).click();
		// synchoWait();
		// driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		synchoWait();
		clickOpenAndAcquire();
		driver.findElement(Approve_Form).click();
		driver.findElement(Continue_Button).click();

	}

	public void switchSolWindow() {

		// This will return the number of windows opened by Webdriver and will return
		// Set of Strings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator to go over the totoal windows
		Iterator<String> I1 = s1.iterator();

		// List of the windows

		String parent = I1.next();
		String child_window = I1.next();
		// String third_window = I1.next();

		// Here we will compare if parent window and title back
		driver.switchTo().window(parent);
		System.out.println(driver.switchTo().window(parent).getTitle());

		// switch to first window perform operation and close
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();

		// switch to second window and perform some action then close
		// driver.switchTo().window(third_window);
		// System.out.println(driver.switchTo().window(third_window).getTitle());
		// driver.close();
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);

	}

	public String getTextOfElement(By locator) {
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(Application_ID));
		String text = driver.findElement(locator).getText();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("My copied value: " + text);
		// return elementText;
		return text;
	}

	public void addMileStone() {
		driver.findElement(By.xpath("//*[@id=\"yxqknL\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"headerDiv\"]/div/div/div/div[1]/div/div/div[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"y1SVRnM\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"y12lXD\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"contractFileMilestoneGanttChart\"]/div/div[1]/div[2]/div[2]/div[4]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"contractFileMilestoneGanttChart\"]/div/div[1]/div[2]/div[2]/div[4]"))
				.click();
		WebElement scroll = driver.findElement(By.xpath("//*[@id='ztviEV']"));
		// JavascriptExecutor jvm =(JavascriptExecutor)driver;
		// jvm.executeScript("scroll(0,1000)",scroll);
		Coordinates coordinate = ((Locatable) scroll).getCoordinates();
		coordinate.inViewPort();

	}
}