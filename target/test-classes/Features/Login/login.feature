@Regression
Feature: Login in to ACWS Application
  
  @Login
  Scenario: Verify Login in to ACWS Application
   #Given I want to open a browser
    Given I click on Accept & Continue
   # Then I validate seal logo is displayed
    Then I am in the ACWS login page as a CS User
    #And I close the broswer
    
    