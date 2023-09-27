Feature: Sign Up
  @register
  Scenario Outline: DevBook User Register
    When The user sends a POST request with "<email>" and "<password>" and "<name>" and "<google>" and "<facebook>" and "<github>"
    Then The user verifies that status code <statusCode>
    And The user verifies that body contains "<content>"
    And The compiler gets the token
    Examples:
      | email              | password | name        | google    | facebook   | github   | statusCode | content |
      | Tadic1@bootflow.com | Test1234 | Dusan Tadic | @dusanggl | @dusanface | @dusan21 | 200        | token   |