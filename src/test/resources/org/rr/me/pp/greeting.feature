Feature: Say Hello feature

  Background:
    * url baseUrl

  Scenario: Testing the exact response of a GET endpoint
    Given path 'greeting'
    When method GET
    Then status 200
    And match $ == "Hello world!"