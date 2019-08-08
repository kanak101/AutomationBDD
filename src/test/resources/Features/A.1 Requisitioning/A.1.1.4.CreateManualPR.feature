@Regression
Feature: A.1.1.4 Create Manual PR
  I want to Create and Process New  Requisition

@CreateReq
  Scenario: Test ability of creating new Requisition
  	Given I click on Accept & Continue
    Then I login into the ACWS as a Requisition Submitter
    And I navigate to the Transactions > Acquisitions > New > Request; New Request page
    Then I validate the New Request page header
    And I fill out the data to create a New Request
    |Document Type |  Document Number | Procurement Title |
    |REQ           |    random        | USS Rashid        |
    And I click the Finish button
    Then I validate that the Header page is displayed
    And I enter following data into the Header tab
    |    Description                							 | Contracting Officer | Contracting Specialist |
    |This is test Automation for Manual Requisition| autotestv1_ko1      | autotestv1_cs1         |
    Then I click the Financial References tab
    And I click the Add button
    And I verify that the ACRN is AA 
    Then I fill out the following data into the Financial References tab 
    |Template      |Sub Class | DEPT TRS  | Department Regular |
    |ACWS Template |1         | 12        | 56                 |
    Then I click the Financial References tab again
    And I click the Add button
    And I verify that the ACRN is AB 
    Then I fill out the following data into the Financial References tab 
    |Template      |Sub Class | DEPT TRS  | Department Regular |
    |ACWS Template |55        | 48        | 126                |
    Then I click the Itemized Lines tab 
    And I click the Add button to add itemized line number one
    And I click the Edit button and fill out the following 
    | Type of Contract |
    |FFP               |
    And I click the Apply button 
    Then I verify that Line Number is 0001
    And I enter the following data into the Itemized Line tab for line number one      
    |Base/Option Indicator |  Unit | PSC | NAICS Code | Addl Description								  | Quantity | Unit Price |
    |Base                  |  MO   | 56  | 561710     | Smoke Test for Manual Requisition | 12       | 100000     |
    Then I click the Accounting Lines tab 
    And I click Add button to add accounting lines for itemized line one
    And I enter the following data into the Accounting Lines tab
    | Total Amount | Template     | 
    | 1200000      | ACWS Template|
    And I select the AA for ACRN field under Financial References section
    Then I click the Delivery Instances tab and Add button to add delivery instances to itemized lines 
    And I enter the following data into the Delivery Instance tab
    |Freight On Board | Responsibility |  Responsibility |
    |Destination      | Other          |  Other          |
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 						 | DODDAC |
    |Delivery/Performance    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type				  | DODDAC |
    |Acceptance Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type                  | DODDAC |
    |Party to receive Invoice     | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 					| DODDAC |
    |Inspection Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type									 | DODDAC |
    |Government Property Office    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type      | DODDAC |
    |Technical Office | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Itemized Lines tab
    And I click the Add button to add itemized line number two
    And I click the Edit button and fill out the following 
    | Type of Contract |
    |FFP               |
    And I click the Apply button 
    Then I verify that Line Number is 0002
    And I enter the following data into the Itemized Line tab for line number two      
    |Base/Option Indicator |  Unit | PSC | NAICS Code | Addl Description								            | Quantity | Unit Price |
    |Base                  |  MO   | 56  | 561710     | Smoke Test for Manual Requisition Line 0002 | 12       | 100000     |
    Then I click the Accounting Lines tab 
    And I click Add button to add accounting lines for itemized line two
    And I enter the following data into the Accounting Lines tab
    | Total Amount | Template     | 
    | 1200000      | ACWS Template|
    And I select the AB for ACRN field under Financial References section
    Then I click the Delivery Instances tab and Add button to add delivery instances to itemized lines 
    And I enter the following data into the Delivery Instance tab
    |Freight On Board | Responsibility |  Responsibility |
    |Destination      | Other          |  Other          |
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 						 | DODDAC |
    |Delivery/Performance    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type				  | DODDAC |
    |Acceptance Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type                  | DODDAC |
    |Party to receive Invoice     | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 					| DODDAC |
    |Inspection Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type									 | DODDAC |
    |Government Property Office    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type      | DODDAC |
    |Technical Office | W91QV1 |
    And I click the Default Mailing Address button 
  	Then I click the Itemized Lines tab
    And I click the Add button to add itemized line number three
    And I click the Edit button and fill out the following 
    | Type of Contract |
    |FFP               |
    And I click the Apply button 
    Then I verify that Line Number is 0003
    And I enter the following data into the Itemized Line tab for line number three       
    |Base/Option Indicator | Base Line Number | Option Period | Unit | PSC | NAICS Code | Addl Description 													 | Quantity | Unit Price |
    |Option                | 0001             |      1        | MO   | 56  | 561710     | Manual Requisition: Add Itemized Lines 0003| 12       | 100000     |
    Then I click the Delivery Instances tab and Add button to add delivery instances to itemized lines 
    And I enter the following data into the Delivery Instance tab
    |Freight On Board | Responsibility |  Responsibility |
    |Destination      | Other          |  Other          |
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 						 | DODDAC |
    |Delivery/Performance    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type				  | DODDAC |
    |Acceptance Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type                  | DODDAC |
    |Party to receive Invoice     | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 					| DODDAC |
    |Inspection Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type									 | DODDAC |
    |Government Property Office    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type      | DODDAC |
    |Technical Office | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Itemized Lines tab
    And I click the Add button to add itemized line number four
    And I click the Edit button and fill out the following 
    | Type of Contract |
    |FFP               |
    And I click the Apply button 
    Then I verify that Line Number is 0004
    And I enter the following data into the Itemized Line tab for line number three       
    |Base/Option Indicator | Base Line Number | Option Period | Unit | PSC | NAICS Code | Addl Description 													 | Quantity | Unit Price |
    |Option                | 0002             |      1        | MO   | 56  | 561710     | Manual Requisition: Add Itemized Lines 0004| 12       | 100000     |
    Then I click the Delivery Instances tab and Add button to add delivery instances to itemized lines 
    And I enter the following data into the Delivery Instance tab
    |Freight On Board | Responsibility |  Responsibility |
    |Destination      | Other          |  Other          |
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 						 | DODDAC |
    |Delivery/Performance    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type				  | DODDAC |
    |Acceptance Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type                  | DODDAC |
    |Party to receive Invoice     | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type 					| DODDAC |
    |Inspection Location  | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type									 | DODDAC |
    |Government Property Office    | W91QV1 |
    And I click the Default Mailing Address button 
    Then I click the Office Addresses tab and Add button to add delivery instance office address 
    And I enter the following data into the Office Address tab 
    |Office Type      | DODDAC |
    |Technical Office | W91QV1 |
    And I click the Default Mailing Address button
    Then I click the Verify button at the bottom of the page 
    And Verify that the system displays the message - Form (Document Number)  was verified successfully.
    Then I click the Save button at the bottom of the page 
    And Verify that the system dislays the message - Form (Document Number)  was saved successfully.
    Then I click the Submit button at the bottom of the page 
    And Verify that the system dislays the message -  Form (Document Number)  was submitted for processing successfully. 
    Then I log out of ACWS as a Requisition submitter 
    Then I log back into ACWS as a Workload Manager 
    And I click the Sort Tasks button
    And I select the Assignment Date from the Sort by dropdown 
    And I click the Sort Descending button
    And I click the Sort button 
    Then I select the appropriate requisition approval task 
    And I click the Open and Acquire button 
    When I complete the review then I click the Approve button 
    And I add comments to the Comment box
    |Comment         |
    |Test Complete   |
    And I click the Continue button 
    