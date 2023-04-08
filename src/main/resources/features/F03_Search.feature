@smoke
Feature: User searchers for elements

  Scenario Outline: user could se arch using variables
    Given navigate to url website
    And Go to login page
    When Enter valid email and password
    And Click on login button
    Given User searches with "<search_word>"
    And Search Show The Result For
    Then User See The Products "<search_word>"
    Examples:
      | search_word |
      | book        |
      | laptop      |
      | nike        |



  Scenario Outline: user could search for products using sku
    Given navigate to url website
    And Go to login page
    When Enter valid email and password
    And Click on login button
    When user searches with SerialNumber "<Serial_number>"
    And Search Show The Result For
    Then User See The Products For SerialNumber "<Serial_number>"
    Examples:
      | Serial_number |
      | SCI_FAITH     |
      | APPLE_CAM     |
      | SF_PRO_11     |

