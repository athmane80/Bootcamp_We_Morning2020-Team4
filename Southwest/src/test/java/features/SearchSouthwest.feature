Feature:Southwest HomePage
  As a costumer i am  at Southwest Homepage
  Background:Southwest HomePage
    Given I am at Southwest HomePage

  Scenario: Test login button
    When I click Login button
    And I Enter UserName
    And I Enter Password
    And I click Log in button
    Then I should see infos intered incorrect

  Scenario: Test Enroll button
    When I click Enroll
    Then I should see Enroll page

  Scenario: Test Southwest services button
    When I click services
    Then I should see services provided page

  Scenario: Test Southwest Flights button
    When I click services
    And  I click flights button
    Then i should see flights page

  Scenario: Test Southwest Hotels button
    When I click services
    And I click Hotels
    Then i should see Hotels page

  Scenario: Test Southwest Car button
    When I click services
    And I click Car
    Then i should see Car page

  Scenario: Test Southwest Vacations button
    When I click services
    And I click Vacations
    Then I should see Vacations page

  Scenario: Test Southwest Special offers  button
    When I click Special offers
    Then I should see Special offers page

  Scenario:Test Special Flights offers
    When I click Special offers
    And I click Flight offers
    Then I should see Flights offers page

  Scenario:Test Special Hotels offers
    When I click Special offers
    And I click Hotels offers
    Then I should see Hotels offers page

  Scenario:Test Special Cars offers
    When I click Special offers
    And I click Cars offers
    Then I should see Cars offers page

  Scenario:Test Special Vacations offers
    When I click Special offers
    And I click  Vacations
    Then I should see Special Vacations offers page

  Scenario: Test Southwest Rapid Rewards  button
    When I click Special Rewards
    Then I should see Rewards page

  Scenario: Test Southwest Program Rewards  button
    When I click Special Rewards
    And I click Program Rewards
    Then I should see Program Rewards Page

  Scenario: Test Southwest About Rewards button
    When I click Special Rewards
    And I click About Rewards
    Then I should see About Rewards Page

  Scenario: Test Southwest Enroll Rewards button
    When I click Special Rewards
    And I click Enroll Rewards
    Then I should see Enroll Rewards Page

  Scenario: Test Southwest Earn points Rewards button
    When I click Special Rewards
    And I click Earn Points Rewards
    Then I should see Earns points Rewards Page

  Scenario: Test Southwest Benefits Rewards button
    When I click Special Rewards
    And I click Benefits Rewards
    Then I should see Benefits Rewards Page

  Scenario: Test Southwest Credit Card Rewards button
    When I click Special Rewards
    And I click Credit card Rewards
    Then I should see Credit card Rewards Page

  Scenario: Test Southwest Redeem Points button
    When I click Special Rewards
    And I click Redeem Rewards
    Then I should see Redeem Rewards Page

  Scenario: Test Southwest Earn points Shop Online Rewards button
    When I click Special Rewards
    And I click Earn Points Shop Online Rewards
    Then I should see Earn points Shop Online  Rewards Page

  Scenario: Test Southwest manage rewards button
    When I click Special Rewards
    And I click manage
    Then I should see manage Rewards page

  Scenario: Test Manage account rewards button
    When I click Special Rewards
    And I click manage Account
    Then I should see manage account Rewards page

  Scenario: Test manage Account login button
    When I click Special Rewards
    And I click manage Account login
    Then I should see manage account login Rewards page

  Scenario: Test manage promotions rewards button
    When I click Special Rewards
    And I click manage promotion
    Then I should see manage promotions Rewards page

  Scenario: Test manage transfer points rewards button
    When I click Special Rewards
    And I click manage transfer points
    Then I should see manage transfer points Rewards page

  Scenario: Test manage donate points rewards button
    When I click Special Rewards
    And I click manage donate points
    Then I should see manage donate points Rewards page

  Scenario: Test manage Email Subscriptions rewards button
    When I click Special Rewards
    And I click manage email subscriptions
    Then I should see manage email subscriptions Rewards page

  Scenario: Test Southwest Search Field
    When I click search button
    And I enter Car Rental New York City in serach field
    And I click search bt
    Then I should see car rentals in NYC




     A
















