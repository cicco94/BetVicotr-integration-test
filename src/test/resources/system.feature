Feature: "SystemController" is an endpoint which check the state of the up

  Scenario: check if app is up
    Given I want to know if app is on
    When I check if app is up
    Then I should receive true

  Scenario: check app version
    Given I want to know the version of the app
    When I check the version of the app
    Then I should receive a SystemVersion json