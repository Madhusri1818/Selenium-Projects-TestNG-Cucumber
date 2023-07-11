@tag
Feature: valiadte the register Functionality

  @NewRegistration
  Scenario: new Registartion
    Given I am on a newUser_Registration Link
    When Enter valid data in reg_Page
      | Madhu      |
      | Sri        |
      | Nellore    |
      | Nellore    |
      | AP         |
      |     524345 |
      | 8125685121 |
      |  123456789 |
      | Madhusri   |
      | Kanna@123  |
      | Kanna@123  |
    Then user should be regester successfull
