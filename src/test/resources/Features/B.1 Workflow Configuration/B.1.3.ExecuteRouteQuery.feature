@Regression
Feature: B.1.3_Execute Route Query
  I want to Test ability to review Ad Hoc Workflow  

  @ExecuteRouteQuery
  Scenario: Test ability to review and verify Ad Hoc Workflow 
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Route Query page
     And I verify that I am in the Route Query page
    Then I fill out the data in the Search Criteria section
				 |  Object Number | Status   |
				 | W91QV119R0004  | active	 |
    And I click the Search button  
    Then I click the checkbox next to the appropriate routed item in the results section
    And I verify the Status is Active into the Routing Information section
    And I also verify that the Current Mail Stop is autotestv1_ko1 into the Mail Stop Information Section  
    Then I click the View button to review the routed transaction and verify that the Header page is displaying
    And I verify the Solicitation number form the General section
    
    	
    