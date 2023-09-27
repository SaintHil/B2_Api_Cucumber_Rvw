Feature: Sign Up

  @register @wip
  Scenario Outline: DevBook User Register
    When The user sends a POST request with "<email>" and "<password>" and "<name>" and "<google>" and "<facebook>" and "<github>"
    Then The user verifies that status code <statusCode>
    And The user verifies that body contains "<content>"
    And The compiler gets the token
    Examples:
      | email               | password | name        | google    | facebook   | github   | statusCode | content |
      | Tadic3@bootflow.com | Test1234 | Dusan Tadic | @dusanggl | @dusanface | @dusan21 | 200        | token   |

  @saveProfile @wip
  Scenario Outline: User can able to POST request and gets the token and saves profile
    When The user sends a POST request with "<company>" and "<website>" and "<location>" and "<status>" and "<skills>" and "<githubusername>" and "<youtube>" and "<twitter>" and "<facebook>" and "<linkedin>" and "<instagram>"
    Then The user verifies that status code <statusCode>
    And The user verifies that name as "<name>" and email as "<email>"
    Examples:
      | company | website      | location | status    | skills | githubusername | youtube     | twitter     | facebook    | linkedin      | instagram    | statusCode | name        | email               |
      | FB      | tadic@fb.com | Istanbul | Developer | Java   | Tadic21        | Tadic21tube | Tadic21twit | Tadic21face | Tadic21linked | Tadic21insta | 200        | Dusan Tadic | Tadic3@bootflow.com |