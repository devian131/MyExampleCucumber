Feature: Testing comment functionality
  developer Sean
  tester Sean
  Background:
    Given user open website
    And user logged in to their account

  Scenario: Verify Comment is received
    When user comment the post
    Then comment is displayed
