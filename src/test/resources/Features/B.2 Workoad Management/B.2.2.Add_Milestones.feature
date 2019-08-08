@Smoke
Feature: B.2.2 Add Milestones

  @AddMilestones
  Scenario: Test CS's ability to add Milestones
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
    Then I go to the Search Contract File page
    And search for the contract file by Identifier field 
    And I click the Search button 
    And I select the appropriate contract file and click Open
    Then I click the TasksMilestones tab
    And I select the Gantt display
    And I click the Actions and then Add button 
    And I double click on Open to open the Milestone Details pop up menu
    And I fill out the data
    		| Milestone/Task Template |
        | Complex Contract 				|
    And I click Ok
    Then I select the Open again and click the Actions then Default 
    And I verify the Action was successful. message
    Then I click the Save button 
    And I verify the Action was successful. message  
    
    

 