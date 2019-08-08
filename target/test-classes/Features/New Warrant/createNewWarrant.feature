@Regression
Feature: New Warrant
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given I click on Accept & Continue
    Given I am in the ACWS login page as a admin User
    Then  I create new Admin user 
    And   I click on Return to Sign in Page
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
    And I Initiate Warrant Application
    And   I click on Return to Sign in Page
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a ko User New Warrant
    And I Review Warrant Application by Canidate
    And   I click on Return to Sign in Page
    Given I click on Accept & Continue  
    Then I am in the ACWS login page as a supervisor User
    And I Approve Warrant Application by Supervisor
    And   I click on Return to Sign in Page
    Given I click on Accept & Continue
    And I am in the ACWS login page as a Review User
    And I click on Return to Sign in Page
    And I Approve Warrant as a Review User
    And I click on Return to Sign in Page
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CORB User
    And I Approve as a CORB user
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a Appointing User
    And I approve as a Appointing User
    