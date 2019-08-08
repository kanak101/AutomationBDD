@Regression
Feature: B.5.1 Create Contract File
  I want to Create Central Contract File 

@CreateNewCCFAsCSViaWorkloadTask
  Scenario: Test ability of creating new Central Contract File as CS user via Workload- View Assignment Task for the Purchase Request
		Given I click on Accept & Continue
		Then I am in the ACWS login page as a IQ user 
		Then I create a new requisition and pass it to the WM for approval 
		Then WM user approves the requisition and assigns the task to the CS user 
    Then I am in the ACWS login page as a CS User
    Then I search for and select the Workload - View Assignment Task for the Purchase Request
    And I click the Open and Acquire button to open the Workload - View Assignment Task
    Then I click the Contract File tab 
    And I click Action and then Create button to add new contract file 
    Then I verify that I am in the New Contract File page 
    And I fill out the following data on the New Contract File page to create a new Central Contract File 
     |Contract File Template |  File Type/DODAAC | Record Retention Category | Title       		      |
   	 |ACWS_CCF          		 |    CCF-W91QV1     | Environmental			       | Create Contract File |
   	And I click the Generate button
    And I click the Save button 
    And I verify that Contract Flie page is displayed 
    And I click on the WorkloadAssignment link on the top left hand corner of the page 
    And I click the Save button to associate the REQ to the new CCF 
    And I verify the Action was successful. message 

@CreateNEWCCFAsCS
  Scenario: Test ability of creating new Central Contract File as CS user 
  	Given I click on Accept & Continue
    Then I am in the ACWS login page as a CS User
    And I navigate to the Transactions > Acquisitions > Contract File; Search - Contract File page
    And I click the New button 
    Then I fill out the following data on the New Contract File page to create a new Central Contract File
    |Contract File Template |  File Type/DODAAC | Record Retention Category | Title       		     |
    |ACWS_CCF          		  |    CCF-W91QV1     | Environmental			        | Create Contract File |
    And I click the Generate button
    And I click the Save button 
    And I verify that Contract Flie page is displayed 
    Then I click the General Information tab
    And I verify that Creator ID field value is autotestv1_cs1
    And I also verify that Record Retention Category field value is Environmental	 
    
@CreateNEWCCFAsKO
  Scenario: Test ability of creating new Central Contract File as KO user 
  	Given I click on Accept & Continue
    Then I am in the ACWS login page as a KO User
    And I navigate to the Transactions > Acquisitions > Contract File; Search - Contract File page
    And I click the New button 
    Then I fill out the following data on the New Contract File page to create a new Central Contract File
    |Contract File Template |  File Type/DODAAC | Record Retention Category | Title       		     |
    |ACWS_CCF          		  |    CCF-W91QV1     | Environmental			        | Create Contract File |
    And I click the Generate button
    And I click the Save button 
    And I verify that Contract Flie page is displayed 
    Then I click the General Information tab
    And I verify that Creator ID field value is autotestv1_ko1
    And I also verify that Record Retention Category field value is Environmental     
    
    