$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into StackFlow Account",
  "description": "Existing active user should be able to loginwith valid login credentials.",
  "id": "login-into-stackflow-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12224928707,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with valid credentials",
  "description": "",
  "id": "login-into-stackflow-account;login-into-account-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User visit to stackflow homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter a username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter a password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken successfully to the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_visit_to_stackflow_homepage()"
});
formatter.result({
  "duration": 4483439824,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button_on_homepage()"
});
formatter.result({
  "duration": 1061301451,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enter_a_username()"
});
formatter.result({
  "duration": 105074245,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enter_a_password()"
});
formatter.result({
  "duration": 57485550,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 261223290,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_be_taken_successfully_to_the_login_page()"
});
formatter.result({
  "duration": 2493256896,
  "status": "passed"
});
formatter.after({
  "duration": 5985609307,
  "status": "passed"
});
});