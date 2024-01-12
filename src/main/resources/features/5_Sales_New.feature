Feature: New Page
  # scenario = test case
  # 1
  Scenario: Filter Data Valid
    Given User click menu New
    When Choose start date
    And Choose end date
    And User click filter button
    Then View data

  # 2
  Scenario: Filter Data with Invalid date
    Given User click menu New
    When Choose start date
    And Choose end date
    And User click filter button
    Then View data

  #3
  Scenario: Reset Filter Data
    Given User click menu New
    When Choose start date
    And Choose end date
    And User click reset button
    Then View data

  #4
  Scenario: Search Data with input alphabet
    Given User input user