Feature: Search in Google.com 22
  As a user
  I want to be able to log in
  so I try to log in

  Scenario: Search on the google 3
    Given User opens Google page
    When User searches per 'coco'
    Then User checks that title contains 'coco' word

  Scenario: Search on the google 4
    Given User opens Google page
    When User searches per 'selen'
    Then User checks that title contains 'selen' word