Feature: Login Page

Scenario: Login page title
Given user is on login page
When user gets the title 
Then user validate the title "Free CRM  - CRM software for customer relationship management, sales, and support."

Scenario: check logo
Given user is on login page
Then site logo should be displayed 

Scenario: login with valid credentials

Given user is on login page
When user enters username "Madhus12"
And user enters password "Test@123"
And user clicks on login
Then user gets the title