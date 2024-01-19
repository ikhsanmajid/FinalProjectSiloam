Feature: Filter and Refresh
  Scenario: Filter data Januari 2024
    Given Admin home
    When Click View and Export
#    And Click Start date
    And Enter Start date 1 Januari 2024
#    And Click End date
    And Enter End date 31 Januari 2024
    And Click filter button
    Then Shows Valid Data

  Scenario: Start date empty and end date empty
    Given Admin home
    When Click View and Export
    And Click filter button
    Then Message start date fill out this

  Scenario: Start date is longer than end date
    Given Admin home
    When Click View and Export
    And Click Start date
    And Enter Start date 31 Januari 2024
    And Click End date
    And Enter End date 1 Januari 2024
    And Click filter button
    Then Does not shown any data

  Scenario:  Fill only start date
    Given Admin home
    When Click View and Export
    And Click End date
    And Enter Start date 1 Januari 2024
    And Click filter button
    Then Message start date fill out this

  Scenario: Fill only end date
    Given Admin home
    When Click View and Export
    And Click End date
    And Enter End date 31 Januari 2024
    And Click filter button
    Then Message end date fill out this

  Scenario: Clear start date and end date
    Given Admin home
    When Click View and Export
    And Click Start date
    And Enter Start date 1 Januari 2024
    And Click End date
    And Enter End date 31 Januari 2024
    And Click refresh button
    Then start date and end date are empty

  Scenario: Clear empty start date and empty end date
    Given Admin home
    When Click View and Export
    And Click refresh button
    Then start date and end date are empty

  Scenario: Filter data and view data Januari 2024
    Given Admin home
    When Click View and Export
    And Click Start date
    And Enter Start date 1 Januari 2024
    And Click End date
    And Enter End date 31 Januari 2024
    And Click filter button
    And Click view
    Then Direct to View Data Page