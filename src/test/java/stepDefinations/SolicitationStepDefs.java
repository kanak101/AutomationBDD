package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import pageObject_OR.LoginPage;
import pageObject_OR.Solicitation;
import utilities.TestBase;
import utilities.WindowsHandle;

public class SolicitationStepDefs extends TestBase {

	
	
	Solicitation solicitation;
	LoginPage loginPage;
	WindowsHandle windowHandle;



	@And("^I navigate to Contract File Search page$")
	public void i_navigate_to_Contract_File_Search_page() throws Exception {
		solicitation = new Solicitation();
		solicitation.navigateToContractSearch();
		

	}

	@Then("^I fill out the data in the Contract File$")
	public void i_fill_out_the_data_in_the_Contract_File(DataTable table) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		
		solicitation.contractFileDataTable(table);

	}

	@Then("^I dispaly Contract File Search data$")
	public void i_dispaly_Contract_File_Search_data() throws Exception {
		solicitation = new Solicitation();
		solicitation.clickSearch();

	}

	@And("^I pick the following contract file$")
	public void i_pick_the_following_contract_file() throws Exception {
		solicitation = new Solicitation();
		//Thread.sleep(2000);    
		solicitation.selectFirstRowResult();
		

	}
	
	@And("^I click on new Solicitation link$")
	public void i_click_on_new_Solicitation_link() throws Exception {
		
		solicitation = new Solicitation();
		solicitation.createSolicitationLink();
		
	}
	
	@Then("^I enter the following Data in New Solicitation page$")
	public void i_enter_the_following_Data_in_New_Solicitation_page(DataTable table) throws Exception {
		
		
		solicitation = new Solicitation();
		solicitation.newSolicitationDataTable(table);
	}

	@Then("^I click on the generate button$")
	public void i_click_on_the_generate_button() throws Exception {
		
		solicitation = new Solicitation();
		solicitation.clickGenerateButton();
		//solicitation.verifyGeneratedDocNum();
	   
	}

	@And("^I verify Document Number is Generated$")
	public void iVerifyDocumentNumberIsGenerated() throws Exception {
		
		solicitation = new Solicitation();
		solicitation.verifyGeneratedDocNum();
		
	}

	@And("^I verify generate button is displayed$")
	public void iVerifyGenerateButtonIsDisplayed() throws Exception{
		solicitation = new Solicitation();
		solicitation.verifyGenerateButton();
	}

	@Then("^I click on Finish Button$")
	public void iClickOnFinishButton() throws Exception {
		solicitation = new Solicitation();
		solicitation.clickFinishButton();
	}

	@And("^I verfiy Document Type error message is displayed$")
	public void iVerfiyDocumentTypeErrorMessageIsDisplayed() throws Throwable {
		solicitation = new Solicitation();
		solicitation.verifyErrorMessage();
	}

	@Then("^I enter following Data's in Header Page$")
	public void iEnterFollowingDataSInHeaderPage( DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.newSolicitationHeaderPageDataTable(table);
	}
		

	@Then("^I close parent window$")
	public void iCloseParentWindow() throws Throwable {
		windowHandle = new WindowsHandle();
		windowHandle.closeParentWindow();
		
		
	}

	@And("^I search and select the following Workload Assignment$")
	public void iSearchAndSelectTheFollowingWorkloadAssignment(DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.inboxSearchWorkloadandViewDataTable(table);
	}

	@And("^I click on the Open and Acquire Button$")
	public void iClickOnTheOpenAndAcquireButton() throws Throwable {
		solicitation = new Solicitation();
		solicitation.clickOpenAndAcquire();
	}

	@And("^I click on the contract file tab$")
	public void iClickOnTheContractFileTab() throws Throwable {
		solicitation = new Solicitation();
		solicitation.clickContractFileTab();
		
	}

	@And("^I enter the New Contract File data$")
	public void iEnterTheNewContractFileData(DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.createNewContractFileDataTable(table);
		
	}

	@And("^I click on save button$")
	public void iClickOnSaveButton() throws Throwable {
		solicitation = new Solicitation();
		solicitation.clickNewContrctPageSaveButton();
	}

	@And("^I verify the save confirmation message$")
	public void iVerifyTheSaveConfirmationMessage() throws Throwable {
		solicitation = new Solicitation();
		solicitation.verifySaveMessge();
	}

	@And("^I select the Requation folder from the contract file$")
	public void iSelectTheRequationFolderFromTheContractFile() throws Throwable {
		solicitation = new Solicitation();
		solicitation.selectReqFolder();
	}

	@Then("^I search for solicitation document$")
	public void iSearchForSolicitationDocument() throws Exception {
		windowHandle = new WindowsHandle();
		driver.findElement(By.xpath("//*[@id='wfx-transactions']")).click();
		driver.findElement(By.xpath("//*[@id='wfx-transactions-subnav']/li[2]")).click();
		driver.findElement(By.xpath("//*[@id='yBv5q1']")).sendKeys("SOL");
		//Click search key
		driver.findElement(By.xpath("//*[@id='z13KMi6']")).click();
		//select sol radibutton
		driver.findElement(By.xpath("//*[@id='2']/td[1]/label")).click();
		//click on Correct Button New windows open up
		driver.findElement(By.xpath("//*[@id='zKLJNU']")).click();
		//Handeling new window
		windowHandle.windowsHandle();
		driver.findElement(By.xpath("//*[@id='viewNavigation']/nav/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id='yGR5Xk']")).click();
		driver.findElement(By.xpath("//*[@id='ycarLO']")).click();
		driver.findElement(By.xpath("//*[@id='y2KKxvW']")).click();
		driver.findElement(By.xpath("//*[@id='y148GeT']")).click();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='clauseText_ifr']"));
		driver.switchTo().frame(iframe);
	//	driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Tom Papa");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("cbs tokyoa");
        Object lock = new Object();
       synchronized(lock){
        lock.wait(4000);
       	}

		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("cbs tokyoa");
		driver.findElement(By.xpath("//*[@id='tinymce']")).click();
		//driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("cbs tokyoa");
		
		
		
	}

	@Then("^I verify the save confirmation message is displayed$")
	public void iVerifyTheSaveConfirmationMessageIsDisplayed() throws Throwable {
		solicitation = new Solicitation();
		solicitation.newSolHeaderSave();
	}

	@Then("^I navigate to Contract File$")
	public void iNavigateToContractFile() throws Throwable {
		solicitation = new Solicitation();
		solicitation.navigateToContractFile();
	}

	@And("^I select the Announcement folder from the contract file$")
	public void iSelectTheAnnouncementFolderFromTheContractFile() throws Throwable {
		solicitation = new Solicitation();
		solicitation.selectAnnouncementFolder();
	}

	@Then("^I enter the following Data in New Announcement page$")
	public void iEnterTheFollowingDataInNewAnnouncementPage(DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.newAnnoucementDataTable(table);
	}

	@And("^I fillout Announcement Header Page$")
	public void iFilloutAnnouncementHeaderPage(DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.newAnnouncementHeaderDataTable(table);
	}

	@And("^I search and approve as a KO User$")
	public void iSearchAndApproveAsAKOUser() throws Throwable {
		solicitation = new Solicitation();
		solicitation.sortKoApproveSOL();
	}

	@And("^I switch back to parent window$")
	public void iSwitchBackToParentWindow() throws Throwable {
		//windowHandle = new WindowsHandle();
		solicitation = new Solicitation();
		solicitation.switchSolWindow();
	}

	@And("^I pick the folder for correct all the lines$")
	public void iPickTheFolderForCorrectAllTheLines() throws Throwable {
		solicitation = new Solicitation();
		solicitation.selectCorrectALLLinesFolder();
		
	}

	@And("^I enter the following office data$")
	public void iEnterTheFollowingOfficeData(DataTable table) throws Throwable {
		solicitation = new Solicitation();
		solicitation.addOfficeDataTable(table);
	}

	@Then("^I click on Additional Tabs for T&C$")
	public void iClickOnAdditionalTabsForTC() throws Throwable {
		solicitation = new Solicitation();
		solicitation.addTermsAndCondition();
	}

	@And("^I add milstone$")
	public void iAddMilstone() throws Throwable {
		solicitation = new Solicitation();
		solicitation.addMileStone();
	}

	
	
	

	

}
