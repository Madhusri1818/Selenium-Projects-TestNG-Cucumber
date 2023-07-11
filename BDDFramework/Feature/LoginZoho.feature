@tag
Feature: Zoho site_Login feature

  @tag1
  Scenario Outline: Valiadte the Login fuctionality
    Given Launch the Browser
    And click on SignIn button
    When Enter email "<useremail>" in email field
    And Enter password  "<password>" in password field
    Then click on Login

    Examples: 
      | useremail             | password  |
      | smadhusri59@gmail.com | Kanna@123 |
      | smadhu59@gmail.com | Kanna@123 |
      | smadhusri59@gmail.com | Kanna@123 |
      | smadhusri@gmail.com   |    123123 |
