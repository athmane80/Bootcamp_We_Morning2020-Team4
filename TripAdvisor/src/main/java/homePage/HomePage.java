package homePage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import webElement.HomePageWebElement;

import java.util.List;

import static webElement.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementSign)
    public WebElement signin;
    public void signTripAdv() { signin.click(); }

    @FindBy(how = How.CSS, using = webElementEmail)
    public WebElement byemail;
    public void setSignbyemail() { byemail.click(); }

    @FindBy(how = How.XPATH, using =webElementEnterEmail)
    public WebElement enteremail;
    public void setEnteremail () { enteremail.sendKeys("akka104@hotmail.com"); }

    @FindBy(how = How.XPATH, using =webElementPassword)
    public WebElement enterpassword;
    public void setEnterpass () { enterpassword.sendKeys("111111"); }

    @FindBy(how = How.XPATH, using =webElementLog)
    public WebElement login;
    public void setlog () { login.click(); }

    @FindBy(how = How.XPATH, using =webElementThingsToDo)
    public WebElement things;
    public void setThings () { things.click(); }

    @FindBy(how = How.XPATH, using =webElementSearchThing)
    public WebElement searchthings;
    public void setSearchThings(){searchthings.sendKeys("New York City"); }

    @FindBy(how = How.CSS, using =webElementSearchThButton)
    public WebElement searchthingsBu;
    public void setthingsButton () {searchthingsBu.click();}

    @FindBy(how = How.CSS, using =webElHotelLocation)
    public WebElement searchtHotloca;
    public void setSearLoca(){searchtHotloca.sendKeys("Miami Florida");}

    @FindBy(how = How.CSS, using =webElementHotel)
    public WebElement searchthotel;
    public void setEnterLocation(){searchthotel.click();}

    @FindBy(how = How.CSS, using =webElHotelBt)
    public WebElement locatbt;
    public void clickSearchLoca(){locatbt.click();}

    @FindBy(how = How.XPATH, using =webVacation)
    public WebElement vacation ;
    public void setVacation(){vacation.click();}

    @FindBy(how = How.XPATH, using =webSelectDate)
    public WebElement datein ;
    public void setDatein(){datein.click();}

    @FindBy(how = How.XPATH, using =webCheckin)
    public WebElement checkin ;
    public void setCheIn (){checkin.click();}

    @FindBy(how = How.XPATH, using =webRestLoca)
    public WebElement restauloca ;
    public void setRestauLoca(){restauloca.sendKeys("Paris");}

//    @FindBy(how = How.XPATH, using =webReataurant)
//    public WebElement restaurant ;
//    public void setRestaurantSearch(){restaurant.click();}


    @FindBy(how = How.XPATH, using =webReview)
    public WebElement review ;
    public void setReview(){review.click();}

    @FindBy(how = How.XPATH, using =webStars)
    public WebElement starsreview ;
    public void setStars(){starsreview.click();}

////
    @FindBy(how = How.XPATH, using = WbSearchField)
    public WebElement searchValidText;
//////
    public static void dragDrop() throws InterruptedException {

        Actions act=new Actions(driver);

        // find element which we need to drag
        WebElement source=driver.findElement(By.xpath("(//span[text()='Thrillers'])[1]"));

        WebElement destination=driver.findElement(By.xpath("(//span[text()='History'])[2]"));

        // it will click and hold the triller box and move to element will move cursor to history in another box and then release
        act.clickAndHold(source).pause(2000).moveToElement(destination).release().build().perform();

    }

    public void validateSearchService(List<String> expectedResult) {
        String actualResult = searchValidText.getText();
        Assert.assertEquals("Search Result not Displayed",expectedResult,actualResult);

    }


}























