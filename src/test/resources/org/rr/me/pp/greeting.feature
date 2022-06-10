Feature: Say Hello feature

  Background:
    * url baseUrl

  @smoke
  Scenario: Testing the exact response of a GET endpoint
    Given path 'hello'
    When method GET
    Then status 200
    And match $ == "Hello from RESTEasy Reactive"