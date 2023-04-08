@smoke
Feature: Switching Currency To Euro
  Scenario: changing the currency from UsDollar To Euro
    Given navigate to url website
    And Go to login page
    When Enter valid email and password
    And Click on login button
    When click on the currency box and choose euro
    Then see euro on products successfully
