Feature: Sales New Page
  # scenario = test case
  # 1
  Scenario: Filter Data with Invalid date
    Given User click menu New
    When Choose start date
    And Choose 19 Januari 2024
    And Choose end date
    And Choose 07 Januari 2024
    And User click filter button
    Then View data

  Scenario: Filter Data Valid
    Given User click menu New
    When Choose start date
    And Choose 07 Januari 2024
    And Choose end date
    And Choose 17 Januari 2024
    And User click filter button
    Then View data

  Scenario: Reset Filter Data
    Given User click menu New
    When Choose start date
    And Choose end date
    And User click reset button
    Then View data

  Scenario: Search Data without input keyword
    Given User click menu New
    When User input empty keyword
    And User click search button
    Then View data

  Scenario: Search Data with input alphabet
    Given User click menu New
    When User input alphabet
    And User click search button
    Then View data

  Scenario: Search Data with input numeric
    Given User click menu New
    When User input numeric
    And User click search button
    Then View data

  Scenario: Search Data with input symbol
    Given User click menu New
    When User input symbol
    And User click search button
    Then View data

  Scenario: User Refresh data
    Given User click menu New
    When User input alphabet
    And User click search button
    And User click refresh button
    Then View data

  Scenario: Check action signature
    Given User click page
    And User click action signature
    Then View data

  Scenario: Check action view
    Given User click page
    And User click action view
    And User click submit button
    Then View data

  Scenario: Update data without data
    Given User click page
    When User click action view
    And User click edit button
    And User input empty keyword
    And User click save button
    Then User Validation Alamat Empty

  Scenario: Cancel data existing
    When User click action view
    And User click edit button
    And User click cancel button
    Then View data

  Scenario: Update data
    When User click action view
    And User click edit button
    And User update data alamat
    And User click save button
    Then View data

  Scenario: Delete document existing
    When User click action view
    And User click delete document
    And User click submit button
    Then View data

  Scenario: Reupload document existing
    Given User click page
    When User click action view
    And User click Add files button
    And User insert reupload foto
    And User click save button
    And User click submit button
    Then View data

