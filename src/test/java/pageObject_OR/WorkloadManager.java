package pageObject_OR;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import utilities.TestBase;
import utilities.WindowsHandle;
import pageObject_OR.Solicitation;

public class WorkloadManager extends TestBase{
	Solicitation solicitation;

	public WorkloadManager() {
		super();
		
	}
	
	
	

	/*******************************************************************************************************************************************************
	 *  OBJECT REPO For Workload Manager Page
	 *
	 * *****************************************************************************************************************************************************/
	 
	By Sort_Task_Button = By.xpath("//*[@title='Sort Tasks']");
	By Sort_By_Field = By.xpath("//*[@name='sort-tasks-input']");
	By Sort_Button = By.xpath("//*[@title='Sort']");
	By Task_Input_Field = By.xpath("//*[@name='assignmentType']");
	By Lead_Time_Template_Input_field = By.xpath("//*[@name='leadTimeTemplateId']");
	By ProcurementMethod_Input_field = By.xpath("//*[@name='procurementMethod']");
	By Procurement_Type_Input_field = By.xpath("//*[@name='procurementType']");
	By Assigne_Tab = By.xpath("//*[@title='Display Assignees']");
	By Add_Button = By.xpath("//*[@name='new1Button']");
	By Autotest_user = By.xpath("//*[@title='autotestv1_cs1']");
	By Select_Button = By.xpath("//*[@name='newButton']");
	By Save_Button = By.xpath("//*[@name='save1Button']");
	By Save_Message = By.xpath("//*[@title='Action was successful.']");
	By Assignee_Remove_Button = By.xpath("//*[@name='deleteButton']");
	By Assign_Button =By.xpath("//*[@name='hybridAssignButton']");
	By WorkLoad_Manager_Workload_Card = By.xpath("//*[contains(text(),'assigned')]");
	

	
	
	
	
	


/*******************************************************************************************************************************************************
 * Action Methods For Workload Manager Page
 *
 * *****************************************************************************************************************************************************/
	
	
	//Method is perform sort task
	public void sortTask() throws Exception {
		solicitation = new Solicitation();
		WebDriverWait wait = new WebDriverWait(driver, 30);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Task_Input_Field)).sendKeys("Workload - Manage Assignment");
		driver.findElement(Task_Input_Field).sendKeys("Workload - Manage Assignment");
		driver.findElement(Sort_Task_Button).click();
		driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		driver.findElement(Sort_Button).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		try {
	    	 WebElement workloadcard = driver.findElement(WorkLoad_Manager_Workload_Card);
	    	workloadcard.click();
	    } catch (Exception StaleElementReferenceException) {
	    	WebElement workloadcard = driver.findElement(WorkLoad_Manager_Workload_Card);
	    	workloadcard.click();
	    }
	}
	
	//Method is for DataTable for Lead Time Page
	public void workLoadManagerPageDataTable(DataTable table) throws Exception    {
		//WebDriverWait wait = new WebDriverWait(driver, 30);	
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		for(Map<String, String> data : table.asMaps(String.class, String.class )) {
		driver.findElement(Lead_Time_Template_Input_field).sendKeys(data.get("Lead Time Template"));
		driver.findElement(ProcurementMethod_Input_field).sendKeys(data.get("Procurement Method"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Descreption_input_Field));		
		//driver.findElement(Descreption_input_Field).sendKeys(data.get("DESCREPTION"));
        //driver.findElement(Procurement_Type_Input_field).sendKeys(data.get("Procurement Type"));
        try {
	    	 WebElement procur_Type = driver.findElement(Procurement_Type_Input_field);
	    	//procur_Type.sendKeys(data.get("Procurement Type"));
	    } catch (Exception StaleElementReferenceException) {
	    	WebElement procur_Type = driver.findElement(Procurement_Type_Input_field);
	    	procur_Type.sendKeys(data.get("Procurement Type"));
	    }
	    
		
	}
	
}
	
 //Method is for User to be Assinged in assignees page
	public void assigneeUser() {
		driver.findElement(Assigne_Tab).click();
	    driver.findElement(Add_Button).click();
	    driver.findElement(Autotest_user).click();
	    driver.findElement(Select_Button).click();
	 
 }
	
	
	// Method to verify Assignee Save confirmation message
	public void verifyAssigneesSave() {
		
		driver.findElement(Save_Button).click();
		String actual_message = driver.findElement(Save_Message).getText();
		String expected_message = "Action was successful.";
		System.out.println(actual_message);
		assertEquals(expected_message, actual_message);
		driver.findElement(Assign_Button).click();
		
	}
}