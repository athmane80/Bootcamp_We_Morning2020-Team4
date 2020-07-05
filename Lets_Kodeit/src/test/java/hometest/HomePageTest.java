package hometest;

import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    public static void getInItElements(){ PageFactory.initElements(driver, HomePage.class); }
    @Test (priority = 1)
    public  void testPracticeButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
    }

    @Test (priority = 2)
    public  void testSelectClassBar() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        clickSelectClassBar();
        sleepFor(2);
    }

    @Test(priority = 3)
    public  void clickOnRadioButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);

    }

    @Test(priority = 4)
    public  void clickOnSelectButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromDrop(webElemetSelectButton, "benz");
        sleepFor(3);

    }

    @Test(priority = 5)
    public  void clickOnSelectMultiButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);

    }

    @Test(priority = 6)
    public  void clickOnCheckButtonBMW() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }

    @Test(priority = 7)
    public  void testNewWindowOpen() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }

    @Test(priority = 8)
    public  void testNewBrowserTabOpen() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);

    }
    @Test(priority = 9)
    public  void alertHandleAccept() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();
        sleepFor(2);
        okkAlert();

    }

    @Test(priority = 10)
    public  void alertHandleCancel() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
//        alertHandleCancel();
        sleepFor(2);
        caancelAlert();

    }
    @Test(priority = 11)
    public  void testGetTable() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetTable);
        getListOfWebElemenntByXpath(webElemetTable);
        sleepFor(2);

    }
    @Test(priority = 12)
    public void testMouseHover() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(1);
        //scrollToWebElement(webElemetMouseHover);
//        setMouseHover();
        mouseHoverByXpath(webElemetMouseHover);
        sleepFor(2);
    }
    @Test(priority = 13)
    public void testIFrame() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetIframeName);
        sleepFor(2);
        iframeHandle(iFrameName);
        useSearchbar("Athmane Chebili Bootcamp");
        sleepFor(2);
        clearSearchBar();
        sleepFor(1);
    }


}