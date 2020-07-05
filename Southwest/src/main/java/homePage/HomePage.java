package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webElement.HomePageWebElements;

public class HomePage extends HomePageWebElements {

    @FindBy(xpath = webRoundTrip)
    public static WebElement selectCheckButton;

    public static WebElement selectCheck() {
        return selectCheckButton;
    }

    public static void checkButton() {
        selectCheck().click();
    }
}
