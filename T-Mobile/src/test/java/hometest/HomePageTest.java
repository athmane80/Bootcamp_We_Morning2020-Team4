package hometest;

import homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    HomePage TmobileTest;
    public void initElements() {
        TmobileTest = PageFactory.initElements(driver, HomePage.class);
    }
    @Test (priority =1)
    public void seeplans() throws InterruptedException{
        initElements();
        Thread.sleep(2000);
        TmobileTest.setPlans();
        Thread.sleep(4000);
        driver.navigate().refresh(); }
    @Test (priority =2)
    public void seeSupport() throws InterruptedException{
        initElements();
        Thread.sleep(2000);
        TmobileTest.setSupport();
        driver.navigate().refresh(); }
    @Test(priority = 3)
    public void seeDevices() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.setDevices(); }
    @Test(priority = 4)
    public void seeDeals() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.setDeals(); }
    @Test(priority = 5)
    public void seeCoverage() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.setCoverage();}
     @Test(priority = 6)
     public void seeBenefits() throws InterruptedException {
        //initElements();
         Thread.sleep(3000);
//         TmobileTest.setBenefits();
         TmobileTest.setMouseHover();
         }
    @Test(priority = 7)
    public void seeCompare() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.setCompare(); }
     @Test (priority = 8)
     public void accountLog() throws InterruptedException {
        initElements();
         Thread.sleep(2000);}
//        TmobileTest.accountBt();
//        TmobileTest.LogingButton();
//        Thread.sleep(2000);
//        TmobileTest.enterPhoneNumber(); }
     @Test(priority = 9)
     public void findStoreTest() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.findStores();
        TmobileTest.findLocation();
        Thread.sleep(2000);
        TmobileTest.locatButton();
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); } }
     @Test(priority = 10)
     public void shoPhones() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
        TmobileTest.shop();
//        TmobileTest.phones();
        Thread.sleep(3000); }
     @Test (priority = 11)
     public void statementRead() throws InterruptedException {
        initElements();
         Thread.sleep(2000);
        TmobileTest.switchToTmobile(); }





       @Test (priority=12)
      public void PlansMouseHover() throws InterruptedException{
        initElements();
        Thread.sleep(5000);
        mouseHoverByXpath(WbePlans);






       }


}


