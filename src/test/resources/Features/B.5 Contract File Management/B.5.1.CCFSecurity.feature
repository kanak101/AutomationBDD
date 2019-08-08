@Regression
Feature: B.5.1 CCF Security
  I want to Modify CCF Security 

  @CCFSecurity
  Scenario: Test ability for administrator(s)/owners of the CCF to be allowed to 
  restrict access to the CCF by selecting Manage Security
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Search Contract File page
     And I verify that I am in the Search Contract File page
    Then I fill out the data in the Search Crireria section
				 |  Identifier 				| 
				 | CCF-W91QV1-19-0003	| 
    And I click the Search button  
    Then I click the checkbox next to the appropriate item in the results section
    And I click the Open button to open the CCF
    Then I click the Manage Security button 
    And I click the Add User/Group button 
    And I select User under the Type heading in the new line
    And I add the user id information into the new line
    		|User Id |
    		|pparker | 
    And I select True under the Administrator heading
    And I click the + icon to display the folder access
    And I click the Add Folder(S) button 
    And I select the Contract File folder
    And I click the Select button 
    Then I click the + icon again to display the folder access
    And I select the Contract File folder
    And I select Yes for View 
    And I select Yes for Update 
    And I select Yes for Remove Content
    And I select Yes for Delete Folder 
    Then I click Previous button 
    And I click Save buttton 
    And I verify the Action was successful. message
    
    
    
    
    
    	
    