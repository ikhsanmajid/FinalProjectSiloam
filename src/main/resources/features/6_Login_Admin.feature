Feature: Admin Login
  Scenario: Admin Input username dan password valid
    Given Admin enter URL web Siloam
    When Admin enter valid username
    And Admin enter valid password
    And Admin click login button
    Then Admin login successful
  Scenario: Admin not input username and password
    Given Admin enter URL web Siloam
    And Admin click login button
    Then Message harap isi bidang ini
  Scenario: Admin Input only username
    Given Admin enter URL web Siloam
    When Admin enter valid username
    And Admin click login button
    Then Message harap isi bidang ini
  Scenario: Admin input invalid username and password
    Given Admin enter URL web Siloam
    When Admin enter invalid username
    And Admin enter invalid password
    And Admin click login button
    Then Message harap isi bidang ini
  Scenario: Admin input valid username capital letters and valid password capital letters
    Given Admin enter URL web Siloam
    When Admin enter valid username capital letters
    And  Admin enter valid password capital letters
    And Admin click login button
    Then Admin back to login page
  Scenario:  Admin input valid username capital letters and valid password
    Given Admin enter URL web Siloam
    When Admin enter valid username capital letters
    And Admin enter valid password
    And Admin click login button
    Then Admin back to login page
  Scenario:  Admin input valid username and valid password capital letters
    Given Admin enter URL web Siloam
    When Admin enter valid username
    And Admin enter valid password capital letters
    And Admin click login button
    Then Admin back to login page
  Scenario: Admin input password more than 16 char
    Given Admin enter URL web Siloam
    When Admin enter valid username
    And Admin enter password with more than 16 length char
    Then password length cannot increased
  Scenario: Admin input valid username and invalid password
    Given Admin enter URL web Siloam
    When Admin enter valid username
    And Admin enter invalid password
    And Admin click login button
    Then Admin back to login page
  Scenario: Admin input invalid username and valid password
    Given Admin enter URL web Siloam
    When Admin enter invalid username
    And Admin enter valid password
    And Admin click login button
    Then Admin back to login page


