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

    /*@Test
    public void testClothing(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkClothing();

    }*/

    @Test
    public void testclothingTab() throws InterruptedException{
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.HoveroverClothingTab();
    }

    @Test
    public void testWomens(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.checkWomens();

    }


}


