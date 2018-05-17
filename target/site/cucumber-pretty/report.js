$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Work/API Project/API/src/test/resources/features/get.feature");
formatter.feature({
  "line": 2,
  "name": "GET Response",
  "description": "",
  "id": "get-response",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GIT"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "HTTP request using GET",
  "description": "",
  "id": "get-response;http-request-using-get",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Iam a normal user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I hit the system with GIT",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I shall see all companies details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iam_a_normal_user()"
});
formatter.result({
  "duration": 2851559962,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_hit_the_system_with_GIT()"
});
formatter.result({
  "duration": 73436,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_shall_see_all_companies_details()"
});
formatter.result({
  "duration": 767235721,
  "status": "passed"
});
});