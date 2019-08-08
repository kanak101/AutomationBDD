@Regression
Feature: T&E
  I want to create T&E

  @CreateSol
  Scenario: Create a t&e
    #Given I click on Accept & Continue
    #Then I validate seal logo is displayed
    #Then I am in the ACWS login page as KO user
    #Then I search for solicitation document
    Given I click on Accept & Continue
    Then I validate seal logo is displayed
    Then I am in the ACWS login page as a CS User
    And I navigate to Contract File Search page
    Then I fill out the data in the Contract File
      | Identifier         |
      | CCF-W912HQ-19-0015 |
    Then I dispaly Contract File Search data
    And I pick the following contract file
    And I add milstone
