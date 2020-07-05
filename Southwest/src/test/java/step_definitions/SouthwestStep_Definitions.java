package step_definitions;

import common.WebAPI;
import homePage.HomePage;
import hometest.HomePageTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import hometest.HomePageTest.*;

import java.io.IOException;

import static webElement.HomePageWebElements.*;

public class SouthwestStep_Definitions extends WebAPI {

    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83", "https://www.southwest.com/");
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() { homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am at Southwest HomePage")
    public void i_am_at_Southwest_HomePage() throws InterruptedException{ getInitElements(); }

    @When("I click Login button")
    public void i_click_Login_button()throws InterruptedException { getInitElements();
    homePage.clickOnElement(webSouthLogin,driver); }

    @When("I Enter UserName")
    public void i_Enter_UserName() throws InterruptedException{ getInitElements();
    homePage.typeOnElement(webSouthUserName,"user name-Southwest"); }

    @When("I Enter Password")
    public void i_Enter_Password() throws InterruptedException{ getInitElements();
    homePage.typeOnElement(webSouthPassword,"password-Southwest"); }

    @When("I click Log in button")
    public void i_click_Log_in_button() throws InterruptedException{ getInitElements();
    homePage.clickOnElement(webSouthLgBt,driver); }

    @Then("I should see infos intered incorrect")
    public void i_should_see_infos_intered_incorrect()throws InterruptedException { getInitElements(); }

    @When("I click Enroll")
    public void i_click_Enroll() throws InterruptedException{ getInitElements();
    homePage.clickOnElement(webSouthEnroll,driver); }

    @Then("I should see Enroll page")
    public void i_should_see_Enroll_page() throws InterruptedException{ getInitElements(); }

    @When("I click services")
    public void i_click_services()throws InterruptedException { getInitElements();
    homePage.clickOnElement(webSouthServices,driver); }

    @Then("I should see services provided page")
    public void i_should_see_services_provided_page() throws InterruptedException{ getInitElements(); }

    @When("I click flights button")
    public void i_click_flights_button() throws InterruptedException{
//        homePage.clickOnElement(webSouthServices,driver);
        homePage.clickOnElement(webSouthFlights,driver);
        getInitElements();
    }

    @Then("i should see flights page")
    public void i_should_see_flights_page() throws InterruptedException{ getInitElements(); }

    @When("I click Hotels")
    public void i_click_Hotels() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthServices,driver);
        homePage.clickOnElement(webSouthHotels,driver);
    }

    @Then("i should see Hotels page")
    public void i_should_see_Hotels_page() throws InterruptedException{ getInitElements();}

    @When("I click Car")
    public void i_click_Car() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthServices,driver);
        homePage.clickOnElement(webSouthCar,driver);
    }

    @Then("i should see Car page")
    public void i_should_see_Car_page() throws InterruptedException{ getInitElements(); }

    @When("I click Vacations")
    public void i_click_Vaccations() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthServices,driver);
        homePage.clickOnElement(webSouthVacations,driver);
    }

    @Then("I should see Vacations page")
    public void i_should_see_Vacations_page()throws InterruptedException{ getInitElements(); }

    @When("I click Special offers")
    public void i_click_Special_offers() throws InterruptedException{
        getInitElements();
        homePage.clickOnElement(webSoutSpecial,driver);
    }

    @Then("I should see Special offers page")
    public void i_should_see_Special_offers_page() { getInitElements(); }

    @When("I click Flight offers")
    public void i_click_Flight_offers() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSoutSpecial);
        homePage.clickOnElement(webSouthSpecFlights,driver);

    }

    @Then("I should see Flights offers page")
    public void i_should_see_Flights_offers_page() throws InterruptedException{ getInitElements(); }

    @When("I click Hotels offers")
    public void i_click_Hotels_offers() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSoutSpecial);
        homePage.clickOnElement(webSouthSpecHotels,driver);
    }

    @Then("I should see Hotels offers page")
    public void i_should_see_Hotels_offers_page() throws InterruptedException { getInitElements(); }

    @When("I click Cars offers")
    public void i_click_Cars_offers() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSoutSpecial);
        homePage.clickOnElement(webSouthSpecCars,driver);
    }

    @Then("I should see Cars offers page")
    public void i_should_see_Cars_offers_page() throws InterruptedException{
        getInitElements(); }

    @When("I click  Vacations")
    public void i_click_Vacations() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSoutSpecial);
        homePage.clickOnElement(webSouthSpevacations,driver);
    }

    @Then("I should see Special Vacations offers page")
    public void i_should_see_Special_Vacations_offers_page() throws InterruptedException{ getInitElements(); }

    @When("I click Special Rewards")
    public void i_click_Special_Rewards() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webSouthRewards,driver);
    }

    @Then("I should see Rewards page")
    public void i_should_see_Rewards_page() throws InterruptedException{
        getInitElements();
    }

    @When("I click Program Rewards")
    public void i_click_Program_Rewards() throws InterruptedException{
        getInitElements();
        homePage.clickOnElement(webSouthRewards,driver);
    }

    @Then("I should see Program Rewards Page")
    public void i_should_see_Program_Rewards_Page() throws InterruptedException { getInitElements(); }

    @When("I click About Rewards")
    public void i_click_About_Rewards() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthRapRew,driver);
    }

    @Then("I should see About Rewards Page")
    public void i_should_see_About_Rewards_Page()throws InterruptedException { getInitElements(); }

    @When("I click Enroll Rewards")
    public void i_click_Enroll_Rewards() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthPrEnroll,driver);
    }

    @Then("I should see Enroll Rewards Page")
    public void i_should_see_Enroll_Rewards_Page()throws InterruptedException { getInitElements(); }

    @When("I click Earn Points Rewards")
    public void i_click_Earn_Points_Rewards()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthErningPts,driver);
    }

    @Then("I should see Earns points Rewards Page")
    public void i_should_see_Earns_points_Rewards_Page()throws InterruptedException { getInitElements(); }

    @When("I click Benefits Rewards")
    public void i_click_Benefits_Rewards()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthBenefits,driver);
    }

    @Then("I should see Benefits Rewards Page")
    public void i_should_see_Benefits_Rewards_Page() throws InterruptedException{ getInitElements(); }

    @When("I click Credit card Rewards")
    public void i_click_Credit_card_Rewards()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthRapCredit,driver);
    }

    @Then("I should see Credit card Rewards Page")
    public void i_should_see_Credit_card_Rewards_Page()throws InterruptedException { getInitElements(); }

    @When("I click Redeem Rewards")
    public void i_click_Redeem_Rewards()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthRedeemPts,driver);
    }

    @Then("I should see Redeem Rewards Page")
    public void i_should_see_Redeem_Rewards_Page() throws InterruptedException{ getInitElements(); }

    @When("I click Earn Points Shop Online Rewards")
    public void i_click_Earn_Points_Shop_Online_Rewards() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthEarnPtsShop,driver);
    }

    @Then("I should see Earn points Shop Online  Rewards Page")
    public void i_should_see_Earn_points_Shop_Online_Rewards_Page() throws InterruptedException {
        getInitElements();
    }

    @When("I click manage")
    public void i_click_manage() throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthmanageRe,driver);
    }

    @Then("I should see manage Rewards page")
    public void i_should_see_manage_Rewards_page() throws InterruptedException { getInitElements(); }

    @When("I click manage Account")
    public void i_click_manage_Account() throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthManagAcc,driver);
    }

    @Then("I should see manage account Rewards page")
    public void i_should_see_manage_account_Rewards_page()throws InterruptedException { getInitElements(); }

    @When("I click manage Account login")
    public void i_click_manage_Account_login()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthManagAccLg,driver);
    }

    @Then("I should see manage account login Rewards page")
    public void i_should_see_manage_account_login_Rewards_page()throws InterruptedException { getInitElements(); }

    @When("I click manage promotion")
    public void i_click_manage_promotion() throws InterruptedException{
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthManagPromo,driver);
    }

    @Then("I should see manage promotions Rewards page")
    public void i_should_see_manage_promotions_Rewards_page()throws InterruptedException { getInitElements(); }

    @When("I click manage transfer points")
    public void i_click_manage_transfer_points()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthManagTrsPts,driver);
    }

    @Then("I should see manage transfer points Rewards page")
    public void i_should_see_manage_transfer_points_Rewards_page()throws InterruptedException {
        getInitElements(); }

    @When("I click manage donate points")
    public void i_click_manage_donate_points()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthManagDonPts,driver);

    }

    @Then("I should see manage donate points Rewards page")
    public void i_should_see_manage_donate_points_Rewards_page()throws InterruptedException { getInitElements(); }

    @When("I click manage email subscriptions")
    public void i_click_manage_email_subscriptions()throws InterruptedException {
        getInitElements();
//        homePage.clickOnElement(webSouthRewards,driver);
        homePage.clickOnElement(webSouthMangEmSub,driver);

    }

    @Then("I should see manage email subscriptions Rewards page")
    public void i_should_see_manage_email_subscriptions_Rewards_page()throws InterruptedException { getInitElements(); }

    @When("I click search button")
    public void i_click_search_button() {
        getInitElements();
        homePage.clickOnElement(webSerch,driver);

    }

    @When("I enter Car Rental New York City in serach field")
    public void i_enter_Car_Rental_New_York_City_in_serach_field()throws InterruptedException {
        getInitElements();
        homePage.typeOnElement(webSerachField,"Car Rental New York City");

    }

    @When("I click search bt")
    public void i_click_search_bt()throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webSerachBtn,driver);

    }

    @Then("I should see car rentals in NYC")
    public void i_should_see_car_rentals_in_NYC() throws InterruptedException {
        getInitElements();

    }





}
