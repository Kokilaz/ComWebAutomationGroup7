package testHomePage;

import homePage.AmazonHomePageSignin;
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openlogin();
    }

    @Test
    public void setOpenPageLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openpageLogin();
    }

    @Test
    public void createAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setCreateaccount();
    }

    @Test
    public void name(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setYourname();
    }

    @Test
    public void email(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.giveemail();
    }

    @Test
    public void amazonPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setpassword();
    }

    @Test
    public void enterPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setReEnter();
    }

    @Test
    public void account(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setReEnter();
    }

    @Test
    public void emailVerification(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setReEnter();
    }

    @Test
    public void setSignout(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.signout();
    }

    @Test
    public void getHoveroverSignin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.hoveroverSiginTab();
    }
}
