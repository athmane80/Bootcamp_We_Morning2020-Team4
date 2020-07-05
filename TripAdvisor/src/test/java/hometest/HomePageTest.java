package hometest;

import homePage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static webElement.HomePageWebElement.*;

public class HomePageTest extends HomePage {
    HomePage TripadvisorTest;

    public void initElements() {
        TripadvisorTest = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void signin() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webElementSign,driver);

        sleepFor(2);
    }

    @Test(priority = 2)
    public void thingsDo() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webElementThingsToDo,driver);
        TripadvisorTest.typeOnElement(webElementSearchThing,"New York City");
        TripadvisorTest.clickOnElement(webElementSearchThButton,driver);

        sleepFor(3);
    }

    @Test(priority = 3)
    public void Hotelslocation() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webElementHotel,driver);
        TripadvisorTest.typeOnElement(webElHotelLocation,"Miami Florida");
        TripadvisorTest.clickOnElement(webElHotelBt);
    }

    @Test(priority = 4)
    public void vacation() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webVacation,driver);
        TripadvisorTest.clickOnElement(webCheckin,driver);
        sleepFor(4);}

    @Test(priority = 5)
    public void restau() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webReataurant, driver);
        TripadvisorTest.typeOnElement(webRestLoca, "Paris");
//        TripadvisorTest.clickOnElement(webRestBT,driver);
    }
     @Test(priority = 6)
    public void reviewPlace() throws InterruptedException {
        initElements();
        TripadvisorTest.clickByXpath(webReview);
        sleepFor(3);

    }
    @Test (priority = 7)
    public void forumTrip() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webForums,driver);
        TripadvisorTest.typeOnElement(webPlaces,"best places to visit");
        sleepFor(3);
        TripadvisorTest.clearInputField(webPlaces);
        TripadvisorTest.typeOnElement(webPlaces,"cheap hotels in Miami");
        TripadvisorTest.clickOnElement(webFurumBt,driver);
        sleepFor(3);
    }
    @Test (priority = 8)
    public void Rental() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath(webCarRental);

        TripadvisorTest.clickOnElement(webCarRental, driver);
        TripadvisorTest.clickOnElement(webBrowseLocation, driver);
        TripadvisorTest.typeOnElement(webRentalPlace, "New York City, NY - John F. Kennedy International Airport (JFK)");
        TripadvisorTest.clickOnElement(webRentalBt,driver);
        TripadvisorTest.navigateBack();
    }
    @Test (priority = 9)
    public void airlines() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath(webAirlines);
        TripadvisorTest.clickOnElement(webAirlines,driver);
    }
    @Test (priority = 10)
    public void cruises() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webCruises);
        TripadvisorTest.clickOnElement( webCruises,driver);}

    @Test (priority=11)
    public void flights() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webFlights);
        TripadvisorTest.clickOnElement( webFlights,driver);}


    @Test (priority=12)
    public void helpcenter() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webHelpCenter);
        TripadvisorTest.clickOnElement( webHelpCenter,driver);}

    @Test (priority=13)
    public void insurance() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webInsurance);
        TripadvisorTest.clickOnElement( webInsurance,driver);}

    @Test (priority=14)
    public void trips() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webTrips);
        TripadvisorTest.clickOnElement(webTrips,driver);}

    @Test (priority=15)
    public void travelersChoice() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webTravelersChoice);
        TripadvisorTest.clickOnElement(webTravelersChoice,driver);}

    @Test (priority=16)
    public void packages() throws InterruptedException {
        initElements();
        TripadvisorTest.clickOnElement(webMore, driver);
        TripadvisorTest.mouseHoverByXpath( webPackage);
        TripadvisorTest.clickOnElement(webPackage,driver);}





}














