package testPages;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.clothingPage;
import pages.jewelryPage;

public class testClothingPage extends clothingPage {
    clothingPage clothingpage;
    String clothingPageUrl = "https://www.etsy.com/c/clothing-and-shoes?ref=catnav-10923";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(clothingPageUrl);
        clothingpage = PageFactory.initElements(driver, clothingPage.class);
    }

    @Test
    public void testclothingTab() throws InterruptedException{
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.HoveroverClothingTab();
    }

    @Test
    public void testSeventhBday(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkSeventhBday();
        driver.navigate().back();
    }

    @Test
    public void testMonogram(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkMonogram();
        driver.navigate().back();
    }

    @Test
    public void testLVCase(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkLVcase();
        driver.navigate().back();
    }

    @Test
    public void testPurpleDress(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkPurpleDress();
        driver.navigate().back();
    }

    @Test
    public void testBabyShoes(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkBabyShoes();
        driver.navigate().back();
    }
}


