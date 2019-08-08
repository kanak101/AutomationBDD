package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class GetandSentValue extends TestBase {
	
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
				
				public void enterTextInField(String string, By locator)  {
					driver.findElement(locator).clear();
					driver.findElement(locator).sendKeys(string);
					//((JavascriptExecutor)driver).executeScript("document.getElementById('taskName').value= \'"  + value + "\'");
				//	jvm.executeScript("document.getElementById('taskName').value='"+AppID"'");
					 System.out.println("value copied");
				}

}
