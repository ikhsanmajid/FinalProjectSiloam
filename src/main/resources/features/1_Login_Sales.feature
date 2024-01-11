Feature: Sales Login
  Scenario: Sales Login Valid
    Given Sales enter URL web Siloam
    When Sales enter username and password
    And Sales click login button
    Then Sales login successful