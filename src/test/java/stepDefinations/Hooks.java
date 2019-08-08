package stepDefinations;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.TestBase;

public class Hooks extends TestBase {
	


	 @Before
	    public static void beforeScenario(){
		 TestBase.initialization();
	    } 
	 
	 @After
	    public static void afterScenario(Scenario scenario) throws Exception{
		 if (scenario.isFailed()) {
			    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			    scenario.embed(screenshot, "image/png");
			   
			}
		
		 
			TestBase.closeSession();
	    }
}
