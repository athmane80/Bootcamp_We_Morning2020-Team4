package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import webElement.HomePageWebElements;




public class HomePage extends HomePageWebElements {
     @FindBy(how = How.XPATH, using = webElementFindStore)
     public WebElement findStore;
     public void findStores() { findStore.click(); }
     @FindBy(how = How.XPATH, using = WbePlans)
     public WebElement plans;
     public void setPlans(){ mouseHoverByXpath(WbePlans);plans.click(); }
     @FindBy(how=How.XPATH,using=WebMagenta)
     public WebElement magenda;
     public void useMagenda(){ magenda.click(); }
     @FindBy(how = How.XPATH, using = WebDevices)
     public WebElement devices;
     public void setDevices() { mouseHoverByXpath(WebDevices);devices.click(); }
     @FindBy(how = How.XPATH, using =WebDeals)
     public WebElement deals;
     public void setDeals() { mouseHoverByXpath(WebDeals);deals.click();}
     @FindBy(how = How.XPATH, using =WebSupport)
     public WebElement support;
     public void setSupport() { mouseHoverByXpath(WebSupport);support.click();}
     @FindBy(how = How.XPATH, using =WebCoverge)
     public WebElement coverage;
     public void setCoverage() { mouseHoverByXpath(WebCoverge);coverage.click();}


     @FindBy(how = How.XPATH, using =Webebenefits)
     public WebElement benefits;
     public void setBenefits() { benefits.click();}
     @FindBy (xpath =Webebenefits )public WebElement mouseHover;

     public  void setMouseHover(){ mouseHoverByXpath(Webebenefits);}

     //public  void setMouseHover(){ mouseHoverByXpath(Webebenefits);}




     @FindBy(how = How.XPATH, using =WebCompare)
     public WebElement compare;
     public void setCompare() { benefits.click();}
     @FindBy(how = How.XPATH, using = webElementSearchStore)
     public WebElement enterLocation;
     public void findLocation () { enterLocation.sendKeys("Brooklyn"); }
     @FindBy(how = How.XPATH, using = webElementStoreSearchButton)
     public WebElement locationButton;
     public void locatButton () { locationButton.click(); }
     @FindBy(how = How.XPATH, using = webelementStoreAdress)
     public WebElement adressLink;
     public void adress () { adressLink.click(); }
     @FindBy(how = How.XPATH, using = webElementShopPhones)
     public WebElement shopPhones;
     public void shop () { shopPhones.click(); }
     @FindBy(how = How.XPATH, using = webElementPhones)
     public WebElement elementPhones;
     public void phones () { elementPhones.click(); }
     @FindBy(how = How.XPATH, using = webElementAccount)
     public WebElement accountButton;
     public void accountBt () { accountButton.click(); }
     @FindBy(how = How.XPATH, using = webLogButton)
     public WebElement logButton;
     public void LogingButton () { logButton.click(); }
     @FindBy(how = How.XPATH, using = webPhoneNumber)
     public WebElement phoneNumber;
     public void enterPhoneNumber () { phoneNumber.sendKeys("2178888888"); }
     @FindBy(how = How.XPATH, using = WebStatement)
     public WebElement WebSwitch;
     public void switchToTmobile () {WebSwitch .click(); }







}




















