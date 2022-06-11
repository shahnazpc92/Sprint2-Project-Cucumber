$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/contact.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Application",
  "description": "User should login with valid credentials",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login",
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
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login link in home page to land on Secure sign in Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify that user is succesfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-into-application;positive-test-validating-login;;1"
    },
    {
      "cells": [
        "shahnazpc9@gmail.com",
        "Naaz@123"
      ],
      "line": 13,
      "id": "login-into-application;positive-test-validating-login;;2"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 14,
      "id": "login-into-application;positive-test-validating-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login link in home page to land on Secure sign in Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"shahnazpc9@gmail.com\" and \"Naaz@123\" and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify that user is succesfully logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login link in home page to land on Secure sign in Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"admin\" and \"admin\" and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify that user is succesfully logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Negative test validating login",
  "description": "",
  "id": "login-into-application;negative-test-validating-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Login link in home page to land on Secure sign in Page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters \"invalid\" and \"Naaz@123\" and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Navigate to Sign in page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});