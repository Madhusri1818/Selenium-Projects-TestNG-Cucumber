Feature: Home pape Feature

  Background: 
    Given user already logged into login page
      | username | password |
      | Madhus12 | Test@123 |

  Scenario: Homepage Title
    Given user on home page
    When user gets the title
    Then page title should be "CRMPRO"

  Scenario: Homepage section count
    Given user on home page
    Then User gets sections in Home
      | HOME      |
      | CALENDAR  |
      | COMPANIES |
      | CONTACTS  |
      | DEALS     |
      | TASKS     |
      | CASES     |
      | CALL      |
      | EMAIL     |
      | TEXT/SMS  |
      | PRINT     |
      | CAMPAIGNS |
      | DOCS      |
      | FORMS     |
      | REPORTS   |
    And Sections in Homepage should be 15
