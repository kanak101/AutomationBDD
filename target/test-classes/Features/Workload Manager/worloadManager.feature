@Regression
Feature: Workload Manager
  I want to create a Workload Manager

  @WorkLoadManager
  Scenario: Create a Workload Manager
    Given I click on Accept & Continue
    Then I validate seal logo is displayed
    Then I logged in as a Workload Manager User
    And I clicked on Sort Task
    And I click on the Open and Acquire Button
    Then I enter the following datas Lead Time page
    |Lead Time Template  | Procurement Method | Procurement Type |
    |$10-100M COM   		 | FO									| FFP							 |	
    Then I Assigne user in the Assignees page 
     And I verify successful confirmation message
    
 
