@GIT
Feature: GET Response
Scenario: HTTP request using GET

 
Given Iam a normal user
    When I hit the system with GIT
    Then I shall see all companies details