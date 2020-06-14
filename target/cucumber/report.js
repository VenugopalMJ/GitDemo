$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Service.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@UatTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login with \"Austin\" and password \"Stone\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page will open",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Cards displayed are \"True\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnition.user_is_on_login_page()"
});
formatter.result({
  "duration": 386750400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Austin",
      "offset": 17
    },
    {
      "val": "Stone",
      "offset": 39
    }
  ],
  "location": "stepDefnition.user_login_with_and_password(String,String)"
});
formatter.result({
  "duration": 4554900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefnition.home_page_is_populated()"
});
formatter.result({
  "duration": 185900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 21
    }
  ],
  "location": "stepDefnition.cards_displayed_are(String)"
});
formatter.result({
  "duration": 1549800,
  "status": "passed"
});
});