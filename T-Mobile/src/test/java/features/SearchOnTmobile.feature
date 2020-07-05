
Feature:T-Mobile HomePage
  As a costumer i am  at T-Mobile HomePage
  Background:T-Mobile HomePage
    Given I am at T-Mobile HomePage

    Scenario: Test login button
      When I click my account button
      And I click log in button
      Then I sould see log in page



  Scenario: Test Search for T-Mobile Deals
    When I click deals button
    Then I should see T-Mobile deals



    Scenario: Test search for T-Mobile coverage
      When I click coverage button
      Then I should see T-Mobile coverages





  Scenario: Test Support button
    When I click support button
    Then I should see support page



  Scenario: Test devices button
    When I click devices button
    Then I should see devices page



  Scenario: Test benefits button
    When I click benefits button
    Then I should see benefits page


  Scenario: Test  compare button
    When I click compare button
    Then I should see compare page


  Scenario: Test Find store
    When I click find a store button
    And I enter Brooklyn in search field
    And I click search button
    Then I should see T-Mobile stores in Brooklyn


  Scenario: Test  Shop phones
    When I click shop button
    Then I should see shop page page


  Scenario: Test  Statement
    When I click statement button
    Then I should see statement  page

  Scenario: Test Plans
    When I click plans button
    Then I should see plans page




















