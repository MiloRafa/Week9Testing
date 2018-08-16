Feature: Shopping on the website
  As a user
  I want to search for a dress
  so that I can buy it

  Scenario: Searching for a blue dress
    Given the correct text entered
    When I search for a blue dress
    Then all blue dresses should load

  Scenario: Searching for a yellow dress
    Given the correct text entered
    When I search for a yellow dress
    Then all yellow dresses should load

  Scenario: Searching for a green dress
    Given the correct text entered
    When I search for a green dress
    Then all green dresses should load

  Scenario: Searching for a white dress
    Given the correct text entered
    When I search for a white dress
    Then all white dresses should load

  Scenario: Searching for all dresses
    Given the correct text entered
    When I search for a dress
    Then all dresses should load