@Regression
Feature: B.2.1.1 Execute Workload Status and Assignment Query
  I want to Execute Workload Status Assignment Query 

  @ExecuteWorkloadStatusAssignmentQuery
  Scenario: Test ability to use Workload Status Assignment Query  
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Workload Status and Assignment Query page
     And I verify that I am in the Workload Status and Assignment Query page
    Then I fill out the data in the Search Criteria section
				 |  Document Type | Document Number   |
				 | REQ					  | REQ-37-7242       |
    And I click the Search button  
    Then I click the checkbox next to the appropriate item in the results section
    And I verify the Document Number is same as the Document Number from the Search Criteria
    And I verify the Assignment Status is Assigned
    Then I click the View Award/Requisition button to review the REQ
    And I click the Itemized Lines tab 
    And I verify the REQ number 
    
    	
    