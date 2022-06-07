Feature: Check Prime Feature

  Background:
    * url baseUrl

  Scenario Outline: Check if a number is prime
    Given path 'prime/<number>'
    When method GET
    Then status 200
#    * print response
    And match response == <result>
    Examples:
      | number | result  |
      | -4     | 'false' |
      | 1      | 'false' |
      | 2      | 'true' |
      | 3      | 'true'  |
      | 4      | 'false' |

  Scenario: Get a random Prime number
    Given path 'prime'
    When method GET
    Then status 200
    * print response
