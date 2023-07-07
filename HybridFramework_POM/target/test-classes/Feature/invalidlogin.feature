Feature: invalid data login check
  Scenario: Login fun
    
    Given user launch browser
    When enter Data
    Then user click on login
    
    
    Scenario: Login invalid
    Given user launch browser
    When enter invalidData
    Then user click on login