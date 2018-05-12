Feature: Multiply
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Scenario: Multiply two numbers -2 & 3
    Given I have a multiply calculator
    When I multiply -2 and 3
    Then the result of multiple should be -6

  Scenario: Multiply two numbers 10 & 15
    Given I have a multiply calculator
    When I multiply 10 and 15
    Then the result of multiple should be 150