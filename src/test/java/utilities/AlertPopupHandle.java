package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AlertPopupHandle extends TestBase{
	
	
	
	
public  void AlertDemo() throws Exception {         	      	
       		
         // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		     		
        // Displaying alert message		
        System.out.println(alert.getText());	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	

	
	public boolean isAlertPreset() {
		{ 
		    try 
		    { 
		        driver.switchTo().alert(); 
		        return true; 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }   // catch 
		}
}

}
