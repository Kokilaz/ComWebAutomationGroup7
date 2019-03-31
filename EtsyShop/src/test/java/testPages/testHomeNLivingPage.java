package testPages;

import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homeNLivingPage;
import pages.jewelryPage;

public class testHomeNLivingPage extends homeNLivingPage {

    homeNLivingPage homelivingpage;
    String homeNLivingPageUrl = "https://www.etsy.com/?ref=lgo";
    @BeforeMethod
    public void initialize() {
        driver.navigate().to(homeNLivingPageUrl);
       homelivingpage = PageFactory.initElements(driver, homeNLivingPage.class);
    }

    @Test
    public void testHomeNLiving() throws InterruptedException{
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
       homelivingpage.HoveroverHomeandLiving();
    }

    @Test
    public void testhomeDecor() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkhomeDecor();
    }

    @Test
    public void testwallDecor() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwallDecor();
        driver.navigate().back();
    }

    @Test
    public void testwallHangings() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwallHangings();
        driver.navigate().back();
    }

    @Test
    public void testwallDecals() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwallDecals();
        driver.navigate().back();
    }

    @Test
    public void testwallPaper() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwallPaper();
        driver.navigate().back();
    }

    @Test
    public void testwallStencils() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwallStencils();
        driver.navigate().back();
    }

    @Test
    public void testchristmasTrees() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkchristmasTrees();
        driver.navigate().back();
    }

    @Test
    public void testornaments() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkornaments();
        driver.navigate().back();
    }

    @Test
    public void testcandles() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkcandles();
        driver.navigate().back();
    }

    @Test
    public void testincense() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkincense();
        driver.navigate().back();
    }

    @Test
    public void testwreaths() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkwreaths();
    }

    @Test
    public void testspringWreaths() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homelivingpage.checkspringWreaths();
    }
}
