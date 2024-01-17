Feature: Sales Login
  Scenario Outline: Sales Login invalid
    Given Sales enter URL web Siloam
    When Sales enter <username> or <password>
    And Sales click login button
    Then Sales login empty failed

    Examples:
      | username | password |
      | "" | "" |

  Scenario Outline: Sales Login invalid
    Given Sales enter URL web Siloam
    When Sales enter <username> or <password>
    And Sales click login button
    Then Sales login wrong failed
    Examples:
      | username | password |
      | "K6400001" | "" |
      | "" | "a" |
      | "K6400001" | "z" |
      | "z" | "a" |

  Scenario: Sales Login Valid
    Given Sales enter URL web Siloam
    When Sales enter username and password
    And Sales click login button
    Then Sales login successful