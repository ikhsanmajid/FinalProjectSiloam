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

  # 3
  Scenario: Reset Filter Data
    Given User click menu New
    When Choose start date
    And Choose end date
    And User click reset button
    Then View data

  # 4
  Scenario: Search Data with input alphabet
    Given User input alphabet
    When User click search button
    Then View data

  # 5
  Scenario: Search Data with input numeric
    Given User input numeric
    When User click search button
    Then View data

  # 6
  Scenario: Search Data with input symbol
    Given User input symbol
    When User click search button
    Then View data

  # 7
  Scenario: Search Data without input keyword
    Given User input empty keyword
    When User click search button
    Then View data

  # 8
  Scenario: Search Data with input keyword
    Given User input search keyword
    When User click search button
    And User click refresh button
    Then View data

  # 9
  Scenario: Check action signature
    Given User view data
    When User click action signature
    Then View data

  # 10
  Scenario: Check action view
    Given User view data
    When User click action view
    And User click submit button
    Then View data

  # 11
  Scenario: Update data
    Given User update existing data
    When User click action view
    And User click edit button
    And User update data
    And User click save button
    Then View data

  # 12
  Scenario: Update data without data
    Given User update existing data
    When User click action view
    And User click edit button
    And User input empty keyword
    And User click save button
    Then View data

  # 13
  Scenario: Cancel data existing
    Given User update existing data
    When User click action view
    And User click edit button
    And User click cancel button
    Then View data

  # 14
  Scenario: Delete document existing
    Given User update existing data
    When User click action view
    And User click delete document
    And User click submit button
    Then View data

  # 15
  Scenario: Reupload document existing
    Given User update existing data
    When User click action view
    And User click Add files button
    And User click submit button
    Then View data

    Scenario: Sales Logout Website
      When Sales