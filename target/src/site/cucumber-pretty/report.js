$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contract File/createContractFile.feature");
formatter.feature({
  "line": 2,
  "name": "Contract File",
  "description": "I want to use this template for my feature file",
  "id": "contract-file",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 21233578836,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Create a new Contract File",
  "description": "",
  "id": "contract-file;create-a-new-contract-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@CreateContractFile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on Accept \u0026 Continue",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I validate seal logo is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am in the ACWS login page as a CS User",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I search and select the following Workload Assignment",
  "rows": [
    {
      "cells": [
        "Item Number"
      ],
      "line": 11
    },
    {
      "cells": [
        "REQ REQ-13-3185"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the Open and Acquire Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the contract file tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter the New Contract File data",
  "rows": [
    {
      "cells": [
        "Contract File Template",
        "FileTypeDODAAC",
        "Title"
      ],
      "line": 16
    },
    {
      "cells": [
        "ACWS_CCF",
        "CCF-W91QV1",
        "Ship Level2"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the save confirmation message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefs.i_click_on_Accept_Continue()"
});
