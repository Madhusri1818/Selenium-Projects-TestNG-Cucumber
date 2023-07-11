@tag
Feature: Login CRMPRO site and create multiple contacts

  # Scenario: login to site
  # Given Launch application CRMPRO
  # When user enters "Madhus12" and "Test@123"
  # And click on login
  #Then I validate the Title
 
 
  Scenario Outline: login to site,create multiple contacts
    Given Launch application CRMPRO
    When user enters "<username>" and "<password>"
    And click on login
    Then I validate the Title
    Then user moves to new contact page
    Then User enter "<firstname>" and "<Lastname>" and "<phonenum>"
    Then close the browser

    Examples: 
      | username | password | firstname | Lastname | phonenum   |
      | Madhus12 | Test@123 | madhu     | sri      | 8125685121 |
      | Madhus12 | Test@23  | naveen    | k        | 8128756731 |
      | Madhus12 | Test@123 | sarath    | chandra  | 9010856345 |
