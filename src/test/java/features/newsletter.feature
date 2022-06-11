Feature: Newsletter Application
  User should newsletter with Radio Button

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://retailm1.upskills.in/" site
    Then Click on Newsletter
    And Navigate to "http://retailm1.upskills.in/account/login" Login site
    Then User enters <email> and <pass>
    And click on Login
    Then Select radio Button to Subscribe
    And Click on Continue
    Then verify that Success: Your newsletter subscription has been successfully updated!
    And close the browser

