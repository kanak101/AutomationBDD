package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject_OR.Solicitation;
import pageObject_OR.WorkloadManager;

public class WorkloadManagerStepDefs {
	
	 WorkloadManager workloadmanager;
	

	@Given("^I clicked on Sort Task$")
	public void i_clicked_on_Sort_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		workloadmanager = new WorkloadManager();
		workloadmanager.sortTask();
	}



	@Then("^I enter the following datas Lead Time page$")
	public void iEnterTheFollowingDatasLeadTimePage(DataTable table) throws Throwable {
		workloadmanager = new WorkloadManager();
		workloadmanager.workLoadManagerPageDataTable(table);
	}

	@Then("^I Assigne user in the Assignees page$")
	public void iAssigneUserInTheAssigneesPage() throws Throwable {
		workloadmanager = new WorkloadManager();
		workloadmanager.assigneeUser();
		}

	

	@And("^I verify successful confirmation message$")
	public void iVerifySuccessfulConfirmationMessage() throws Throwable {
		workloadmanager = new WorkloadManager();
		workloadmanager.verifyAssigneesSave();
		
	}



	

}
