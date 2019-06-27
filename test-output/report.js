$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vraja/workspace/POMWithBDDFramework/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 711427503,
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
  "duration": 15173056581,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 259727435,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.click_log_in_button()"
});
formatter.result({
  "duration": 18936778649,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_enters_username_and_password()"
});
formatter.result({
  "duration": 553372521,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.validate_home_page_title()"
});
formatter.result({
  "duration": 4511641,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.validate_logged_in_username()"
});
formatter.result({
  "duration": 4012739846,
  "status": "passed"
});
formatter.after({
  "duration": 3762031525,
  "status": "passed"
});
});