Feature: Check google calculator

  Scenario: Check addition in google calculator
    Given Open Google calculator
    When Enter 2+3 in search text box
    And Press Enter
    Then We should get result as 5
    But Nothing else

