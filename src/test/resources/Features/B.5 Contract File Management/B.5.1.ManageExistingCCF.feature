@Regression
Feature: B.5.1 Mange Existing Central Contract File
  I want to Mange Existing Central Contract File

  @CreateAdditionalFolderinCCF
  Scenario: Test ability to create additional folder in CCF  
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Search Contract File page
     And I verify that I am in the Search Contract File page
    Then I fill out the data in the Search Criteria section
				 |  Identifier 				| 
				 | CCF-W91QV1-19-0003	| 
    And I click the Search button  
    Then I click the checkbox next to the appropriate item in the results section
    And I click the Open button to open the CCF
    And I click the Create and then click the Folder to add a new folder to the current CCF
    And I add fill out the data on the ADD FOLDER pop up menu
    		|Item         |
    		|New Folder   |
    And I click Ok button		
    Then I verify the new folder name
    And I click Save button
    And I verify the Action was successful. message
    
    
  @RenameFolderinCCF
  Scenario: Test ability to rename a folder in CCF  
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to the Search Contract File page
     And I verify that I am in the Search Contract File page
    Then I fill out the data in the Search Criteria section
				 |  Identifier 				| 
				 | CCF-W91QV1-19-0003	| 
    And I click the Search button  
    Then I click the checkbox next to the appropriate item in the results section
    And I click the Open button to open the CCF
    Then I select and expand the Contract File folder
    And I select the New Folder
    And I click the Actions and then click the Modify Folder to rename the selected folder
    And I add fill out the data on the MODIFY FOLDER pop up menu
    		|Item         		 |
    		|Modified Folder   |
    And I close the MODIFY FOLDER menu		
    Then I verify the modified folder name
    And I click Save button
    And I verify the Action was successful. message
    
 #PI3 and PI4 do not have this functinoality - will become availbel PI5 (not for MVS)
 #@AttempttoDeleteFolder
  #Scenario: Test attempt to delete folder in CCF  
   
   # Given I click on Accept & Continue
   # Then I am in the ACWS login page as a CS User
    # And I navigate to the Search Contract File page
     #And I verify that I am in the Search Contract File page
    #Then I fill out the data in the Search Criteria section
			#	 |  Identifier 				| 
				# | CCF-W91QV1-19-0003	| 
    #And I click the Search button  
   # Then I click the checkbox next to the appropriate item in the results section
   # And I click the Open button to open the CCF
   # Then I select and expand the Contract File folder
   # And I select the Modified Folder
   # And I click the Actions and then click the Delete 
   # And I verify the error meaasge  
    
    	
    