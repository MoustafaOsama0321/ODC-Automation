@smoke
  Feature: Login_ user could login to the system with valid account
    Scenario: valid login
      Given navigate to url website
      And Go to login page
      When Enter valid email and password
      And Click on login button
      Then verify that user logged in successfully

    Scenario: invalid login
      Given navigate to url website
      And Go to login page
      When Enter invalid email and password
      And Click on login button
      Then verify that user didn't logged in successfully

    Scenario: empty login
      Given navigate to url website
      And Go to login page
      When Don't enter email and password
      And Click on login button
      Then Unsuccessfully Login