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


    # id 104 and 141 with scenario outline
  @oneUserProfileWithID
  Scenario Outline: GET Request One User and verify All Information
    When The user sends a GET request with id <id>
    Then The user verifies that status code <statusCode>
    And The user verifies that user's info name is "<name>" and company is "<company>" and location is "<location>"
    Examples:
      | id  | statusCode | name      | company | location |
      | 104 | 200        | FiftyCent | Bootflow | NY       |
      | 141 | 200        | Lisa      | Google  | sm       |
