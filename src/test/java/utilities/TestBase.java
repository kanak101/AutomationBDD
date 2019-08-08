package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
   
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/test/java/config/config.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			e.getMessage();
		}
		
		
	}
	
  
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		
	if(browserName.equals("chrome")){
		//System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", prop.getProperty("webdriver.chrome.driver"));
       // System.setProperty("log4j.configurationFile", prop.getProperty("log4j2ConfigFile"));
        
        /**
         * Uncomment below code to run in headless browser
         * 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
         */
        
		driver = new ChromeDriver();
	} 
	else if(browserName.equals("IE")){
		
		 
		 System.setProperty("webdriver.ie.driver", prop.getProperty("webdriver.ie.driver"));	
		 
	//	DesiredCapabilities ieCapabilities = new DesiredCapabilities();
		 
		 
		
		
		 
		
		/* * 
		
		 ieCapabilities.setCapability("nativeEvents", true);
		 ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
		 ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
		 ieCapabilities.setCapability("disable-popup-blocking", false);
		 ieCapabilities.setCapability("enablePersistentHover", true);
		 ieCapabilities.setCapability("ignoreZoomSetting", true);
		 ieCapabilities.setCapability("requireWindowFocus", true);
	//	 ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
	//	 ieCapabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		 ieCapabilities.setJavascriptEnabled(true);
		
		 
		  //ieCapabilities.setCapability("nativeEvents", true); 
		   ieCapabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		    ieCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		    ieCapabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		    ieCapabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);
		    ieCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		    //ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		    ieCapabilities.setCapability("disable-popup-blocking", false);
		    ieCapabilities.setJavascriptEnabled(true);
		    //ieCapabilities.setCapability("killProcessesByName", true);
		   // ieCapabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"");
		     
		   */
		 
		
		  driver = new InternetExplorerDriver(getCapabilities());
	}
		 
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));	
	
	}
	
	
	
	
	
	 

	public static InternetExplorerOptions getCapabilities() {
	    InternetExplorerOptions ieOptions = new InternetExplorerOptions();
	  
	    ieOptions.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);
	    ieOptions.setCapability("ignoreProtectedModeSettings", false);
		
		//ieOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	    ieOptions.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	    ieOptions.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
	    ieOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
	    ieOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    ieOptions.setCapability("disable-popup-blocking", false);
	   // ieOptions.setJavascriptEnabled(true);
	    ieOptions.setCapability("requireWindowFocus", true);
	 //   ieOptions.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"");
	  
	  
	    return ieOptions;
	}


	
	public static void closeSession() throws Exception {
		
		  
		driver.close();
		
		
		
    } 
}




	
	

	
	

