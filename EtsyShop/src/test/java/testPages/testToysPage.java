package testPages;

import Reporting.TestLogger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ToysPage;
import pages.partyPage;

public class testToysPage extends ToysPage {

    ToysPage toyspage;
    String toysPageUrl = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
    @BeforeMethod
    public void initialize() {
        driver.navigate().to(toysPageUrl);
        toyspage = PageFactory.initElements(driver, ToysPage.class);
    }


    @Test
    public void testAToysPage() throws InterruptedException {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.HoveroverToys();
    }

    @Test
    public void testBooks() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkBooks();
    }

    @Test
    public void testBookMarks() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkBookMarks();
        driver.navigate().back();
    }

    @Test
    public void testBlankBooks() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkBlankBooks();
        driver.navigate().back();
    }

    @Test
    public void testJournals() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkJournals();
        driver.navigate().back();
    }


    @Test
    public void testSketchBooks() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkSketchBooks();
        driver.navigate().back();
    }


    @Test
    public void testFictionBooks() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkFictionBooks();
        driver.navigate().back();
    }


    @Test
    public void testLiteraryFiction() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkLiteraryFiction();
        driver.navigate().back();

    }


    @Test
    public void testSciFi() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkSciFi();
        driver.navigate().back();
    }


    @Test
    public void testToysTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkToysTab();
        driver.navigate().back();
    }


    @Test
    public void testBabyToys() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkBabyToys();
        driver.navigate().back();
    }

    @Test
    public void testDollsNAction() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkDollsNAction();
        driver.navigate().back();
    }


    @Test
    public void testGames() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkGames();
        driver.navigate().back();
    }

    @Test
    public void testVideoGames() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkVideoGames();
        driver.navigate().back();
    }

    @Test
    public void testSports() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkSports();
        driver.navigate().back();
    }

    @Test
    public void testArchery() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toyspage.checkArchery();
        driver.navigate().back();
    }

}



