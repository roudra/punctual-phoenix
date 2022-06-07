Feature: Say Hello feature

  Background:
    * url baseUrl

  Scenario: Testing the exact response of a GET endpoint
    Given path 'settings'
    When method GET
    Then status 200
    And match $ == {"color":"RED"}