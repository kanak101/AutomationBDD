@Regression
Feature: Contract File
  I want to use this template for my feature file

  @CreateContractFile
   Scenario: Create a new Contract File
   Given I click on Accept & Continue
    Then I validate seal logo is displayed
    Then I am in the ACWS login page as a CS User
    And I search and select the following Workload Assignment
    |Item Number   |
    |REQ REQ-11-2019|
    And I click on the Open and Acquire Button
    And I click on the contract file tab
    And I enter the New Contract File data
    |Contract File Template | FileTypeDODAAC | Title 											| 
    | ACWS_CCF              |	CCF-W91QV1	   |	Ship Level2	              |
    And I click on save button
    And I verify the save confirmation message 
    
    