@Regression
Feature: Issue Award 
  I want to create a new Award  

  @IssueAWD	
  Scenario: Create a New Award via Search file Contract File
   
    Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
     And I navigate to Contract File Search page
    Then I fill out the data in the Search-Contract File page
    |Identifier |  
    |CCF-W91QV1-19-0003|
    Then I select the appropriate contract file and click open 
    Then I select the Contract file folder and click Expand button 
  	And I locate the Solicitation W91QV119R0004, select it, click on Actions button, click Copy Frwd Transaction, click Award 
  	Then I fill out data in the NEW AWARD page
  	|Document Type|DODAAC  |Instrument Type|
  	|AWD					|W91QV1	 |	C						 |	
  	
    
    