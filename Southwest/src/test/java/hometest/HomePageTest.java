package hometest;

import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class HomePageTest  extends HomePage {

    HomePage SouthwestTest;

    public void initElements() {
        SouthwestTest = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 27)
    public void southLogin() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthLogin,driver);
        SouthwestTest.typeOnElement(webSouthUserName,"user name-Southwest");
        SouthwestTest.typeOnElement(webSouthPassword,"password-Southwest");
        SouthwestTest.clickOnElement(webSouthLgBt,driver);
        sleepFor(2); }
    @Test(priority =29 )
    public void southEnroll() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthEnroll,driver);
        sleepFor(2); }
    @Test(priority = 30)
    public void southFlights() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthServices,driver);
        SouthwestTest.clickOnElement(webSouthFlights,driver); }
        @Test(priority = 31)
    public void southHotels() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthServices,driver);
        SouthwestTest.clickOnElement(webSouthHotels,driver); }
    @Test(priority = 32)
    public void southCar() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthServices,driver);
        SouthwestTest.clickOnElement(webSouthCar,driver); }
    @Test(priority = 33)
    public void southVacations() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthServices,driver);
        SouthwestTest.clickOnElement(webSouthVacations,driver); }
    @Test(priority = 34)
    public void southSpecFlights() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSoutSpecial,driver);
        SouthwestTest.clickOnElement(webSouthSpecFlights,driver); }
    @Test(priority = 35)
    public void southSpecHotels() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSoutSpecial,driver);
        SouthwestTest.clickOnElement(webSouthSpecHotels,driver); }
    @Test(priority = 36)
    public void southSpecCars() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSoutSpecial,driver);
        SouthwestTest.clickOnElement(webSouthSpecCars,driver); }
    @Test(priority = 10)
    public void southSpecVacations() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSoutSpecial,driver);
        SouthwestTest.clickOnElement(webSouthSpevacations,driver); }
    @Test(priority = 11)
    public void southProgram() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthProgramRe,driver); }
    @Test(priority = 12)
    public void southRaprewardsPgma() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthRapRew,driver); }
    @Test(priority = 13)
    public void southEnrollPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthPrEnroll,driver); }
    @Test(priority = 14)
    public void southErnPtsPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthErningPts,driver); }
    @Test(priority = 15)
    public void southSBenefitsPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthBenefits,driver); }
    @Test(priority = 16)
    public void southCreditcardPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthRapCredit,driver); }
    @Test(priority = 17)
    public void southSPtsFlightsPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthRedeemPts,driver); }
    @Test(priority = 18)
    public void southPtsShopPgm() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthEarnPtsShop,driver); }
        @Test(priority = 19)
    public void southmanage() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthmanageRe,driver); }
    @Test(priority = 20)
    public void southManageAcc() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthManagAcc,driver); }
        @Test(priority = 21)
    public void southManageAccLg() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthManagAccLg,driver); }
        @Test(priority = 22)
    public void southManagePromotions() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthManagPromo,driver); }
        @Test(priority = 23)
    public void southManageTrPts() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthManagTrsPts,driver); }
    @Test(priority = 24)
    public void southManageDonatePts() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthManagDonPts,driver); }
    @Test(priority = 25)
    public void southManageEmailSub() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSouthRewards,driver);
        SouthwestTest.clickOnElement(webSouthMangEmSub,driver); }
    @Test(priority = 26)
    public void southsearch() throws InterruptedException {
        initElements();
        SouthwestTest.clickOnElement(webSerch,driver);
        SouthwestTest.typeOnElement(webSerachField,"Car Rental New York City");
        SouthwestTest.clickOnElement(webSerachBtn,driver); }

     @Test(priority =28 )
    public void RoundTripCheck() throws InterruptedException{
        initElements();
//        SouthwestTest.clickOnElement(webSerachFlight,driver);
        SouthwestTest.checkButton();
        SouthwestTest.typeOnElement(webDepartFlight,"JFK NYC");
        SouthwestTest.typeOnElement(webArriveFlight,"ORD Chicago");
        sleepFor(3);
        SouthwestTest.clickOnElement(webDepartDate,driver);
         sleepFor(3);
        SouthwestTest.clickOnElement(webSelectDepaDate,driver);
         sleepFor(3);
        SouthwestTest.clickOnElement(webReturnDate,driver);
    }

     @Test(priority=1)
    public void setCheckin(){
        initElements();
        SouthwestTest.clickOnElement(webCheckin,driver);
        SouthwestTest.typeOnElement(webChecknum,"111111");
        SouthwestTest.typeOnElement(webCheckFname,"Athmane");
        SouthwestTest.typeOnElement(webCheckLname,"Chebili");
        SouthwestTest.clickOnElement(webCheckBt,driver); }


     @Test(priority=2)
    public void flightStatus(){
        initElements();
        SouthwestTest.clickOnElement(webFlStatusBt,driver); }

    @Test(priority=3)
    public void flightChange(){
        initElements();
        SouthwestTest.clickOnElement(webChangeCancelBt,driver); }

    @Test(priority=4)
    public void southProducts(){
        initElements();
        SouthwestTest.clickOnElement(webSouthProducts,driver); }

    @Test(priority=5)
    public void Aboutsouth(){
        initElements();
        SouthwestTest.clickOnElement(webAboutSouthwest,driver); }
    @Test(priority=6)
    public void FlySouth(){
        initElements();
        SouthwestTest.clickOnElement(webFliyingSouth,driver); }

    @Test(priority=7)
    public void SoutCosService(){
        initElements();
        SouthwestTest.clickOnElement(webSoutCostumerSer,driver); }

    @Test(priority=8)
    public void SoutPressRoom(){
        initElements();
        SouthwestTest.clickOnElement(WebPressRoom,driver); }

    @Test(priority=9)
    public void SoutFaq(){
        initElements();
        SouthwestTest.clickOnElement(webFaq,driver); }



}
