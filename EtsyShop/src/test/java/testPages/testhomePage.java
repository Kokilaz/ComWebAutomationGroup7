package testPages;

import Base.CommonAPI;
import Reporting.ApplicationLog;
import Reporting.TestLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homePage;

import java.io.IOException;
import java.util.List;

import static javax.swing.UIManager.get;

public class testhomePage extends homePage {

    homePage homepage;
    String homePageUrl = "https://www.etsy.com/";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(homePageUrl);
        homepage = PageFactory.initElements(driver, homePage.class);
    }

    @Test
    public void testetsyLogo() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.checkLogo();
    }

    @Test
    public void testsellonetsy() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.checkSelletsy();
    }

    @Test
    public void testJandATab() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoveroverJandATab();
    }

    @Test
    public void testclothingTab() throws InterruptedException{
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoveroverClothingTab();
        }

    @Test
    public void testHomeNLiving() throws InterruptedException{
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoveroverHomeandLiving();
    }

    @Test
    public void testWeddingNParty() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoveroverweddingandParty();
    }

    @Test
    public void testToys() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.Hoverovertoys();
    }
    @Test
    public void testArt() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.Hoveroverart();
    }

    @Test
    public void testartSupplies() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoverovercraftSupplies();
    }

    @Test
    public void testvintage() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.HoveroverVintage();
    }

    @Test
    public void testGifts() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.Hoverovergifts();
    }

    @Test
    public void testSigninbutton(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.checkSigninButton();
    }

    @Test
    public void testSigninBox(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage.SigninBox();
    }
}

