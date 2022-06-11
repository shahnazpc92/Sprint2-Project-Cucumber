Feature: Contact Us Application
  User should Contact us with valid credentials

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://retailm1.upskills.in/" site
    Then Click on Contact Us
    Then User enters <name> and <email> and <enquiry>
    And click on Submit
    And verify you get Your enquiry has been successfully sent to the store owner!
    Then click on continue
    And close the browser

