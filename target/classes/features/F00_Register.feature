@smoke
Feature: register users could register with all valid data
  Scenario: register with  all valid data
  Given navigate to url website
  And press on register button
  And enter first name and last name
  And enter email field
  And enter Password fields
  And enter Confirm password
  And enter click on register button
  Then verify that user entered to the page successfully