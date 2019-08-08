
package pageObject_OR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import utilities.TestBase;

public class LoginPage extends TestBase {
	
	
	
	
	
	public LoginPage(){
		super();
		
	}
	
	
	
	/*******************************************************************************************************************************************************
	 *  OBJECT REPO FOR LOGIN PAGE
	 *
	 * *****************************************************************************************************************************************************/
	
	
	 By  userID = By.xpath("//input[@id='j_username']");
    //By passWord = By.xpath("//*[@id='j_password']");
     By passWord = By.xpath("//*[@id='j_password']");
     By SignIn   = By.xpath("//*[@id='j_signIn']");
  // Click on Return to the SgnIN Page
     By clickReturntoSignInPage= By .xpath("//*[@class='btn btn-default btn-icon-right']");
     By Profile_Dropdown           = By.xpath("//*[@id='wfx-profile-dropdown-button']");
 	 By Sign_Out = By.xpath("//*[@class='btn-signout']");
	
	
 
	
	 

     /*******************************************************************************************************************************************************
 	 *  ACTIONS METHODS FOR LOGIN PAGE
 	 *
 	 * *****************************************************************************************************************************************************/
	
	
	//Set user name 
	
	public void setUserName(String strUserName) {
		driver.findElement(userID).sendKeys(strUserName);
		//userID.sendKeys(strUserName);
		//userID.sendKeys(strUserName);
		//return new LoginPage();
	}
	
	//Set passowrd in text box
	
	public  void setPassword(String strPassword) {
		//driver.findElement(passWord).sendKeys(strPassword);
		driver.findElement(passWord).sendKeys(strPassword);
		//return new LoginPage();
	}
	
	//Click on sign in button
	
	public void clickLogin() {
		driver.findElement(SignIn).click();
		//SignIn.click();
		//SignIn.click();
		//return new LoginPage();
	}
	
	//Sign in page login
	
	public void loginToHomePage(String strUserName, String strPassword) {
		
		
		setUserName(strUserName);
		setPassword(strPassword);
		clickLogin();
		//return new LoginPage();
		
	}
	
	public void clickReturntoSignInPage() throws Exception{
     synchoWait();
        driver.findElement(clickReturntoSignInPage).click();
        }
	

	
	
	public void synchoWait() throws InterruptedException {
		Object lock = new Object();
		synchronized (lock) {
			lock.wait(3000);
		}
	}
	
 public void logoutOfthePage() {
	  driver.findElement(Profile_Dropdown).click();
	  driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	  driver.findElement(Sign_Out).click(); 
 }
	
}

	

