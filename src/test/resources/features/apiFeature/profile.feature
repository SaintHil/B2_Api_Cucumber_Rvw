Feature: Retrieve Profiles

  @allProfiles
  Scenario: The user able to see all profiles
    When The user sends a GET request and able to see all profiles
    Then The user verifies that status code 200

  @profileWithID
  Scenario: GET Request with Path Parameter
    When The user sends a GET request with id 19
    Then The user verifies that status code 200
    And The user verifies that user's info name is "Michael" and company is "Amazon" and location is "Madrid"