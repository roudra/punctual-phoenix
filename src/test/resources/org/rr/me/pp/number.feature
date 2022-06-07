Feature: Check Prime Feature

  Background:
    * url baseUrl

  Scenario Outline: Testing the exact response of a GET endpoint
    Given path 'prime/<number>'
    When method GET
    Then status 200
#    * print response
    And match response == <result>
    Examples:
      | number | result |
      | 3      | 'true'   |
      | 4      | 'false'  |
