@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: user able to login
    #Given I launched the Browser
  # When Enter valid data "admin" and "manager"
   # And click on Login link
   # Then validate the outcomes

  @tag2
  Scenario Outline: user able to login
   Given I launched the Browser
    When Enter  data "<username>" and "<password>"
    And click on Login link
    Then logout the app
   Then close the browser

    Examples: 
      | username | password |
      | admin     | manager  |
      | trainee   | trainee  |
      | admin     | trainee  |
