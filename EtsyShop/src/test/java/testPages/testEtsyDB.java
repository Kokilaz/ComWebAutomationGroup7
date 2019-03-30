package testPages;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EtsyDB;

public class testEtsyDB extends CommonAPI {

    String Url = "https://www.etsy.com/?ref=lgo";
    EtsyDB etsyDB;

    @BeforeMethod
    public void init(){
        driver.navigate().to(Url);
        etsyDB = PageFactory.initElements(driver, EtsyDB.class);
    }

    @Test
    public void testSearchDB()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        etsyDB.searchItems();
    }
}

