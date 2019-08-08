package pageObject_OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;



public class AcceptContinue extends TestBase {
	
	public AcceptContinue() {
		super();
		
	}


	
	        
	
	/*******************************************************************************************************************************************************
	 *  OBJECT REPO FOR LOGIN PAGE
	 *
	 * *****************************************************************************************************************************************************/
	
	//By acceptContinue = By.xpath("//button[@id='acceptBtn']");
	//By acceptContinue = By.xpath("//button[@id='acceptBtn']");
	//@FindBy(xpath="//button[@id='acceptBtn']")
	//WebElement acceptContinue;
	

	
	
	/*******************************************************************************************************************************************************
	 *  ACTIONS METHODS
	 *
	 * *****************************************************************************************************************************************************/
	
	//Method for clicking Accept Continue button.
	public void clickAcceptContinue() {
		
		WebElement acceptContinue = driver.findElement(By.xpath("//button[@id='acceptBtn']"));
		acceptContinue.click();
		
}
	}


