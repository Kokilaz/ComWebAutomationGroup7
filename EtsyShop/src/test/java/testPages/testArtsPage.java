package testPages;

import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.artsPage;
import pages.clothingPage;

public class testArtsPage extends artsPage {

    artsPage artspage;
    String artsPageUrl = "https://www.etsy.com/c/art-and-collectibles?ref=catnav-66";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(artsPageUrl);
       artspage = PageFactory.initElements(driver, artsPage.class);
    }


    @Test
    public void testArtPage() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        artspage.Hoveroverart();
    }

    @Test
    public void testDigitalPrints() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        artspage.checkDigitalPrints();
    }


}
