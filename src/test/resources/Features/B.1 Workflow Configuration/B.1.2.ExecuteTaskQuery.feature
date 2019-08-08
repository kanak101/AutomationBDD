@Regression
Feature: B.1.2_Execute Task Query
  I want to Test ability of reviewing workflow tasks  

  @ReviewWorkflowTask
  Scenario: Test ability to review and verify workflow tasks
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Queries>Workflow>Task; Task Query page
     And I verify that I am in the Task Query page
    Then I click and expand the Document Details section
    And I fill out the data in the Document Details section
				 |  Document Number | 
				 | W91QV119R0004    | 
    And I click the Search button  
    Then I click the checkbox next to the appropriate item in the results section
    Then I click the View button to review the transaction 
    And  I verify that the Header page is displaying and Solicitation Number is same as the Document Number 
    And I click the Task Query breadcrumb to return to the query page
    Then I click the checkbox next to the appropriate item in the results section
    And I click the Open button to go to the Task Details page 
    And I click the Assignees button  
    And I verify that User Id is autotestv1_ko1
     
    
    
    	
    