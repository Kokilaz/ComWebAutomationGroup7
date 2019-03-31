package testPages;

import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homeNLivingPage;
import pages.partyPage;

public class testPartyPage extends partyPage {
   partyPage partypage;
    String partyPageUrl = "https://www.etsy.com/c/wedding-and-party?ref=catnav-10983";
    @BeforeMethod
    public void initialize() {
        driver.navigate().to(partyPageUrl);
        partypage = PageFactory.initElements(driver, partyPage.class);
    }

    @Test
    public void testWNPTab() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.HoveroverweddingandParty();
    }

    @Test
    public void testInvitePaper() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkInvitePaper();
        driver.navigate().back();
    }

    @Test
    public void testSaveTheDate() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkSaveTheDate();
    }

    @Test
    public void testgreetingCards() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkgreetingCards();
    }

    @Test
    public void testholidayCards() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkHolidayCards();
        driver.navigate().back();
    }

    @Test
    public void testblankCards() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkBlankCards();
        driver.navigate().back();
    }

    @Test
    public void testpartySupplies() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkpartySupples();
        driver.navigate().back();
    }

    @Test
    public void testweddingAcc() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkweddingAcc();
        driver.navigate().back();
    }

    @Test
    public void testweddingBags() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkweddingBags();
        driver.navigate().back();
    }

    @Test
    public void testweddingCorsages() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkweddingcorsages();
        driver.navigate().back();
    }

    @Test
    public void testweddingScarves() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkweddingScarves();
        driver.navigate().back();
    }

    @Test
    public void testbakingSupplies() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partypage.checkbakingSupplies();
        driver.navigate().back();
    }
}
