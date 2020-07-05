package step_definitions;

import hometest.HomePageTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.io.IOException;

public class CommonMethods extends HomePageTest {

    @Given("I am at Letskodeit Homepage")
    public void i_am_at_Letskodeit_Homepage() throws IOException {
        // Write code here that turns the phrase above into concrete actions
    setUp(false,"browserstack","OS X","Catalina","chrome","83","https://learn.letskodeit.com/");
    }


    @Then("I Close Browser")
    public void i_Close_Browser() {
        // Write code here that turns the phrase above into concrete actions
    driver.quit();
    }

}
