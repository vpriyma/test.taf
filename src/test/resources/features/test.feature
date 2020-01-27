Feature: Search in Google.com 11
  As a user
  I want to be able to log in
  so I try to log in

  @debug
  Scenario: Search on the google 1
    Given User opens Google page
    When User searches per 'Selenide'
    Then User checks that title contains 'Selenide' word

  @debug
  Scenario: Search on the google 2
    Given User opens Google page
    When User searches per 'Selenium'
    Then User checks that title contains 'Selenium1' word