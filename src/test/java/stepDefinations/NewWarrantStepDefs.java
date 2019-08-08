package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject_OR.AcceptContinue;
import pageObject_OR.LoginPage;
import pageObject_OR.NewWarrant;
import utilities.TestBase;

public class NewWarrantStepDefs extends TestBase {
	AcceptContinue acceptPage;
    LoginPage loginPage;
    NewWarrant newWarrant;
    
    
    @Then("^I create new Admin user$")
	public void iCreateNewAdminUser() throws Throwable {
		
		newWarrant = new NewWarrant();
		newWarrant.createKoUser();
	}


	@And("^I Initiate Warrant Application$")
	public void iInitiateWarrantApplication() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.createNewWarrantPage();
		
	}


	@And("^I Review Warrant Application by Canidate$")
	public void iReviewWarrantApplicationByCanidate() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.reviewAppByCanidate();
	}


	@And("^I Approve Warrant Application by Supervisor$")
	public void iApproveWarrantApplicationBySupervisor() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.approveApplicationBySupervisor();
	}


	@And("^I Approve Warrant as a Review User$")
	public void iApproveWarrantAsAReviewUser() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.reviewOfficialApproval();
		
	}


	@And("^I Approve as a CORB user$")
	public void iApproveAsACORBUser() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.corbEndorsingOfficialApproval();
	}


	@And("^I approve as a Appointing User$")
	public void iApproveAsAAppointingUser() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.appointingOfficialApproval();
	}


	@Then("^I am in the ACWS login page as a ko User New Warrant$")
	public void iAmInTheACWSLoginPageAsAKoUserNewWarrant() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.koUserRandomlyGenerated();
	}


	@And("^I check inner scroll$")
	public void iCheckInnerScroll() throws Throwable {
		newWarrant = new NewWarrant();
		newWarrant.innerScrollTry();
	}


	
	}

