
@LoginFuctionality_Amazon
Feature: validate the login functionality

  @ValidCredentials
  Scenario: login with valid credentials
    Given Launch AmazonSite
    When user enters Email and Password
   | username|password|
    |8125685121|Kanna@123|
    |8125685121|Kanna@123|
    And log the data
    Then user step into homepage
 

  