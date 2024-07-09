
Feature: Automate facebook Login
  

  @tag1
  Scenario: login in to facebook
    Given user should open browser and open facebook login page
    When enter email, password
    And click on login button
    Then user should be login

