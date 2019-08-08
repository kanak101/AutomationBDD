package utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class WindowsHandle extends TestBase {
	
	public void windowsHandle(){
		
		//Main Window
		String MainWindow = driver.getWindowHandle();
		
		//To handle all new open window
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			String ChildWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				//Switching to child window
				
				driver.switchTo().window(ChildWindow);
				System.out.println(ChildWindow + "switch to child window");
				driver.manage().window().maximize();
			//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			} 
			
			
			
				
			
			
			
			
			 
			
		}  
	}
	
	public void switchToParentWindow() {
		
//Store the current window handle
String winHandleBefore = driver.getWindowHandle();
System.out.println("winHandleParent" + winHandleBefore);

//Perform the click operation that opens new window

//Switch to new window opened
for(String winHandle : driver.getWindowHandles()){
 driver.switchTo().window(winHandle);
driver.switchTo().window(winHandleBefore);
}
	}

	
		

		
		
		
			
	
	public void abcWindow() {
		String parent =driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		System.out.println("Total window " + count);
		
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				System.out.println("Child window id" + child);
				
			}
			
			String child2 = driver.getWindowHandle();
			for(String child3: driver.getWindowHandles()) {
				if(!child3.equalsIgnoreCase(parent)&& !child3.equalsIgnoreCase(child2)) {
					driver.switchTo().window(child3);
					System.out.println("child 3 window id " + child3);
				}
			}
		}
		
		
	}

	
	
	
		
		 
		public void closeParentWindow() {
			 String winHandleBefore = driver.getWindowHandle();
			 for (String winHandle : driver.getWindowHandles()) {
			   // Switch to child window
			   driver.switchTo().window(winHandle);
			 }

			// Do some operation on child window and get child window handle.
			String winHandleAfter = driver.getWindowHandle();

			//switch to child window of 1st child window.
			for(String winChildHandle : driver.getWindowHandles()) {
			  // Switch to child window of the 1st child window.
			  if(!winChildHandle.equals(winHandleBefore) 
			  && !winChildHandle.equals(winHandleAfter)) {
			    driver.switchTo().window(winChildHandle);
			    System.out.println(driver.getTitle() + " page title a:");
			 //   driver.close();
			    
			   }
			  	driver.switchTo().window(winHandleBefore);
				System.out.println(driver.getTitle() + " page title b:");
			 }

		   //  driver.close();
			
			
		}
		
}
		


			
		
		
		
		
	
	
	
		
		
	

	

