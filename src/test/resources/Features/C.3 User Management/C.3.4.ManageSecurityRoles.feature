@Regression
Feature: C.3.4_Manage Security Roles
  I want to Create New Security Roles, Update Security Roles and Delete Security Roles

  @CreateNewSecurityRoles
  Scenario: Test ability of creating new Security Roles
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to System Administration > Security > Roles  then to the Search Security Role page 
     And I verify that I am in the Search Security Role page
    Then I click the New button 
     And I fill out the data in the Security Role page 
     		 | Code   | Name      								| Security Org  | Description     |
     		 | SCS    | Smoke Contract Specialist | BASE					| Test Automation |
     And I click the Save button 
     And I verify the Action was successful. message 
     Then I click the Security Entries tab 
     And I click the Add button 
     And I select Acquisitions for Category and Additional Forms for subvalue
     And I click the Search button 
     And I select the checkbox next to the the appropriate category in the results section
     And I click the Select button 
     And I select the appropriate Security Category
     And I click the Select All button to add Security Actions 
     And I click the Save button 
     And I verify the Action was successful. message 
     Then I click the Overrideable Errors tab
     And I click the Add button 
     And I enter the following 
        |Code    |
        |AG1929W |
     And I click the Search button 
     And I select the checkbox next to the the appropriate Overrideable Error in the results section
     And I click the Select button 
     And I click the Save button 
     And I verify the Action was successful. message 
  
  @UpdateSecurityRoles
  Scenario: Test ability of updating Security Roles
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to System Administration > Security > Roles  then to the Search Security Role page 
     And I verify that I am in the Search Security Role page  
     And I enter the following 
        |Code   |
        |SCS    |
     And I click the Search button 
     And I select the appropriate security role in the results section  
     And I click the Open button 
     And I click the Security Entries tab
     And I select the Security Category in the results section
     And I uncheck the List from the Security Actions 
     And I click the Save button 
     Then I verify the Action was successful. message
     
     
 @DeleteSecurityRoles
  Scenario: Test ability of deleting Security Roles
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to System Administration > Security > Roles  then to the Search Security Role page 
     And I verify that I am in the Search Security Role page  
     And I enter the following 
        |Code   |
        |SCS    |
     And I click the Search button         
     And I select the appropriate security role in the results section   
     And I click the Delete button    
     And I click the Yes button to confirm 
     Then I verify the Deletion was successful. message      
     
      
     
        
    
    	
    