Feature: Compare UI and API Experience Request
  @uı_and_api
  Scenario Outline: UI and API Experience
    Given The user sends a POST request and login with "<email>" and "<password>"
    When The user send a POST request for adding an experience with "<title>" and "<company>" and "<location>" and "<from>" and "<to>" and "<current>" and "<description>"
    Then The user verifies that status code <statusCode>
    When The compiler gets the experience ID
    And The user sends a GET request to get experience with ID
    And The user is on the Dashboard Page
    Then The user verifies that UI experience and API experience for the "<company>" should match
    Examples:
      | email              | password | title     | company | location | from       | to         | current | description | statusCode |
      | Tadic@bootflow.com | Test1234 | developer | Ajax    | Ajax     | 2023-01-01 | 2023-08-01 | current | description | 201        |
