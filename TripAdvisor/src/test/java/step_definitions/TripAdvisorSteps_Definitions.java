package step_definitions;
import webElement.HomePageWebElement;
import common.WebAPI;
import homePage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static webElement.HomePageWebElement.*;


public class TripAdvisorSteps_Definitions  extends WebAPI {

    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83", "https://www.tripadvisor.com/");
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }



    @Given("I am at Advisor HomePage")
    public void i_am_at_Advisor_HomePage() throws InterruptedException { getInitElements();}



    @When("I click Sign In button")
    public void  i_click_Sign_In_button() throws InterruptedException{
        getInitElements();
        homePage.clickOnElement(webElementSign,driver);
    }



    @Then("I should see ways to connect")
    public void i_should_see_ways_to_connect() throws InterruptedException{
        getInitElements();

    }

    @When("I click Things to Do button")
    public void i_click_Things_to_Do_button()throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webElementThingsToDo,driver);


    }

    @When("I enter New York City as  location")
    public void i_enter_New_York_City_as_location()throws InterruptedException {
        getInitElements();
        homePage.typeOnElement(webElementSearchThing,"New York City");

    }

    @When("I click searchbutton")
    public void i_click_searchbutton()throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webElementSearchThButton,driver);

    }

    @Then("I should see things to do in NYC")
    public void i_should_see_things_to_do_in_NYC() throws InterruptedException{
        getInitElements();

    }

    @When("I click hotels field")
    public void i_click_hotels_field() {
        getInitElements();
        homePage.clickOnElement(webElementHotel,driver);


    }

    @When("I enter Miami Florida as location")
    public void i_enter_Miami_Florida_as_location() {
        getInitElements();
        homePage.typeOnElement(webElHotelLocation,"Miami Florida");

    }

    @When("I click hotels search button")
    public void i_click_hotels_search_button() {
        getInitElements();
        homePage.clickOnElement(webElHotelBt);

    }

    @Then("I should see hotels in Florida")
    public void i_should_see_hotels_in_Florida() {
        getInitElements();

    }

    @When("I click vacation field")
    public void i_click_vacation_field() {
        getInitElements();
        homePage.clickOnElement(webVacation,driver);

    }

    @When("I click check in field")
    public void i_click_check_in_field() {
        getInitElements();
        homePage.clickOnElement(webCheckin,driver);



    }

    @Then("i should see check in dates")
    public void i_should_see_check_in_dates() {
        getInitElements();

    }

    @When("I click restaurants field")
    public void i_click_restaurants_field() {
        getInitElements();
        homePage.clickOnElement(webReataurant,driver);

    }

    @When("I enter Paris in research field")
    public void i_enter_Paris_in_research_field() {
        getInitElements();
        homePage.typeOnElement(webRestLoca,"Paris");

    }

    @When("I click search restaurant button")
    public void i_click_search_restaurant_button() {
        getInitElements();
//        homePage.clickOnElement(webRestBT,driver);

    }

    @Then("I should see restaurants in Paris")
    public void i_should_see_restaurants_in_Paris() {
        getInitElements();

    }

    @When("I click Review field")
    public void i_click_Review_field() {
        getInitElements();
        homePage.clickByXpath(webReview);

    }

    @Then("I should see review page")
    public void i_should_see_review_page() {
        getInitElements();

    }

    @When("I click Travel Forums field")
    public void i_click_Travel_Forums_field() {
        getInitElements();
        homePage.clickOnElement(webForums,driver);


    }

    @When("I enter best places to visit in search field")
    public void i_enter_best_places_to_visit_in_search_field() {
        getInitElements();
        homePage.typeOnElement(webPlaces,"best places to visit");

    }

    @When("I clear search field")
    public void i_clear_search_field() {
        getInitElements();
        homePage.clearInputField(webPlaces);

    }

    @When("I enter cheap hotels in Miami")
    public void i_enter_cheap_hotels_in_Miami() {
        getInitElements();
        homePage.typeOnElement(webPlaces,"cheap hotels in Miami");

    }

    @When("I click search forums button")
    public void i_click_search_forums_button() {

        getInitElements();
        homePage.clickOnElement(webFurumBt,driver);

    }

    @Then("I should see cheap hotels in Miami")
    public void i_should_see_cheap_hotels_in_Miami() {
        getInitElements();

    }

    @When("I click more field")
    public void i_click_more_field() {
        getInitElements();
        homePage.clickOnElement(webMore, driver);

    }

    @When("I click rental cars field")
    public void i_click_rental_cars_field() {
        getInitElements();
        homePage.clickOnElement(webCarRental, driver);

    }

    @Then("I should see Rental Cars page")
    public void i_should_see_Rental_Cars_page() {
        getInitElements();

    }

    @When("I click airlines field")
    public void i_click_airlines_field() {
        getInitElements();
        homePage.clickOnElement(webAirlines,driver);

    }

    @Then("I should see airlines page")
    public void i_should_see_airlines_page() {
        getInitElements();

    }

    @When("I click cruises field")
    public void i_click_cruises_field() {
        getInitElements();
        homePage.clickOnElement( webCruises,driver);

    }

    @Then("I should see cruises page")
    public void i_should_see_cruises_page() {
        getInitElements();

    }

    @When("I click flights field")
    public void i_click_flights_field() {
        getInitElements();
        homePage.clickOnElement( webFlights,driver);

    }

    @Then("I should flights page")
    public void i_should_flights_page() {
        getInitElements();

    }

    @When("I click help center field")
    public void i_click_help_center_field() {
        getInitElements();
        homePage.clickOnElement( webHelpCenter,driver);


    }

    @Then("I should see help center page")
    public void i_should_see_help_center_page() {
        getInitElements();

    }

    @When("I click insurance field")
    public void i_click_insurance_field() {
        getInitElements();
        homePage.clickOnElement( webInsurance,driver);

    }

    @Then("I should see insurance page")
    public void i_should_see_insurance_page() {
        getInitElements();

    }

    @When("I click trips field")
    public void i_click_trips_field() {
        getInitElements();
        homePage.clickOnElement(webTrips,driver);

    }

    @Then("I should see trips page")
    public void i_should_see_trips_page() {
        getInitElements();

    }

    @When("I click travelers choice field")
    public void i_click_travelers_choice_field() {
        getInitElements();
        homePage.clickOnElement(webTravelersChoice,driver);

    }

    @Then("I should see Travelers choice page")
    public void i_should_see_Travelers_choice_page() {
        getInitElements();

    }

    @When("I click packages field")
    public void i_click_packages_field() {
        getInitElements();
        homePage.clickOnElement(webPackage,driver);

    }

    @Then("I should see packages page")
    public void i_should_see_packages_page() {
        getInitElements(); }

    @Given("I Enter Items In Search field")
    public void i_Enter_Items_In_Search_field (List<String> items) {
        getInitElements();
        homePage.validateSearchService(items); }

    @When("I click Search button")
    public void i_click_Search_button() {
        getInitElements();
        homePage.clickOnElement(WbSearchField,driver); }

    @Then("I should see Expected Items")
    public void i_should_see_Expected_Items(io.cucumber.datatable.DataTable dataTable) { getInitElements(); }











}
