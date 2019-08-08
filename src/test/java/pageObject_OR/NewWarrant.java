package pageObject_OR;

import utilities.TestBase;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import utilities.TestBase;
import utilities.WindowsHandle;

public class NewWarrant extends TestBase {
	
	Solicitation solicitation;
	WorkloadManager workloadmanager;
    public static String AppID;
    public static String CanidateID;

	
	public NewWarrant() {
		super();
	}
	
	
	
	
	

	/*******************************************************************************************************************************************************
	 * OBJECT REPO For New Warrent Page
	 *
	 *****************************************************************************************************************************************************/

	By Transaction_Link = By.xpath("//*[@id='wfx-transactions']/button");
	By Application_ID = By.xpath("//*[@id='EXPAND-OUTERFRAME']//span[contains(text(),'A-W91')]");
	By Item_Number_Field = By.xpath("//*[@id='taskName']");
	By Acquisitions_Link = By.xpath("//*[@id='wfx-transactions-subnav']/li[5]/button");
	By Additional_Form_Link = By.xpath("//*[@id='wfx-transactions-subnav']/li[5]/ul/li[12]/button/span");
	By New_Link = By.xpath("//*[@id='wfx-transactions-subnav']/li[5]/ul/li[12]/ul/li[2]/button");
	By Warrent_link = By.xpath("//*[@id='wfx-transactions-subnav']/li[5]/ul/li[12]/ul/li[2]/ul/li[4]/a");
	By Warrent_Template_Field = By.xpath("//*[@id='WarrantTemplate']");
	By Canidate_ID_Field = By.xpath("//*[@id='CandidateOpID']");
	By DoDDAC_Input_Field = By.xpath("//*[@id='DODAAC']");
	By Security_Org_Field = By.xpath("//*[@id='SecurityOrg']");
	By PCO_CheckBox = By.xpath("//*[@id='ProcuringContractOfficerBool']");
	By Limited_Radio_Button = By.xpath("//*[@for='TypeDesReqListL']");
	By Prejudice_radio_Button = By.xpath("//*[@for='HasCndHadWarrantTerminatedListN']");
	By Semester_radio_Button = By.xpath("//*[@for='DidCompltAtLeast24HrsListY']");
	By Supervisor_Field = By.xpath("//*[@id='From']");
	By Warrent_Save_Button = By.xpath("//*[@name='CustomButtonsCandInfo_pyWorkPage_65']");
	By New_Warrant_Submit_Button = By.xpath("//*[@name='CustomButtonsCandInfo_pyWorkPage_68']");
	By Canidate_Id_Field_Sub_Pick = By.xpath("//*[@id='po0']");
	By Profile_Dropdown           = By.xpath("//*[@id='wfx-profile-dropdown-button']");
	By Sign_Out = By.xpath("//*[@class='btn-signout']");
	By Task_Input_Field = By.xpath("//*[@name='assignmentType']");
	By Sort_Task_Button = By.xpath("//*[@title='Sort Tasks']");
	By Sort_By_Field = By.xpath("//*[@name='sort-tasks-input']");
	By Sort_Decending_Arrow = By.xpath("//*[@id='sort-descending']");
	By Sort_Button = By.xpath("//*[@title='Sort']");
	By Box_Card = By.xpath("//*[@data-unique-view-name='cards-0']//*[@ng-click='inbox.openTaskSummaryModal(task)']");
	By Open_Button = By.xpath("//*[@id='view']");
	By Cand_Review_Submit_Button = By.xpath("//*[@name='CustomButtonsCandRevw_pyWorkPage_10']");
	By Search_Button = By.xpath("//*[ @title='Search']");
	By Req_Official_Select_Drop_Down = By.xpath("//*[@id='ProposedWrntRsn']");
	By Req_Official_Select_Sub_Value = By.xpath("//*[@id='ProposedWrntRsn']/option[4]");
	By Req_Official_Text_Area = By.xpath("//*[@id='ImpactIfWrntDenied']");
	By Req_Submit_Button = By.xpath("//*[@title='Approve']");
	By AppOfficial_Approve_Radio_Button = By.xpath("//*[@for='ApprovedDisapprovedT']");
	By PassCORB_Radio_Button = By.xpath("//*[@for='HasCndPassedCORBListY']");
	By Generate_SF1402_Button = By.xpath("//*[@name='AppointingOfficial_pyWorkPage_22']");
	By Confirmation_Sussess_Message = By.xpath("//*[@class='field-item dataLabelRead heading_4_dataLabelRead']");
	By System_Admin_Link = By.xpath("//*[@id='wfx-SystemAdministration']/button");
	By Security_link = By.xpath("//*[@id='wfx-SystemAdministration-subnav']//*[contains(text(),'Security')]");
	By Principale_link = By.xpath("//*[@id='wfx-SystemAdministration-subnav']/li[7]/ul/li[4]/a");
	By User_ID_Field = By.xpath("//*[@id='y1lAL2F']");
	By Principle_Search_Button = By.xpath("//*[@name='searchButton']");
	By Principle_Radio_Button = By.xpath("//*[@id='0']/td[1]");
	By Principle_Copy_Button = By.xpath("//*[@name='copyButton']");
	By Principle_with_Option_link = By.xpath("//*[@name='copyWithOptions']");
	By Principle_Select_All_Checkbox = By.xpath("//*[@data-wfx-widgetlabel='user2CopyAll']");
	By Principle_Finish_Button = By.xpath("//*[@name='finishButton']");
	By User_ID_Field_admin = By.xpath("//*[@name='principalId']");
	By Name_Field_admin = By.xpath("//*[@name='name']");
	By New_Password_Field_admin = By.xpath("//*[@name='newPassword']");
	By Verify_Password_Field_admin = By.xpath("//*[@name='verifyPassword']");
	By Save_Admin_Button = By.xpath("//*[@name='saveButton']");
	By Refresh_Admin_Button = By.xpath("//*[@name='refreshButton']");
	By Continue_Admin = By.xpath("//*[@id='y1ZguD6']");
	By xperiment_field = By.xpath("//*[@id='HighestLevel']");
	By User_ID_KO_Randomly_Generated = By.xpath("//input[@id='j_username']");
	By Password_field_KO = By.xpath("//*[@id='j_password']");
	By SignIn   = By.xpath("//*[@id='j_signIn']");
	By Task_Field = By.xpath("//*[@id='taskName']");
	/*******************************************************************************************************************************************************
	 * Action Method for User Creation
	 * @throws Exception 
	 *
	 *****************************************************************************************************************************************************/
	
	public void createKoUser() throws Exception {
		driver.findElement(System_Admin_Link).click();
		driver.findElement(Security_link).click();
		driver.findElement(Principale_link).click();
		driver.findElement(User_ID_Field).sendKeys("autotestv1_ko1");
		synchoWait();
		driver.findElement(Principle_Search_Button).click();
		driver.findElement(Principle_Radio_Button).click();
		driver.findElement(Principle_Copy_Button).click();
		driver.findElement(Principle_with_Option_link).click();
		driver.findElement(Principle_Select_All_Checkbox).click();
		driver.findElement(Principle_Finish_Button).click();
		driver.findElement(User_ID_Field_admin).clear();
		driver.findElement(User_ID_Field_admin).sendKeys(newRandomUserID());
		//WebElement field_to_copy = driver.findElement(By.xpath(("//*[@name='principalId']")));
		//Actions action = new Actions(driver); 
		//synchoWait();
		//action.moveToElement(field_to_copy).click().build().perform();
		//Highlight and Copy the newly created userID from User Id Field
		//driver.findElement(User_ID_Field_admin).sendKeys((Keys.chord(Keys.CONTROL,"a")),Keys.chord(Keys.CONTROL,"c"));
		
		CanidateID = getAttributeValueOfElement(User_ID_Field_admin);
		driver.findElement(Name_Field_admin).clear();
		driver.findElement(Name_Field_admin).sendKeys("John Smith");
		synchoWait();
		driver.findElement(New_Password_Field_admin).clear();
		driver.findElement(New_Password_Field_admin).sendKeys("123");
		driver.findElement(Verify_Password_Field_admin).clear();
		driver.findElement(Verify_Password_Field_admin).sendKeys("123");
		synchoWait();
		driver.findElement(Save_Admin_Button).click();
		synchoWait();
		driver.findElement(Refresh_Admin_Button).click();
		synchoWait();
		
		driver.findElement(Profile_Dropdown).click();
		driver.findElement(Sign_Out).click(); 
		driver.findElement(Continue_Admin).click();
	}
	
	
	
	/*******************************************************************************************************************************************************
	 * Action Method for New Warrent Page
	 *
	 *****************************************************************************************************************************************************/

	
	
	public void createNewWarrantPage() throws Exception {

		/********************************************************************************************************************************
		 * Initiate Warrant Application
		 ********************************************************************************************************************************/
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		  // Navigating to the Warrant Page
		  driver.findElement(Transaction_Link).click();
		  driver.findElement(Acquisitions_Link).click();
		  driver.findElement(Additional_Form_Link).click();
		  driver.findElement(New_Link).click();
		  driver.findElement(Warrent_link).click(); 
		// switching to page Iframe
		  WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		  driver.switchTo().frame(iframe); // Filling out all data's for the page
		  driver.findElement(Warrent_Template_Field).sendKeys("CLASS_I");
		  //Sending the newly created KO User to Canidate ID field
		  synchoWait();
		 // driver.findElement(By.id("CandidateOpID")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		  enterTextInField(CanidateID, Canidate_ID_Field);
		  synchoWait();
		  driver.findElement(By.xpath("//*[@id='po0']")).click();
		  synchoWait(); 
		  driver.findElement(DoDDAC_Input_Field).sendKeys("W91QV1");
		  driver.findElement(PCO_CheckBox).click(); synchoWait();
		  driver.findElement(Limited_Radio_Button).click();
		  driver.findElement(Prejudice_radio_Button).click();
		  synchoWait();
		  driver.findElement(Semester_radio_Button).click();
		  synchoWait();
		  driver.findElement(Supervisor_Field).sendKeys("dschrute"); 
		  synchoWait();
		  driver.findElement(New_Warrant_Submit_Button).click();
		   synchoWait();
		   AppID = getTextOfElement(Application_ID);
		  driver.switchTo().defaultContent();
		
		  driver.findElement(Profile_Dropdown).click();
		  driver.findElement(Sign_Out).click(); 
		//  driver.findElement(Transaction_Link).click();
		 // driver.findElement(Acquisitions_Link).click();
		 
		  //solicitation = new Solicitation();
		 // driver.findElement(solicitation.Contract_File).click();
		//  enterTextInField(applicationID);
		
		  //driver.findElement(solicitation.Search_Button).click();
		  
		 
	}
	

	
	public void reviewAppByCanidate() throws Exception {
		
		/*****************************************************************************************************************************************************
		 Review Warrant Application by Candidate
		 ******************************************************************************************************************************************************/
		try {
			synchronized (Task_Input_Field) {
				Task_Input_Field.wait(2000);
				driver.findElement(Task_Input_Field).sendKeys("Candidate Warrant Review");
				}
		} catch (Exception e) {
			driver.findElement(Task_Input_Field).sendKeys("Candidate Warrant Review");
		}
		 synchoWait();
		 
		 enterTextInField(AppID,Item_Number_Field);
		//((JavascriptExecutor)driver).executeScript("document.getElementById('taskName').value= \'"  + AppID + "\'");
		driver.findElement(Search_Button).click();
		//driver.findElement(Sort_Task_Button).click();
		//driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		//synchoWait();
		//driver.findElement(Sort_Decending_Arrow).click();
		//synchoWait();
		//driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		synchoWait();
		driver.findElement(Open_Button).click();
		synchoWait();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		driver.switchTo().frame(iframe); // Filling out all data's for the page
		driver.findElement(Cand_Review_Submit_Button).click();
		driver.switchTo().defaultContent();
		driver.findElement(Profile_Dropdown).click();
		driver.findElement(Sign_Out).click(); 
		
	    	
	}
	
	
	
	public void approveApplicationBySupervisor() throws Exception {
	/*****************************************************************************************************************************************************
	Approve Warrant Application by Supervisor
	 ******************************************************************************************************************************************************/
		try {
			synchronized (Task_Input_Field) {
				Task_Input_Field.wait(2000);
				driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
				}
		} catch (Exception e) {
			driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
		}
		synchoWait();
		enterTextInField(AppID,Item_Number_Field);
		driver.findElement(Search_Button).click();
		//synchoWait();
		//driver.findElement(Sort_Task_Button).click();
		//driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		//driver.findElement(Sort_Decending_Arrow).click();
		//synchoWait();
		//driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		driver.findElement(Open_Button).click();
		synchoWait();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		driver.switchTo().frame(iframe); // Filling out all data's for the page
		driver.findElement(Req_Official_Select_Drop_Down).click();
		driver.findElement(Req_Official_Select_Sub_Value).click();
		driver.findElement(Req_Official_Text_Area).sendKeys("Test Automation");
		 synchoWait();
		 driver.findElement(Req_Submit_Button).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(Profile_Dropdown).click();
		 driver.findElement(Sign_Out).click(); 
	}
	
	/*****************************************************************************************************************************************************
	Approve Warrant Application by Review Official
	 
	 ******************************************************************************************************************************************************/
	public void reviewOfficialApproval() throws Exception {
		try {
			synchronized (Task_Input_Field) {
				Task_Input_Field.wait(2000);
				driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
				}
		} catch (Exception e) {
			driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
		}
		synchoWait();
		enterTextInField(AppID,Item_Number_Field);
		driver.findElement(Search_Button).click();
		//driver.findElement(Sort_Task_Button).click();
		//driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		//synchoWait();
		//driver.findElement(Sort_Decending_Arrow).click();
		//synchoWait();
		//driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		driver.findElement(Open_Button).click();
		synchoWait();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		driver.switchTo().frame(iframe); // Filling out all data's for the page
		 synchoWait();
		 driver.findElement(Req_Submit_Button).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(Profile_Dropdown).click();
		 driver.findElement(Sign_Out).click(); 

		
	}
	
	/*****************************************************************************************************************************************************
	Approve Warrant Application by CORB/Endorsing Official
	 
	 ******************************************************************************************************************************************************/
	public void corbEndorsingOfficialApproval() throws Exception {
		try {
			synchronized (Task_Input_Field) {
				Task_Input_Field.wait(2000);
				driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
				}
		} catch (Exception e) {
			driver.findElement(Task_Input_Field).sendKeys("Review/Approve Warrant");
		}
		synchoWait();
		enterTextInField(AppID,Item_Number_Field);
		driver.findElement(Search_Button).click();
		//driver.findElement(Sort_Task_Button).click();
		//driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		//synchoWait();
		//driver.findElement(Sort_Decending_Arrow).click();
		//synchoWait();
		//driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		driver.findElement(Open_Button).click();
		synchoWait();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		driver.switchTo().frame(iframe); // Filling out all data's for the page
		 synchoWait();
		 driver.findElement(Req_Submit_Button).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(Profile_Dropdown).click();
		 driver.findElement(Sign_Out).click(); 

		
	}
	
	/*****************************************************************************************************************************************************
	Approve Warrant Application by Appointing Official (PARC)
	 
	 ******************************************************************************************************************************************************/
	public void appointingOfficialApproval() throws Exception {
		try {
			synchronized (Task_Input_Field) {
				Task_Input_Field.wait(2000);
				driver.findElement(Task_Input_Field).sendKeys("Complete Warrant");
				}
		} catch (Exception e) {
			driver.findElement(Task_Input_Field).sendKeys("Complete Warrant");
		}
		synchoWait();
		enterTextInField(AppID,Item_Number_Field);
		driver.findElement(Search_Button).click();
		//driver.findElement(Sort_Task_Button).click();
		//driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
		//synchoWait();
		//driver.findElement(Sort_Decending_Arrow).click();
		//synchoWait();
		//driver.findElement(Sort_Button).click();
		synchoWait();
		driver.findElement(Box_Card).click();
		driver.findElement(Open_Button).click();
		synchoWait();
		WebElement iframe = driver.findElement(By.xpath("//*[@id='PegaGadgetIfr']"));
		driver.switchTo().frame(iframe); // Filling out all data's for the page
		 synchoWait();
		driver.findElement(AppOfficial_Approve_Radio_Button).click();
		 synchoWait();
		driver.findElement(PassCORB_Radio_Button).click();
		synchoWait();
		driver.findElement(Generate_SF1402_Button).click();
		 synchoWait();
	   driver.findElement(Req_Submit_Button).click();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   //verify Success Confirmation Message
	   String expected = driver.findElement(Confirmation_Sussess_Message).getText();
	   System.out.println(expected);
	   String actual = "Thank you! The next step in this application has been routed appropriately.";
	   if(expected.equalsIgnoreCase(actual)) {
		   System.out.println("Warrent form has been send and submitted successfully");
	   }else {
		   System.out.println("Warrent form has not been send and wasn't able to submit");
	   }
	   driver.switchTo().defaultContent();
	   driver.findElement(Profile_Dropdown).click();
	   driver.findElement(Sign_Out).click(); 

		
	}
	
	//Method for sending the randomly generated Ko User ID to log in as Canidate
	public void koUserRandomlyGenerated() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Actions a = new Actions(driver); //to perform copy actio
		//driver.findElement(User_ID_KO_Randomly_Generated).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		enterTextInField(CanidateID, User_ID_KO_Randomly_Generated);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(Password_field_KO).sendKeys("123");
		driver.findElement(SignIn).click();
		
	}


	public void synchoWait() throws InterruptedException {
		Object lock = new Object();
		synchronized (lock) {
			lock.wait(2000);
		}
	}
	
	
	
	public String newRandomUserID( ) {
		  char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
	        
	        StringBuilder sb = new StringBuilder(20);
	        Random rand = new Random();
	        for (int i = 0; i < 2; i++) {
	            char c = chars[rand.nextInt(chars.length)];
	        
	            sb.append(c).toString();
	         }      
	        int num2 = (rand.nextInt(9000));
	        
	      //   DecimalFormat df1 = new DecimalFormat("00");
	        DecimalFormat df2 = new DecimalFormat("0000");
	        
	         String reqNumber = "Auto_Warrant" +"-"+ sb + "-" + df2.format(num2);
	        
	         System.out.println(reqNumber);
	         return reqNumber;

	}
	
	

		  public void innerScrollTry() throws Exception {
//			  try {
//					synchronized (Task_Input_Field) {
//						Task_Input_Field.wait(2000);
//						driver.findElement(Task_Input_Field).sendKeys("Apply Electronic Signature");
//						}
//				} catch (Exception e) {
//					driver.findElement(Task_Input_Field).sendKeys("Apply Electronic Signature");
//				}
				
			  try {
				synchronized (Task_Field) {
					Task_Field.wait(3000);
					driver.findElement(Task_Field).sendKeys("SOL W91QV119R0073");
				}
			  } catch (Exception e) {
				  driver.findElement(Task_Field).sendKeys("SOL W91QV119R0073");
			}
				
				driver.findElement(Search_Button).click();
				driver.findElement(Sort_Task_Button).click();
				driver.findElement(Sort_By_Field).sendKeys("Assignment Date");
				synchoWait();
				driver.findElement(Sort_Decending_Arrow).click();
				synchoWait();
				driver.findElement(Sort_Button).click();
				synchoWait();
				driver.findElement(Box_Card).click();
				driver.findElement(Open_Button).click();
//				Thread.sleep(4000);
				((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
				WebElement iframes  = driver.findElement(By.xpath("//*[@id='taskSectionFrame']"));
                driver.switchTo().frame(iframes);
 //               Thread.sleep(4000);
				WebElement scroll = driver.findElement(By.xpath("//*[@id='page_0']"));
				JavascriptExecutor jvm =(JavascriptExecutor)driver;
                jvm.executeScript("scroll(0,1000)",scroll);
                synchoWait();
                driver.findElement(By.cssSelector("#accept_disclosure")).click();
               synchoWait();
                
                driver.findElement(By.xpath("//*[@id='main']"));
				
		  }
		  
			// Get Text of Element to store in variable call "text"
			public String getTextOfElement(By locator)  {
				//WebDriverWait wait = new WebDriverWait(driver, 30);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(Application_ID));
				 String text = driver.findElement(locator).getText();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				System.out.println("My copied value: " + text);
				// return elementText;
				return text;
			}
			
			public String getAttributeValueOfElement(By locator)  {
				//WebDriverWait wait = new WebDriverWait(driver, 30);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(Application_ID));
				 String text = driver.findElement(locator).getAttribute("value");
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				System.out.println("My copied value: " + text);
				// return elementText;
				return text;
			}

			// Enter Text of element from stored variable from getTextOfElement()
			//Locator Parameter pass in the Element Name
			//For Value pass in the variable name where value is stored, for value parameter 
			public void enterTextInField(String value, By locator)  {
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(value);
				//((JavascriptExecutor)driver).executeScript("document.getElementById('taskName').value= \'"  + value + "\'");
			//	jvm.executeScript("document.getElementById('taskName').value='"+AppID"'");
				 System.out.println("value copied");
			}
	
		  
			
		  
}
