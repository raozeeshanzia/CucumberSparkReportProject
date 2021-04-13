Feature: This is Demo test case of NDC application.

  Scenario Outline: Verify User can Log in into application through Valid credentials
    Given I am on NDC home page
    When user enter login username and password using given sheetname "<SheetName>" and rowNumber "<RowNumber>"
    Then I click on login button
    And I click on tools
    And I select the branch
    And I verify that I am on desired Page

    Examples: 
      | SheerName | RowNumber |
      | LoginData |   0 |
