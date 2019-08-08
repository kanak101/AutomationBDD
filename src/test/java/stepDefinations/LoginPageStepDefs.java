package stepDefinations;

import java.awt.Window;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObject_OR.AcceptContinue;
import pageObject_OR.LoginPage;
import utilities.TestBase;
import utilities.WindowsHandle;

import org.openqa.selenium.WebElement;

public class LoginPageStepDefs extends TestBase {
	 
	//AcceptContinue acceptPage;
	//LoginPage loginPage;
	
	AcceptContinue acceptPage;
     LoginPage loginPage;
     WindowsHandle windowHandle;
	
	

     


	
	//@Given("^I want to open a browser$")
	//public void i_want_to_open_a_browser() throws Exception{
	//	TestBase.initialization();
	//hookpage = new Hooks();
	//hookpage.BeforeTest();
		
	    
	//}
	

	
	@Given("^I click on Accept & Continue$")
	public void i_click_on_Accept_Continue() throws Exception{
	    acceptPage = new AcceptContinue();
		acceptPage.clickAcceptContinue();
	}
	
	
	@Then("^I validate seal logo is displayed$")
	public void i_validate_seal_logo_is_displayed() throws Exception {
		loginPage = new LoginPage();
		Thread.sleep(3000);
	//	loginPage.validateCrmImage();
		
		
	}
	
	@Then("^I logged in as a Workload Manager User$")
	public void i_logged_in_as_a_Workload_Manager_User() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("autotestv1_wm1", "123");
	}

	
	@Then("^I am in the ACWS login page as a CS User$")
	public void i_am_in_the_ACWS_login_page_as_a_CS_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("autotestv1_cs1", "123");
	}
	
	
	@Given("^I am in the ACWS login page as a admin User$")
	public void i_am_in_the_ACWS_login_page_as_a_Admin_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("admin", "adminadmin");
	}
	
	
	@Then("^I am in the ACWS login page as a supervisor User$")
	public void i_am_in_the_ACWS_login_page_as_a_Supervisor_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("dschrute", "123");
	}
	
	@Then("^I am in the ACWS login page as a Review User$")
	public void i_am_in_the_ACWS_login_page_as_a_Review_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("jhalpert", "123");
	}
	
	@Then("^I am in the ACWS login page as a CORB User$")
	public void i_am_in_the_ACWS_login_page_as_a_Corb_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("mscott", "123");
	}
	
	@Then("^I am in the ACWS login page as a Appointing User$")
	public void i_am_in_the_ACWS_login_page_as_a_Appointing_User() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = new LoginPage();
		loginPage.loginToHomePage("pbeesly", "123");
	}
	
	@And("^I click on Return to Sign in Page$")
	public void i_click_on_Return_to_Sign_in_Page() throws Exception{
		loginPage = new LoginPage();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginPage.clickReturntoSignInPage();
	}


	@And("^I am in the ACWS login page as KO user$")
	public void iAmInTheACWSLoginPageAsKOUser() throws Throwable {
		loginPage = new LoginPage();
		loginPage.loginToHomePage("autotestv1_ko1", "123");
	}


	@Then("^I log out of the page$")
	public void iLogOutOfThePage() throws Throwable {
		loginPage = new LoginPage();
		loginPage.logoutOfthePage();
	}
	
	
	 
	 
	 



	}










	




