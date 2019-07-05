$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("../POMWithBDDFramework/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 922405,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Logs details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_open_browser()"
});
formatter.result({
  "duration": 15667073774,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 133519183,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.click_log_in_button()"
});
