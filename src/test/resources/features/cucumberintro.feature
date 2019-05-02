Feature: Cucumber investigation.
  As a user of cucumber
  I want to learn how to use its features.
  Scenario: I am able to run a test in cucumber.
    Given cucumber is set up correctly
    When I run the tests
    Then I can see them run

  Scenario: Using cucumber I can grab details from my steps and use them.
    Given I have the number 20
    And I wish to add 10
    When I add them together
    Then I get 35

  Scenario: more maths 
    Given I have the number 25
    And I wish to add 42
    When I add them together
    Then I get 67