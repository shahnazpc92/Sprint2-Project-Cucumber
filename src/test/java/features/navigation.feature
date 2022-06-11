Feature: Footer Navigation
  User should Navigate the Footer with Backward and Forward

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://retailm1.upskills.in/" site 
    Then Navigate to "http://retailm1.upskills.in/about_us" About us Page
    And Navigate to "http://retailm1.upskills.in/delivery" Delivery Information Page
    Then Navigate back to "http://retailm1.upskills.in/about_us" About us Page Agian
    Then Navigate back to "http://retailm1.upskills.in/about_us" Home Page again
    And Navigate to "http://retailm1.upskills.in/privacy" Privacy Page
    And Navigate to "http://retailm1.upskills.in/terms" Terms & Condition Page
    And Navigate to "http://retailm1.upskills.in/information/contact" Contact us Page
    And Navigate to "http://retailm1.upskills.in/information/sitemap" Sitemap Page
    Then Navigate to "http://retailm1.upskills.in/about_us" Home Page Again
    

