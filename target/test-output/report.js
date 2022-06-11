$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contact.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Us Application",
  "description": "User should Contact us with valid credentials",
  "id": "contact-us-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Positive test validating login",
  "description": "",
  "id": "contact-us-application;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://retailm1.upskills.in/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Contact Us",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \u003cname\u003e and \u003cemail\u003e and \u003cenquiry\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify you get Your enquiry has been successfully sent to the store owner!",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.uri("navigation.feature");
formatter.feature({
  "line": 1,
  "name": "Footer Navigation",
  "description": "User should Navigate the Footer with Backward and Forward",
  "id": "footer-navigation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Positive test validating login",
  "description": "",
  "id": "footer-navigation;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://retailm1.upskills.in/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Navigate to \"http://retailm1.upskills.in/about_us\" About us Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Navigate to \"http://retailm1.upskills.in/delivery\" Delivery Information Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Navigate back to \"http://retailm1.upskills.in/about_us\" About us Page Agian",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Navigate back to \"http://retailm1.upskills.in/about_us\" Home Page again",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Navigate to \"http://retailm1.upskills.in/privacy\" Privacy Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to \"http://retailm1.upskills.in/terms\" Terms \u0026 Condition Page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Navigate to \"http://retailm1.upskills.in/information/contact\" Contact us Page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Navigate to \"http://retailm1.upskills.in/information/sitemap\" Sitemap Page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Navigate to \"http://retailm1.upskills.in/about_us\" Home Page Again",
  "keyword": "Then "
});
formatter.uri("newsletter.feature");
formatter.feature({
  "line": 1,
  "name": "Newsletter Application",
  "description": "User should newsletter with Radio Button",
  "id": "newsletter-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Positive test validating login",
  "description": "",
  "id": "newsletter-application;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://retailm1.upskills.in/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Newsletter",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Navigate to \"http://retailm1.upskills.in/account/login\" Login site",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters \u003cemail\u003e and \u003cpass\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select radio Button to Subscribe",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify that Success: Your newsletter subscription has been successfully updated!",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
});