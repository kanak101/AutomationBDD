package testTunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features =  "src/test/resources/Features",
			plugin = {"json:target/cucumber.json", "html:target/src/site/cucumber-pretty"},
			
			glue = {"stepDefinations"},
			
			
			strict = true,
			dryRun =false
			)


	public class TestRunner {
	
}
