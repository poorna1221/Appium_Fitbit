$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: poorna"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: Login"
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "LoginPage Functionality",
  "description": "",
  "id": "loginpage-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 23,
  "name": "Verify Login Functionality with Invalid credentials",
  "description": "",
  "id": "loginpage-functionality;verify-login-functionality-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Fitbit app is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user enters \"Poornachandrarao.948@gmail.com\" and \"test\" and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "verify if user is not logged into appliction",
  "keyword": "Then "
});
formatter.match({
  "location": "FitBitAppLogin.fitbit_app_is_opened()"
});
formatter.result({
  "duration": 10655160489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Poornachandrarao.948@gmail.com",
      "offset": 13
    },
    {
      "val": "test",
      "offset": 50
    }
  ],
  "location": "FitBitAppLogin.user_enters_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 7881585344,
  "status": "passed"
});
formatter.match({
  "location": "FitBitAppLogin.verify_if_user_is_not_logged_into_appliction()"
});
formatter.result({
  "duration": 1582044998,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify Login Functionality with valid credentials",
  "description": "",
  "id": "loginpage-functionality;verify-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "Fitbit app is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user enters \"Poornachandrarao.948@gmail.com\" and \"test123456\" and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "verify if the user is logged into the fitbit app",
  "keyword": "Then "
});
formatter.match({
  "location": "FitBitAppLogin.fitbit_app_is_opened()"
});
formatter.result({
  "duration": 11494748954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Poornachandrarao.948@gmail.com",
      "offset": 13
    },
    {
      "val": "test123456",
      "offset": 50
    }
  ],
  "location": "FitBitAppLogin.user_enters_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 7892628927,
  "status": "passed"
});
formatter.match({
  "location": "FitBitAppLogin.verify_if_the_user_is_logged_into_the_fitbit_app()"
});
formatter.result({
  "duration": 26171294722,
  "status": "passed"
});
});