
@tag
Feature: Login to HRM Application

  @ValidCredentials
  Scenario: LogiC:\Users\MadhusriChoppa\eclipse-workspace\Ecllipse_oxygen\CucumberSelTestNG\allure-resultsn with valid credentials
    Given User is on home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully
