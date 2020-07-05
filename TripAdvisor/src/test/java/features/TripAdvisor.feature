Feature: TripAdvisor HomePage
  As a costumer I am at TripAdvisor HomePage
  Background: Advisor HomePage
    Given I am at Advisor HomePage

    Scenario: Test Signin
      When I click Sign In button
      Then I should see ways to connect

     Scenario:Things to Do in NYC
       When I click Things to Do button
       And I enter New York City as  location
       And I click searchbutton
       Then I should see things to do in NYC

     Scenario:Test hotel location
       When I click hotels field
       And I enter Miami Florida as location
       And I click hotels search button
       Then I should see hotels in Florida

     Scenario:Test vacation search
       When I click vacation field
       And I click check in field
       Then i should see check in dates

     Scenario: Test Restaurants in Paris
       When I click restaurants field
       And I enter Paris in research field
       And I click search restaurant button
       Then I should see restaurants in Paris

     Scenario:Test give Review page
       When I click Review field
       Then I should see review page

    Scenario: Test Travel Forum page
      When I click Travel Forums field
      And I enter best places to visit in search field
      And I clear search field
      And I enter cheap hotels in Miami
      And I click search forums button
      Then I should see cheap hotels in Miami

     Scenario: Test Car Rentals page
       When I click more field
       And I click rental cars field
       Then I should see Rental Cars page


     Scenario: Test Airlines page
       When I click more field
       And I click airlines field
       Then I should see airlines page

  Scenario: Test cruises page
    When I click more field
    And I click cruises field
    Then I should see cruises page

  Scenario: Test flights page
    When I click more field
    And I click flights field
    Then I should flights page

  Scenario: Test help center page
    When I click more field
    And I click help center field
    Then I should see help center page

  Scenario: Test Insurance page
    When I click more field
    And I click insurance field
    Then I should see insurance page

  Scenario: Test Trips page
    When I click more field
    And I click trips field
    Then I should see trips page

  Scenario: Test Traveler's choice page
    When I click more field
    And I click travelers choice field
    Then I should see Travelers choice page

  Scenario: Test Packages page
    When I click more field
    And I click packages field
    Then I should see packages page


  Scenario: Test Search tripAdvisor services using Parameter
    And I Enter Items In Search field
  | Flights |
  | Hotels |
  | Cars Rental|
  | Vacations |
  When I click Search button
  Then I should see Expected Items

    | "Flights "|
    | "Hotels" |
    | "Cars Rental"|
    | "Vacations" |





















