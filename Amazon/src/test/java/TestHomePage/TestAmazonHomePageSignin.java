package TestHomePage;

import HomePage.AmazonHomePageSignin;
import Reporting.ApplicationLog;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonHomePageSignin extends AmazonHomePageSignin {

    AmazonHomePageSignin amazonHomePageSignin;
    String Url = "https://www.amazon.com";

    @BeforeMethod
    public void initialize(){
        driver.navigate().to(Url);
        amazonHomePageSignin = PageFactory.initElements(driver,AmazonHomePageSignin.class);
    }

    @Test
    public void setopenlogin(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openlogin();
    }

    @Test
    public void setOpenPageLogin(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openpageLogin();
    }

}
