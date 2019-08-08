@Regression
Feature: Solicitation
  I want to create a Solicitation 

  @CreateSol
  Scenario: Create a Solicitation via Search file Contract File
   
    #Given I click on Accept & Continue
    #Then I validate seal logo is displayed
    #Then I am in the ACWS login page as a CS User
    #And I navigate to Contract File Search page
    #Then I fill out the data in the Contract File
    #|Identifier |  
    #|CCF-W912HQ-19-0015|
    #Then I dispaly Contract File Search data
    #And I pick the following contract file
    #And I select the Requation folder from the contract file
    #Then I enter the following Data in New Solicitation page
    #|Document Type |DODAAC |Instrument Type  |
    #| SOL   			 |W91QV1 |R								 |
    #And I verify generate button is displayed
    #And I click on the generate button
    #And I verify Document Number is Generated
    #Then I click on Finish Button
    #Then I enter following Data's in Header Page
    #|Form Type   |Printing Format  |  CODE 	          | Removel Date| Closing Date   |Removel Time |Closing Time |Method of Acquisition |Close Time Zone | 
    #|SF1449      |COM							 | CGIFEDERA        | 05/16/2019  |  05/16/2019	   |12:00        |12:00        |RFP 									|GMT+00:00 GMT, Western European Time, Morocco|	
    #Then I verify the save confirmation message is displayed
    #Then I navigate to Contract File
    #Then I fill out the data in the Contract File
    #|Identifier |  
    #|CCF-W912HQ-19-0015|
    #Then I dispaly Contract File Search data
    #And I pick the following contract file
    #And I select the Announcement folder from the contract file
     #Then I enter the following Data in New Announcement page
    #|Document Type |DODAAC 		|
    #| PRA  				 | W91QV1   |
    #And I fillout Announcement Header Page
    #|Announcement Title | Description 								  | Response Date  | Product Service Code |
    #|productServiceCode | copied over from solicitation | 05/19/2020     | 56										|
     #And I switch back to parent window
     #Then I log out of the page
    #Then I click on Return to Sign in Page
    #Given I click on Accept & Continue
    #And I am in the ACWS login page as KO user
    #And I search and approve as a KO User
    #Then I log out of the page
    #Then I click on Return to Sign in Page
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to Contract File Search page
    Then I fill out the data in the Contract File
    |Identifier |  
    |CCF-W912HQ-19-0015|
    Then I dispaly Contract File Search data
    And I pick the following contract file
    And I pick the folder for correct all the lines
    And I enter the following office data
    |Administerted  				| Email   					| Phone 			 |
    |Contract Issuing Office| gharrison@mail.mil| 202-555-5555 |
    Then I click on Additional Tabs for T&C
    
    
    

   
      
    
   
 
 
 
 
