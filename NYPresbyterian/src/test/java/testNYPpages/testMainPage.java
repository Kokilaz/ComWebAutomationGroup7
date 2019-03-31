package testNYPpages;

import Reporting.TestLogger;
import nypPages.mainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testMainPage extends mainPage {

    mainPage mainpage;
    String homePageUrl = "https://www.nyp.org/home";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(homePageUrl);
        mainpage = PageFactory.initElements(driver, mainPage.class);
    }

    @Test
    public void TestLogo(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.CheckLogo();
    }

    @Test
    public void TestFindADoctor(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.FindADoctor();
    }

    @Test
    public void TestOurServices(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.OurServices();
    }

    @Test
    public void PayMyBill(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.PayMyBill();
    }

    @Test
    public void Locations(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.Locations();
    }

    @Test
    public void Visitors(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.Visitors();
    }

    @Test
    public void AboutUs(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.AboutUs();
    }

    @Test
    public void ClinicalTrials(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.ClinicalTrials();
    }

    @Test
    public void HealthLibrary(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.HealthLibrary();
    }

    @Test
    public void GiveToNYP(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.GiveToNYP();
    }

    @Test
    public void ContactUs(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.ContactUs();
    }

    @Test
    public void FacebookIcon(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.FacebookIcon();
        driver.navigate().back();
    }

    @Test
    public void TwitterIcon(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.TwitterIcon();
        driver.navigate().back();
    }

    @Test
    public void InstagramIcon(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.InstagramIcon();
        driver.navigate().back();
    }

    @Test
    public void UrgentCare(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.UrgentCare();
    }

    @Test
    public void NewsRoom(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.NewsRoom();
    }

    @Test
    public void GlobalServices(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.GlobalServices();
    }

    @Test
    public void ForProfessionals(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.ForProfessionals();
    }

    @Test
    public void Employees(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.Employees();
    }

    @Test
    public void ForVendors(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.ForVendors();
    }

    @Test
    public void Careers(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.Careers();
    }
}

