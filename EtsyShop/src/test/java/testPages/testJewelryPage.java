package testPages;

import Reporting.TestLogger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homePage;
import pages.jewelryPage;

public class testJewelryPage extends jewelryPage {

    jewelryPage jewelrypage;
    String jewelryPageUrl = "https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(jewelryPageUrl);
        jewelrypage = PageFactory.initElements(driver, jewelryPage.class);
    }

    @Test
    public void testAccessories(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkaccessories();
    }

    @Test
    public void testBeltNSuspenders(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkbeltnsuspenders();
    }

    @Test
    public void testHairacc(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkhairacc();
    }

    @Test
    public void testHats() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkhats();
    }

    @Test
    public void testKeychains(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkKeychains();
    }

    @Test
    public void testViewAllAcc() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkViewAllAcc();
    }

    @Test
    public void testPineappleTassle() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkPineappleTassle();
    }

    @Test
    public void testLuckyPenny() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkLuckyPenny();
    }

    @Test
    public void testWeddingVeil() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkWeddingVeil();
    }

    @Test
    public void testduffleBags() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkduffleBags();
    }

    @Test
    public void testNextpage(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkNextPage();
    }

    @Test
    public void testBodyJewelry(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jewelrypage.checkBodyJewelry();
        driver.navigate().back();
    }

    @Test
    public void testHandmade(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        jewelrypage.checkHandmade();
        driver.navigate().back();
    }

    @Test
    public void testPriceRange(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        jewelrypage.checkPriceRange();
        driver.navigate().back();
    }

    @Test
    public void testAcceptGiftCard(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        jewelrypage.checkAcceptGiftCard();
        driver.navigate().back();
    }
}

