@smoke
Feature: Testing different request on the virgin games API

  Scenario: Check if the virgin game application can be accessed by users
    Given Display all the records with currency GBP
    When User sends a GET request to GBP endpoint
    Then  User should see currency in GBP and status code 200

  Scenario: Check if the virgin game application can be accessed by users
  Given Display all the records with currency SEK
    When User sends a GET request with SEK query parameter
    Then User should see currency in SEK and status code 200

  Scenario: Check if the virgin game application can be accessed by users
    Given Display all the records with currency EUR
    When User sends a GET request with EUR query parameter
    Then User should see currency in EUR and status code 200