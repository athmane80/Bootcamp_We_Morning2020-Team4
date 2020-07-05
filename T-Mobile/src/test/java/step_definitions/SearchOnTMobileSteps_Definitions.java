package step_definitions;

import common.WebAPI;
import homePage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import static webElement.HomePageWebElements.*;

import java.io.IOException;

public class SearchOnTMobileSteps_Definitions extends WebAPI {

    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83", "https://www.T-Mobile.com/");
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Given("I am at T-Mobile HomePage")
    public void i_am_at_T_Mobile_HomePage() throws InterruptedException {
        getInitElements(); }

    @When("I click deals button")
    public void i_click_deals_button()throws InterruptedException {
       getInitElements();
       homePage.clickOnElement(WebDeals,driver);}



    @Then("I should see T-Mobile deals")
    public void i_should_see_T_Mobile_deals()throws InterruptedException { getInitElements(); }

    @When("I click coverage button")
    public void i_click_coverage_button()throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(WebCoverge,driver); }



    @Then("I should see T-Mobile coverages")
    public void i_should_see_T_Mobile_coverages()throws InterruptedException { getInitElements(); }

    @When("I click my account button")
    public void i_click_my_account_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webElementAccount,driver); }



    @When("I click log in button")
    public void i_click_log_in_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webLogButton,driver); }


    @Then("I sould see log in page")
    public void i_sould_see_log_in_page() throws InterruptedException {
        getInitElements(); }


     @When("I click support button")
    public void i_click_support_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(WebSupport,driver); }



    @Then("I should see support page")
    public void i_should_see_support_page() throws InterruptedException { getInitElements(); }

    @When("I click devices button")
    public void i_click_devices_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(WebDevices,driver); }



    @Then("I should see devices page")
    public void i_should_see_devices_page() throws InterruptedException { getInitElements(); }

    @When("I click benefits button")
    public void i_click_benefits_button() throws InterruptedException  {
        getInitElements();
        homePage.clickOnElement(Webebenefits,driver); }



    @Then("I should see benefits page")
    public void i_should_see_benefits_page() throws InterruptedException { getInitElements(); }

    @When("I click compare button")
    public void i_click_compare_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(WebCompare,driver); }


    @Then("I should see compare page")
    public void i_should_see_compare_page() throws InterruptedException { getInitElements(); }

    @When("I click find a store button")
    public void i_click_find_a_store_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(webElementFindStore,driver); }


    @When("I enter Brooklyn in search field")
    public void i_enter_Brooklyn_in_search_field() throws InterruptedException {
        getInitElements();
        homePage.typeOnElement(webElementSearchStore,"Brooklyn"); }

    @When("I click search button")
    public void i_click_search_button() throws InterruptedException  {
        getInitElements();
        homePage.clickOnElement(webElementStoreSearchButton,driver); }

    @Then("I should see T-Mobile stores in Brooklyn")
    public void i_should_see_T_Mobile_stores_in_Brooklyn() throws InterruptedException  { getInitElements(); }

    @When("I click shop button")
    public void i_click_shop_button() throws InterruptedException  {
        getInitElements();
        homePage.clickOnElement(webElementShopPhones,driver); }

    @Then("I should see shop page page")
    public void i_should_see_shop_page_page() throws InterruptedException { getInitElements(); }

    @When("I click statement button")
    public void i_click_statement_button() throws InterruptedException  {
        getInitElements();
        homePage.clickOnElement(WebStatement,driver ); }

    @Then("I should see statement  page")
    public void i_should_see_statement_page() throws InterruptedException { getInitElements(); }

    @When("I click plans button")
    public void i_click_plans_button() throws InterruptedException {
        getInitElements();
        homePage.clickOnElement(WbePlans,driver); }

    @Then("I should see plans page")
    public void i_should_see_plans_page() throws InterruptedException{ getInitElements(); }




}


